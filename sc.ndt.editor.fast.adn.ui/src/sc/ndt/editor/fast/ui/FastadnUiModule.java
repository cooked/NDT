/*
 * generated by Xtext
 */
package sc.ndt.editor.fast.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

/**
 * Use this class to register components to be used within the IDE.
 */
public class FastadnUiModule extends
		sc.ndt.editor.fast.ui.AbstractFastadnUiModule {

	public FastadnUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	// override nature creation
	// contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
	public Class<? extends org.eclipse.xtext.ui.editor.IXtextEditorCallback> bindIXtextEditorCallback() {
		return sc.ndt.editor.fast.ui.addon.nature.NatureAddingEditorCallback.class;
	}
	
	/*// coloring
	public Class<? extends IHighlightingConfiguration> bindISemanticHighlightingConfiguration() {
		return sc.ndt.editor.fast.ui.addon.coloring.FastadnHighlightingConfiguration.class;
	}

	public Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
		return sc.ndt.editor.fast.ui.addon.coloring.FastadnSemanticHighlightingCalculator.class;
	}*/
}