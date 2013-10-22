package sc.ndt.editor.fast.ui.addon.mpe;

import java.util.HashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.editor.IFormPage;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.outline.impl.OutlinePage;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import sc.ndt.commons.model.EditorInputFASTOut;
import sc.ndt.commons.model.ModelFileTowerSec;
import sc.ndt.commons.ui.editor.IXtextFormEditor;
import sc.ndt.editor.bmodesbmi.ModelBmodesbmi;
import sc.ndt.editor.bmodesout.ModelBmodesout;
import sc.ndt.editor.bmodestsp.ModelBmodestsp;
import sc.ndt.editor.fast.fasttwr.ModelFasttwr;
import sc.ndt.editor.fast.ui.FasttwrFactory;
import sc.ndt.editor.fast.ui.addon.mpe.outline.TwrMultiPageContentOutline;
import sc.ndt.editor.ui.BmodesbmiFactory;
import sc.ndt.editor.ui.BmodesoutFactory;
import sc.ndt.editor.ui.BmodestspFactory;

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
	
	// inner source editors
	//public XtextEditor 			xtextEditorTwr;
	//public XtextEditor 			xtextEditorBmi;
	
	// inner form editors
	public TwrFormPage				formPageMain;
		
	// outline view
	@Inject 
	public OutlinePage 			outlinePageFMain;
	
	public Provider<XtextResourceSet> 	resourceSetProviderFAdyn;
		
	public ModelFasttwr 					modelTwr;
	public ModelBmodesbmi 					modelBmi;
	public ModelBmodestsp 					modelTsp;
	public ModelBmodesout					modelOut;
	
	FasttwrFactory 		ff;
	BmodesbmiFactory 	bf;
	BmodestspFactory 	tf;
	BmodesoutFactory 	of;
	
	private TwrMultiPageContentOutline fContentOutline;
	
	private HashMap<String,Injector>	xtextInjectors;
	private HashMap<String,XtextEditor>	xtextEditors;
	
	public ModelFileTowerSec			fileTwrTsv;
	
	
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

		
		if (input instanceof FileEditorInput) {

			if(fileTwrTsv==null) {
				IFile file = ((FileEditorInput)input).getFile();
				fileTwrTsv = new ModelFileTowerSec(file);
			}
		}

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
		updateContentOutline(page);
		
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
			setPageText(index, getEditorInput().getName());
						
			modelTwr = (ModelFasttwr) getModelFromXtextEditor(getXtextEditor("twr"));
			
			IFile file = ((FileEditorInput) getEditorInput()).getFile();
			Path path = new Path(file.getFullPath().toOSString());
			IWorkspaceRoot r = ResourcesPlugin.getWorkspace().getRoot();
			
			// *.bmi file
			if (getEditorInput() instanceof FileEditorInput) {
				
				IPath p2 = path.removeFileExtension().addFileExtension("bmi");
				FileEditorInput fei = new FileEditorInput(r.getFile(p2));
				index = addPage(getXtextEditor("bmi"), fei);
				setPageText(index, fei.getName());
			}

			// *.tsp file
			if (getEditorInput() instanceof FileEditorInput) {
				IPath p2 = path.removeFileExtension().addFileExtension("tsp");
				FileEditorInput fei = new FileEditorInput( r.getFile(p2) );
				index = addPage(getXtextEditor("tsp"), fei);
				setPageText(index, fei.getName());
			}

			// *.out file
			if (getEditorInput() instanceof FileEditorInput) {
				IPath p2 = path.removeFileExtension().addFileExtension("out");
				FileEditorInput fei = new FileEditorInput(r.getFile(p2));
				index = addPage(getXtextEditor("out"), fei);
				setPageText(index, fei.getName());
			}
			
			
			// Form
			formPageMain = new TwrFormPage(this,"general","GUI");
			addPage(0,formPageMain);

			setActivePage(0);
			
			
			

		} catch (PartInitException e) {
			ErrorDialog.openError(getSite().getShell(),
					"Error creating nested text editor",null,e.getStatus());
		}
		
	}
	
	
	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Class adapter) {
				
		if (adapter.equals(IPropertySheetPage.class)) {
			// TODO
			return null;
		} else if (IContentOutlinePage.class.equals(adapter)) {
			return getContentOutline();
		}
		return super.getAdapter(adapter);
		
	}
 
	public TwrMultiPageContentOutline getContentOutline() {
		if (fContentOutline == null || fContentOutline.isDisposed()) {
			fContentOutline = new TwrMultiPageContentOutline(this);
			updateContentOutline(getActivePageInstance());
		}
		return fContentOutline;
		
	}
	
	private void updateContentOutline(IFormPage page) {
		if (fContentOutline == null)
			return;

		/*ISortable*/IContentOutlinePage outline = null;
		if (page instanceof TwrFormPage)
			outline = ((TwrFormPage)page).getContentOutline();
		//else if (page instanceof XtextEditor)
		//	outline = ((XtextEditor)page).getContentOutline();
			
		// outlinePageFMain.setSourceViewer(xtextEditorFst.getInternalSourceViewer());
		fContentOutline.setPageActive(outline);
	}

	
}
