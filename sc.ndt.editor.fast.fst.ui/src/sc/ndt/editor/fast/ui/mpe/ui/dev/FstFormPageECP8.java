package sc.ndt.editor.fast.ui.mpe.ui.dev;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ui.view.ECPRendererException;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTViewRenderer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;

import sc.ndt.editor.fast.ui.mpe.ui.FstMultiPageEditor;

public class FstFormPageECP8 extends FormPage {

	private IXtextDocument document;
	private FstMultiPageEditor fxe;
	private URI uri;
	
	/**
	 * Create the form page.
	 * @param id
	 * @param title
	 */
	public FstFormPageECP8(String id, String title) {
		super(id, title);
	}

	/**
	 * Create the form page.
	 * @param editor
	 * @param id
	 * @param title
	 * @wbp.parser.constructor
	 * @wbp.eval.method.parameter id "Some id"
	 * @wbp.eval.method.parameter title "Some title"
	 */
	public FstFormPageECP8(FormEditor editor, String id, String title) {
		super(editor, id, title);
		
		if(document==null && getEditor() instanceof FstMultiPageEditor) {
			
			fxe = (FstMultiPageEditor)getEditor();
			
			// init uri
			uri = fxe.getXtextEditorModelFst().eResource().getURI();
			
			
		
			// get the document
			document = fxe.getXtextEditor("fst").getDocument();
			
		}


	}

	/**
	 * Create contents of the form.
	 * @param managedForm
	 */
	@Override
	protected void createFormContent(IManagedForm managedForm) {
		FormToolkit toolkit = managedForm.getToolkit();
		ScrolledForm form = managedForm.getForm();
		form.setText("Empty FormPage");
		Composite body = form.getBody();
		toolkit.decorateFormHeading(form.getForm());
		toolkit.paintBordersFor(body);
		
		try {
			ECPSWTViewRenderer.INSTANCE.render(body, fxe.getXtextEditorModelFst());
		} catch (ECPRendererException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
