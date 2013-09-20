package sc.ndt.editor.iecwind.serializer;

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
import sc.ndt.editor.iecwind.iecwindiec.Header;
import sc.ndt.editor.iecwind.iecwindiec.IecwindiecPackage;
import sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec;
import sc.ndt.editor.iecwind.iecwindiec.Section;
import sc.ndt.editor.iecwind.iecwindiec.iIECClass;
import sc.ndt.editor.iecwind.iecwindiec.iIECStd;
import sc.ndt.editor.iecwind.iecwindiec.iStart;
import sc.ndt.editor.iecwind.iecwindiec.nHubHeight;
import sc.ndt.editor.iecwind.iecwindiec.nRotDiam;
import sc.ndt.editor.iecwind.iecwindiec.nWindIn;
import sc.ndt.editor.iecwind.iecwindiec.nWindNom;
import sc.ndt.editor.iecwind.iecwindiec.nWindOut;
import sc.ndt.editor.iecwind.iecwindiec.nWindSlope;
import sc.ndt.editor.iecwind.iecwindiec.sWindTurb;
import sc.ndt.editor.iecwind.iecwindiec.siUnits;
import sc.ndt.editor.iecwind.iecwindiec.vOutList;
import sc.ndt.editor.iecwind.services.IecwindiecGrammarAccess;

@SuppressWarnings("all")
public class IecwindiecSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private IecwindiecGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == IecwindiecPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case IecwindiecPackage.HEADER:
				if(context == grammarAccess.getHeaderRule()) {
					sequence_Header(context, (Header) semanticObject); 
					return; 
				}
				else break;
			case IecwindiecPackage.MODEL_IECWINDIEC:
				if(context == grammarAccess.getModelIecwindiecRule()) {
					sequence_ModelIecwindiec(context, (ModelIecwindiec) semanticObject); 
					return; 
				}
				else break;
			case IecwindiecPackage.SECTION:
				if(context == grammarAccess.getSectionRule()) {
					sequence_Section(context, (Section) semanticObject); 
					return; 
				}
				else break;
			case IecwindiecPackage.IIEC_CLASS:
				if(context == grammarAccess.getIIECClassRule()) {
					sequence_iIECClass(context, (iIECClass) semanticObject); 
					return; 
				}
				else break;
			case IecwindiecPackage.IIEC_STD:
				if(context == grammarAccess.getIIECStdRule()) {
					sequence_iIECStd(context, (iIECStd) semanticObject); 
					return; 
				}
				else break;
			case IecwindiecPackage.ISTART:
				if(context == grammarAccess.getIStartRule()) {
					sequence_iStart(context, (iStart) semanticObject); 
					return; 
				}
				else break;
			case IecwindiecPackage.NHUB_HEIGHT:
				if(context == grammarAccess.getNHubHeightRule()) {
					sequence_nHubHeight(context, (nHubHeight) semanticObject); 
					return; 
				}
				else break;
			case IecwindiecPackage.NROT_DIAM:
				if(context == grammarAccess.getNRotDiamRule()) {
					sequence_nRotDiam(context, (nRotDiam) semanticObject); 
					return; 
				}
				else break;
			case IecwindiecPackage.NWIND_IN:
				if(context == grammarAccess.getNWindInRule()) {
					sequence_nWindIn(context, (nWindIn) semanticObject); 
					return; 
				}
				else break;
			case IecwindiecPackage.NWIND_NOM:
				if(context == grammarAccess.getNWindNomRule()) {
					sequence_nWindNom(context, (nWindNom) semanticObject); 
					return; 
				}
				else break;
			case IecwindiecPackage.NWIND_OUT:
				if(context == grammarAccess.getNWindOutRule()) {
					sequence_nWindOut(context, (nWindOut) semanticObject); 
					return; 
				}
				else break;
			case IecwindiecPackage.NWIND_SLOPE:
				if(context == grammarAccess.getNWindSlopeRule()) {
					sequence_nWindSlope(context, (nWindSlope) semanticObject); 
					return; 
				}
				else break;
			case IecwindiecPackage.SWIND_TURB:
				if(context == grammarAccess.getSWindTurbRule()) {
					sequence_sWindTurb(context, (sWindTurb) semanticObject); 
					return; 
				}
				else break;
			case IecwindiecPackage.SI_UNITS:
				if(context == grammarAccess.getSiUnitsRule()) {
					sequence_siUnits(context, (siUnits) semanticObject); 
					return; 
				}
				else break;
			case IecwindiecPackage.VOUT_LIST:
				if(context == grammarAccess.getVOutListRule()) {
					sequence_vOutList(context, (vOutList) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     row=SL_COMMENT
	 */
	protected void sequence_Header(EObject context, Header semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IecwindiecPackage.Literals.HEADER__ROW) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IecwindiecPackage.Literals.HEADER__ROW));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHeaderAccess().getRowSL_COMMENTTerminalRuleCall_0_0(), semanticObject.getRow());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         Head=Header 
	 *         sections+=Section 
	 *         SIUnits=siUnits 
	 *         Start=iStart 
	 *         sections+=Section 
	 *         IECClass=iIECClass 
	 *         WindTurb=sWindTurb 
	 *         WindSlope=nWindSlope 
	 *         IECStandard=iIECStd 
	 *         sections+=Section 
	 *         HubHeight=nHubHeight 
	 *         RotDiam=nRotDiam 
	 *         WindIn=nWindIn 
	 *         WindNom=nWindNom 
	 *         WindOut=nWindOut 
	 *         sections+=Section 
	 *         OutList=vOutList
	 *     )
	 */
	protected void sequence_ModelIecwindiec(EObject context, ModelIecwindiec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=SL_COMMENT
	 */
	protected void sequence_Section(EObject context, Section semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IecwindiecPackage.Literals.SECTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IecwindiecPackage.Literals.SECTION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSectionAccess().getNameSL_COMMENTTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_iIECClass(EObject context, iIECClass semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IecwindiecPackage.Literals.IIEC_CLASS__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IecwindiecPackage.Literals.IIEC_CLASS__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIIECClassAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_iIECStd(EObject context, iIECStd semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IecwindiecPackage.Literals.IIEC_STD__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IecwindiecPackage.Literals.IIEC_STD__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIIECStdAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=tNUMBER
	 */
	protected void sequence_iStart(EObject context, iStart semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IecwindiecPackage.Literals.ISTART__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IecwindiecPackage.Literals.ISTART__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIStartAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=tNUMBER
	 */
	protected void sequence_nHubHeight(EObject context, nHubHeight semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IecwindiecPackage.Literals.NHUB_HEIGHT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IecwindiecPackage.Literals.NHUB_HEIGHT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNHubHeightAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=tNUMBER
	 */
	protected void sequence_nRotDiam(EObject context, nRotDiam semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IecwindiecPackage.Literals.NROT_DIAM__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IecwindiecPackage.Literals.NROT_DIAM__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNRotDiamAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=tNUMBER
	 */
	protected void sequence_nWindIn(EObject context, nWindIn semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IecwindiecPackage.Literals.NWIND_IN__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IecwindiecPackage.Literals.NWIND_IN__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNWindInAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=tNUMBER
	 */
	protected void sequence_nWindNom(EObject context, nWindNom semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IecwindiecPackage.Literals.NWIND_NOM__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IecwindiecPackage.Literals.NWIND_NOM__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNWindNomAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=tNUMBER
	 */
	protected void sequence_nWindOut(EObject context, nWindOut semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IecwindiecPackage.Literals.NWIND_OUT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IecwindiecPackage.Literals.NWIND_OUT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNWindOutAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=tNUMBER
	 */
	protected void sequence_nWindSlope(EObject context, nWindSlope semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IecwindiecPackage.Literals.NWIND_SLOPE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IecwindiecPackage.Literals.NWIND_SLOPE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNWindSlopeAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=CLASS
	 */
	protected void sequence_sWindTurb(EObject context, sWindTurb semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IecwindiecPackage.Literals.SWIND_TURB__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IecwindiecPackage.Literals.SWIND_TURB__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSWindTurbAccess().getValueCLASSTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=tBOOL
	 */
	protected void sequence_siUnits(EObject context, siUnits semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IecwindiecPackage.Literals.SI_UNITS__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IecwindiecPackage.Literals.SI_UNITS__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSiUnitsAccess().getValueTBOOLParserRuleCall_1_0(), semanticObject.isValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=tARRAY_OUT
	 */
	protected void sequence_vOutList(EObject context, vOutList semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IecwindiecPackage.Literals.VOUT_LIST__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IecwindiecPackage.Literals.VOUT_LIST__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVOutListAccess().getValueTARRAY_OUTParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
}
