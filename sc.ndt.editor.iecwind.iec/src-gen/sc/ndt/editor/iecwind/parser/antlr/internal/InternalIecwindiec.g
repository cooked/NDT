/*
* generated by Xtext
*/
grammar InternalIecwindiec;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package sc.ndt.editor.iecwind.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package sc.ndt.editor.iecwind.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import sc.ndt.editor.iecwind.services.IecwindiecGrammarAccess;

}

@parser::members {

 	private IecwindiecGrammarAccess grammarAccess;
 	
    public InternalIecwindiecParser(TokenStream input, IecwindiecGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "ModelIecwindiec";	
   	}
   	
   	@Override
   	protected IecwindiecGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModelIecwindiec
entryRuleModelIecwindiec returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelIecwindiecRule()); }
	 iv_ruleModelIecwindiec=ruleModelIecwindiec 
	 { $current=$iv_ruleModelIecwindiec.current; } 
	 EOF 
;

// Rule ModelIecwindiec
ruleModelIecwindiec returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getModelIecwindiecAccess().getHeadHeaderParserRuleCall_0_0()); 
	    }
		lv_Head_0_0=ruleHeader		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelIecwindiecRule());
	        }
       		set(
       			$current, 
       			"Head",
        		lv_Head_0_0, 
        		"Header");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getModelIecwindiecAccess().getSectionsSectionParserRuleCall_1_0()); 
	    }
		lv_sections_1_0=ruleSection		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelIecwindiecRule());
	        }
       		add(
       			$current, 
       			"sections",
        		lv_sections_1_0, 
        		"Section");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getModelIecwindiecAccess().getSIUnitsSiUnitsParserRuleCall_2_0()); 
	    }
		lv_SIUnits_2_0=rulesiUnits		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelIecwindiecRule());
	        }
       		set(
       			$current, 
       			"SIUnits",
        		lv_SIUnits_2_0, 
        		"siUnits");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getModelIecwindiecAccess().getStartIStartParserRuleCall_3_0()); 
	    }
		lv_Start_3_0=ruleiStart		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelIecwindiecRule());
	        }
       		set(
       			$current, 
       			"Start",
        		lv_Start_3_0, 
        		"iStart");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getModelIecwindiecAccess().getSectionsSectionParserRuleCall_4_0()); 
	    }
		lv_sections_4_0=ruleSection		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelIecwindiecRule());
	        }
       		add(
       			$current, 
       			"sections",
        		lv_sections_4_0, 
        		"Section");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getModelIecwindiecAccess().getIECClassIIECClassParserRuleCall_5_0()); 
	    }
		lv_IECClass_5_0=ruleiIECClass		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelIecwindiecRule());
	        }
       		set(
       			$current, 
       			"IECClass",
        		lv_IECClass_5_0, 
        		"iIECClass");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getModelIecwindiecAccess().getWindTurbSWindTurbParserRuleCall_6_0()); 
	    }
		lv_WindTurb_6_0=rulesWindTurb		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelIecwindiecRule());
	        }
       		set(
       			$current, 
       			"WindTurb",
        		lv_WindTurb_6_0, 
        		"sWindTurb");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getModelIecwindiecAccess().getWindSlopeNWindSlopeParserRuleCall_7_0()); 
	    }
		lv_WindSlope_7_0=rulenWindSlope		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelIecwindiecRule());
	        }
       		set(
       			$current, 
       			"WindSlope",
        		lv_WindSlope_7_0, 
        		"nWindSlope");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getModelIecwindiecAccess().getIECStandardIIECStdParserRuleCall_8_0()); 
	    }
		lv_IECStandard_8_0=ruleiIECStd		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelIecwindiecRule());
	        }
       		set(
       			$current, 
       			"IECStandard",
        		lv_IECStandard_8_0, 
        		"iIECStd");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getModelIecwindiecAccess().getSectionsSectionParserRuleCall_9_0()); 
	    }
		lv_sections_9_0=ruleSection		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelIecwindiecRule());
	        }
       		add(
       			$current, 
       			"sections",
        		lv_sections_9_0, 
        		"Section");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getModelIecwindiecAccess().getHubHeightNHubHeightParserRuleCall_10_0()); 
	    }
		lv_HubHeight_10_0=rulenHubHeight		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelIecwindiecRule());
	        }
       		set(
       			$current, 
       			"HubHeight",
        		lv_HubHeight_10_0, 
        		"nHubHeight");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getModelIecwindiecAccess().getRotDiamNRotDiamParserRuleCall_11_0()); 
	    }
		lv_RotDiam_11_0=rulenRotDiam		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelIecwindiecRule());
	        }
       		set(
       			$current, 
       			"RotDiam",
        		lv_RotDiam_11_0, 
        		"nRotDiam");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getModelIecwindiecAccess().getWindInNWindInParserRuleCall_12_0()); 
	    }
		lv_WindIn_12_0=rulenWindIn		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelIecwindiecRule());
	        }
       		set(
       			$current, 
       			"WindIn",
        		lv_WindIn_12_0, 
        		"nWindIn");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getModelIecwindiecAccess().getWindNomNWindNomParserRuleCall_13_0()); 
	    }
		lv_WindNom_13_0=rulenWindNom		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelIecwindiecRule());
	        }
       		set(
       			$current, 
       			"WindNom",
        		lv_WindNom_13_0, 
        		"nWindNom");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getModelIecwindiecAccess().getWindOutNWindOutParserRuleCall_14_0()); 
	    }
		lv_WindOut_14_0=rulenWindOut		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelIecwindiecRule());
	        }
       		set(
       			$current, 
       			"WindOut",
        		lv_WindOut_14_0, 
        		"nWindOut");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getModelIecwindiecAccess().getSectionsSectionParserRuleCall_15_0()); 
	    }
		lv_sections_15_0=ruleSection		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelIecwindiecRule());
	        }
       		add(
       			$current, 
       			"sections",
        		lv_sections_15_0, 
        		"Section");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getModelIecwindiecAccess().getOutListVOutListParserRuleCall_16_0()); 
	    }
		lv_OutList_16_0=rulevOutList		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelIecwindiecRule());
	        }
       		set(
       			$current, 
       			"OutList",
        		lv_OutList_16_0, 
        		"vOutList");
	        afterParserOrEnumRuleCall();
	    }

)
)(this_WS_17=RULE_WS
    { 
    newLeafNode(this_WS_17, grammarAccess.getModelIecwindiecAccess().getWSTerminalRuleCall_17_0()); 
    }

    |this_NEWLINE_18=RULE_NEWLINE
    { 
    newLeafNode(this_NEWLINE_18, grammarAccess.getModelIecwindiecAccess().getNEWLINETerminalRuleCall_17_1()); 
    }

    |this_SL_COMMENT_19=RULE_SL_COMMENT
    { 
    newLeafNode(this_SL_COMMENT_19, grammarAccess.getModelIecwindiecAccess().getSL_COMMENTTerminalRuleCall_17_2()); 
    }
)*)
;





// Entry rule entryRuletNUMBER
entryRuletNUMBER returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getTNUMBERRule()); } 
	 iv_ruletNUMBER=ruletNUMBER 
	 { $current=$iv_ruletNUMBER.current.getText(); }  
	 EOF 
;

// Rule tNUMBER
ruletNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_INT_0=RULE_INT    {
		$current.merge(this_INT_0);
    }

    { 
    newLeafNode(this_INT_0, grammarAccess.getTNUMBERAccess().getINTTerminalRuleCall_0()); 
    }

    |    this_NUMBER_1=RULE_NUMBER    {
		$current.merge(this_NUMBER_1);
    }

    { 
    newLeafNode(this_NUMBER_1, grammarAccess.getTNUMBERAccess().getNUMBERTerminalRuleCall_1()); 
    }
)
    ;





// Entry rule entryRuletBOOL
entryRuletBOOL returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getTBOOLRule()); } 
	 iv_ruletBOOL=ruletBOOL 
	 { $current=$iv_ruletBOOL.current.getText(); }  
	 EOF 
;

// Rule tBOOL
ruletBOOL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='TRUE' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getTBOOLAccess().getTRUEKeyword_0()); 
    }

    |
	kw='True' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getTBOOLAccess().getTrueKeyword_1()); 
    }

    |
	kw='true' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getTBOOLAccess().getTrueKeyword_2()); 
    }

    |
	kw='FALSE' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getTBOOLAccess().getFALSEKeyword_3()); 
    }

    |
	kw='False' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getTBOOLAccess().getFalseKeyword_4()); 
    }

    |
	kw='false' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getTBOOLAccess().getFalseKeyword_5()); 
    }
)
    ;







// Entry rule entryRuletARRAY_OUT
entryRuletARRAY_OUT returns [String current=null] 
	@init { 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");
	}
	:
	{ newCompositeNode(grammarAccess.getTARRAY_OUTRule()); } 
	 iv_ruletARRAY_OUT=ruletARRAY_OUT 
	 { $current=$iv_ruletARRAY_OUT.current.getText(); }  
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule tARRAY_OUT
ruletARRAY_OUT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");
    }
    @after { leaveRule(); }:
((    this_WS_0=RULE_WS    {
		$current.merge(this_WS_0);
    }

    { 
    newLeafNode(this_WS_0, grammarAccess.getTARRAY_OUTAccess().getWSTerminalRuleCall_0()); 
    }
)?    this_OUT_1=RULE_OUT    {
		$current.merge(this_OUT_1);
    }

    { 
    newLeafNode(this_OUT_1, grammarAccess.getTARRAY_OUTAccess().getOUTTerminalRuleCall_1()); 
    }
(    this_WS_2=RULE_WS    {
		$current.merge(this_WS_2);
    }

    { 
    newLeafNode(this_WS_2, grammarAccess.getTARRAY_OUTAccess().getWSTerminalRuleCall_2()); 
    }
)?    this_NEWLINE_3=RULE_NEWLINE    {
		$current.merge(this_NEWLINE_3);
    }

    { 
    newLeafNode(this_NEWLINE_3, grammarAccess.getTARRAY_OUTAccess().getNEWLINETerminalRuleCall_3()); 
    }
)*
    ;
finally {
	myHiddenTokenState.restore();
}





// Entry rule entryRuleHeader
entryRuleHeader returns [EObject current=null] 
	@init { 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
	}
	:
	{ newCompositeNode(grammarAccess.getHeaderRule()); }
	 iv_ruleHeader=ruleHeader 
	 { $current=$iv_ruleHeader.current; } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule Header
ruleHeader returns [EObject current=null] 
    @init { enterRule(); 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
    }
    @after { leaveRule(); }:
((
(
		lv_row_0_0=RULE_SL_COMMENT
		{
			newLeafNode(lv_row_0_0, grammarAccess.getHeaderAccess().getRowSL_COMMENTTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getHeaderRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"row",
        		lv_row_0_0, 
        		"SL_COMMENT");
	    }

)
)this_NEWLINE_1=RULE_NEWLINE
    { 
    newLeafNode(this_NEWLINE_1, grammarAccess.getHeaderAccess().getNEWLINETerminalRuleCall_1()); 
    }
)
;
finally {
	myHiddenTokenState.restore();
}





// Entry rule entryRuleSection
entryRuleSection returns [EObject current=null] 
	@init { 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
	}
	:
	{ newCompositeNode(grammarAccess.getSectionRule()); }
	 iv_ruleSection=ruleSection 
	 { $current=$iv_ruleSection.current; } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule Section
ruleSection returns [EObject current=null] 
    @init { enterRule(); 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_SL_COMMENT
		{
			newLeafNode(lv_name_0_0, grammarAccess.getSectionAccess().getNameSL_COMMENTTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSectionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"SL_COMMENT");
	    }

)
)this_NEWLINE_1=RULE_NEWLINE
    { 
    newLeafNode(this_NEWLINE_1, grammarAccess.getSectionAccess().getNEWLINETerminalRuleCall_1()); 
    }
)
;
finally {
	myHiddenTokenState.restore();
}





// Entry rule entryRulesiUnits
entryRulesiUnits returns [EObject current=null] 
	@init { 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
	}
	:
	{ newCompositeNode(grammarAccess.getSiUnitsRule()); }
	 iv_rulesiUnits=rulesiUnits 
	 { $current=$iv_rulesiUnits.current; } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule siUnits
rulesiUnits returns [EObject current=null] 
    @init { enterRule(); 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
    }
    @after { leaveRule(); }:
((this_WS_0=RULE_WS
    { 
    newLeafNode(this_WS_0, grammarAccess.getSiUnitsAccess().getWSTerminalRuleCall_0()); 
    }
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getSiUnitsAccess().getValueTBOOLParserRuleCall_1_0()); 
	    }
		lv_value_1_0=ruletBOOL		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSiUnitsRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"tBOOL");
	        afterParserOrEnumRuleCall();
	    }

)
)this_WS_2=RULE_WS
    { 
    newLeafNode(this_WS_2, grammarAccess.getSiUnitsAccess().getWSTerminalRuleCall_2()); 
    }
(this_SL_COMMENT_3=RULE_SL_COMMENT
    { 
    newLeafNode(this_SL_COMMENT_3, grammarAccess.getSiUnitsAccess().getSL_COMMENTTerminalRuleCall_3()); 
    }
)?this_NEWLINE_4=RULE_NEWLINE
    { 
    newLeafNode(this_NEWLINE_4, grammarAccess.getSiUnitsAccess().getNEWLINETerminalRuleCall_4()); 
    }
)
;
finally {
	myHiddenTokenState.restore();
}





// Entry rule entryRuleiStart
entryRuleiStart returns [EObject current=null] 
	@init { 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
	}
	:
	{ newCompositeNode(grammarAccess.getIStartRule()); }
	 iv_ruleiStart=ruleiStart 
	 { $current=$iv_ruleiStart.current; } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule iStart
ruleiStart returns [EObject current=null] 
    @init { enterRule(); 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
    }
    @after { leaveRule(); }:
((this_WS_0=RULE_WS
    { 
    newLeafNode(this_WS_0, grammarAccess.getIStartAccess().getWSTerminalRuleCall_0()); 
    }
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getIStartAccess().getValueTNUMBERParserRuleCall_1_0()); 
	    }
		lv_value_1_0=ruletNUMBER		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIStartRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"tNUMBER");
	        afterParserOrEnumRuleCall();
	    }

)
)this_WS_2=RULE_WS
    { 
    newLeafNode(this_WS_2, grammarAccess.getIStartAccess().getWSTerminalRuleCall_2()); 
    }
(this_SL_COMMENT_3=RULE_SL_COMMENT
    { 
    newLeafNode(this_SL_COMMENT_3, grammarAccess.getIStartAccess().getSL_COMMENTTerminalRuleCall_3()); 
    }
)?this_NEWLINE_4=RULE_NEWLINE
    { 
    newLeafNode(this_NEWLINE_4, grammarAccess.getIStartAccess().getNEWLINETerminalRuleCall_4()); 
    }
)
;
finally {
	myHiddenTokenState.restore();
}





// Entry rule entryRuleiIECClass
entryRuleiIECClass returns [EObject current=null] 
	@init { 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
	}
	:
	{ newCompositeNode(grammarAccess.getIIECClassRule()); }
	 iv_ruleiIECClass=ruleiIECClass 
	 { $current=$iv_ruleiIECClass.current; } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule iIECClass
ruleiIECClass returns [EObject current=null] 
    @init { enterRule(); 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
    }
    @after { leaveRule(); }:
((this_WS_0=RULE_WS
    { 
    newLeafNode(this_WS_0, grammarAccess.getIIECClassAccess().getWSTerminalRuleCall_0()); 
    }
)?(
(
		lv_value_1_0=RULE_INT
		{
			newLeafNode(lv_value_1_0, grammarAccess.getIIECClassAccess().getValueINTTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getIIECClassRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"INT");
	    }

)
)this_WS_2=RULE_WS
    { 
    newLeafNode(this_WS_2, grammarAccess.getIIECClassAccess().getWSTerminalRuleCall_2()); 
    }
(this_SL_COMMENT_3=RULE_SL_COMMENT
    { 
    newLeafNode(this_SL_COMMENT_3, grammarAccess.getIIECClassAccess().getSL_COMMENTTerminalRuleCall_3()); 
    }
)?this_NEWLINE_4=RULE_NEWLINE
    { 
    newLeafNode(this_NEWLINE_4, grammarAccess.getIIECClassAccess().getNEWLINETerminalRuleCall_4()); 
    }
)
;
finally {
	myHiddenTokenState.restore();
}





// Entry rule entryRulesWindTurb
entryRulesWindTurb returns [EObject current=null] 
	@init { 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
	}
	:
	{ newCompositeNode(grammarAccess.getSWindTurbRule()); }
	 iv_rulesWindTurb=rulesWindTurb 
	 { $current=$iv_rulesWindTurb.current; } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule sWindTurb
rulesWindTurb returns [EObject current=null] 
    @init { enterRule(); 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
    }
    @after { leaveRule(); }:
((this_WS_0=RULE_WS
    { 
    newLeafNode(this_WS_0, grammarAccess.getSWindTurbAccess().getWSTerminalRuleCall_0()); 
    }
)?(
(
		lv_value_1_0=RULE_CLASS
		{
			newLeafNode(lv_value_1_0, grammarAccess.getSWindTurbAccess().getValueCLASSTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSWindTurbRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"CLASS");
	    }

)
)this_WS_2=RULE_WS
    { 
    newLeafNode(this_WS_2, grammarAccess.getSWindTurbAccess().getWSTerminalRuleCall_2()); 
    }
(this_SL_COMMENT_3=RULE_SL_COMMENT
    { 
    newLeafNode(this_SL_COMMENT_3, grammarAccess.getSWindTurbAccess().getSL_COMMENTTerminalRuleCall_3()); 
    }
)?this_NEWLINE_4=RULE_NEWLINE
    { 
    newLeafNode(this_NEWLINE_4, grammarAccess.getSWindTurbAccess().getNEWLINETerminalRuleCall_4()); 
    }
)
;
finally {
	myHiddenTokenState.restore();
}





// Entry rule entryRulenWindSlope
entryRulenWindSlope returns [EObject current=null] 
	@init { 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
	}
	:
	{ newCompositeNode(grammarAccess.getNWindSlopeRule()); }
	 iv_rulenWindSlope=rulenWindSlope 
	 { $current=$iv_rulenWindSlope.current; } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule nWindSlope
rulenWindSlope returns [EObject current=null] 
    @init { enterRule(); 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
    }
    @after { leaveRule(); }:
((this_WS_0=RULE_WS
    { 
    newLeafNode(this_WS_0, grammarAccess.getNWindSlopeAccess().getWSTerminalRuleCall_0()); 
    }
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getNWindSlopeAccess().getValueTNUMBERParserRuleCall_1_0()); 
	    }
		lv_value_1_0=ruletNUMBER		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNWindSlopeRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"tNUMBER");
	        afterParserOrEnumRuleCall();
	    }

)
)this_WS_2=RULE_WS
    { 
    newLeafNode(this_WS_2, grammarAccess.getNWindSlopeAccess().getWSTerminalRuleCall_2()); 
    }
(this_SL_COMMENT_3=RULE_SL_COMMENT
    { 
    newLeafNode(this_SL_COMMENT_3, grammarAccess.getNWindSlopeAccess().getSL_COMMENTTerminalRuleCall_3()); 
    }
)?this_NEWLINE_4=RULE_NEWLINE
    { 
    newLeafNode(this_NEWLINE_4, grammarAccess.getNWindSlopeAccess().getNEWLINETerminalRuleCall_4()); 
    }
)
;
finally {
	myHiddenTokenState.restore();
}





// Entry rule entryRuleiIECStd
entryRuleiIECStd returns [EObject current=null] 
	@init { 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
	}
	:
	{ newCompositeNode(grammarAccess.getIIECStdRule()); }
	 iv_ruleiIECStd=ruleiIECStd 
	 { $current=$iv_ruleiIECStd.current; } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule iIECStd
ruleiIECStd returns [EObject current=null] 
    @init { enterRule(); 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
    }
    @after { leaveRule(); }:
((this_WS_0=RULE_WS
    { 
    newLeafNode(this_WS_0, grammarAccess.getIIECStdAccess().getWSTerminalRuleCall_0()); 
    }
)?(
(
		lv_value_1_0=RULE_INT
		{
			newLeafNode(lv_value_1_0, grammarAccess.getIIECStdAccess().getValueINTTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getIIECStdRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"INT");
	    }

)
)this_WS_2=RULE_WS
    { 
    newLeafNode(this_WS_2, grammarAccess.getIIECStdAccess().getWSTerminalRuleCall_2()); 
    }
(this_SL_COMMENT_3=RULE_SL_COMMENT
    { 
    newLeafNode(this_SL_COMMENT_3, grammarAccess.getIIECStdAccess().getSL_COMMENTTerminalRuleCall_3()); 
    }
)?this_NEWLINE_4=RULE_NEWLINE
    { 
    newLeafNode(this_NEWLINE_4, grammarAccess.getIIECStdAccess().getNEWLINETerminalRuleCall_4()); 
    }
)
;
finally {
	myHiddenTokenState.restore();
}





// Entry rule entryRulenHubHeight
entryRulenHubHeight returns [EObject current=null] 
	@init { 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
	}
	:
	{ newCompositeNode(grammarAccess.getNHubHeightRule()); }
	 iv_rulenHubHeight=rulenHubHeight 
	 { $current=$iv_rulenHubHeight.current; } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule nHubHeight
rulenHubHeight returns [EObject current=null] 
    @init { enterRule(); 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
    }
    @after { leaveRule(); }:
((this_WS_0=RULE_WS
    { 
    newLeafNode(this_WS_0, grammarAccess.getNHubHeightAccess().getWSTerminalRuleCall_0()); 
    }
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getNHubHeightAccess().getValueTNUMBERParserRuleCall_1_0()); 
	    }
		lv_value_1_0=ruletNUMBER		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNHubHeightRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"tNUMBER");
	        afterParserOrEnumRuleCall();
	    }

)
)this_WS_2=RULE_WS
    { 
    newLeafNode(this_WS_2, grammarAccess.getNHubHeightAccess().getWSTerminalRuleCall_2()); 
    }
(this_SL_COMMENT_3=RULE_SL_COMMENT
    { 
    newLeafNode(this_SL_COMMENT_3, grammarAccess.getNHubHeightAccess().getSL_COMMENTTerminalRuleCall_3()); 
    }
)?this_NEWLINE_4=RULE_NEWLINE
    { 
    newLeafNode(this_NEWLINE_4, grammarAccess.getNHubHeightAccess().getNEWLINETerminalRuleCall_4()); 
    }
)
;
finally {
	myHiddenTokenState.restore();
}





// Entry rule entryRulenRotDiam
entryRulenRotDiam returns [EObject current=null] 
	@init { 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
	}
	:
	{ newCompositeNode(grammarAccess.getNRotDiamRule()); }
	 iv_rulenRotDiam=rulenRotDiam 
	 { $current=$iv_rulenRotDiam.current; } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule nRotDiam
rulenRotDiam returns [EObject current=null] 
    @init { enterRule(); 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
    }
    @after { leaveRule(); }:
((this_WS_0=RULE_WS
    { 
    newLeafNode(this_WS_0, grammarAccess.getNRotDiamAccess().getWSTerminalRuleCall_0()); 
    }
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getNRotDiamAccess().getValueTNUMBERParserRuleCall_1_0()); 
	    }
		lv_value_1_0=ruletNUMBER		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNRotDiamRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"tNUMBER");
	        afterParserOrEnumRuleCall();
	    }

)
)this_WS_2=RULE_WS
    { 
    newLeafNode(this_WS_2, grammarAccess.getNRotDiamAccess().getWSTerminalRuleCall_2()); 
    }
(this_SL_COMMENT_3=RULE_SL_COMMENT
    { 
    newLeafNode(this_SL_COMMENT_3, grammarAccess.getNRotDiamAccess().getSL_COMMENTTerminalRuleCall_3()); 
    }
)?this_NEWLINE_4=RULE_NEWLINE
    { 
    newLeafNode(this_NEWLINE_4, grammarAccess.getNRotDiamAccess().getNEWLINETerminalRuleCall_4()); 
    }
)
;
finally {
	myHiddenTokenState.restore();
}





// Entry rule entryRulenWindIn
entryRulenWindIn returns [EObject current=null] 
	@init { 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
	}
	:
	{ newCompositeNode(grammarAccess.getNWindInRule()); }
	 iv_rulenWindIn=rulenWindIn 
	 { $current=$iv_rulenWindIn.current; } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule nWindIn
rulenWindIn returns [EObject current=null] 
    @init { enterRule(); 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
    }
    @after { leaveRule(); }:
((this_WS_0=RULE_WS
    { 
    newLeafNode(this_WS_0, grammarAccess.getNWindInAccess().getWSTerminalRuleCall_0()); 
    }
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getNWindInAccess().getValueTNUMBERParserRuleCall_1_0()); 
	    }
		lv_value_1_0=ruletNUMBER		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNWindInRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"tNUMBER");
	        afterParserOrEnumRuleCall();
	    }

)
)this_WS_2=RULE_WS
    { 
    newLeafNode(this_WS_2, grammarAccess.getNWindInAccess().getWSTerminalRuleCall_2()); 
    }
(this_SL_COMMENT_3=RULE_SL_COMMENT
    { 
    newLeafNode(this_SL_COMMENT_3, grammarAccess.getNWindInAccess().getSL_COMMENTTerminalRuleCall_3()); 
    }
)?this_NEWLINE_4=RULE_NEWLINE
    { 
    newLeafNode(this_NEWLINE_4, grammarAccess.getNWindInAccess().getNEWLINETerminalRuleCall_4()); 
    }
)
;
finally {
	myHiddenTokenState.restore();
}





// Entry rule entryRulenWindNom
entryRulenWindNom returns [EObject current=null] 
	@init { 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
	}
	:
	{ newCompositeNode(grammarAccess.getNWindNomRule()); }
	 iv_rulenWindNom=rulenWindNom 
	 { $current=$iv_rulenWindNom.current; } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule nWindNom
rulenWindNom returns [EObject current=null] 
    @init { enterRule(); 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
    }
    @after { leaveRule(); }:
((this_WS_0=RULE_WS
    { 
    newLeafNode(this_WS_0, grammarAccess.getNWindNomAccess().getWSTerminalRuleCall_0()); 
    }
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getNWindNomAccess().getValueTNUMBERParserRuleCall_1_0()); 
	    }
		lv_value_1_0=ruletNUMBER		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNWindNomRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"tNUMBER");
	        afterParserOrEnumRuleCall();
	    }

)
)this_WS_2=RULE_WS
    { 
    newLeafNode(this_WS_2, grammarAccess.getNWindNomAccess().getWSTerminalRuleCall_2()); 
    }
(this_SL_COMMENT_3=RULE_SL_COMMENT
    { 
    newLeafNode(this_SL_COMMENT_3, grammarAccess.getNWindNomAccess().getSL_COMMENTTerminalRuleCall_3()); 
    }
)?this_NEWLINE_4=RULE_NEWLINE
    { 
    newLeafNode(this_NEWLINE_4, grammarAccess.getNWindNomAccess().getNEWLINETerminalRuleCall_4()); 
    }
)
;
finally {
	myHiddenTokenState.restore();
}





// Entry rule entryRulenWindOut
entryRulenWindOut returns [EObject current=null] 
	@init { 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
	}
	:
	{ newCompositeNode(grammarAccess.getNWindOutRule()); }
	 iv_rulenWindOut=rulenWindOut 
	 { $current=$iv_rulenWindOut.current; } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule nWindOut
rulenWindOut returns [EObject current=null] 
    @init { enterRule(); 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
    }
    @after { leaveRule(); }:
((this_WS_0=RULE_WS
    { 
    newLeafNode(this_WS_0, grammarAccess.getNWindOutAccess().getWSTerminalRuleCall_0()); 
    }
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getNWindOutAccess().getValueTNUMBERParserRuleCall_1_0()); 
	    }
		lv_value_1_0=ruletNUMBER		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNWindOutRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"tNUMBER");
	        afterParserOrEnumRuleCall();
	    }

)
)this_WS_2=RULE_WS
    { 
    newLeafNode(this_WS_2, grammarAccess.getNWindOutAccess().getWSTerminalRuleCall_2()); 
    }
(this_SL_COMMENT_3=RULE_SL_COMMENT
    { 
    newLeafNode(this_SL_COMMENT_3, grammarAccess.getNWindOutAccess().getSL_COMMENTTerminalRuleCall_3()); 
    }
)?this_NEWLINE_4=RULE_NEWLINE
    { 
    newLeafNode(this_NEWLINE_4, grammarAccess.getNWindOutAccess().getNEWLINETerminalRuleCall_4()); 
    }
)
;
finally {
	myHiddenTokenState.restore();
}





// Entry rule entryRulevOutList
entryRulevOutList returns [EObject current=null] 
	@init { 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
	}
	:
	{ newCompositeNode(grammarAccess.getVOutListRule()); }
	 iv_rulevOutList=rulevOutList 
	 { $current=$iv_rulevOutList.current; } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule vOutList
rulevOutList returns [EObject current=null] 
    @init { enterRule(); 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getVOutListAccess().getValueTARRAY_OUTParserRuleCall_0()); 
	    }
		lv_value_0_0=ruletARRAY_OUT		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getVOutListRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"tARRAY_OUT");
	        afterParserOrEnumRuleCall();
	    }

)
)
;
finally {
	myHiddenTokenState.restore();
}





RULE_OUT : ('ECD' ('-r'|'+r') (('-'|'+') '2.0')?|'EWS' ('V'|'H') ('-'|'+') RULE_INT+ ('.' RULE_INT)?|'EOG' ('i'|'r' (('-'|'+') '2.0')?|'o')|'EDC' ('-r'|'+r') (('-'|'+') '2.0')?|'NWP' RULE_INT+ ('.' RULE_INT)?);

RULE_INT : ('0'..'9')+;

RULE_NUMBER : (('+'|'-')? RULE_INT '.' RULE_INT? (('E'|'e') ('+'|'-')? RULE_INT)?|('+'|'-')? RULE_INT ('E'|'e') ('+'|'-')? RULE_INT|'.' RULE_INT (('E'|'e') ('+'|'-')? RULE_INT)?|'-' RULE_INT);

RULE_CLASS : ('A'|'B'|'C');

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_SL_COMMENT : '!' ~(('\r'|'\n'|'\r\n'))*;

RULE_NEWLINE : ('\r'|'\n'|'\r\n');

RULE_WS : (' '|'\t')+;

