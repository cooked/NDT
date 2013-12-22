package sc.ndt.editor.fast.ui.addon.mpe;

import java.util.HashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.view.ExtendedPropertySheetPage;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.editor.IFormPage;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.views.contentoutline.ContentOutline;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheetPage;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.outline.impl.OutlinePage;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import sc.ndt.commons.model.EditorInputFASTOut;
import sc.ndt.commons.model.ModelFileTowerSec;
import sc.ndt.commons.ui.editor.IXtextFormEditor;
import sc.ndt.editor.bmodes.ui.BmodesbmiFactory;
import sc.ndt.editor.bmodes.ui.BmodesoutFactory;
import sc.ndt.editor.bmodes.ui.BmodestspFactory;
import sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi;
import sc.ndt.editor.bmodes.bmodesout.ModelBmodesout;
import sc.ndt.editor.bmodes.bmodestsp.ModelBmodestsp;
import sc.ndt.editor.fast.fasttwr.ModelFasttwr;
import sc.ndt.editor.fast.ui.FasttwrFactory;
import sc.ndt.editor.fast.ui.addon.mpe.outline.ChartOutline;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

/**
 * @author Cotta
 *
 */
public class TwrMultiPageEditor extends FormEditor implements IXtextFormEditor {

	// NOTE: all file of the set must exists. no problem if it is created with wizard
	//		 that creates .tsv, .twr, .bmi, .tsp (the.out is not required)	
	
	// see about ISizeprovider
	// http://www.eclipse.org/forums/index.php/m/706788/
	
	//public static final String ID = "sc.nrel.nwtc.fast.editors.FMainFileMultiPageEditor"; //$NON-NLS-1$

	// external injectors
	public Injector				fTwrInjector;
	public Injector				fBmiInjector;
	public Injector				fTspInjector;
	public Injector				fOutInjector;
	
	// inner form editors
	public TwrFormPage			formPageMain;
		
	// outline view
	@Inject 
	public OutlinePage 			outlinePageFMain;
	
	//public Provider<XtextResourceSet> 	resourceSetProviderFAdyn;
		
	public ModelFasttwr 					modelTwr;
	public ModelBmodesbmi 					modelBmi;
	public ModelBmodestsp 					modelTsp;
	public ModelBmodesout					modelOut;
	public ModelFileTowerSec				fileTwrTsv;
	
	FasttwrFactory 		ff;
	BmodesbmiFactory 	bf;
	BmodestspFactory 	tf;
	BmodesoutFactory 	of;
	
	private HashMap<String,Injector>	xtextInjectors;
	private HashMap<String,XtextEditor>	xtextEditors;
	
	
	// other views
	protected IContentOutlinePage 		contentOutlinePage;
	protected PropertySheetPage 		propertySheetPage;

	
	public TwrMultiPageEditor() {
		
		ff 				= new FasttwrFactory();
		bf 				= new BmodesbmiFactory();
		tf 				= new BmodestspFactory();
		of 				= new BmodesoutFactory();
		
		xtextInjectors 	= new HashMap<String,Injector>();
		xtextInjectors.put("twr", ff.getInjector());
		xtextInjectors.put("bmi", bf.getInjector());
		xtextInjectors.put("tsp", tf.getInjector());
		xtextInjectors.put("out", of.getInjector());
		
		xtextEditors 	= new HashMap<String,XtextEditor>();
		xtextEditors.put("twr",xtextInjectors.get("twr").getInstance(XtextEditor.class));
		xtextEditors.put("bmi",xtextInjectors.get("bmi").getInstance(XtextEditor.class));
		xtextEditors.put("tsp",xtextInjectors.get("tsp").getInstance(XtextEditor.class));
		xtextEditors.put("out",xtextInjectors.get("out").getInstance(XtextEditor.class));
	
	}

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {

		super.init(site,input);		

		if (input instanceof FileEditorInput && fileTwrTsv==null)
			fileTwrTsv = new ModelFileTowerSec(((FileEditorInput)input).getFile());

	}
	
	@Override
	public Injector getXtextInjector(String key) {
		return xtextInjectors.get(key);
	}
	
	@Override
	public XtextEditor getXtextEditor(String key) {
		return xtextEditors.get(key);
	}
	
	/**
	 * @param editor
	 * @return
	 */
	public EObject getModelFromXtextEditor(XtextEditor editor) {
		
		EObject out = editor.getDocument().readOnly(
			new IUnitOfWork<EObject, XtextResource>() {
				@Override
				public EObject exec(XtextResource res) throws Exception {
					return res.getContents().get(0);
				}	
			});
				
		return out;
		
	}
	
	protected void pageChange(int newPageIndex) {

		super.pageChange(newPageIndex);		
		IFormPage page = getActivePageInstance();	
		//updateContentOutline(page);
		
		/* TODO 
		// manage pages
		if(newPageIndex>=0 && getCurrentPage()>=0) {
			Object oldPage = pages.get(getCurrentPage());
			Object newPage = pages.get(newPageIndex);
			
			if(oldPage instanceof FormPage && newPage instanceof XtextEditor)
				
				// commit change to Source on page change 
				xtextEditorFMain.getDocument().modify(new IUnitOfWork<Void, XtextResource>() {

					@Override
					public java.lang.Void exec(XtextResource res) throws Exception {

						// pass updated model to xtext editor
						res.getContents().set(0, modelFMain);
						
						xtextEditorFMain.getDocument().set(
								res.getSerializer().serialize(modelFMain));
						
						return null;
					}
				});
		}*/


		// GUI --> Sorce
		//if (oldPage instanceof IFormPage) {

			//ModelFMain m = formPage.model;
			
			//IFormPage fpage = (IFormPage) page;
			//if (fpage.getPartControl() == null) {
			//	fpage.createPartControl(getContainer());
			//	setControl(newPageIndex, fpage.getPartControl());
			//	fpage.getPartControl().setMenu(getContainer().getMenu());
			//}
			
		// Source --> GUI
		//} else if (oldPage instanceof XtextEditor) {
		
		//}

		super.pageChange(newPageIndex);
		
	}
	
	public boolean isDirty() {
		return formPageMain.isDirty();
	}
	
	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return true;		
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		
		// save sources
		getXtextEditor("twr").doSave(monitor);
		getXtextEditor("tsp").doSave(monitor);
		getXtextEditor("bmi").doSave(monitor);
		// save sec
		formPageMain.doSave(monitor);
				
		editorDirtyStateChanged();
		
	}

    
	@Override
	public void doSaveAs() {
		
		getXtextEditor("twr").doSaveAs();
		setPageText(0, getXtextEditor("twr").getTitle());
		setInput(getXtextEditor("twr").getEditorInput());
		
		getXtextEditor("tsp").doSaveAs();
		getXtextEditor("bmi").doSaveAs();
		
	}

	@Override
	protected void addPages() {
		
		try {
					
			// *.twr source			
			int index = addPage(getXtextEditor("twr"), getEditorInput());
			setPageText(index, "FAST input (.twr)"/*getEditorInput().getName()*/);
						
			//modelTwr = (ModelFasttwr) getModelFromXtextEditor(getXtextEditor("twr"));
			
			IFile file = ((FileEditorInput) getEditorInput()).getFile();
			Path path = new Path(file.getFullPath().toOSString());
			IWorkspaceRoot r = ResourcesPlugin.getWorkspace().getRoot();
			
			// *.bmi file
			if (getEditorInput() instanceof FileEditorInput) {
				
				IPath p2 = path.removeFileExtension().addFileExtension("bmi");
				FileEditorInput fei = new FileEditorInput(r.getFile(p2));
				index = addPage(getXtextEditor("bmi"), fei);
				setPageText(index, "BModes input (.bmi)"/*fei.getName()*/);
			}

			// *.tsp file
			if (getEditorInput() instanceof FileEditorInput) {
				IPath p2 = path.removeFileExtension().addFileExtension("tsp");
				FileEditorInput fei = new FileEditorInput( r.getFile(p2) );
				index = addPage(getXtextEditor("tsp"), fei);
				setPageText(index, "FAST input properties (.tsp)"/*fei.getName()*/);
			}

			// *.out file
			if (getEditorInput() instanceof FileEditorInput) {
				IPath p2 = path.removeFileExtension().addFileExtension("out");
				FileEditorInput fei = new FileEditorInput(r.getFile(p2));
				if(fei.getFile().exists()) {
					index = addPage(getXtextEditor("out"), fei);
					setPageText(index, "BModes output (.out)"/*fei.getName()*/);
				}
			}
			
			
			// Form
			formPageMain = new TwrFormPage(this,"general","Overview");
			addPage(0,formPageMain);

			setActivePage(0);
			
			
			

		} catch (PartInitException e) {
			ErrorDialog.openError(getSite().getShell(),
					"Error creating nested text editor",null,e.getStatus());
		}
		
	}
	
	
	@Override
	public Object getAdapter(Class adapter) {
				
		if (adapter.equals(IPropertySheetPage.class)) {
			return null;
			
		} else if (IContentOutlinePage.class.equals(adapter)) {
			return getContentOutline();
		} 
		
		return super.getAdapter(adapter);
		
	}
 
	public IContentOutlinePage getContentOutline() {
		if (contentOutlinePage == null)
			contentOutlinePage = new ChartOutline();
			///updateContentOutline(getActivePageInstance());
		return contentOutlinePage;
		
		
		/*if (fContentOutline == null ) {
			//fContentOutline = new TwrMultiPageContentOutline(this);
			//updateContentOutline(getActivePageInstance());
			fContentOutline = //(IContentOutlinePage) ((XtextEditor)page).getAdapter(IContentOutlinePage.class);
					(IContentOutlinePage) xtextEditors.get("twr").getAdapter(IContentOutlinePage.class);
		}
		return fContentOutline;
		*/
		
	}

	@Override
	public EObject getXtextEditorModel(String key) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/*private void updateContentOutline(IFormPage page) {
		if (fContentOutline == null)
			return;

		IContentOutlinePage outline = null;
		if (page instanceof TwrFormPage)
			outline = ((TwrFormPage)page).getContentOutline();
		else if (page instanceof XtextEditor)
			outline = (IContentOutlinePage) ((XtextEditor)page).getAdapter(IContentOutlinePage.class);
			
		// outlinePageFMain.setSourceViewer(xtextEditorFst.getInternalSourceViewer());
		//fContentOutline.setPageActive(outline);
	}
	
	/*public IPropertySheetPage getPropertySheetPage() {
		if (propertySheetPage == null) {
			propertySheetPage = new ExtendedPropertySheetPage(editingDomain) {
					@Override
					public void setSelectionToViewer(List<?> selection) {
						WebpageEditor.this.setSelectionToViewer(selection);
						WebpageEditor.this.setFocus();
					}

					@Override
					public void setActionBars(IActionBars actionBars) {
						super.setActionBars(actionBars);
						getActionBarContributor().shareGlobalActions(this, actionBars);
					}
				};
			propertySheetPage.setPropertySourceProvider(new AdapterFactoryContentProvider(adapterFactory));
		}

		return propertySheetPage;
	}*/

	
}
