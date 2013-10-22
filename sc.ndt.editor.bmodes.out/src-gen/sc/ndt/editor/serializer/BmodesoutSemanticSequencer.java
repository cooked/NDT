package sc.ndt.editor.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import sc.ndt.editor.bmodesout.BmodesoutPackage;
import sc.ndt.editor.bmodesout.Header;
import sc.ndt.editor.bmodesout.Mode;
import sc.ndt.editor.bmodesout.ModelBmodesout;
import sc.ndt.editor.services.BmodesoutGrammarAccess;

@SuppressWarnings("all")
public class BmodesoutSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BmodesoutGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == BmodesoutPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case BmodesoutPackage.HEADER:
				if(context == grammarAccess.getHeaderRule()) {
					sequence_Header(context, (Header) semanticObject); 
					return; 
				}
				else break;
			case BmodesoutPackage.MODE:
				if(context == grammarAccess.getModeRule()) {
					sequence_Mode(context, (Mode) semanticObject); 
					return; 
				}
				else break;
			case BmodesoutPackage.MODEL_BMODESOUT:
				if(context == grammarAccess.getModelBmodesoutRule()) {
					sequence_ModelBmodesout(context, (ModelBmodesout) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     n=INT
	 */
	protected void sequence_Header(EObject context, Header semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BmodesoutPackage.Literals.HEADER__N) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesoutPackage.Literals.HEADER__N));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHeaderAccess().getNINTTerminalRuleCall_19_0(), semanticObject.getN());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         index=INT 
	 *         freq=tNUMBER 
	 *         (
	 *             span_loc+=tNUMBER 
	 *             flap_disp+=tNUMBER 
	 *             flap_slope+=tNUMBER 
	 *             lag_disp+=tNUMBER 
	 *             lag_slope+=tNUMBER 
	 *             twist+=tNUMBER
	 *         )+
	 *     )
	 */
	protected void sequence_Mode(EObject context, Mode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (Head=Header Modes+=Mode+)
	 */
	protected void sequence_ModelBmodesout(EObject context, ModelBmodesout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
