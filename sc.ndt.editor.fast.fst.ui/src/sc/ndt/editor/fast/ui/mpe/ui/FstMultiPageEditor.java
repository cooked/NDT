package sc.ndt.editor.fast.ui.mpe.ui;

import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.core.internal.resources.File;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdapterManager;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
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
import sc.ndt.editor.fast.fasttwr.ModelFasttwr;
import sc.ndt.editor.fast.ui.FastfstFactory;
import sc.ndt.editor.fast.ui.FastadnFactory;
import sc.ndt.editor.fast.ui.addon.mpe.AdnFormPage;
import sc.ndt.editor.fast.ui.addon.mpe.BldFormPage;
import sc.ndt.editor.fast.ui.addon.mpe.TwrFormPage;
import sc.ndt.editor.fast.ui.mpe.outline.FstMultiPageContentOutline;
import sc.ndt.editor.fast.ui.mpe.outline.OutListContentOutline;
import sc.ndt.editor.fast.ui.mpe.ui.dev.FstFormPageECP8;
import sc.ndt.editor.fast.fastadn.ModelFastadn;
import sc.ndt.editor.fast.fastbld.ModelFastbld;
import sc.ndt.editor.fast.ui.FastbldFactory;

import com.google.inject.Inject;
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
	//public FormPage				formPageFst;
	//public FormPage				formPagePfm;
		
	// outline view
	public OutlinePage 			outlinePageFMain;
	public OutlinePage 			outlinePageFAdyn;
		
	protected IContentOutlinePage 		contentOutlinePage;
	private HashMap<String,XtextEditor>	xtextEditors;
	private HashMap<String,EObject>		xtextEditorsModel;
	
	
	private static final HashMap<Integer,String[]>	vFileSet = new HashMap<Integer,String[]>();
	
	public OutList outList;
	private IFile fileFst;
	private String AdnFile, BldFile, TwrFile, PfmFile;
	
	private int ver = 0;
	
	IAdapterManager am;
	
	public FstMultiPageEditor() {
	
		// libro di Lorenzo Bettini su Xtext
		// http://books.google.co.uk/books?id=ifaBCqGka2IC&pg=PT181&lpg=PT181&dq=xtext+use+inject&source=bl&ots=6n-cz6uoRB&sig=V1EZQT3j6w_ECaAUcE3KTWqYHMw&hl=en&sa=X&ei=cVFLVLf9A-PB7Aaa2IDYCA&ved=0CFYQ6AEwBw#v=onepage&q&f=false
		
		// about Injectors
		// http://koehnlein.blogspot.co.uk/2012/11/xtext-tip-how-do-i-get-guice-injector.html
		// - http://coopology.com/2011/06/easily-load-xtext-files-and-objects-in-eclipse-plugin-or-rcp-projects-using-adapters/
		
		// add logic to support:
		// - FAST 7 (legacy)
		// - FAST 8 (new)
		
		// create sets of known files 
		//vFileSet.put(7, new String[]{"fst", "adn"});
		vFileSet.put(7, new String[]{"fst", "adn", "bld", "twr", "pfm"});
		vFileSet.put(8, new String[]{"fst", "edn", "sdn"});	
		
		xtextEditors 		= new HashMap<String,XtextEditor>();
		xtextEditorsModel 	= new HashMap<String,EObject>();
		
	}

	public void init(IEditorSite site, IEditorInput editorInput) throws PartInitException {
		super.init(site, editorInput);
		
		if (editorInput instanceof FileEditorInput) {

			am = Platform.getAdapterManager();
			
			fileFst = (IFile) editorInput.getAdapter(IFile.class);
			setPartName(fileFst.getName());
			
			// TODO manage version, and load required editors
			// .fst = 7
			// .fs8 = 8
			
			if(fileFst.getFileExtension().matches("fst")) {
				for(String ext:vFileSet.get(7)) {

					// FAST
					// get source editor
					xtextEditors.put("fst", (XtextEditor) am.getAdapter(editorInput, ModelFastfst.class));
					// get model and ext files (absolute path)
					ModelFastfst mFst = (ModelFastfst) am.getAdapter(fileFst, ModelFastfst.class);
					AdnFile = mFst.getADFile().getValue();
					BldFile = mFst.getBldFile_1_().getValue();
					TwrFile = mFst.getTwrFile().getValue();
					PfmFile = mFst.getPtfmFile().getValue();
					xtextEditorsModel.put("fst", mFst);
					
					// find FAST version
					for(String s:mFst.getHead().getRows()) {
						if(s.contains("FAST v8")) {
							ver = 8;
							break;
						} else if (s.contains("FAST v7")) {
							ver = 7;
							break;
						}
					}

					
				}
			}
			
		}

	}
	
	private void addPagesAero(int index) throws PartInitException {
		///// AeroDyn source
		// AeroDyn
		//IFile path = fileFst.getParent().getFile(new Path(AdnFile));

		IPath path = fileFst.getParent().getFullPath().append(AdnFile);
		IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
		FileEditorInput fileEditorInputAdyn = new FileEditorInput(file);
		xtextEditors.put("adn", (XtextEditor) am.getAdapter(fileEditorInputAdyn, ModelFastadn.class));				
		xtextEditorsModel.put("adn", (ModelFastadn) am.getAdapter(file, ModelFastadn.class));

		setPageText(
				addPage(xtextEditors.get("adn"), fileEditorInputAdyn), 
				fileEditorInputAdyn.getName());

		///// AeroDyn Form
		AdnFormPage formPageAdn = new AdnFormPage(this,"aerodyn","AeroDyn");
		addPage(1,formPageAdn);
	}
	
	private void addPagesBlade(int index) throws PartInitException {
		
		///// Blade source
		IPath 			path 				= fileFst.getParent().getFullPath().append(BldFile);
		IFile 			file 				= ResourcesPlugin.getWorkspace().getRoot().getFile(path);
		FileEditorInput fileEditorInputBld 	= new FileEditorInput(file);
		
		xtextEditors.put("bld", (XtextEditor) am.getAdapter(fileEditorInputBld, ModelFastbld.class));
		xtextEditorsModel.put("bld", (ModelFastbld) am.getAdapter(file, ModelFastbld.class));

		//setPageText(
		//		addPage(xtextEditors.get("bld"), fileEditorInputBld), 
		//		fileEditorInputBld.getName());

		///// TODO Blade Form
		//BldFormPage formPageBld = new BldFormPage(this,"blade","Blade");
		//addPage(index,formPageBld);
		
	}
	
	private void addPagesTower(int index) throws PartInitException {
		///// Tower source
		IPath 			path 				= fileFst.getParent().getFullPath().append(TwrFile);
		IFile 			file 				= ResourcesPlugin.getWorkspace().getRoot().getFile(path);
		FileEditorInput fileEditorInputTwr 	= new FileEditorInput(file);
		
		xtextEditors.put("twr", (XtextEditor) am.getAdapter(fileEditorInputTwr, ModelFasttwr.class));
		xtextEditorsModel.put("twr", (ModelFasttwr) am.getAdapter(file, ModelFasttwr.class));

		setPageText(
				addPage(xtextEditors.get("twr"),fileEditorInputTwr), 
				fileEditorInputTwr.getName());

		///// Tower Form
		TwrFormPage formPageTwr = new TwrFormPage(this,"tower","Tower");
		formPageTwr.init(getEditorSite(),fileEditorInputTwr);
		addPage(index,formPageTwr);
		
	}
	
	private void addPagesV7() {
		
		try {
			
			// append source pages to the MPE
			setPageText(
					addPage(xtextEditors.get("fst"),getEditorInput()), 
					getEditorInput().getName());
									
			///// FAST source		
			outList = OutListRegistry.getInstance().getNewOutList();
			outList.setAllSelected(getXtextEditorModelFst().getOutList().getValue());
			
			///// FAST Form
			//formPageFst = new FstFormPageECP8(this,"ovr","Overview");
			FstFormPage formPageFst = new FstFormPage(this,"ovr","FAST");
			addPage(0,formPageFst);

			
			// IMPORTANT
			// At this point Adn plugin must be loaded, for example setting the proper start-level in the 
			// Run configurations... adn_startlevel < fst_startlevel
			// Also set auto-start to true
			addPagesAero(1); 
			addPagesBlade(2);
			addPagesTower(3);
			
			setActivePage(0);
			
			
		} catch (PartInitException e) {
			ErrorDialog.openError(getSite().getShell(),
					"Error creating nested text editor",null,e.getStatus());
		}
	}
	
	@Override
	protected void addPages() {
		
		switch(ver) { 
			case 7:	addPagesV7();
					break;
			case 8:	addPagesV7();
					break;
		}

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
	
	
	/*@Override
	public Injector getXtextInjector(String key) {
		return xtextInjectors.get(key);
	}*/
	
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
	
	public ArrayList<Float[]> get3DInfoBlade() {
		
		ArrayList<Float[]> out = new ArrayList<Float[]>();
		
		if(xtextEditorsModel.get("adn")!=null) {
			ModelFastadn m = (ModelFastadn)xtextEditorsModel.get("adn");
			
			// airstation position
			EList<Float> el = m.getAirStat().getRnodes();
			Float[] rnodes = new Float[el.size()];
		    out.add( el.toArray(rnodes) );
		    
		    // airstation chord 
		    el = m.getAirStat().getChord();
			Float[] chord = new Float[el.size()];
		    out.add( el.toArray(chord) );
			
		}
			
		return out;
	}
	
	public ArrayList<Float> get3DInfoHub() {
		
		ArrayList<Float> out = new ArrayList<Float>();
		
		float hub_x = 0;
		float hub_y = 0;
		float hub_z = 0;
		float tilt 	= 0;
		
		// tower height
		if(xtextEditorsModel.get("fst")!=null) {
			ModelFastfst m = (ModelFastfst)xtextEditorsModel.get("fst");
			hub_x 	= m.getOverHang().getValue();
			tilt	= (float) Math.toRadians(m.getShftTilt().getValue());
			hub_z 	= 
					(float) (m.getTwr2Shft().getValue() + 
					m.getTowerHt().getValue() +
					Math.abs(hub_x)*Math.sin(tilt));
		}
		out.add(hub_x);
		out.add(hub_y);
		out.add(hub_z);
		out.add(tilt);
		
		return out;
		
	}
	
	public ArrayList<Float[]> get3DInfoTower() {
		
		ArrayList<Float[]> out = new ArrayList<Float[]>();
		
		float towerht = 0;
		
		// tower height
		if(xtextEditorsModel.get("fst")!=null) {
			ModelFastfst m = (ModelFastfst)xtextEditorsModel.get("fst");
			towerht = m.getTowerHt().getValue();
		}
		
		if(xtextEditorsModel.get("twr")!=null) {
			ModelFasttwr m = (ModelFasttwr)xtextEditorsModel.get("twr");
			
			// airstation position
			EList<Float> el = m.getTwrStat().getHtFract();
			Float[] htfract = new Float[el.size()];
			for(int i=0; i<el.size(); i++)
				htfract[i] = el.get(i)*towerht;
			
		    out.add( htfract );
		    
		}
			
		return out;
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
	public Object getAdapter(Class adapter) {
				
		if (adapter.equals(IPropertySheetPage.class)) {
			// TODO
			return null;
			
		} else if (adapter.equals(IContentOutlinePage.class)) {
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
