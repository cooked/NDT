package sc.ndt.editor.fast.ui.mpe.ui;

import java.util.HashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
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
import sc.ndt.commons.model.OutList;
import sc.ndt.commons.model.OutListRegistry;
import sc.ndt.commons.ui.editor.IXtextFormEditor;
import sc.ndt.editor.fast.fastfst.ModelFastfst;
import sc.ndt.editor.fast.ui.FastfstFactory;
import sc.ndt.editor.fast.ui.FastadnFactory;
import sc.ndt.editor.fast.ui.mpe.outline.FstMultiPageContentOutline;
import sc.ndt.editor.fast.ui.mpe.outline.OutListContentOutline;
import sc.ndt.editor.fast.fastadn.ModelFastadn;
//import sc.nrel.nwtc.fast.fMain.ModelFMain;
//import sc.nrel.nwtc.fast.aerodyn.ui.internal.FAdynActivator;
//import sc.nrel.nwtc.fast.aerodyn.ui.editors.*;




import com.google.inject.Injector;

/**
 * @author Cotta
 *
 */
public class FstMultiPageEditor extends FormEditor implements IXtextFormEditor {

	// see about ISizeprovider
	// http://www.eclipse.org/forums/index.php/m/706788/
	
	//public static final String ID = "sc.nrel.nwtc.fast.editors.FMainFileMultiPageEditor"; //$NON-NLS-1$
	
	// inner form editors
	public FormPage				formPageFst;
	public FormPage				formPageAdn;
	public FormPage				formPageTwr;
	public FormPage				formPageBld;
	public FormPage				formPagePfm;
		
	// outline view
	public OutlinePage 			outlinePageFMain;
	public OutlinePage 			outlinePageFAdyn;
	
	FastfstFactory ff;
	FastadnFactory fa;
	
	protected IContentOutlinePage 		contentOutlinePage;
	private HashMap<String,Injector>	xtextInjectors;
	private HashMap<String,XtextEditor>	xtextEditors;
	private HashMap<String,EObject>		xtextEditorsModel;

	
	public OutList outList;
	
	public FstMultiPageEditor() {
		
		ff 				= new FastfstFactory();
		fa 				= new FastadnFactory();
		
		xtextInjectors 	= new HashMap<String,Injector>();
		xtextInjectors.put("fst", ff.getInjector());
		xtextInjectors.put("adn", fa.getInjector());
		
		xtextEditors 	= new HashMap<String,XtextEditor>();
		xtextEditors.put("fst",xtextInjectors.get("fst").getInstance(XtextEditor.class));
		xtextEditors.put("adn",xtextInjectors.get("adn").getInstance(XtextEditor.class));
		
		xtextEditorsModel 	= new HashMap<String,EObject>();
		// TODO models can be added only in addPages() or nto the FormPage?..this is why we had to go there and create the model back here? seems so!
		
	}

	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		super.init(site, input);
		
		if (input instanceof FileEditorInput) {
			// TODO add checks!!!!!!
			IFile f = (IFile) input.getAdapter(IFile.class);
			//setInput(new EditorInputFASTOut(f));
			setPartName(f.getName());
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
	
	public EObject getXtextEditorModel(String key) {
		if(xtextEditorsModel.get(key)==null)
			xtextEditorsModel.put(key, getModelFromXtextEditor(getXtextEditor(key)));
		return xtextEditorsModel.get(key);
	}
	
	public ModelFastfst getXtextEditorModelFst() {
		return (ModelFastfst) getXtextEditorModel("fst");
	}
	
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
	
	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return true;		
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub
		
		// save Main
		xtextEditors.get("fst").doSave(monitor);
		
		// save AeroDyn
		// save Tower
		// save Blade
		
		editorDirtyStateChanged();
		
	}

	@Override
	public void doSaveAs() {
		
		getXtextEditor("fst").doSaveAs();
		setPageText(0, xtextEditors.get("fst").getTitle());
		setInput(xtextEditors.get("fst").getEditorInput());

	}

	
	@Override
	protected void addPages() {
		
		int index;
		
		try {
		
	
			
			///// FAST source		
			setPageText(
					addPage(xtextEditors.get("fst"), getEditorInput()), "Source");
			outList = OutListRegistry.getInstance().getNewOutList();
			outList.setAllSelected(getXtextEditorModelFst().getOutList().getValue());
			
			///// FAST Form
			formPageFst = new FstFormPage(this,"ovr","Overview");
			addPage(0,formPageFst);
					

	/*
			///// AeroDyn source
			String ADFile = modelFst.getADFile().getValue();

			IFile fileMain = (IFile) xtextEditors.get("fst").getEditorInput().getAdapter(IFile.class);
			IPath path = fileMain.getParent().getFullPath().append(ADFile);
			IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);

			FileEditorInput fileEditorInputAdyn = new FileEditorInput(file);

			index = addPage(xtextEditors.get("adn"), fileEditorInputAdyn);
			setPageText(index, fileEditorInputAdyn.getName());
		
			
			///// AeroDyn Form
			formPageAdn = new AdnFormPage(this,"aerodyn","AeroDyn");
			addPage(formPageAdn);

			setActivePage(0);


			


			///// Blade source
			/*String BldFile = modelFst.getBldFile_1_().getValue();

			path = fileMain.getParent().getFullPath().append(BldFile);
			file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);

			FileEditorInput fileEditorInputBld = new FileEditorInput(file);

			index = addPage(xtextEditorBld, fileEditorInputBld);
			setPageText(index, fileEditorInputBld.getName());
			*/
			
			
		} catch (PartInitException e) {
			ErrorDialog.openError(getSite().getShell(),
					"Error creating nested text editor",null,e.getStatus());
		}
		
		
	}
	
	
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
 
	public IContentOutlinePage getContentOutline() {
		if (contentOutlinePage == null && getActivePageInstance() instanceof FstFormPage) {
			//fContentOutline = new FstMultiPageContentOutline(this);
				contentOutlinePage = new OutListContentOutline(this);
			//fContentOutline = updateContentOutline(getActivePageInstance());
			//contentOutlinePage = new ChartOutline();
		}
		return contentOutlinePage;
		
	}
	
	/*private void updateContentOutline(IFormPage page) {

		if (fContentOutline == null)
			return;
		IContentOutlinePage outline = null;
		if (page instanceof FstFormPage)
		//	outline = ((FstFormPage)page).getContentOutline();
		//else if (page instanceof XtextEditor)
		outline = new OutListContentOutline();
			
		// outlinePageFMain.setSourceViewer(xtextEditorFst.getInternalSourceViewer());
		//fContentOutline.setPageActive(outline);
		//return outline;
		
	}*/


}
