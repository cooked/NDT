package sc.ndt.editor.bmodes.serializer;

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
import sc.ndt.editor.bmodes.bmodestsp.BmodestspPackage;
import sc.ndt.editor.bmodes.bmodestsp.Header;
import sc.ndt.editor.bmodes.bmodestsp.ModelBmodestsp;
import sc.ndt.editor.bmodes.bmodestsp.aSec;
import sc.ndt.editor.bmodes.bmodestsp.iNodes;
import sc.ndt.editor.bmodes.services.BmodestspGrammarAccess;

@SuppressWarnings("all")
public class BmodestspSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BmodestspGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == BmodestspPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case BmodestspPackage.HEADER:
				if(context == grammarAccess.getHeaderRule()) {
					sequence_Header(context, (Header) semanticObject); 
					return; 
				}
				else break;
			case BmodestspPackage.MODEL_BMODESTSP:
				if(context == grammarAccess.getModelBmodestspRule()) {
					sequence_ModelBmodestsp(context, (ModelBmodestsp) semanticObject); 
					return; 
				}
				else break;
			case BmodestspPackage.ASEC:
				if(context == grammarAccess.getASecRule()) {
					sequence_aSec(context, (aSec) semanticObject); 
					return; 
				}
				else break;
			case BmodestspPackage.INODES:
				if(context == grammarAccess.getINodesRule()) {
					sequence_iNodes(context, (iNodes) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     name=SL_COMMENT
	 */
	protected void sequence_Header(EObject context, Header semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BmodestspPackage.Literals.HEADER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodestspPackage.Literals.HEADER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHeaderAccess().getNameSL_COMMENTTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (Head=Header NNodes=iNodes Sections=aSec)
	 */
	protected void sequence_ModelBmodestsp(EObject context, ModelBmodestsp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BmodestspPackage.Literals.MODEL_BMODESTSP__HEAD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodestspPackage.Literals.MODEL_BMODESTSP__HEAD));
			if(transientValues.isValueTransient(semanticObject, BmodestspPackage.Literals.MODEL_BMODESTSP__NNODES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodestspPackage.Literals.MODEL_BMODESTSP__NNODES));
			if(transientValues.isValueTransient(semanticObject, BmodestspPackage.Literals.MODEL_BMODESTSP__SECTIONS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodestspPackage.Literals.MODEL_BMODESTSP__SECTIONS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getModelBmodestspAccess().getHeadHeaderParserRuleCall_0_0(), semanticObject.getHead());
		feeder.accept(grammarAccess.getModelBmodestspAccess().getNNodesINodesParserRuleCall_1_0(), semanticObject.getNNodes());
		feeder.accept(grammarAccess.getModelBmodestspAccess().getSectionsASecParserRuleCall_3_0(), semanticObject.getSections());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         sec_loc+=tNUMBER 
	 *         str_tw+=tNUMBER 
	 *         tw_iner+=tNUMBER 
	 *         mass_den+=tNUMBER 
	 *         flp_iner+=tNUMBER 
	 *         edge_iner+=tNUMBER 
	 *         flp_stff+=tNUMBER 
	 *         edge_stff+=tNUMBER 
	 *         tor_stff+=tNUMBER 
	 *         axial_stff+=tNUMBER 
	 *         cg_offst+=tNUMBER 
	 *         sc_offst+=tNUMBER 
	 *         tc_offst+=tNUMBER
	 *     )+
	 */
	protected void sequence_aSec(EObject context, aSec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=INT name='n_secs')
	 */
	protected void sequence_iNodes(EObject context, iNodes semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BmodestspPackage.Literals.INODES__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodestspPackage.Literals.INODES__VALUE));
			if(transientValues.isValueTransient(semanticObject, BmodestspPackage.Literals.INODES__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodestspPackage.Literals.INODES__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getINodesAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getINodesAccess().getNameN_secsKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
}
