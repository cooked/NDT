package sc.ndt.commons.ui.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class NRELPreferencePage
extends FieldEditorPreferencePage
implements IWorkbenchPreferencePage {

	public NRELPreferencePage() {
		super(GRID);
		//setPreferenceStore(Activator.getDefault().getPreferenceStore());
		//setDescription("A demonstration of a preference page implementation");
	}

	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	@Override
	public void createFieldEditors() {
		/*addField(new DirectoryFieldEditor(PreferenceConstants.P_PATH, 
				"&Directory preference:", getFieldEditorParent()));
		addField(
				new BooleanFieldEditor(
						PreferenceConstants.P_BOOLEAN,
						"&An example of a boolean preference",
						getFieldEditorParent()));

		addField(new RadioGroupFieldEditor(
				PreferenceConstants.P_CHOICE,
				"An example of a multiple-choice preference",
				1,
				new String[][] { { "&Choice 1", "choice1" }, {
					"C&hoice 2", "choice2" }
				}, getFieldEditorParent()));
		addField(
				new StringFieldEditor(PreferenceConstants.P_STRING, "A &text preference:", getFieldEditorParent()));
		 */
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	@Override
	public void init(IWorkbench workbench) {
	}

}
