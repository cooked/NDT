/*
* generated by Xtext
*/
package sc.ndt.editor.iecwind.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import sc.ndt.editor.iecwind.services.IecwindiecGrammarAccess;

public class IecwindiecParser extends AbstractContentAssistParser {
	
	@Inject
	private IecwindiecGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected sc.ndt.editor.iecwind.ui.contentassist.antlr.internal.InternalIecwindiecParser createParser() {
		sc.ndt.editor.iecwind.ui.contentassist.antlr.internal.InternalIecwindiecParser result = new sc.ndt.editor.iecwind.ui.contentassist.antlr.internal.InternalIecwindiecParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getModelIecwindiecAccess().getAlternatives_17(), "rule__ModelIecwindiec__Alternatives_17");
					put(grammarAccess.getTNUMBERAccess().getAlternatives(), "rule__TNUMBER__Alternatives");
					put(grammarAccess.getTBOOLAccess().getAlternatives(), "rule__TBOOL__Alternatives");
					put(grammarAccess.getModelIecwindiecAccess().getGroup(), "rule__ModelIecwindiec__Group__0");
					put(grammarAccess.getTARRAY_INTAccess().getGroup(), "rule__TARRAY_INT__Group__0");
					put(grammarAccess.getTARRAY_INTAccess().getGroup_1(), "rule__TARRAY_INT__Group_1__0");
					put(grammarAccess.getTARRAY_OUTAccess().getGroup(), "rule__TARRAY_OUT__Group__0");
					put(grammarAccess.getHeaderAccess().getGroup(), "rule__Header__Group__0");
					put(grammarAccess.getSectionAccess().getGroup(), "rule__Section__Group__0");
					put(grammarAccess.getSiUnitsAccess().getGroup(), "rule__SiUnits__Group__0");
					put(grammarAccess.getIStartAccess().getGroup(), "rule__IStart__Group__0");
					put(grammarAccess.getIIECClassAccess().getGroup(), "rule__IIECClass__Group__0");
					put(grammarAccess.getSWindTurbAccess().getGroup(), "rule__SWindTurb__Group__0");
					put(grammarAccess.getNWindSlopeAccess().getGroup(), "rule__NWindSlope__Group__0");
					put(grammarAccess.getIIECStdAccess().getGroup(), "rule__IIECStd__Group__0");
					put(grammarAccess.getNHubHeightAccess().getGroup(), "rule__NHubHeight__Group__0");
					put(grammarAccess.getNRotDiamAccess().getGroup(), "rule__NRotDiam__Group__0");
					put(grammarAccess.getNWindInAccess().getGroup(), "rule__NWindIn__Group__0");
					put(grammarAccess.getNWindNomAccess().getGroup(), "rule__NWindNom__Group__0");
					put(grammarAccess.getNWindOutAccess().getGroup(), "rule__NWindOut__Group__0");
					put(grammarAccess.getModelIecwindiecAccess().getHeadAssignment_0(), "rule__ModelIecwindiec__HeadAssignment_0");
					put(grammarAccess.getModelIecwindiecAccess().getSectionsAssignment_1(), "rule__ModelIecwindiec__SectionsAssignment_1");
					put(grammarAccess.getModelIecwindiecAccess().getSIUnitsAssignment_2(), "rule__ModelIecwindiec__SIUnitsAssignment_2");
					put(grammarAccess.getModelIecwindiecAccess().getStartAssignment_3(), "rule__ModelIecwindiec__StartAssignment_3");
					put(grammarAccess.getModelIecwindiecAccess().getSectionsAssignment_4(), "rule__ModelIecwindiec__SectionsAssignment_4");
					put(grammarAccess.getModelIecwindiecAccess().getIECClassAssignment_5(), "rule__ModelIecwindiec__IECClassAssignment_5");
					put(grammarAccess.getModelIecwindiecAccess().getWindTurbAssignment_6(), "rule__ModelIecwindiec__WindTurbAssignment_6");
					put(grammarAccess.getModelIecwindiecAccess().getWindSlopeAssignment_7(), "rule__ModelIecwindiec__WindSlopeAssignment_7");
					put(grammarAccess.getModelIecwindiecAccess().getIECStandardAssignment_8(), "rule__ModelIecwindiec__IECStandardAssignment_8");
					put(grammarAccess.getModelIecwindiecAccess().getSectionsAssignment_9(), "rule__ModelIecwindiec__SectionsAssignment_9");
					put(grammarAccess.getModelIecwindiecAccess().getHubHeightAssignment_10(), "rule__ModelIecwindiec__HubHeightAssignment_10");
					put(grammarAccess.getModelIecwindiecAccess().getRotDiamAssignment_11(), "rule__ModelIecwindiec__RotDiamAssignment_11");
					put(grammarAccess.getModelIecwindiecAccess().getWindInAssignment_12(), "rule__ModelIecwindiec__WindInAssignment_12");
					put(grammarAccess.getModelIecwindiecAccess().getWindNomAssignment_13(), "rule__ModelIecwindiec__WindNomAssignment_13");
					put(grammarAccess.getModelIecwindiecAccess().getWindOutAssignment_14(), "rule__ModelIecwindiec__WindOutAssignment_14");
					put(grammarAccess.getModelIecwindiecAccess().getSectionsAssignment_15(), "rule__ModelIecwindiec__SectionsAssignment_15");
					put(grammarAccess.getModelIecwindiecAccess().getOutListAssignment_16(), "rule__ModelIecwindiec__OutListAssignment_16");
					put(grammarAccess.getHeaderAccess().getRowAssignment_0(), "rule__Header__RowAssignment_0");
					put(grammarAccess.getSectionAccess().getNameAssignment_0(), "rule__Section__NameAssignment_0");
					put(grammarAccess.getSiUnitsAccess().getValueAssignment_1(), "rule__SiUnits__ValueAssignment_1");
					put(grammarAccess.getIStartAccess().getValueAssignment_1(), "rule__IStart__ValueAssignment_1");
					put(grammarAccess.getIIECClassAccess().getValueAssignment_1(), "rule__IIECClass__ValueAssignment_1");
					put(grammarAccess.getSWindTurbAccess().getValueAssignment_1(), "rule__SWindTurb__ValueAssignment_1");
					put(grammarAccess.getNWindSlopeAccess().getValueAssignment_1(), "rule__NWindSlope__ValueAssignment_1");
					put(grammarAccess.getIIECStdAccess().getValueAssignment_1(), "rule__IIECStd__ValueAssignment_1");
					put(grammarAccess.getNHubHeightAccess().getValueAssignment_1(), "rule__NHubHeight__ValueAssignment_1");
					put(grammarAccess.getNRotDiamAccess().getValueAssignment_1(), "rule__NRotDiam__ValueAssignment_1");
					put(grammarAccess.getNWindInAccess().getValueAssignment_1(), "rule__NWindIn__ValueAssignment_1");
					put(grammarAccess.getNWindNomAccess().getValueAssignment_1(), "rule__NWindNom__ValueAssignment_1");
					put(grammarAccess.getNWindOutAccess().getValueAssignment_1(), "rule__NWindOut__ValueAssignment_1");
					put(grammarAccess.getVOutListAccess().getValueAssignment(), "rule__VOutList__ValueAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			sc.ndt.editor.iecwind.ui.contentassist.antlr.internal.InternalIecwindiecParser typedParser = (sc.ndt.editor.iecwind.ui.contentassist.antlr.internal.InternalIecwindiecParser) parser;
			typedParser.entryRuleModelIecwindiec();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] {  };
	}
	
	public IecwindiecGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(IecwindiecGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
