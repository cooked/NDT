package sc.ndt.editor.fast.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import sc.ndt.editor.fast.services.FasttwrGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFasttwrParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WS", "RULE_NEWLINE", "RULE_SL_COMMENT", "RULE_INT", "RULE_NUMBER", "RULE_STRING", "'TRUE'", "'True'", "'true'", "'FALSE'", "'False'", "'false'", "'NTwInpSt'", "'CalcTMode'", "'TwrFADmp(1)'", "'TwrFADmp(2)'", "'TwrSSDmp(1)'", "'TwrSSDmp(2)'", "'FAStTunr(1)'", "'FAStTunr(2)'", "'SSStTunr(1)'", "'SSStTunr(2)'", "'AdjTwMa'", "'AdjFASt'", "'AdjSSSt'", "'TwFAM1Sh(2)'", "'TwFAM1Sh(3)'", "'TwFAM1Sh(4)'", "'TwFAM1Sh(5)'", "'TwFAM1Sh(6)'", "'TwFAM2Sh(2)'", "'TwFAM2Sh(3)'", "'TwFAM2Sh(4)'", "'TwFAM2Sh(5)'", "'TwFAM2Sh(6)'", "'TwSSM1Sh(2)'", "'TwSSM1Sh(3)'", "'TwSSM1Sh(4)'", "'TwSSM1Sh(5)'", "'TwSSM1Sh(6)'", "'TwSSM2Sh(2)'", "'TwSSM2Sh(3)'", "'TwSSM2Sh(4)'", "'TwSSM2Sh(5)'", "'TwSSM2Sh(6)'", "'HtFract'", "'TMassDen'", "'TwFAStif'", "'TwSSStif'", "'TwGJStif'", "'TwEAStif'", "'TwFAIner'", "'TwSSIner'", "'TwFAcgOf'", "'TwSScgOf'", "'(-)'", "'(kg/m)'", "'(Nm^2)'", "'(N)'", "'(kg m)'", "'(m)'"
    };
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int RULE_NUMBER=8;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int T__10=10;
    public static final int RULE_INT=7;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int RULE_NEWLINE=5;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=6;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=9;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=4;

    // delegates
    // delegators


        public InternalFasttwrParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFasttwrParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFasttwrParser.tokenNames; }
    public String getGrammarFileName() { return "../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g"; }



     	private FasttwrGrammarAccess grammarAccess;
     	
        public InternalFasttwrParser(TokenStream input, FasttwrGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ModelFasttwr";	
       	}
       	
       	@Override
       	protected FasttwrGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModelFasttwr"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:67:1: entryRuleModelFasttwr returns [EObject current=null] : iv_ruleModelFasttwr= ruleModelFasttwr EOF ;
    public final EObject entryRuleModelFasttwr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelFasttwr = null;


        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:68:2: (iv_ruleModelFasttwr= ruleModelFasttwr EOF )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:69:2: iv_ruleModelFasttwr= ruleModelFasttwr EOF
            {
             newCompositeNode(grammarAccess.getModelFasttwrRule()); 
            pushFollow(FOLLOW_ruleModelFasttwr_in_entryRuleModelFasttwr75);
            iv_ruleModelFasttwr=ruleModelFasttwr();

            state._fsp--;

             current =iv_ruleModelFasttwr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelFasttwr85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelFasttwr"


    // $ANTLR start "ruleModelFasttwr"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:76:1: ruleModelFasttwr returns [EObject current=null] : ( ( (lv_Head_0_0= ruleHeader ) ) ( (lv_sections_1_0= ruleSection ) ) ( (lv_NTwInpSt_2_0= rulenNTwInpSt ) ) ( (lv_CalcTMode_3_0= rulebCalcTMode ) ) ( (lv_BldFlDmp1_4_0= rulenTwrFADmp1 ) ) ( (lv_BldFlDmp2_5_0= rulenTwrFADmp2 ) ) ( (lv_BldEdDmp1_6_0= rulenTwrSSDmp1 ) ) ( (lv_BldEdDmp2_7_0= rulenTwrSSDmp2 ) ) ( (lv_sections_8_0= ruleSection ) ) ( (lv_FAStTunr1_9_0= rulenFAStTunr1 ) ) ( (lv_FAStTunr2_10_0= rulenFAStTunr2 ) ) ( (lv_SSStTunr1_11_0= rulenSSStTunr1 ) ) ( (lv_SSStTunr2_12_0= rulenSSStTunr2 ) ) ( (lv_AdjTwMa_13_0= ruleAdjTwMa ) ) ( (lv_AdjFASt_14_0= ruleAdjFASt ) ) ( (lv_AdjSSSt_15_0= ruleAdjSSSt ) ) ( (lv_sections_16_0= ruleSection ) ) ( (lv_TwrStat_17_0= ruleaTwrStat ) ) ( (lv_sections_18_0= ruleSection ) ) ( (lv_TwFAM1Sh2_19_0= rulenTwFAM1Sh2 ) ) ( (lv_TwFAM1Sh3_20_0= rulenTwFAM1Sh3 ) ) ( (lv_TwFAM1Sh4_21_0= rulenTwFAM1Sh4 ) ) ( (lv_TwFAM1Sh5_22_0= rulenTwFAM1Sh5 ) ) ( (lv_TwFAM1Sh6_23_0= rulenTwFAM1Sh6 ) ) ( (lv_TwFAM2Sh2_24_0= rulenTwFAM2Sh2 ) ) ( (lv_TwFAM2Sh3_25_0= rulenTwFAM2Sh3 ) ) ( (lv_TwFAM2Sh4_26_0= rulenTwFAM2Sh4 ) ) ( (lv_TwFAM2Sh5_27_0= rulenTwFAM2Sh5 ) ) ( (lv_TwFAM2Sh6_28_0= rulenTwFAM2Sh6 ) ) ( (lv_sections_29_0= ruleSection ) ) ( (lv_TwSSM1Sh2_30_0= rulenTwSSM1Sh2 ) ) ( (lv_TwSSM1Sh3_31_0= rulenTwSSM1Sh3 ) ) ( (lv_TwSSM1Sh4_32_0= rulenTwSSM1Sh4 ) ) ( (lv_TwSSM1Sh5_33_0= rulenTwSSM1Sh5 ) ) ( (lv_TwSSM1Sh6_34_0= rulenTwSSM1Sh6 ) ) ( (lv_TwSSM2Sh2_35_0= rulenTwSSM2Sh2 ) ) ( (lv_TwSSM2Sh3_36_0= rulenTwSSM2Sh3 ) ) ( (lv_TwSSM2Sh4_37_0= rulenTwSSM2Sh4 ) ) ( (lv_TwSSM2Sh5_38_0= rulenTwSSM2Sh5 ) ) ( (lv_TwSSM2Sh6_39_0= rulenTwSSM2Sh6 ) ) (this_WS_40= RULE_WS | this_NEWLINE_41= RULE_NEWLINE | this_SL_COMMENT_42= RULE_SL_COMMENT )* ) ;
    public final EObject ruleModelFasttwr() throws RecognitionException {
        EObject current = null;

        Token this_WS_40=null;
        Token this_NEWLINE_41=null;
        Token this_SL_COMMENT_42=null;
        EObject lv_Head_0_0 = null;

        EObject lv_sections_1_0 = null;

        EObject lv_NTwInpSt_2_0 = null;

        EObject lv_CalcTMode_3_0 = null;

        EObject lv_BldFlDmp1_4_0 = null;

        EObject lv_BldFlDmp2_5_0 = null;

        EObject lv_BldEdDmp1_6_0 = null;

        EObject lv_BldEdDmp2_7_0 = null;

        EObject lv_sections_8_0 = null;

        EObject lv_FAStTunr1_9_0 = null;

        EObject lv_FAStTunr2_10_0 = null;

        EObject lv_SSStTunr1_11_0 = null;

        EObject lv_SSStTunr2_12_0 = null;

        EObject lv_AdjTwMa_13_0 = null;

        EObject lv_AdjFASt_14_0 = null;

        EObject lv_AdjSSSt_15_0 = null;

        EObject lv_sections_16_0 = null;

        EObject lv_TwrStat_17_0 = null;

        EObject lv_sections_18_0 = null;

        EObject lv_TwFAM1Sh2_19_0 = null;

        EObject lv_TwFAM1Sh3_20_0 = null;

        EObject lv_TwFAM1Sh4_21_0 = null;

        EObject lv_TwFAM1Sh5_22_0 = null;

        EObject lv_TwFAM1Sh6_23_0 = null;

        EObject lv_TwFAM2Sh2_24_0 = null;

        EObject lv_TwFAM2Sh3_25_0 = null;

        EObject lv_TwFAM2Sh4_26_0 = null;

        EObject lv_TwFAM2Sh5_27_0 = null;

        EObject lv_TwFAM2Sh6_28_0 = null;

        EObject lv_sections_29_0 = null;

        EObject lv_TwSSM1Sh2_30_0 = null;

        EObject lv_TwSSM1Sh3_31_0 = null;

        EObject lv_TwSSM1Sh4_32_0 = null;

        EObject lv_TwSSM1Sh5_33_0 = null;

        EObject lv_TwSSM1Sh6_34_0 = null;

        EObject lv_TwSSM2Sh2_35_0 = null;

        EObject lv_TwSSM2Sh3_36_0 = null;

        EObject lv_TwSSM2Sh4_37_0 = null;

        EObject lv_TwSSM2Sh5_38_0 = null;

        EObject lv_TwSSM2Sh6_39_0 = null;


         enterRule(); 
            
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:79:28: ( ( ( (lv_Head_0_0= ruleHeader ) ) ( (lv_sections_1_0= ruleSection ) ) ( (lv_NTwInpSt_2_0= rulenNTwInpSt ) ) ( (lv_CalcTMode_3_0= rulebCalcTMode ) ) ( (lv_BldFlDmp1_4_0= rulenTwrFADmp1 ) ) ( (lv_BldFlDmp2_5_0= rulenTwrFADmp2 ) ) ( (lv_BldEdDmp1_6_0= rulenTwrSSDmp1 ) ) ( (lv_BldEdDmp2_7_0= rulenTwrSSDmp2 ) ) ( (lv_sections_8_0= ruleSection ) ) ( (lv_FAStTunr1_9_0= rulenFAStTunr1 ) ) ( (lv_FAStTunr2_10_0= rulenFAStTunr2 ) ) ( (lv_SSStTunr1_11_0= rulenSSStTunr1 ) ) ( (lv_SSStTunr2_12_0= rulenSSStTunr2 ) ) ( (lv_AdjTwMa_13_0= ruleAdjTwMa ) ) ( (lv_AdjFASt_14_0= ruleAdjFASt ) ) ( (lv_AdjSSSt_15_0= ruleAdjSSSt ) ) ( (lv_sections_16_0= ruleSection ) ) ( (lv_TwrStat_17_0= ruleaTwrStat ) ) ( (lv_sections_18_0= ruleSection ) ) ( (lv_TwFAM1Sh2_19_0= rulenTwFAM1Sh2 ) ) ( (lv_TwFAM1Sh3_20_0= rulenTwFAM1Sh3 ) ) ( (lv_TwFAM1Sh4_21_0= rulenTwFAM1Sh4 ) ) ( (lv_TwFAM1Sh5_22_0= rulenTwFAM1Sh5 ) ) ( (lv_TwFAM1Sh6_23_0= rulenTwFAM1Sh6 ) ) ( (lv_TwFAM2Sh2_24_0= rulenTwFAM2Sh2 ) ) ( (lv_TwFAM2Sh3_25_0= rulenTwFAM2Sh3 ) ) ( (lv_TwFAM2Sh4_26_0= rulenTwFAM2Sh4 ) ) ( (lv_TwFAM2Sh5_27_0= rulenTwFAM2Sh5 ) ) ( (lv_TwFAM2Sh6_28_0= rulenTwFAM2Sh6 ) ) ( (lv_sections_29_0= ruleSection ) ) ( (lv_TwSSM1Sh2_30_0= rulenTwSSM1Sh2 ) ) ( (lv_TwSSM1Sh3_31_0= rulenTwSSM1Sh3 ) ) ( (lv_TwSSM1Sh4_32_0= rulenTwSSM1Sh4 ) ) ( (lv_TwSSM1Sh5_33_0= rulenTwSSM1Sh5 ) ) ( (lv_TwSSM1Sh6_34_0= rulenTwSSM1Sh6 ) ) ( (lv_TwSSM2Sh2_35_0= rulenTwSSM2Sh2 ) ) ( (lv_TwSSM2Sh3_36_0= rulenTwSSM2Sh3 ) ) ( (lv_TwSSM2Sh4_37_0= rulenTwSSM2Sh4 ) ) ( (lv_TwSSM2Sh5_38_0= rulenTwSSM2Sh5 ) ) ( (lv_TwSSM2Sh6_39_0= rulenTwSSM2Sh6 ) ) (this_WS_40= RULE_WS | this_NEWLINE_41= RULE_NEWLINE | this_SL_COMMENT_42= RULE_SL_COMMENT )* ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:80:1: ( ( (lv_Head_0_0= ruleHeader ) ) ( (lv_sections_1_0= ruleSection ) ) ( (lv_NTwInpSt_2_0= rulenNTwInpSt ) ) ( (lv_CalcTMode_3_0= rulebCalcTMode ) ) ( (lv_BldFlDmp1_4_0= rulenTwrFADmp1 ) ) ( (lv_BldFlDmp2_5_0= rulenTwrFADmp2 ) ) ( (lv_BldEdDmp1_6_0= rulenTwrSSDmp1 ) ) ( (lv_BldEdDmp2_7_0= rulenTwrSSDmp2 ) ) ( (lv_sections_8_0= ruleSection ) ) ( (lv_FAStTunr1_9_0= rulenFAStTunr1 ) ) ( (lv_FAStTunr2_10_0= rulenFAStTunr2 ) ) ( (lv_SSStTunr1_11_0= rulenSSStTunr1 ) ) ( (lv_SSStTunr2_12_0= rulenSSStTunr2 ) ) ( (lv_AdjTwMa_13_0= ruleAdjTwMa ) ) ( (lv_AdjFASt_14_0= ruleAdjFASt ) ) ( (lv_AdjSSSt_15_0= ruleAdjSSSt ) ) ( (lv_sections_16_0= ruleSection ) ) ( (lv_TwrStat_17_0= ruleaTwrStat ) ) ( (lv_sections_18_0= ruleSection ) ) ( (lv_TwFAM1Sh2_19_0= rulenTwFAM1Sh2 ) ) ( (lv_TwFAM1Sh3_20_0= rulenTwFAM1Sh3 ) ) ( (lv_TwFAM1Sh4_21_0= rulenTwFAM1Sh4 ) ) ( (lv_TwFAM1Sh5_22_0= rulenTwFAM1Sh5 ) ) ( (lv_TwFAM1Sh6_23_0= rulenTwFAM1Sh6 ) ) ( (lv_TwFAM2Sh2_24_0= rulenTwFAM2Sh2 ) ) ( (lv_TwFAM2Sh3_25_0= rulenTwFAM2Sh3 ) ) ( (lv_TwFAM2Sh4_26_0= rulenTwFAM2Sh4 ) ) ( (lv_TwFAM2Sh5_27_0= rulenTwFAM2Sh5 ) ) ( (lv_TwFAM2Sh6_28_0= rulenTwFAM2Sh6 ) ) ( (lv_sections_29_0= ruleSection ) ) ( (lv_TwSSM1Sh2_30_0= rulenTwSSM1Sh2 ) ) ( (lv_TwSSM1Sh3_31_0= rulenTwSSM1Sh3 ) ) ( (lv_TwSSM1Sh4_32_0= rulenTwSSM1Sh4 ) ) ( (lv_TwSSM1Sh5_33_0= rulenTwSSM1Sh5 ) ) ( (lv_TwSSM1Sh6_34_0= rulenTwSSM1Sh6 ) ) ( (lv_TwSSM2Sh2_35_0= rulenTwSSM2Sh2 ) ) ( (lv_TwSSM2Sh3_36_0= rulenTwSSM2Sh3 ) ) ( (lv_TwSSM2Sh4_37_0= rulenTwSSM2Sh4 ) ) ( (lv_TwSSM2Sh5_38_0= rulenTwSSM2Sh5 ) ) ( (lv_TwSSM2Sh6_39_0= rulenTwSSM2Sh6 ) ) (this_WS_40= RULE_WS | this_NEWLINE_41= RULE_NEWLINE | this_SL_COMMENT_42= RULE_SL_COMMENT )* )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:80:1: ( ( (lv_Head_0_0= ruleHeader ) ) ( (lv_sections_1_0= ruleSection ) ) ( (lv_NTwInpSt_2_0= rulenNTwInpSt ) ) ( (lv_CalcTMode_3_0= rulebCalcTMode ) ) ( (lv_BldFlDmp1_4_0= rulenTwrFADmp1 ) ) ( (lv_BldFlDmp2_5_0= rulenTwrFADmp2 ) ) ( (lv_BldEdDmp1_6_0= rulenTwrSSDmp1 ) ) ( (lv_BldEdDmp2_7_0= rulenTwrSSDmp2 ) ) ( (lv_sections_8_0= ruleSection ) ) ( (lv_FAStTunr1_9_0= rulenFAStTunr1 ) ) ( (lv_FAStTunr2_10_0= rulenFAStTunr2 ) ) ( (lv_SSStTunr1_11_0= rulenSSStTunr1 ) ) ( (lv_SSStTunr2_12_0= rulenSSStTunr2 ) ) ( (lv_AdjTwMa_13_0= ruleAdjTwMa ) ) ( (lv_AdjFASt_14_0= ruleAdjFASt ) ) ( (lv_AdjSSSt_15_0= ruleAdjSSSt ) ) ( (lv_sections_16_0= ruleSection ) ) ( (lv_TwrStat_17_0= ruleaTwrStat ) ) ( (lv_sections_18_0= ruleSection ) ) ( (lv_TwFAM1Sh2_19_0= rulenTwFAM1Sh2 ) ) ( (lv_TwFAM1Sh3_20_0= rulenTwFAM1Sh3 ) ) ( (lv_TwFAM1Sh4_21_0= rulenTwFAM1Sh4 ) ) ( (lv_TwFAM1Sh5_22_0= rulenTwFAM1Sh5 ) ) ( (lv_TwFAM1Sh6_23_0= rulenTwFAM1Sh6 ) ) ( (lv_TwFAM2Sh2_24_0= rulenTwFAM2Sh2 ) ) ( (lv_TwFAM2Sh3_25_0= rulenTwFAM2Sh3 ) ) ( (lv_TwFAM2Sh4_26_0= rulenTwFAM2Sh4 ) ) ( (lv_TwFAM2Sh5_27_0= rulenTwFAM2Sh5 ) ) ( (lv_TwFAM2Sh6_28_0= rulenTwFAM2Sh6 ) ) ( (lv_sections_29_0= ruleSection ) ) ( (lv_TwSSM1Sh2_30_0= rulenTwSSM1Sh2 ) ) ( (lv_TwSSM1Sh3_31_0= rulenTwSSM1Sh3 ) ) ( (lv_TwSSM1Sh4_32_0= rulenTwSSM1Sh4 ) ) ( (lv_TwSSM1Sh5_33_0= rulenTwSSM1Sh5 ) ) ( (lv_TwSSM1Sh6_34_0= rulenTwSSM1Sh6 ) ) ( (lv_TwSSM2Sh2_35_0= rulenTwSSM2Sh2 ) ) ( (lv_TwSSM2Sh3_36_0= rulenTwSSM2Sh3 ) ) ( (lv_TwSSM2Sh4_37_0= rulenTwSSM2Sh4 ) ) ( (lv_TwSSM2Sh5_38_0= rulenTwSSM2Sh5 ) ) ( (lv_TwSSM2Sh6_39_0= rulenTwSSM2Sh6 ) ) (this_WS_40= RULE_WS | this_NEWLINE_41= RULE_NEWLINE | this_SL_COMMENT_42= RULE_SL_COMMENT )* )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:80:2: ( (lv_Head_0_0= ruleHeader ) ) ( (lv_sections_1_0= ruleSection ) ) ( (lv_NTwInpSt_2_0= rulenNTwInpSt ) ) ( (lv_CalcTMode_3_0= rulebCalcTMode ) ) ( (lv_BldFlDmp1_4_0= rulenTwrFADmp1 ) ) ( (lv_BldFlDmp2_5_0= rulenTwrFADmp2 ) ) ( (lv_BldEdDmp1_6_0= rulenTwrSSDmp1 ) ) ( (lv_BldEdDmp2_7_0= rulenTwrSSDmp2 ) ) ( (lv_sections_8_0= ruleSection ) ) ( (lv_FAStTunr1_9_0= rulenFAStTunr1 ) ) ( (lv_FAStTunr2_10_0= rulenFAStTunr2 ) ) ( (lv_SSStTunr1_11_0= rulenSSStTunr1 ) ) ( (lv_SSStTunr2_12_0= rulenSSStTunr2 ) ) ( (lv_AdjTwMa_13_0= ruleAdjTwMa ) ) ( (lv_AdjFASt_14_0= ruleAdjFASt ) ) ( (lv_AdjSSSt_15_0= ruleAdjSSSt ) ) ( (lv_sections_16_0= ruleSection ) ) ( (lv_TwrStat_17_0= ruleaTwrStat ) ) ( (lv_sections_18_0= ruleSection ) ) ( (lv_TwFAM1Sh2_19_0= rulenTwFAM1Sh2 ) ) ( (lv_TwFAM1Sh3_20_0= rulenTwFAM1Sh3 ) ) ( (lv_TwFAM1Sh4_21_0= rulenTwFAM1Sh4 ) ) ( (lv_TwFAM1Sh5_22_0= rulenTwFAM1Sh5 ) ) ( (lv_TwFAM1Sh6_23_0= rulenTwFAM1Sh6 ) ) ( (lv_TwFAM2Sh2_24_0= rulenTwFAM2Sh2 ) ) ( (lv_TwFAM2Sh3_25_0= rulenTwFAM2Sh3 ) ) ( (lv_TwFAM2Sh4_26_0= rulenTwFAM2Sh4 ) ) ( (lv_TwFAM2Sh5_27_0= rulenTwFAM2Sh5 ) ) ( (lv_TwFAM2Sh6_28_0= rulenTwFAM2Sh6 ) ) ( (lv_sections_29_0= ruleSection ) ) ( (lv_TwSSM1Sh2_30_0= rulenTwSSM1Sh2 ) ) ( (lv_TwSSM1Sh3_31_0= rulenTwSSM1Sh3 ) ) ( (lv_TwSSM1Sh4_32_0= rulenTwSSM1Sh4 ) ) ( (lv_TwSSM1Sh5_33_0= rulenTwSSM1Sh5 ) ) ( (lv_TwSSM1Sh6_34_0= rulenTwSSM1Sh6 ) ) ( (lv_TwSSM2Sh2_35_0= rulenTwSSM2Sh2 ) ) ( (lv_TwSSM2Sh3_36_0= rulenTwSSM2Sh3 ) ) ( (lv_TwSSM2Sh4_37_0= rulenTwSSM2Sh4 ) ) ( (lv_TwSSM2Sh5_38_0= rulenTwSSM2Sh5 ) ) ( (lv_TwSSM2Sh6_39_0= rulenTwSSM2Sh6 ) ) (this_WS_40= RULE_WS | this_NEWLINE_41= RULE_NEWLINE | this_SL_COMMENT_42= RULE_SL_COMMENT )*
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:80:2: ( (lv_Head_0_0= ruleHeader ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:81:1: (lv_Head_0_0= ruleHeader )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:81:1: (lv_Head_0_0= ruleHeader )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:82:3: lv_Head_0_0= ruleHeader
            {
             
            	        newCompositeNode(grammarAccess.getModelFasttwrAccess().getHeadHeaderParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleHeader_in_ruleModelFasttwr131);
            lv_Head_0_0=ruleHeader();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelFasttwrRule());
            	        }
                   		set(
                   			current, 
                   			"Head",
                    		lv_Head_0_0, 
                    		"Header");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:98:2: ( (lv_sections_1_0= ruleSection ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:99:1: (lv_sections_1_0= ruleSection )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:99:1: (lv_sections_1_0= ruleSection )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:100:3: lv_sections_1_0= ruleSection
            {
             
            	        newCompositeNode(grammarAccess.getModelFasttwrAccess().getSectionsSectionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSection_in_ruleModelFasttwr152);
            lv_sections_1_0=ruleSection();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelFasttwrRule());
            	        }
                   		add(
                   			current, 
                   			"sections",
                    		lv_sections_1_0, 
                    		"Section");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:116:2: ( (lv_NTwInpSt_2_0= rulenNTwInpSt ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:117:1: (lv_NTwInpSt_2_0= rulenNTwInpSt )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:117:1: (lv_NTwInpSt_2_0= rulenNTwInpSt )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:118:3: lv_NTwInpSt_2_0= rulenNTwInpSt
            {
             
            	        newCompositeNode(grammarAccess.getModelFasttwrAccess().getNTwInpStNNTwInpStParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulenNTwInpSt_in_ruleModelFasttwr173);
            lv_NTwInpSt_2_0=rulenNTwInpSt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelFasttwrRule());
            	        }
                   		set(
                   			current, 
                   			"NTwInpSt",
                    		lv_NTwInpSt_2_0, 
                    		"nNTwInpSt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:134:2: ( (lv_CalcTMode_3_0= rulebCalcTMode ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:135:1: (lv_CalcTMode_3_0= rulebCalcTMode )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:135:1: (lv_CalcTMode_3_0= rulebCalcTMode )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:136:3: lv_CalcTMode_3_0= rulebCalcTMode
            {
             
            	        newCompositeNode(grammarAccess.getModelFasttwrAccess().getCalcTModeBCalcTModeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulebCalcTMode_in_ruleModelFasttwr194);
            lv_CalcTMode_3_0=rulebCalcTMode();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelFasttwrRule());
            	        }
                   		set(
                   			current, 
                   			"CalcTMode",
                    		lv_CalcTMode_3_0, 
                    		"bCalcTMode");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:152:2: ( (lv_BldFlDmp1_4_0= rulenTwrFADmp1 ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:153:1: (lv_BldFlDmp1_4_0= rulenTwrFADmp1 )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:153:1: (lv_BldFlDmp1_4_0= rulenTwrFADmp1 )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:154:3: lv_BldFlDmp1_4_0= rulenTwrFADmp1
            {
             
            	        newCompositeNode(grammarAccess.getModelFasttwrAccess().getBldFlDmp1NTwrFADmp1ParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_rulenTwrFADmp1_in_ruleModelFasttwr215);
            lv_BldFlDmp1_4_0=rulenTwrFADmp1();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelFasttwrRule());
            	        }
                   		set(
                   			current, 
                   			"BldFlDmp1",
                    		lv_BldFlDmp1_4_0, 
                    		"nTwrFADmp1");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:170:2: ( (lv_BldFlDmp2_5_0= rulenTwrFADmp2 ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:171:1: (lv_BldFlDmp2_5_0= rulenTwrFADmp2 )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:171:1: (lv_BldFlDmp2_5_0= rulenTwrFADmp2 )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:172:3: lv_BldFlDmp2_5_0= rulenTwrFADmp2
            {
             
            	        newCompositeNode(grammarAccess.getModelFasttwrAccess().getBldFlDmp2NTwrFADmp2ParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_rulenTwrFADmp2_in_ruleModelFasttwr236);
            lv_BldFlDmp2_5_0=rulenTwrFADmp2();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelFasttwrRule());
            	        }
                   		set(
                   			current, 
                   			"BldFlDmp2",
                    		lv_BldFlDmp2_5_0, 
                    		"nTwrFADmp2");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:188:2: ( (lv_BldEdDmp1_6_0= rulenTwrSSDmp1 ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:189:1: (lv_BldEdDmp1_6_0= rulenTwrSSDmp1 )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:189:1: (lv_BldEdDmp1_6_0= rulenTwrSSDmp1 )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:190:3: lv_BldEdDmp1_6_0= rulenTwrSSDmp1
            {
             
            	        newCompositeNode(grammarAccess.getModelFasttwrAccess().getBldEdDmp1NTwrSSDmp1ParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_rulenTwrSSDmp1_in_ruleModelFasttwr257);
            lv_BldEdDmp1_6_0=rulenTwrSSDmp1();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelFasttwrRule());
            	        }
                   		set(
                   			current, 
                   			"BldEdDmp1",
                    		lv_BldEdDmp1_6_0, 
                    		"nTwrSSDmp1");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:206:2: ( (lv_BldEdDmp2_7_0= rulenTwrSSDmp2 ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:207:1: (lv_BldEdDmp2_7_0= rulenTwrSSDmp2 )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:207:1: (lv_BldEdDmp2_7_0= rulenTwrSSDmp2 )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:208:3: lv_BldEdDmp2_7_0= rulenTwrSSDmp2
            {
             
            	        newCompositeNode(grammarAccess.getModelFasttwrAccess().getBldEdDmp2NTwrSSDmp2ParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_rulenTwrSSDmp2_in_ruleModelFasttwr278);
            lv_BldEdDmp2_7_0=rulenTwrSSDmp2();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelFasttwrRule());
            	        }
                   		set(
                   			current, 
                   			"BldEdDmp2",
                    		lv_BldEdDmp2_7_0, 
                    		"nTwrSSDmp2");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:224:2: ( (lv_sections_8_0= ruleSection ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:225:1: (lv_sections_8_0= ruleSection )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:225:1: (lv_sections_8_0= ruleSection )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:226:3: lv_sections_8_0= ruleSection
            {
             
            	        newCompositeNode(grammarAccess.getModelFasttwrAccess().getSectionsSectionParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleSection_in_ruleModelFasttwr299);
            lv_sections_8_0=ruleSection();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelFasttwrRule());
            	        }
                   		add(
                   			current, 
                   			"sections",
                    		lv_sections_8_0, 
                    		"Section");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:242:2: ( (lv_FAStTunr1_9_0= rulenFAStTunr1 ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:243:1: (lv_FAStTunr1_9_0= rulenFAStTunr1 )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:243:1: (lv_FAStTunr1_9_0= rulenFAStTunr1 )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:244:3: lv_FAStTunr1_9_0= rulenFAStTunr1
            {
             
            	        newCompositeNode(grammarAccess.getModelFasttwrAccess().getFAStTunr1NFAStTunr1ParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_rulenFAStTunr1_in_ruleModelFasttwr320);
            lv_FAStTunr1_9_0=rulenFAStTunr1();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelFasttwrRule());
            	        }
                   		set(
                   			current, 
                   			"FAStTunr1",
                    		lv_FAStTunr1_9_0, 
                    		"nFAStTunr1");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:260:2: ( (lv_FAStTunr2_10_0= rulenFAStTunr2 ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:261:1: (lv_FAStTunr2_10_0= rulenFAStTunr2 )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:261:1: (lv_FAStTunr2_10_0= rulenFAStTunr2 )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:262:3: lv_FAStTunr2_10_0= rulenFAStTunr2
            {
             
            	        newCompositeNode(grammarAccess.getModelFasttwrAccess().getFAStTunr2NFAStTunr2ParserRuleCall_10_0()); 
            	    
            pushFollow(FOLLOW_rulenFAStTunr2_in_ruleModelFasttwr341);
            lv_FAStTunr2_10_0=rulenFAStTunr2();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelFasttwrRule());
            	        }
                   		set(
                   			current, 
                   			"FAStTunr2",
                    		lv_FAStTunr2_10_0, 
                    		"nFAStTunr2");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:278:2: ( (lv_SSStTunr1_11_0= rulenSSStTunr1 ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:279:1: (lv_SSStTunr1_11_0= rulenSSStTunr1 )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:279:1: (lv_SSStTunr1_11_0= rulenSSStTunr1 )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:280:3: lv_SSStTunr1_11_0= rulenSSStTunr1
            {
             
            	        newCompositeNode(grammarAccess.getModelFasttwrAccess().getSSStTunr1NSSStTunr1ParserRuleCall_11_0()); 
            	    
            pushFollow(FOLLOW_rulenSSStTunr1_in_ruleModelFasttwr362);
            lv_SSStTunr1_11_0=rulenSSStTunr1();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelFasttwrRule());
            	        }
                   		set(
                   			current, 
                   			"SSStTunr1",
                    		lv_SSStTunr1_11_0, 
                    		"nSSStTunr1");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:296:2: ( (lv_SSStTunr2_12_0= rulenSSStTunr2 ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:297:1: (lv_SSStTunr2_12_0= rulenSSStTunr2 )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:297:1: (lv_SSStTunr2_12_0= rulenSSStTunr2 )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:298:3: lv_SSStTunr2_12_0= rulenSSStTunr2
            {
             
            	        newCompositeNode(grammarAccess.getModelFasttwrAccess().getSSStTunr2NSSStTunr2ParserRuleCall_12_0()); 
            	    
            pushFollow(FOLLOW_rulenSSStTunr2_in_ruleModelFasttwr383);
            lv_SSStTunr2_12_0=rulenSSStTunr2();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelFasttwrRule());
            	        }
                   		set(
                   			current, 
                   			"SSStTunr2",
                    		lv_SSStTunr2_12_0, 
                    		"nSSStTunr2");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:314:2: ( (lv_AdjTwMa_13_0= ruleAdjTwMa ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:315:1: (lv_AdjTwMa_13_0= ruleAdjTwMa )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:315:1: (lv_AdjTwMa_13_0= ruleAdjTwMa )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:316:3: lv_AdjTwMa_13_0= ruleAdjTwMa
            {
             
            	        newCompositeNode(grammarAccess.getModelFasttwrAccess().getAdjTwMaAdjTwMaParserRuleCall_13_0()); 
            	    
            pushFollow(FOLLOW_ruleAdjTwMa_in_ruleModelFasttwr404);
            lv_AdjTwMa_13_0=ruleAdjTwMa();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelFasttwrRule());
            	        }
                   		set(
                   			current, 
                   			"AdjTwMa",
                    		lv_AdjTwMa_13_0, 
                    		"AdjTwMa");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:332:2: ( (lv_AdjFASt_14_0= ruleAdjFASt ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:333:1: (lv_AdjFASt_14_0= ruleAdjFASt )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:333:1: (lv_AdjFASt_14_0= ruleAdjFASt )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:334:3: lv_AdjFASt_14_0= ruleAdjFASt
            {
             
            	        newCompositeNode(grammarAccess.getModelFasttwrAccess().getAdjFAStAdjFAStParserRuleCall_14_0()); 
            	    
            pushFollow(FOLLOW_ruleAdjFASt_in_ruleModelFasttwr425);
            lv_AdjFASt_14_0=ruleAdjFASt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelFasttwrRule());
            	        }
                   		set(
                   			current, 
                   			"AdjFASt",
                    		lv_AdjFASt_14_0, 
                    		"AdjFASt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:350:2: ( (lv_AdjSSSt_15_0= ruleAdjSSSt ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:351:1: (lv_AdjSSSt_15_0= ruleAdjSSSt )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:351:1: (lv_AdjSSSt_15_0= ruleAdjSSSt )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:352:3: lv_AdjSSSt_15_0= ruleAdjSSSt
            {
             
            	        newCompositeNode(grammarAccess.getModelFasttwrAccess().getAdjSSStAdjSSStParserRuleCall_15_0()); 
            	    
            pushFollow(FOLLOW_ruleAdjSSSt_in_ruleModelFasttwr446);
            lv_AdjSSSt_15_0=ruleAdjSSSt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelFasttwrRule());
            	        }
                   		set(
                   			current, 
                   			"AdjSSSt",
                    		lv_AdjSSSt_15_0, 
                    		"AdjSSSt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:368:2: ( (lv_sections_16_0= ruleSection ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:369:1: (lv_sections_16_0= ruleSection )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:369:1: (lv_sections_16_0= ruleSection )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:370:3: lv_sections_16_0= ruleSection
            {
             
            	        newCompositeNode(grammarAccess.getModelFasttwrAccess().getSectionsSectionParserRuleCall_16_0()); 
            	    
            pushFollow(FOLLOW_ruleSection_in_ruleModelFasttwr467);
            lv_sections_16_0=ruleSection();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelFasttwrRule());
            	        }
                   		add(
                   			current, 
                   			"sections",
                    		lv_sections_16_0, 
                    		"Section");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:386:2: ( (lv_TwrStat_17_0= ruleaTwrStat ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:387:1: (lv_TwrStat_17_0= ruleaTwrStat )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:387:1: (lv_TwrStat_17_0= ruleaTwrStat )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:388:3: lv_TwrStat_17_0= ruleaTwrStat
            {
             
            	        newCompositeNode(grammarAccess.getModelFasttwrAccess().getTwrStatATwrStatParserRuleCall_17_0()); 
            	    
            pushFollow(FOLLOW_ruleaTwrStat_in_ruleModelFasttwr488);
            lv_TwrStat_17_0=ruleaTwrStat();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelFasttwrRule());
            	        }
                   		set(
                   			current, 
                   			"TwrStat",
                    		lv_TwrStat_17_0, 
                    		"aTwrStat");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:404:2: ( (lv_sections_18_0= ruleSection ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:405:1: (lv_sections_18_0= ruleSection )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:405:1: (lv_sections_18_0= ruleSection )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:406:3: lv_sections_18_0= ruleSection
            {
             
            	        newCompositeNode(grammarAccess.getModelFasttwrAccess().getSectionsSectionParserRuleCall_18_0()); 
            	    
            pushFollow(FOLLOW_ruleSection_in_ruleModelFasttwr509);
            lv_sections_18_0=ruleSection();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelFasttwrRule());
            	        }
                   		add(
                   			current, 
                   			"sections",
                    		lv_sections_18_0, 
                    		"Section");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:422:2: ( (lv_TwFAM1Sh2_19_0= rulenTwFAM1Sh2 ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:423:1: (lv_TwFAM1Sh2_19_0= rulenTwFAM1Sh2 )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:423:1: (lv_TwFAM1Sh2_19_0= rulenTwFAM1Sh2 )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:424:3: lv_TwFAM1Sh2_19_0= rulenTwFAM1Sh2
            {
             
            	        newCompositeNode(grammarAccess.getModelFasttwrAccess().getTwFAM1Sh2NTwFAM1Sh2ParserRuleCall_19_0()); 
            	    
            pushFollow(FOLLOW_rulenTwFAM1Sh2_in_ruleModelFasttwr530);
            lv_TwFAM1Sh2_19_0=rulenTwFAM1Sh2();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelFasttwrRule());
            	        }
                   		set(
                   			current, 
                   			"TwFAM1Sh2",
                    		lv_TwFAM1Sh2_19_0, 
                    		"nTwFAM1Sh2");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:440:2: ( (lv_TwFAM1Sh3_20_0= rulenTwFAM1Sh3 ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:441:1: (lv_TwFAM1Sh3_20_0= rulenTwFAM1Sh3 )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:441:1: (lv_TwFAM1Sh3_20_0= rulenTwFAM1Sh3 )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:442:3: lv_TwFAM1Sh3_20_0= rulenTwFAM1Sh3
            {
             
            	        newCompositeNode(grammarAccess.getModelFasttwrAccess().getTwFAM1Sh3NTwFAM1Sh3ParserRuleCall_20_0()); 
            	    
            pushFollow(FOLLOW_rulenTwFAM1Sh3_in_ruleModelFasttwr551);
            lv_TwFAM1Sh3_20_0=rulenTwFAM1Sh3();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelFasttwrRule());
            	        }
                   		set(
                   			current, 
                   			"TwFAM1Sh3",
                    		lv_TwFAM1Sh3_20_0, 
                    		"nTwFAM1Sh3");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:458:2: ( (lv_TwFAM1Sh4_21_0= rulenTwFAM1Sh4 ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:459:1: (lv_TwFAM1Sh4_21_0= rulenTwFAM1Sh4 )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:459:1: (lv_TwFAM1Sh4_21_0= rulenTwFAM1Sh4 )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:460:3: lv_TwFAM1Sh4_21_0= rulenTwFAM1Sh4
            {
             
            	        newCompositeNode(grammarAccess.getModelFasttwrAccess().getTwFAM1Sh4NTwFAM1Sh4ParserRuleCall_21_0()); 
            	    
            pushFollow(FOLLOW_rulenTwFAM1Sh4_in_ruleModelFasttwr572);
            lv_TwFAM1Sh4_21_0=rulenTwFAM1Sh4();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelFasttwrRule());
            	        }
                   		set(
                   			current, 
                   			"TwFAM1Sh4",
                    		lv_TwFAM1Sh4_21_0, 
                    		"nTwFAM1Sh4");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:476:2: ( (lv_TwFAM1Sh5_22_0= rulenTwFAM1Sh5 ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:477:1: (lv_TwFAM1Sh5_22_0= rulenTwFAM1Sh5 )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:477:1: (lv_TwFAM1Sh5_22_0= rulenTwFAM1Sh5 )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:478:3: lv_TwFAM1Sh5_22_0= rulenTwFAM1Sh5
            {
             
            	        newCompositeNode(grammarAccess.getModelFasttwrAccess().getTwFAM1Sh5NTwFAM1Sh5ParserRuleCall_22_0()); 
            	    
            pushFollow(FOLLOW_rulenTwFAM1Sh5_in_ruleModelFasttwr593);
            lv_TwFAM1Sh5_22_0=rulenTwFAM1Sh5();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelFasttwrRule());
            	        }
                   		set(
                   			current, 
                   			"TwFAM1Sh5",
                    		lv_TwFAM1Sh5_22_0, 
                    		"nTwFAM1Sh5");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:494:2: ( (lv_TwFAM1Sh6_23_0= rulenTwFAM1Sh6 ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:495:1: (lv_TwFAM1Sh6_23_0= rulenTwFAM1Sh6 )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:495:1: (lv_TwFAM1Sh6_23_0= rulenTwFAM1Sh6 )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:496:3: lv_TwFAM1Sh6_23_0= rulenTwFAM1Sh6
            {
             
            	        newCompositeNode(grammarAccess.getModelFasttwrAccess().getTwFAM1Sh6NTwFAM1Sh6ParserRuleCall_23_0()); 
            	    
            pushFollow(FOLLOW_rulenTwFAM1Sh6_in_ruleModelFasttwr614);
            lv_TwFAM1Sh6_23_0=rulenTwFAM1Sh6();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelFasttwrRule());
            	        }
                   		set(
                   			current, 
                   			"TwFAM1Sh6",
                    		lv_TwFAM1Sh6_23_0, 
                    		"nTwFAM1Sh6");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:512:2: ( (lv_TwFAM2Sh2_24_0= rulenTwFAM2Sh2 ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:513:1: (lv_TwFAM2Sh2_24_0= rulenTwFAM2Sh2 )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:513:1: (lv_TwFAM2Sh2_24_0= rulenTwFAM2Sh2 )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:514:3: lv_TwFAM2Sh2_24_0= rulenTwFAM2Sh2
            {
             
            	        newCompositeNode(grammarAccess.getModelFasttwrAccess().getTwFAM2Sh2NTwFAM2Sh2ParserRuleCall_24_0()); 
            	    
            pushFollow(FOLLOW_rulenTwFAM2Sh2_in_ruleModelFasttwr635);
            lv_TwFAM2Sh2_24_0=rulenTwFAM2Sh2();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelFasttwrRule());
            	        }
                   		set(
                   			current, 
                   			"TwFAM2Sh2",
                    		lv_TwFAM2Sh2_24_0, 
                    		"nTwFAM2Sh2");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:530:2: ( (lv_TwFAM2Sh3_25_0= rulenTwFAM2Sh3 ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:531:1: (lv_TwFAM2Sh3_25_0= rulenTwFAM2Sh3 )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:531:1: (lv_TwFAM2Sh3_25_0= rulenTwFAM2Sh3 )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:532:3: lv_TwFAM2Sh3_25_0= rulenTwFAM2Sh3
            {
             
            	        newCompositeNode(grammarAccess.getModelFasttwrAccess().getTwFAM2Sh3NTwFAM2Sh3ParserRuleCall_25_0()); 
            	    
            pushFollow(FOLLOW_rulenTwFAM2Sh3_in_ruleModelFasttwr656);
            lv_TwFAM2Sh3_25_0=rulenTwFAM2Sh3();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelFasttwrRule());
            	        }
                   		set(
                   			current, 
                   			"TwFAM2Sh3",
                    		lv_TwFAM2Sh3_25_0, 
                    		"nTwFAM2Sh3");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:548:2: ( (lv_TwFAM2Sh4_26_0= rulenTwFAM2Sh4 ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:549:1: (lv_TwFAM2Sh4_26_0= rulenTwFAM2Sh4 )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:549:1: (lv_TwFAM2Sh4_26_0= rulenTwFAM2Sh4 )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:550:3: lv_TwFAM2Sh4_26_0= rulenTwFAM2Sh4
            {
             
            	        newCompositeNode(grammarAccess.getModelFasttwrAccess().getTwFAM2Sh4NTwFAM2Sh4ParserRuleCall_26_0()); 
            	    
            pushFollow(FOLLOW_rulenTwFAM2Sh4_in_ruleModelFasttwr677);
            lv_TwFAM2Sh4_26_0=rulenTwFAM2Sh4();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelFasttwrRule());
            	        }
                   		set(
                   			current, 
                   			"TwFAM2Sh4",
                    		lv_TwFAM2Sh4_26_0, 
                    		"nTwFAM2Sh4");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:566:2: ( (lv_TwFAM2Sh5_27_0= rulenTwFAM2Sh5 ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:567:1: (lv_TwFAM2Sh5_27_0= rulenTwFAM2Sh5 )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:567:1: (lv_TwFAM2Sh5_27_0= rulenTwFAM2Sh5 )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:568:3: lv_TwFAM2Sh5_27_0= rulenTwFAM2Sh5
            {
             
            	        newCompositeNode(grammarAccess.getModelFasttwrAccess().getTwFAM2Sh5NTwFAM2Sh5ParserRuleCall_27_0()); 
            	    
            pushFollow(FOLLOW_rulenTwFAM2Sh5_in_ruleModelFasttwr698);
            lv_TwFAM2Sh5_27_0=rulenTwFAM2Sh5();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelFasttwrRule());
            	        }
                   		set(
                   			current, 
                   			"TwFAM2Sh5",
                    		lv_TwFAM2Sh5_27_0, 
                    		"nTwFAM2Sh5");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:584:2: ( (lv_TwFAM2Sh6_28_0= rulenTwFAM2Sh6 ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:585:1: (lv_TwFAM2Sh6_28_0= rulenTwFAM2Sh6 )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:585:1: (lv_TwFAM2Sh6_28_0= rulenTwFAM2Sh6 )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:586:3: lv_TwFAM2Sh6_28_0= rulenTwFAM2Sh6
            {
             
            	        newCompositeNode(grammarAccess.getModelFasttwrAccess().getTwFAM2Sh6NTwFAM2Sh6ParserRuleCall_28_0()); 
            	    
            pushFollow(FOLLOW_rulenTwFAM2Sh6_in_ruleModelFasttwr719);
            lv_TwFAM2Sh6_28_0=rulenTwFAM2Sh6();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelFasttwrRule());
            	        }
                   		set(
                   			current, 
                   			"TwFAM2Sh6",
                    		lv_TwFAM2Sh6_28_0, 
                    		"nTwFAM2Sh6");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:602:2: ( (lv_sections_29_0= ruleSection ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:603:1: (lv_sections_29_0= ruleSection )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:603:1: (lv_sections_29_0= ruleSection )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:604:3: lv_sections_29_0= ruleSection
            {
             
            	        newCompositeNode(grammarAccess.getModelFasttwrAccess().getSectionsSectionParserRuleCall_29_0()); 
            	    
            pushFollow(FOLLOW_ruleSection_in_ruleModelFasttwr740);
            lv_sections_29_0=ruleSection();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelFasttwrRule());
            	        }
                   		add(
                   			current, 
                   			"sections",
                    		lv_sections_29_0, 
                    		"Section");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:620:2: ( (lv_TwSSM1Sh2_30_0= rulenTwSSM1Sh2 ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:621:1: (lv_TwSSM1Sh2_30_0= rulenTwSSM1Sh2 )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:621:1: (lv_TwSSM1Sh2_30_0= rulenTwSSM1Sh2 )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:622:3: lv_TwSSM1Sh2_30_0= rulenTwSSM1Sh2
            {
             
            	        newCompositeNode(grammarAccess.getModelFasttwrAccess().getTwSSM1Sh2NTwSSM1Sh2ParserRuleCall_30_0()); 
            	    
            pushFollow(FOLLOW_rulenTwSSM1Sh2_in_ruleModelFasttwr761);
            lv_TwSSM1Sh2_30_0=rulenTwSSM1Sh2();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelFasttwrRule());
            	        }
                   		set(
                   			current, 
                   			"TwSSM1Sh2",
                    		lv_TwSSM1Sh2_30_0, 
                    		"nTwSSM1Sh2");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:638:2: ( (lv_TwSSM1Sh3_31_0= rulenTwSSM1Sh3 ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:639:1: (lv_TwSSM1Sh3_31_0= rulenTwSSM1Sh3 )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:639:1: (lv_TwSSM1Sh3_31_0= rulenTwSSM1Sh3 )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:640:3: lv_TwSSM1Sh3_31_0= rulenTwSSM1Sh3
            {
             
            	        newCompositeNode(grammarAccess.getModelFasttwrAccess().getTwSSM1Sh3NTwSSM1Sh3ParserRuleCall_31_0()); 
            	    
            pushFollow(FOLLOW_rulenTwSSM1Sh3_in_ruleModelFasttwr782);
            lv_TwSSM1Sh3_31_0=rulenTwSSM1Sh3();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelFasttwrRule());
            	        }
                   		set(
                   			current, 
                   			"TwSSM1Sh3",
                    		lv_TwSSM1Sh3_31_0, 
                    		"nTwSSM1Sh3");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:656:2: ( (lv_TwSSM1Sh4_32_0= rulenTwSSM1Sh4 ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:657:1: (lv_TwSSM1Sh4_32_0= rulenTwSSM1Sh4 )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:657:1: (lv_TwSSM1Sh4_32_0= rulenTwSSM1Sh4 )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:658:3: lv_TwSSM1Sh4_32_0= rulenTwSSM1Sh4
            {
             
            	        newCompositeNode(grammarAccess.getModelFasttwrAccess().getTwSSM1Sh4NTwSSM1Sh4ParserRuleCall_32_0()); 
            	    
            pushFollow(FOLLOW_rulenTwSSM1Sh4_in_ruleModelFasttwr803);
            lv_TwSSM1Sh4_32_0=rulenTwSSM1Sh4();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelFasttwrRule());
            	        }
                   		set(
                   			current, 
                   			"TwSSM1Sh4",
                    		lv_TwSSM1Sh4_32_0, 
                    		"nTwSSM1Sh4");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:674:2: ( (lv_TwSSM1Sh5_33_0= rulenTwSSM1Sh5 ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:675:1: (lv_TwSSM1Sh5_33_0= rulenTwSSM1Sh5 )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:675:1: (lv_TwSSM1Sh5_33_0= rulenTwSSM1Sh5 )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:676:3: lv_TwSSM1Sh5_33_0= rulenTwSSM1Sh5
            {
             
            	        newCompositeNode(grammarAccess.getModelFasttwrAccess().getTwSSM1Sh5NTwSSM1Sh5ParserRuleCall_33_0()); 
            	    
            pushFollow(FOLLOW_rulenTwSSM1Sh5_in_ruleModelFasttwr824);
            lv_TwSSM1Sh5_33_0=rulenTwSSM1Sh5();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelFasttwrRule());
            	        }
                   		set(
                   			current, 
                   			"TwSSM1Sh5",
                    		lv_TwSSM1Sh5_33_0, 
                    		"nTwSSM1Sh5");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:692:2: ( (lv_TwSSM1Sh6_34_0= rulenTwSSM1Sh6 ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:693:1: (lv_TwSSM1Sh6_34_0= rulenTwSSM1Sh6 )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:693:1: (lv_TwSSM1Sh6_34_0= rulenTwSSM1Sh6 )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:694:3: lv_TwSSM1Sh6_34_0= rulenTwSSM1Sh6
            {
             
            	        newCompositeNode(grammarAccess.getModelFasttwrAccess().getTwSSM1Sh6NTwSSM1Sh6ParserRuleCall_34_0()); 
            	    
            pushFollow(FOLLOW_rulenTwSSM1Sh6_in_ruleModelFasttwr845);
            lv_TwSSM1Sh6_34_0=rulenTwSSM1Sh6();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelFasttwrRule());
            	        }
                   		set(
                   			current, 
                   			"TwSSM1Sh6",
                    		lv_TwSSM1Sh6_34_0, 
                    		"nTwSSM1Sh6");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:710:2: ( (lv_TwSSM2Sh2_35_0= rulenTwSSM2Sh2 ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:711:1: (lv_TwSSM2Sh2_35_0= rulenTwSSM2Sh2 )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:711:1: (lv_TwSSM2Sh2_35_0= rulenTwSSM2Sh2 )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:712:3: lv_TwSSM2Sh2_35_0= rulenTwSSM2Sh2
            {
             
            	        newCompositeNode(grammarAccess.getModelFasttwrAccess().getTwSSM2Sh2NTwSSM2Sh2ParserRuleCall_35_0()); 
            	    
            pushFollow(FOLLOW_rulenTwSSM2Sh2_in_ruleModelFasttwr866);
            lv_TwSSM2Sh2_35_0=rulenTwSSM2Sh2();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelFasttwrRule());
            	        }
                   		set(
                   			current, 
                   			"TwSSM2Sh2",
                    		lv_TwSSM2Sh2_35_0, 
                    		"nTwSSM2Sh2");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:728:2: ( (lv_TwSSM2Sh3_36_0= rulenTwSSM2Sh3 ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:729:1: (lv_TwSSM2Sh3_36_0= rulenTwSSM2Sh3 )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:729:1: (lv_TwSSM2Sh3_36_0= rulenTwSSM2Sh3 )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:730:3: lv_TwSSM2Sh3_36_0= rulenTwSSM2Sh3
            {
             
            	        newCompositeNode(grammarAccess.getModelFasttwrAccess().getTwSSM2Sh3NTwSSM2Sh3ParserRuleCall_36_0()); 
            	    
            pushFollow(FOLLOW_rulenTwSSM2Sh3_in_ruleModelFasttwr887);
            lv_TwSSM2Sh3_36_0=rulenTwSSM2Sh3();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelFasttwrRule());
            	        }
                   		set(
                   			current, 
                   			"TwSSM2Sh3",
                    		lv_TwSSM2Sh3_36_0, 
                    		"nTwSSM2Sh3");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:746:2: ( (lv_TwSSM2Sh4_37_0= rulenTwSSM2Sh4 ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:747:1: (lv_TwSSM2Sh4_37_0= rulenTwSSM2Sh4 )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:747:1: (lv_TwSSM2Sh4_37_0= rulenTwSSM2Sh4 )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:748:3: lv_TwSSM2Sh4_37_0= rulenTwSSM2Sh4
            {
             
            	        newCompositeNode(grammarAccess.getModelFasttwrAccess().getTwSSM2Sh4NTwSSM2Sh4ParserRuleCall_37_0()); 
            	    
            pushFollow(FOLLOW_rulenTwSSM2Sh4_in_ruleModelFasttwr908);
            lv_TwSSM2Sh4_37_0=rulenTwSSM2Sh4();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelFasttwrRule());
            	        }
                   		set(
                   			current, 
                   			"TwSSM2Sh4",
                    		lv_TwSSM2Sh4_37_0, 
                    		"nTwSSM2Sh4");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:764:2: ( (lv_TwSSM2Sh5_38_0= rulenTwSSM2Sh5 ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:765:1: (lv_TwSSM2Sh5_38_0= rulenTwSSM2Sh5 )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:765:1: (lv_TwSSM2Sh5_38_0= rulenTwSSM2Sh5 )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:766:3: lv_TwSSM2Sh5_38_0= rulenTwSSM2Sh5
            {
             
            	        newCompositeNode(grammarAccess.getModelFasttwrAccess().getTwSSM2Sh5NTwSSM2Sh5ParserRuleCall_38_0()); 
            	    
            pushFollow(FOLLOW_rulenTwSSM2Sh5_in_ruleModelFasttwr929);
            lv_TwSSM2Sh5_38_0=rulenTwSSM2Sh5();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelFasttwrRule());
            	        }
                   		set(
                   			current, 
                   			"TwSSM2Sh5",
                    		lv_TwSSM2Sh5_38_0, 
                    		"nTwSSM2Sh5");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:782:2: ( (lv_TwSSM2Sh6_39_0= rulenTwSSM2Sh6 ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:783:1: (lv_TwSSM2Sh6_39_0= rulenTwSSM2Sh6 )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:783:1: (lv_TwSSM2Sh6_39_0= rulenTwSSM2Sh6 )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:784:3: lv_TwSSM2Sh6_39_0= rulenTwSSM2Sh6
            {
             
            	        newCompositeNode(grammarAccess.getModelFasttwrAccess().getTwSSM2Sh6NTwSSM2Sh6ParserRuleCall_39_0()); 
            	    
            pushFollow(FOLLOW_rulenTwSSM2Sh6_in_ruleModelFasttwr950);
            lv_TwSSM2Sh6_39_0=rulenTwSSM2Sh6();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelFasttwrRule());
            	        }
                   		set(
                   			current, 
                   			"TwSSM2Sh6",
                    		lv_TwSSM2Sh6_39_0, 
                    		"nTwSSM2Sh6");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:800:2: (this_WS_40= RULE_WS | this_NEWLINE_41= RULE_NEWLINE | this_SL_COMMENT_42= RULE_SL_COMMENT )*
            loop1:
            do {
                int alt1=4;
                switch ( input.LA(1) ) {
                case RULE_WS:
                    {
                    alt1=1;
                    }
                    break;
                case RULE_NEWLINE:
                    {
                    alt1=2;
                    }
                    break;
                case RULE_SL_COMMENT:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:800:3: this_WS_40= RULE_WS
            	    {
            	    this_WS_40=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleModelFasttwr962); 
            	     
            	        newLeafNode(this_WS_40, grammarAccess.getModelFasttwrAccess().getWSTerminalRuleCall_40_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:805:6: this_NEWLINE_41= RULE_NEWLINE
            	    {
            	    this_NEWLINE_41=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_ruleModelFasttwr978); 
            	     
            	        newLeafNode(this_NEWLINE_41, grammarAccess.getModelFasttwrAccess().getNEWLINETerminalRuleCall_40_1()); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:810:6: this_SL_COMMENT_42= RULE_SL_COMMENT
            	    {
            	    this_SL_COMMENT_42=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleModelFasttwr994); 
            	     
            	        newLeafNode(this_SL_COMMENT_42, grammarAccess.getModelFasttwrAccess().getSL_COMMENTTerminalRuleCall_40_2()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelFasttwr"


    // $ANTLR start "entryRuleHeader"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:822:1: entryRuleHeader returns [EObject current=null] : iv_ruleHeader= ruleHeader EOF ;
    public final EObject entryRuleHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:826:2: (iv_ruleHeader= ruleHeader EOF )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:827:2: iv_ruleHeader= ruleHeader EOF
            {
             newCompositeNode(grammarAccess.getHeaderRule()); 
            pushFollow(FOLLOW_ruleHeader_in_entryRuleHeader1037);
            iv_ruleHeader=ruleHeader();

            state._fsp--;

             current =iv_ruleHeader; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeader1047); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:837:1: ruleHeader returns [EObject current=null] : (this_SL_COMMENT_0= RULE_SL_COMMENT this_NEWLINE_1= RULE_NEWLINE this_SL_COMMENT_2= RULE_SL_COMMENT this_NEWLINE_3= RULE_NEWLINE ( (lv_name_4_0= RULE_SL_COMMENT ) ) this_NEWLINE_5= RULE_NEWLINE ) ;
    public final EObject ruleHeader() throws RecognitionException {
        EObject current = null;

        Token this_SL_COMMENT_0=null;
        Token this_NEWLINE_1=null;
        Token this_SL_COMMENT_2=null;
        Token this_NEWLINE_3=null;
        Token lv_name_4_0=null;
        Token this_NEWLINE_5=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:841:28: ( (this_SL_COMMENT_0= RULE_SL_COMMENT this_NEWLINE_1= RULE_NEWLINE this_SL_COMMENT_2= RULE_SL_COMMENT this_NEWLINE_3= RULE_NEWLINE ( (lv_name_4_0= RULE_SL_COMMENT ) ) this_NEWLINE_5= RULE_NEWLINE ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:842:1: (this_SL_COMMENT_0= RULE_SL_COMMENT this_NEWLINE_1= RULE_NEWLINE this_SL_COMMENT_2= RULE_SL_COMMENT this_NEWLINE_3= RULE_NEWLINE ( (lv_name_4_0= RULE_SL_COMMENT ) ) this_NEWLINE_5= RULE_NEWLINE )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:842:1: (this_SL_COMMENT_0= RULE_SL_COMMENT this_NEWLINE_1= RULE_NEWLINE this_SL_COMMENT_2= RULE_SL_COMMENT this_NEWLINE_3= RULE_NEWLINE ( (lv_name_4_0= RULE_SL_COMMENT ) ) this_NEWLINE_5= RULE_NEWLINE )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:842:2: this_SL_COMMENT_0= RULE_SL_COMMENT this_NEWLINE_1= RULE_NEWLINE this_SL_COMMENT_2= RULE_SL_COMMENT this_NEWLINE_3= RULE_NEWLINE ( (lv_name_4_0= RULE_SL_COMMENT ) ) this_NEWLINE_5= RULE_NEWLINE
            {
            this_SL_COMMENT_0=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleHeader1087); 
             
                newLeafNode(this_SL_COMMENT_0, grammarAccess.getHeaderAccess().getSL_COMMENTTerminalRuleCall_0()); 
                
            this_NEWLINE_1=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_ruleHeader1097); 
             
                newLeafNode(this_NEWLINE_1, grammarAccess.getHeaderAccess().getNEWLINETerminalRuleCall_1()); 
                
            this_SL_COMMENT_2=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleHeader1107); 
             
                newLeafNode(this_SL_COMMENT_2, grammarAccess.getHeaderAccess().getSL_COMMENTTerminalRuleCall_2()); 
                
            this_NEWLINE_3=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_ruleHeader1117); 
             
                newLeafNode(this_NEWLINE_3, grammarAccess.getHeaderAccess().getNEWLINETerminalRuleCall_3()); 
                
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:858:1: ( (lv_name_4_0= RULE_SL_COMMENT ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:859:1: (lv_name_4_0= RULE_SL_COMMENT )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:859:1: (lv_name_4_0= RULE_SL_COMMENT )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:860:3: lv_name_4_0= RULE_SL_COMMENT
            {
            lv_name_4_0=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleHeader1133); 

            			newLeafNode(lv_name_4_0, grammarAccess.getHeaderAccess().getNameSL_COMMENTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHeaderRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"SL_COMMENT");
            	    

            }


            }

            this_NEWLINE_5=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_ruleHeader1149); 
             
                newLeafNode(this_NEWLINE_5, grammarAccess.getHeaderAccess().getNEWLINETerminalRuleCall_5()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleHeader"


    // $ANTLR start "entryRuleSection"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:891:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:895:2: (iv_ruleSection= ruleSection EOF )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:896:2: iv_ruleSection= ruleSection EOF
            {
             newCompositeNode(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_ruleSection_in_entryRuleSection1194);
            iv_ruleSection=ruleSection();

            state._fsp--;

             current =iv_ruleSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection1204); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:906:1: ruleSection returns [EObject current=null] : ( ( (lv_name_0_0= RULE_SL_COMMENT ) ) this_NEWLINE_1= RULE_NEWLINE ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_NEWLINE_1=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:910:28: ( ( ( (lv_name_0_0= RULE_SL_COMMENT ) ) this_NEWLINE_1= RULE_NEWLINE ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:911:1: ( ( (lv_name_0_0= RULE_SL_COMMENT ) ) this_NEWLINE_1= RULE_NEWLINE )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:911:1: ( ( (lv_name_0_0= RULE_SL_COMMENT ) ) this_NEWLINE_1= RULE_NEWLINE )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:911:2: ( (lv_name_0_0= RULE_SL_COMMENT ) ) this_NEWLINE_1= RULE_NEWLINE
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:911:2: ( (lv_name_0_0= RULE_SL_COMMENT ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:912:1: (lv_name_0_0= RULE_SL_COMMENT )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:912:1: (lv_name_0_0= RULE_SL_COMMENT )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:913:3: lv_name_0_0= RULE_SL_COMMENT
            {
            lv_name_0_0=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleSection1250); 

            			newLeafNode(lv_name_0_0, grammarAccess.getSectionAccess().getNameSL_COMMENTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSectionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"SL_COMMENT");
            	    

            }


            }

            this_NEWLINE_1=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_ruleSection1266); 
             
                newLeafNode(this_NEWLINE_1, grammarAccess.getSectionAccess().getNEWLINETerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuletNUMBER"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:944:1: entryRuletNUMBER returns [String current=null] : iv_ruletNUMBER= ruletNUMBER EOF ;
    public final String entryRuletNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletNUMBER = null;


        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:945:2: (iv_ruletNUMBER= ruletNUMBER EOF )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:946:2: iv_ruletNUMBER= ruletNUMBER EOF
            {
             newCompositeNode(grammarAccess.getTNUMBERRule()); 
            pushFollow(FOLLOW_ruletNUMBER_in_entryRuletNUMBER1306);
            iv_ruletNUMBER=ruletNUMBER();

            state._fsp--;

             current =iv_ruletNUMBER.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletNUMBER1317); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletNUMBER"


    // $ANTLR start "ruletNUMBER"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:953:1: ruletNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_NUMBER_1= RULE_NUMBER ) ;
    public final AntlrDatatypeRuleToken ruletNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_NUMBER_1=null;

         enterRule(); 
            
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:956:28: ( (this_INT_0= RULE_INT | this_NUMBER_1= RULE_NUMBER ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:957:1: (this_INT_0= RULE_INT | this_NUMBER_1= RULE_NUMBER )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:957:1: (this_INT_0= RULE_INT | this_NUMBER_1= RULE_NUMBER )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_NUMBER) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:957:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruletNUMBER1357); 

                    		current.merge(this_INT_0);
                        
                     
                        newLeafNode(this_INT_0, grammarAccess.getTNUMBERAccess().getINTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:965:10: this_NUMBER_1= RULE_NUMBER
                    {
                    this_NUMBER_1=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruletNUMBER1383); 

                    		current.merge(this_NUMBER_1);
                        
                     
                        newLeafNode(this_NUMBER_1, grammarAccess.getTNUMBERAccess().getNUMBERTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletNUMBER"


    // $ANTLR start "entryRuletBOOL"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:980:1: entryRuletBOOL returns [String current=null] : iv_ruletBOOL= ruletBOOL EOF ;
    public final String entryRuletBOOL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletBOOL = null;


        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:981:2: (iv_ruletBOOL= ruletBOOL EOF )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:982:2: iv_ruletBOOL= ruletBOOL EOF
            {
             newCompositeNode(grammarAccess.getTBOOLRule()); 
            pushFollow(FOLLOW_ruletBOOL_in_entryRuletBOOL1429);
            iv_ruletBOOL=ruletBOOL();

            state._fsp--;

             current =iv_ruletBOOL.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletBOOL1440); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletBOOL"


    // $ANTLR start "ruletBOOL"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:989:1: ruletBOOL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'TRUE' | kw= 'True' | kw= 'true' | kw= 'FALSE' | kw= 'False' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruletBOOL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:992:28: ( (kw= 'TRUE' | kw= 'True' | kw= 'true' | kw= 'FALSE' | kw= 'False' | kw= 'false' ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:993:1: (kw= 'TRUE' | kw= 'True' | kw= 'true' | kw= 'FALSE' | kw= 'False' | kw= 'false' )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:993:1: (kw= 'TRUE' | kw= 'True' | kw= 'true' | kw= 'FALSE' | kw= 'False' | kw= 'false' )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 10:
                {
                alt3=1;
                }
                break;
            case 11:
                {
                alt3=2;
                }
                break;
            case 12:
                {
                alt3=3;
                }
                break;
            case 13:
                {
                alt3=4;
                }
                break;
            case 14:
                {
                alt3=5;
                }
                break;
            case 15:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:994:2: kw= 'TRUE'
                    {
                    kw=(Token)match(input,10,FOLLOW_10_in_ruletBOOL1478); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTBOOLAccess().getTRUEKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1001:2: kw= 'True'
                    {
                    kw=(Token)match(input,11,FOLLOW_11_in_ruletBOOL1497); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTBOOLAccess().getTrueKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1008:2: kw= 'true'
                    {
                    kw=(Token)match(input,12,FOLLOW_12_in_ruletBOOL1516); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTBOOLAccess().getTrueKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1015:2: kw= 'FALSE'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruletBOOL1535); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTBOOLAccess().getFALSEKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1022:2: kw= 'False'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruletBOOL1554); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTBOOLAccess().getFalseKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1029:2: kw= 'false'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruletBOOL1573); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTBOOLAccess().getFalseKeyword_5()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletBOOL"


    // $ANTLR start "entryRulenNTwInpSt"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1042:1: entryRulenNTwInpSt returns [EObject current=null] : iv_rulenNTwInpSt= rulenNTwInpSt EOF ;
    public final EObject entryRulenNTwInpSt() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenNTwInpSt = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1046:2: (iv_rulenNTwInpSt= rulenNTwInpSt EOF )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1047:2: iv_rulenNTwInpSt= rulenNTwInpSt EOF
            {
             newCompositeNode(grammarAccess.getNNTwInpStRule()); 
            pushFollow(FOLLOW_rulenNTwInpSt_in_entryRulenNTwInpSt1619);
            iv_rulenNTwInpSt=rulenNTwInpSt();

            state._fsp--;

             current =iv_rulenNTwInpSt; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenNTwInpSt1629); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulenNTwInpSt"


    // $ANTLR start "rulenNTwInpSt"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1057:1: rulenNTwInpSt returns [EObject current=null] : ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= RULE_INT ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'NTwInpSt' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) ;
    public final EObject rulenNTwInpSt() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token lv_value_1_0=null;
        Token this_WS_2=null;
        Token lv_name_3_0=null;
        Token this_WS_4=null;
        Token this_SL_COMMENT_5=null;
        Token this_NEWLINE_6=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1061:28: ( ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= RULE_INT ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'NTwInpSt' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1062:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= RULE_INT ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'NTwInpSt' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1062:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= RULE_INT ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'NTwInpSt' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1062:2: (this_WS_0= RULE_WS )? ( (lv_value_1_0= RULE_INT ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'NTwInpSt' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1062:2: (this_WS_0= RULE_WS )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_WS) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1062:3: this_WS_0= RULE_WS
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenNTwInpSt1670); 
                     
                        newLeafNode(this_WS_0, grammarAccess.getNNTwInpStAccess().getWSTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1066:3: ( (lv_value_1_0= RULE_INT ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1067:1: (lv_value_1_0= RULE_INT )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1067:1: (lv_value_1_0= RULE_INT )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1068:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulenNTwInpSt1688); 

            			newLeafNode(lv_value_1_0, grammarAccess.getNNTwInpStAccess().getValueINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNNTwInpStRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"INT");
            	    

            }


            }

            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenNTwInpSt1704); 
             
                newLeafNode(this_WS_2, grammarAccess.getNNTwInpStAccess().getWSTerminalRuleCall_2()); 
                
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1088:1: ( (lv_name_3_0= 'NTwInpSt' ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1089:1: (lv_name_3_0= 'NTwInpSt' )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1089:1: (lv_name_3_0= 'NTwInpSt' )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1090:3: lv_name_3_0= 'NTwInpSt'
            {
            lv_name_3_0=(Token)match(input,16,FOLLOW_16_in_rulenNTwInpSt1721); 

                    newLeafNode(lv_name_3_0, grammarAccess.getNNTwInpStAccess().getNameNTwInpStKeyword_3_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNNTwInpStRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_3_0, "NTwInpSt");
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1103:2: (this_WS_4= RULE_WS )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_WS) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1103:3: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenNTwInpSt1746); 
                     
                        newLeafNode(this_WS_4, grammarAccess.getNNTwInpStAccess().getWSTerminalRuleCall_4()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1107:3: (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_SL_COMMENT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1107:4: this_SL_COMMENT_5= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_5=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rulenNTwInpSt1759); 
                     
                        newLeafNode(this_SL_COMMENT_5, grammarAccess.getNNTwInpStAccess().getSL_COMMENTTerminalRuleCall_5()); 
                        

                    }
                    break;

            }

            this_NEWLINE_6=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rulenNTwInpSt1771); 
             
                newLeafNode(this_NEWLINE_6, grammarAccess.getNNTwInpStAccess().getNEWLINETerminalRuleCall_6()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulenNTwInpSt"


    // $ANTLR start "entryRulebCalcTMode"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1126:1: entryRulebCalcTMode returns [EObject current=null] : iv_rulebCalcTMode= rulebCalcTMode EOF ;
    public final EObject entryRulebCalcTMode() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebCalcTMode = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1130:2: (iv_rulebCalcTMode= rulebCalcTMode EOF )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1131:2: iv_rulebCalcTMode= rulebCalcTMode EOF
            {
             newCompositeNode(grammarAccess.getBCalcTModeRule()); 
            pushFollow(FOLLOW_rulebCalcTMode_in_entryRulebCalcTMode1816);
            iv_rulebCalcTMode=rulebCalcTMode();

            state._fsp--;

             current =iv_rulebCalcTMode; 
            match(input,EOF,FOLLOW_EOF_in_entryRulebCalcTMode1826); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulebCalcTMode"


    // $ANTLR start "rulebCalcTMode"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1141:1: rulebCalcTMode returns [EObject current=null] : ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletBOOL ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'CalcTMode' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) ;
    public final EObject rulebCalcTMode() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token lv_name_3_0=null;
        Token this_WS_4=null;
        Token this_SL_COMMENT_5=null;
        Token this_NEWLINE_6=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1145:28: ( ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletBOOL ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'CalcTMode' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1146:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletBOOL ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'CalcTMode' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1146:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletBOOL ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'CalcTMode' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1146:2: (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletBOOL ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'CalcTMode' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1146:2: (this_WS_0= RULE_WS )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_WS) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1146:3: this_WS_0= RULE_WS
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulebCalcTMode1867); 
                     
                        newLeafNode(this_WS_0, grammarAccess.getBCalcTModeAccess().getWSTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1150:3: ( (lv_value_1_0= ruletBOOL ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1151:1: (lv_value_1_0= ruletBOOL )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1151:1: (lv_value_1_0= ruletBOOL )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1152:3: lv_value_1_0= ruletBOOL
            {
             
            	        newCompositeNode(grammarAccess.getBCalcTModeAccess().getValueTBOOLParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruletBOOL_in_rulebCalcTMode1889);
            lv_value_1_0=ruletBOOL();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBCalcTModeRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"tBOOL");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulebCalcTMode1900); 
             
                newLeafNode(this_WS_2, grammarAccess.getBCalcTModeAccess().getWSTerminalRuleCall_2()); 
                
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1172:1: ( (lv_name_3_0= 'CalcTMode' ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1173:1: (lv_name_3_0= 'CalcTMode' )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1173:1: (lv_name_3_0= 'CalcTMode' )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1174:3: lv_name_3_0= 'CalcTMode'
            {
            lv_name_3_0=(Token)match(input,17,FOLLOW_17_in_rulebCalcTMode1917); 

                    newLeafNode(lv_name_3_0, grammarAccess.getBCalcTModeAccess().getNameCalcTModeKeyword_3_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBCalcTModeRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_3_0, "CalcTMode");
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1187:2: (this_WS_4= RULE_WS )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_WS) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1187:3: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulebCalcTMode1942); 
                     
                        newLeafNode(this_WS_4, grammarAccess.getBCalcTModeAccess().getWSTerminalRuleCall_4()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1191:3: (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_SL_COMMENT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1191:4: this_SL_COMMENT_5= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_5=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rulebCalcTMode1955); 
                     
                        newLeafNode(this_SL_COMMENT_5, grammarAccess.getBCalcTModeAccess().getSL_COMMENTTerminalRuleCall_5()); 
                        

                    }
                    break;

            }

            this_NEWLINE_6=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rulebCalcTMode1967); 
             
                newLeafNode(this_NEWLINE_6, grammarAccess.getBCalcTModeAccess().getNEWLINETerminalRuleCall_6()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulebCalcTMode"


    // $ANTLR start "entryRulenTwrFADmp1"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1210:1: entryRulenTwrFADmp1 returns [EObject current=null] : iv_rulenTwrFADmp1= rulenTwrFADmp1 EOF ;
    public final EObject entryRulenTwrFADmp1() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenTwrFADmp1 = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1214:2: (iv_rulenTwrFADmp1= rulenTwrFADmp1 EOF )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1215:2: iv_rulenTwrFADmp1= rulenTwrFADmp1 EOF
            {
             newCompositeNode(grammarAccess.getNTwrFADmp1Rule()); 
            pushFollow(FOLLOW_rulenTwrFADmp1_in_entryRulenTwrFADmp12012);
            iv_rulenTwrFADmp1=rulenTwrFADmp1();

            state._fsp--;

             current =iv_rulenTwrFADmp1; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenTwrFADmp12022); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulenTwrFADmp1"


    // $ANTLR start "rulenTwrFADmp1"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1225:1: rulenTwrFADmp1 returns [EObject current=null] : ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwrFADmp(1)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) ;
    public final EObject rulenTwrFADmp1() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token lv_name_3_0=null;
        Token this_WS_4=null;
        Token this_SL_COMMENT_5=null;
        Token this_NEWLINE_6=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1229:28: ( ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwrFADmp(1)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1230:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwrFADmp(1)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1230:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwrFADmp(1)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1230:2: (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwrFADmp(1)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1230:2: (this_WS_0= RULE_WS )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_WS) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1230:3: this_WS_0= RULE_WS
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwrFADmp12063); 
                     
                        newLeafNode(this_WS_0, grammarAccess.getNTwrFADmp1Access().getWSTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1234:3: ( (lv_value_1_0= ruletNUMBER ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1235:1: (lv_value_1_0= ruletNUMBER )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1235:1: (lv_value_1_0= ruletNUMBER )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1236:3: lv_value_1_0= ruletNUMBER
            {
             
            	        newCompositeNode(grammarAccess.getNTwrFADmp1Access().getValueTNUMBERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruletNUMBER_in_rulenTwrFADmp12085);
            lv_value_1_0=ruletNUMBER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNTwrFADmp1Rule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"tNUMBER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwrFADmp12096); 
             
                newLeafNode(this_WS_2, grammarAccess.getNTwrFADmp1Access().getWSTerminalRuleCall_2()); 
                
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1256:1: ( (lv_name_3_0= 'TwrFADmp(1)' ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1257:1: (lv_name_3_0= 'TwrFADmp(1)' )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1257:1: (lv_name_3_0= 'TwrFADmp(1)' )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1258:3: lv_name_3_0= 'TwrFADmp(1)'
            {
            lv_name_3_0=(Token)match(input,18,FOLLOW_18_in_rulenTwrFADmp12113); 

                    newLeafNode(lv_name_3_0, grammarAccess.getNTwrFADmp1Access().getNameTwrFADmp1Keyword_3_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNTwrFADmp1Rule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_3_0, "TwrFADmp(1)");
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1271:2: (this_WS_4= RULE_WS )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_WS) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1271:3: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwrFADmp12138); 
                     
                        newLeafNode(this_WS_4, grammarAccess.getNTwrFADmp1Access().getWSTerminalRuleCall_4()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1275:3: (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_SL_COMMENT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1275:4: this_SL_COMMENT_5= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_5=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rulenTwrFADmp12151); 
                     
                        newLeafNode(this_SL_COMMENT_5, grammarAccess.getNTwrFADmp1Access().getSL_COMMENTTerminalRuleCall_5()); 
                        

                    }
                    break;

            }

            this_NEWLINE_6=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rulenTwrFADmp12163); 
             
                newLeafNode(this_NEWLINE_6, grammarAccess.getNTwrFADmp1Access().getNEWLINETerminalRuleCall_6()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulenTwrFADmp1"


    // $ANTLR start "entryRulenTwrFADmp2"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1294:1: entryRulenTwrFADmp2 returns [EObject current=null] : iv_rulenTwrFADmp2= rulenTwrFADmp2 EOF ;
    public final EObject entryRulenTwrFADmp2() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenTwrFADmp2 = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1298:2: (iv_rulenTwrFADmp2= rulenTwrFADmp2 EOF )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1299:2: iv_rulenTwrFADmp2= rulenTwrFADmp2 EOF
            {
             newCompositeNode(grammarAccess.getNTwrFADmp2Rule()); 
            pushFollow(FOLLOW_rulenTwrFADmp2_in_entryRulenTwrFADmp22208);
            iv_rulenTwrFADmp2=rulenTwrFADmp2();

            state._fsp--;

             current =iv_rulenTwrFADmp2; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenTwrFADmp22218); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulenTwrFADmp2"


    // $ANTLR start "rulenTwrFADmp2"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1309:1: rulenTwrFADmp2 returns [EObject current=null] : ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwrFADmp(2)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) ;
    public final EObject rulenTwrFADmp2() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token lv_name_3_0=null;
        Token this_WS_4=null;
        Token this_SL_COMMENT_5=null;
        Token this_NEWLINE_6=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1313:28: ( ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwrFADmp(2)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1314:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwrFADmp(2)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1314:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwrFADmp(2)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1314:2: (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwrFADmp(2)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1314:2: (this_WS_0= RULE_WS )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_WS) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1314:3: this_WS_0= RULE_WS
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwrFADmp22259); 
                     
                        newLeafNode(this_WS_0, grammarAccess.getNTwrFADmp2Access().getWSTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1318:3: ( (lv_value_1_0= ruletNUMBER ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1319:1: (lv_value_1_0= ruletNUMBER )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1319:1: (lv_value_1_0= ruletNUMBER )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1320:3: lv_value_1_0= ruletNUMBER
            {
             
            	        newCompositeNode(grammarAccess.getNTwrFADmp2Access().getValueTNUMBERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruletNUMBER_in_rulenTwrFADmp22281);
            lv_value_1_0=ruletNUMBER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNTwrFADmp2Rule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"tNUMBER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwrFADmp22292); 
             
                newLeafNode(this_WS_2, grammarAccess.getNTwrFADmp2Access().getWSTerminalRuleCall_2()); 
                
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1340:1: ( (lv_name_3_0= 'TwrFADmp(2)' ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1341:1: (lv_name_3_0= 'TwrFADmp(2)' )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1341:1: (lv_name_3_0= 'TwrFADmp(2)' )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1342:3: lv_name_3_0= 'TwrFADmp(2)'
            {
            lv_name_3_0=(Token)match(input,19,FOLLOW_19_in_rulenTwrFADmp22309); 

                    newLeafNode(lv_name_3_0, grammarAccess.getNTwrFADmp2Access().getNameTwrFADmp2Keyword_3_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNTwrFADmp2Rule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_3_0, "TwrFADmp(2)");
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1355:2: (this_WS_4= RULE_WS )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_WS) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1355:3: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwrFADmp22334); 
                     
                        newLeafNode(this_WS_4, grammarAccess.getNTwrFADmp2Access().getWSTerminalRuleCall_4()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1359:3: (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_SL_COMMENT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1359:4: this_SL_COMMENT_5= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_5=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rulenTwrFADmp22347); 
                     
                        newLeafNode(this_SL_COMMENT_5, grammarAccess.getNTwrFADmp2Access().getSL_COMMENTTerminalRuleCall_5()); 
                        

                    }
                    break;

            }

            this_NEWLINE_6=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rulenTwrFADmp22359); 
             
                newLeafNode(this_NEWLINE_6, grammarAccess.getNTwrFADmp2Access().getNEWLINETerminalRuleCall_6()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulenTwrFADmp2"


    // $ANTLR start "entryRulenTwrSSDmp1"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1378:1: entryRulenTwrSSDmp1 returns [EObject current=null] : iv_rulenTwrSSDmp1= rulenTwrSSDmp1 EOF ;
    public final EObject entryRulenTwrSSDmp1() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenTwrSSDmp1 = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1382:2: (iv_rulenTwrSSDmp1= rulenTwrSSDmp1 EOF )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1383:2: iv_rulenTwrSSDmp1= rulenTwrSSDmp1 EOF
            {
             newCompositeNode(grammarAccess.getNTwrSSDmp1Rule()); 
            pushFollow(FOLLOW_rulenTwrSSDmp1_in_entryRulenTwrSSDmp12404);
            iv_rulenTwrSSDmp1=rulenTwrSSDmp1();

            state._fsp--;

             current =iv_rulenTwrSSDmp1; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenTwrSSDmp12414); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulenTwrSSDmp1"


    // $ANTLR start "rulenTwrSSDmp1"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1393:1: rulenTwrSSDmp1 returns [EObject current=null] : ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwrSSDmp(1)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) ;
    public final EObject rulenTwrSSDmp1() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token lv_name_3_0=null;
        Token this_WS_4=null;
        Token this_SL_COMMENT_5=null;
        Token this_NEWLINE_6=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1397:28: ( ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwrSSDmp(1)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1398:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwrSSDmp(1)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1398:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwrSSDmp(1)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1398:2: (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwrSSDmp(1)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1398:2: (this_WS_0= RULE_WS )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_WS) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1398:3: this_WS_0= RULE_WS
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwrSSDmp12455); 
                     
                        newLeafNode(this_WS_0, grammarAccess.getNTwrSSDmp1Access().getWSTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1402:3: ( (lv_value_1_0= ruletNUMBER ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1403:1: (lv_value_1_0= ruletNUMBER )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1403:1: (lv_value_1_0= ruletNUMBER )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1404:3: lv_value_1_0= ruletNUMBER
            {
             
            	        newCompositeNode(grammarAccess.getNTwrSSDmp1Access().getValueTNUMBERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruletNUMBER_in_rulenTwrSSDmp12477);
            lv_value_1_0=ruletNUMBER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNTwrSSDmp1Rule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"tNUMBER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwrSSDmp12488); 
             
                newLeafNode(this_WS_2, grammarAccess.getNTwrSSDmp1Access().getWSTerminalRuleCall_2()); 
                
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1424:1: ( (lv_name_3_0= 'TwrSSDmp(1)' ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1425:1: (lv_name_3_0= 'TwrSSDmp(1)' )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1425:1: (lv_name_3_0= 'TwrSSDmp(1)' )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1426:3: lv_name_3_0= 'TwrSSDmp(1)'
            {
            lv_name_3_0=(Token)match(input,20,FOLLOW_20_in_rulenTwrSSDmp12505); 

                    newLeafNode(lv_name_3_0, grammarAccess.getNTwrSSDmp1Access().getNameTwrSSDmp1Keyword_3_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNTwrSSDmp1Rule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_3_0, "TwrSSDmp(1)");
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1439:2: (this_WS_4= RULE_WS )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_WS) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1439:3: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwrSSDmp12530); 
                     
                        newLeafNode(this_WS_4, grammarAccess.getNTwrSSDmp1Access().getWSTerminalRuleCall_4()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1443:3: (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_SL_COMMENT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1443:4: this_SL_COMMENT_5= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_5=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rulenTwrSSDmp12543); 
                     
                        newLeafNode(this_SL_COMMENT_5, grammarAccess.getNTwrSSDmp1Access().getSL_COMMENTTerminalRuleCall_5()); 
                        

                    }
                    break;

            }

            this_NEWLINE_6=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rulenTwrSSDmp12555); 
             
                newLeafNode(this_NEWLINE_6, grammarAccess.getNTwrSSDmp1Access().getNEWLINETerminalRuleCall_6()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulenTwrSSDmp1"


    // $ANTLR start "entryRulenTwrSSDmp2"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1462:1: entryRulenTwrSSDmp2 returns [EObject current=null] : iv_rulenTwrSSDmp2= rulenTwrSSDmp2 EOF ;
    public final EObject entryRulenTwrSSDmp2() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenTwrSSDmp2 = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1466:2: (iv_rulenTwrSSDmp2= rulenTwrSSDmp2 EOF )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1467:2: iv_rulenTwrSSDmp2= rulenTwrSSDmp2 EOF
            {
             newCompositeNode(grammarAccess.getNTwrSSDmp2Rule()); 
            pushFollow(FOLLOW_rulenTwrSSDmp2_in_entryRulenTwrSSDmp22600);
            iv_rulenTwrSSDmp2=rulenTwrSSDmp2();

            state._fsp--;

             current =iv_rulenTwrSSDmp2; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenTwrSSDmp22610); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulenTwrSSDmp2"


    // $ANTLR start "rulenTwrSSDmp2"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1477:1: rulenTwrSSDmp2 returns [EObject current=null] : ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwrSSDmp(2)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) ;
    public final EObject rulenTwrSSDmp2() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token lv_name_3_0=null;
        Token this_WS_4=null;
        Token this_SL_COMMENT_5=null;
        Token this_NEWLINE_6=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1481:28: ( ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwrSSDmp(2)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1482:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwrSSDmp(2)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1482:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwrSSDmp(2)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1482:2: (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwrSSDmp(2)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1482:2: (this_WS_0= RULE_WS )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_WS) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1482:3: this_WS_0= RULE_WS
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwrSSDmp22651); 
                     
                        newLeafNode(this_WS_0, grammarAccess.getNTwrSSDmp2Access().getWSTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1486:3: ( (lv_value_1_0= ruletNUMBER ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1487:1: (lv_value_1_0= ruletNUMBER )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1487:1: (lv_value_1_0= ruletNUMBER )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1488:3: lv_value_1_0= ruletNUMBER
            {
             
            	        newCompositeNode(grammarAccess.getNTwrSSDmp2Access().getValueTNUMBERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruletNUMBER_in_rulenTwrSSDmp22673);
            lv_value_1_0=ruletNUMBER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNTwrSSDmp2Rule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"tNUMBER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwrSSDmp22684); 
             
                newLeafNode(this_WS_2, grammarAccess.getNTwrSSDmp2Access().getWSTerminalRuleCall_2()); 
                
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1508:1: ( (lv_name_3_0= 'TwrSSDmp(2)' ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1509:1: (lv_name_3_0= 'TwrSSDmp(2)' )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1509:1: (lv_name_3_0= 'TwrSSDmp(2)' )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1510:3: lv_name_3_0= 'TwrSSDmp(2)'
            {
            lv_name_3_0=(Token)match(input,21,FOLLOW_21_in_rulenTwrSSDmp22701); 

                    newLeafNode(lv_name_3_0, grammarAccess.getNTwrSSDmp2Access().getNameTwrSSDmp2Keyword_3_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNTwrSSDmp2Rule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_3_0, "TwrSSDmp(2)");
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1523:2: (this_WS_4= RULE_WS )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_WS) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1523:3: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwrSSDmp22726); 
                     
                        newLeafNode(this_WS_4, grammarAccess.getNTwrSSDmp2Access().getWSTerminalRuleCall_4()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1527:3: (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_SL_COMMENT) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1527:4: this_SL_COMMENT_5= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_5=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rulenTwrSSDmp22739); 
                     
                        newLeafNode(this_SL_COMMENT_5, grammarAccess.getNTwrSSDmp2Access().getSL_COMMENTTerminalRuleCall_5()); 
                        

                    }
                    break;

            }

            this_NEWLINE_6=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rulenTwrSSDmp22751); 
             
                newLeafNode(this_NEWLINE_6, grammarAccess.getNTwrSSDmp2Access().getNEWLINETerminalRuleCall_6()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulenTwrSSDmp2"


    // $ANTLR start "entryRulenFAStTunr1"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1546:1: entryRulenFAStTunr1 returns [EObject current=null] : iv_rulenFAStTunr1= rulenFAStTunr1 EOF ;
    public final EObject entryRulenFAStTunr1() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenFAStTunr1 = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1550:2: (iv_rulenFAStTunr1= rulenFAStTunr1 EOF )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1551:2: iv_rulenFAStTunr1= rulenFAStTunr1 EOF
            {
             newCompositeNode(grammarAccess.getNFAStTunr1Rule()); 
            pushFollow(FOLLOW_rulenFAStTunr1_in_entryRulenFAStTunr12796);
            iv_rulenFAStTunr1=rulenFAStTunr1();

            state._fsp--;

             current =iv_rulenFAStTunr1; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenFAStTunr12806); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulenFAStTunr1"


    // $ANTLR start "rulenFAStTunr1"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1561:1: rulenFAStTunr1 returns [EObject current=null] : ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'FAStTunr(1)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) ;
    public final EObject rulenFAStTunr1() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token lv_name_3_0=null;
        Token this_WS_4=null;
        Token this_SL_COMMENT_5=null;
        Token this_NEWLINE_6=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1565:28: ( ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'FAStTunr(1)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1566:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'FAStTunr(1)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1566:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'FAStTunr(1)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1566:2: (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'FAStTunr(1)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1566:2: (this_WS_0= RULE_WS )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_WS) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1566:3: this_WS_0= RULE_WS
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenFAStTunr12847); 
                     
                        newLeafNode(this_WS_0, grammarAccess.getNFAStTunr1Access().getWSTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1570:3: ( (lv_value_1_0= ruletNUMBER ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1571:1: (lv_value_1_0= ruletNUMBER )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1571:1: (lv_value_1_0= ruletNUMBER )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1572:3: lv_value_1_0= ruletNUMBER
            {
             
            	        newCompositeNode(grammarAccess.getNFAStTunr1Access().getValueTNUMBERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruletNUMBER_in_rulenFAStTunr12869);
            lv_value_1_0=ruletNUMBER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNFAStTunr1Rule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"tNUMBER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenFAStTunr12880); 
             
                newLeafNode(this_WS_2, grammarAccess.getNFAStTunr1Access().getWSTerminalRuleCall_2()); 
                
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1592:1: ( (lv_name_3_0= 'FAStTunr(1)' ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1593:1: (lv_name_3_0= 'FAStTunr(1)' )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1593:1: (lv_name_3_0= 'FAStTunr(1)' )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1594:3: lv_name_3_0= 'FAStTunr(1)'
            {
            lv_name_3_0=(Token)match(input,22,FOLLOW_22_in_rulenFAStTunr12897); 

                    newLeafNode(lv_name_3_0, grammarAccess.getNFAStTunr1Access().getNameFAStTunr1Keyword_3_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNFAStTunr1Rule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_3_0, "FAStTunr(1)");
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1607:2: (this_WS_4= RULE_WS )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_WS) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1607:3: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenFAStTunr12922); 
                     
                        newLeafNode(this_WS_4, grammarAccess.getNFAStTunr1Access().getWSTerminalRuleCall_4()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1611:3: (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_SL_COMMENT) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1611:4: this_SL_COMMENT_5= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_5=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rulenFAStTunr12935); 
                     
                        newLeafNode(this_SL_COMMENT_5, grammarAccess.getNFAStTunr1Access().getSL_COMMENTTerminalRuleCall_5()); 
                        

                    }
                    break;

            }

            this_NEWLINE_6=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rulenFAStTunr12947); 
             
                newLeafNode(this_NEWLINE_6, grammarAccess.getNFAStTunr1Access().getNEWLINETerminalRuleCall_6()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulenFAStTunr1"


    // $ANTLR start "entryRulenFAStTunr2"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1630:1: entryRulenFAStTunr2 returns [EObject current=null] : iv_rulenFAStTunr2= rulenFAStTunr2 EOF ;
    public final EObject entryRulenFAStTunr2() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenFAStTunr2 = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1634:2: (iv_rulenFAStTunr2= rulenFAStTunr2 EOF )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1635:2: iv_rulenFAStTunr2= rulenFAStTunr2 EOF
            {
             newCompositeNode(grammarAccess.getNFAStTunr2Rule()); 
            pushFollow(FOLLOW_rulenFAStTunr2_in_entryRulenFAStTunr22992);
            iv_rulenFAStTunr2=rulenFAStTunr2();

            state._fsp--;

             current =iv_rulenFAStTunr2; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenFAStTunr23002); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulenFAStTunr2"


    // $ANTLR start "rulenFAStTunr2"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1645:1: rulenFAStTunr2 returns [EObject current=null] : ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'FAStTunr(2)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) ;
    public final EObject rulenFAStTunr2() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token lv_name_3_0=null;
        Token this_WS_4=null;
        Token this_SL_COMMENT_5=null;
        Token this_NEWLINE_6=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1649:28: ( ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'FAStTunr(2)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1650:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'FAStTunr(2)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1650:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'FAStTunr(2)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1650:2: (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'FAStTunr(2)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1650:2: (this_WS_0= RULE_WS )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_WS) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1650:3: this_WS_0= RULE_WS
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenFAStTunr23043); 
                     
                        newLeafNode(this_WS_0, grammarAccess.getNFAStTunr2Access().getWSTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1654:3: ( (lv_value_1_0= ruletNUMBER ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1655:1: (lv_value_1_0= ruletNUMBER )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1655:1: (lv_value_1_0= ruletNUMBER )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1656:3: lv_value_1_0= ruletNUMBER
            {
             
            	        newCompositeNode(grammarAccess.getNFAStTunr2Access().getValueTNUMBERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruletNUMBER_in_rulenFAStTunr23065);
            lv_value_1_0=ruletNUMBER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNFAStTunr2Rule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"tNUMBER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenFAStTunr23076); 
             
                newLeafNode(this_WS_2, grammarAccess.getNFAStTunr2Access().getWSTerminalRuleCall_2()); 
                
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1676:1: ( (lv_name_3_0= 'FAStTunr(2)' ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1677:1: (lv_name_3_0= 'FAStTunr(2)' )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1677:1: (lv_name_3_0= 'FAStTunr(2)' )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1678:3: lv_name_3_0= 'FAStTunr(2)'
            {
            lv_name_3_0=(Token)match(input,23,FOLLOW_23_in_rulenFAStTunr23093); 

                    newLeafNode(lv_name_3_0, grammarAccess.getNFAStTunr2Access().getNameFAStTunr2Keyword_3_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNFAStTunr2Rule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_3_0, "FAStTunr(2)");
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1691:2: (this_WS_4= RULE_WS )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_WS) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1691:3: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenFAStTunr23118); 
                     
                        newLeafNode(this_WS_4, grammarAccess.getNFAStTunr2Access().getWSTerminalRuleCall_4()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1695:3: (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_SL_COMMENT) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1695:4: this_SL_COMMENT_5= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_5=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rulenFAStTunr23131); 
                     
                        newLeafNode(this_SL_COMMENT_5, grammarAccess.getNFAStTunr2Access().getSL_COMMENTTerminalRuleCall_5()); 
                        

                    }
                    break;

            }

            this_NEWLINE_6=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rulenFAStTunr23143); 
             
                newLeafNode(this_NEWLINE_6, grammarAccess.getNFAStTunr2Access().getNEWLINETerminalRuleCall_6()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulenFAStTunr2"


    // $ANTLR start "entryRulenSSStTunr1"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1714:1: entryRulenSSStTunr1 returns [EObject current=null] : iv_rulenSSStTunr1= rulenSSStTunr1 EOF ;
    public final EObject entryRulenSSStTunr1() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenSSStTunr1 = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1718:2: (iv_rulenSSStTunr1= rulenSSStTunr1 EOF )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1719:2: iv_rulenSSStTunr1= rulenSSStTunr1 EOF
            {
             newCompositeNode(grammarAccess.getNSSStTunr1Rule()); 
            pushFollow(FOLLOW_rulenSSStTunr1_in_entryRulenSSStTunr13188);
            iv_rulenSSStTunr1=rulenSSStTunr1();

            state._fsp--;

             current =iv_rulenSSStTunr1; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenSSStTunr13198); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulenSSStTunr1"


    // $ANTLR start "rulenSSStTunr1"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1729:1: rulenSSStTunr1 returns [EObject current=null] : ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'SSStTunr(1)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) ;
    public final EObject rulenSSStTunr1() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token lv_name_3_0=null;
        Token this_WS_4=null;
        Token this_SL_COMMENT_5=null;
        Token this_NEWLINE_6=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1733:28: ( ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'SSStTunr(1)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1734:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'SSStTunr(1)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1734:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'SSStTunr(1)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1734:2: (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'SSStTunr(1)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1734:2: (this_WS_0= RULE_WS )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_WS) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1734:3: this_WS_0= RULE_WS
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenSSStTunr13239); 
                     
                        newLeafNode(this_WS_0, grammarAccess.getNSSStTunr1Access().getWSTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1738:3: ( (lv_value_1_0= ruletNUMBER ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1739:1: (lv_value_1_0= ruletNUMBER )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1739:1: (lv_value_1_0= ruletNUMBER )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1740:3: lv_value_1_0= ruletNUMBER
            {
             
            	        newCompositeNode(grammarAccess.getNSSStTunr1Access().getValueTNUMBERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruletNUMBER_in_rulenSSStTunr13261);
            lv_value_1_0=ruletNUMBER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNSSStTunr1Rule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"tNUMBER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenSSStTunr13272); 
             
                newLeafNode(this_WS_2, grammarAccess.getNSSStTunr1Access().getWSTerminalRuleCall_2()); 
                
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1760:1: ( (lv_name_3_0= 'SSStTunr(1)' ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1761:1: (lv_name_3_0= 'SSStTunr(1)' )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1761:1: (lv_name_3_0= 'SSStTunr(1)' )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1762:3: lv_name_3_0= 'SSStTunr(1)'
            {
            lv_name_3_0=(Token)match(input,24,FOLLOW_24_in_rulenSSStTunr13289); 

                    newLeafNode(lv_name_3_0, grammarAccess.getNSSStTunr1Access().getNameSSStTunr1Keyword_3_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNSSStTunr1Rule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_3_0, "SSStTunr(1)");
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1775:2: (this_WS_4= RULE_WS )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_WS) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1775:3: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenSSStTunr13314); 
                     
                        newLeafNode(this_WS_4, grammarAccess.getNSSStTunr1Access().getWSTerminalRuleCall_4()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1779:3: (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_SL_COMMENT) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1779:4: this_SL_COMMENT_5= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_5=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rulenSSStTunr13327); 
                     
                        newLeafNode(this_SL_COMMENT_5, grammarAccess.getNSSStTunr1Access().getSL_COMMENTTerminalRuleCall_5()); 
                        

                    }
                    break;

            }

            this_NEWLINE_6=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rulenSSStTunr13339); 
             
                newLeafNode(this_NEWLINE_6, grammarAccess.getNSSStTunr1Access().getNEWLINETerminalRuleCall_6()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulenSSStTunr1"


    // $ANTLR start "entryRulenSSStTunr2"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1798:1: entryRulenSSStTunr2 returns [EObject current=null] : iv_rulenSSStTunr2= rulenSSStTunr2 EOF ;
    public final EObject entryRulenSSStTunr2() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenSSStTunr2 = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1802:2: (iv_rulenSSStTunr2= rulenSSStTunr2 EOF )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1803:2: iv_rulenSSStTunr2= rulenSSStTunr2 EOF
            {
             newCompositeNode(grammarAccess.getNSSStTunr2Rule()); 
            pushFollow(FOLLOW_rulenSSStTunr2_in_entryRulenSSStTunr23384);
            iv_rulenSSStTunr2=rulenSSStTunr2();

            state._fsp--;

             current =iv_rulenSSStTunr2; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenSSStTunr23394); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulenSSStTunr2"


    // $ANTLR start "rulenSSStTunr2"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1813:1: rulenSSStTunr2 returns [EObject current=null] : ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'SSStTunr(2)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) ;
    public final EObject rulenSSStTunr2() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token lv_name_3_0=null;
        Token this_WS_4=null;
        Token this_SL_COMMENT_5=null;
        Token this_NEWLINE_6=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1817:28: ( ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'SSStTunr(2)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1818:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'SSStTunr(2)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1818:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'SSStTunr(2)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1818:2: (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'SSStTunr(2)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1818:2: (this_WS_0= RULE_WS )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_WS) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1818:3: this_WS_0= RULE_WS
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenSSStTunr23435); 
                     
                        newLeafNode(this_WS_0, grammarAccess.getNSSStTunr2Access().getWSTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1822:3: ( (lv_value_1_0= ruletNUMBER ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1823:1: (lv_value_1_0= ruletNUMBER )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1823:1: (lv_value_1_0= ruletNUMBER )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1824:3: lv_value_1_0= ruletNUMBER
            {
             
            	        newCompositeNode(grammarAccess.getNSSStTunr2Access().getValueTNUMBERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruletNUMBER_in_rulenSSStTunr23457);
            lv_value_1_0=ruletNUMBER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNSSStTunr2Rule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"tNUMBER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenSSStTunr23468); 
             
                newLeafNode(this_WS_2, grammarAccess.getNSSStTunr2Access().getWSTerminalRuleCall_2()); 
                
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1844:1: ( (lv_name_3_0= 'SSStTunr(2)' ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1845:1: (lv_name_3_0= 'SSStTunr(2)' )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1845:1: (lv_name_3_0= 'SSStTunr(2)' )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1846:3: lv_name_3_0= 'SSStTunr(2)'
            {
            lv_name_3_0=(Token)match(input,25,FOLLOW_25_in_rulenSSStTunr23485); 

                    newLeafNode(lv_name_3_0, grammarAccess.getNSSStTunr2Access().getNameSSStTunr2Keyword_3_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNSSStTunr2Rule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_3_0, "SSStTunr(2)");
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1859:2: (this_WS_4= RULE_WS )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_WS) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1859:3: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenSSStTunr23510); 
                     
                        newLeafNode(this_WS_4, grammarAccess.getNSSStTunr2Access().getWSTerminalRuleCall_4()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1863:3: (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_SL_COMMENT) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1863:4: this_SL_COMMENT_5= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_5=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rulenSSStTunr23523); 
                     
                        newLeafNode(this_SL_COMMENT_5, grammarAccess.getNSSStTunr2Access().getSL_COMMENTTerminalRuleCall_5()); 
                        

                    }
                    break;

            }

            this_NEWLINE_6=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rulenSSStTunr23535); 
             
                newLeafNode(this_NEWLINE_6, grammarAccess.getNSSStTunr2Access().getNEWLINETerminalRuleCall_6()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulenSSStTunr2"


    // $ANTLR start "entryRuleAdjTwMa"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1882:1: entryRuleAdjTwMa returns [EObject current=null] : iv_ruleAdjTwMa= ruleAdjTwMa EOF ;
    public final EObject entryRuleAdjTwMa() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdjTwMa = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1886:2: (iv_ruleAdjTwMa= ruleAdjTwMa EOF )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1887:2: iv_ruleAdjTwMa= ruleAdjTwMa EOF
            {
             newCompositeNode(grammarAccess.getAdjTwMaRule()); 
            pushFollow(FOLLOW_ruleAdjTwMa_in_entryRuleAdjTwMa3580);
            iv_ruleAdjTwMa=ruleAdjTwMa();

            state._fsp--;

             current =iv_ruleAdjTwMa; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdjTwMa3590); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleAdjTwMa"


    // $ANTLR start "ruleAdjTwMa"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1897:1: ruleAdjTwMa returns [EObject current=null] : ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'AdjTwMa' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) ;
    public final EObject ruleAdjTwMa() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token lv_name_3_0=null;
        Token this_WS_4=null;
        Token this_SL_COMMENT_5=null;
        Token this_NEWLINE_6=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1901:28: ( ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'AdjTwMa' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1902:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'AdjTwMa' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1902:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'AdjTwMa' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1902:2: (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'AdjTwMa' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1902:2: (this_WS_0= RULE_WS )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_WS) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1902:3: this_WS_0= RULE_WS
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleAdjTwMa3631); 
                     
                        newLeafNode(this_WS_0, grammarAccess.getAdjTwMaAccess().getWSTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1906:3: ( (lv_value_1_0= ruletNUMBER ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1907:1: (lv_value_1_0= ruletNUMBER )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1907:1: (lv_value_1_0= ruletNUMBER )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1908:3: lv_value_1_0= ruletNUMBER
            {
             
            	        newCompositeNode(grammarAccess.getAdjTwMaAccess().getValueTNUMBERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruletNUMBER_in_ruleAdjTwMa3653);
            lv_value_1_0=ruletNUMBER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAdjTwMaRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"tNUMBER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleAdjTwMa3664); 
             
                newLeafNode(this_WS_2, grammarAccess.getAdjTwMaAccess().getWSTerminalRuleCall_2()); 
                
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1928:1: ( (lv_name_3_0= 'AdjTwMa' ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1929:1: (lv_name_3_0= 'AdjTwMa' )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1929:1: (lv_name_3_0= 'AdjTwMa' )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1930:3: lv_name_3_0= 'AdjTwMa'
            {
            lv_name_3_0=(Token)match(input,26,FOLLOW_26_in_ruleAdjTwMa3681); 

                    newLeafNode(lv_name_3_0, grammarAccess.getAdjTwMaAccess().getNameAdjTwMaKeyword_3_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAdjTwMaRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_3_0, "AdjTwMa");
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1943:2: (this_WS_4= RULE_WS )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_WS) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1943:3: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleAdjTwMa3706); 
                     
                        newLeafNode(this_WS_4, grammarAccess.getAdjTwMaAccess().getWSTerminalRuleCall_4()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1947:3: (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_SL_COMMENT) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1947:4: this_SL_COMMENT_5= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_5=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleAdjTwMa3719); 
                     
                        newLeafNode(this_SL_COMMENT_5, grammarAccess.getAdjTwMaAccess().getSL_COMMENTTerminalRuleCall_5()); 
                        

                    }
                    break;

            }

            this_NEWLINE_6=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_ruleAdjTwMa3731); 
             
                newLeafNode(this_NEWLINE_6, grammarAccess.getAdjTwMaAccess().getNEWLINETerminalRuleCall_6()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleAdjTwMa"


    // $ANTLR start "entryRuleAdjFASt"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1966:1: entryRuleAdjFASt returns [EObject current=null] : iv_ruleAdjFASt= ruleAdjFASt EOF ;
    public final EObject entryRuleAdjFASt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdjFASt = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1970:2: (iv_ruleAdjFASt= ruleAdjFASt EOF )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1971:2: iv_ruleAdjFASt= ruleAdjFASt EOF
            {
             newCompositeNode(grammarAccess.getAdjFAStRule()); 
            pushFollow(FOLLOW_ruleAdjFASt_in_entryRuleAdjFASt3776);
            iv_ruleAdjFASt=ruleAdjFASt();

            state._fsp--;

             current =iv_ruleAdjFASt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdjFASt3786); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleAdjFASt"


    // $ANTLR start "ruleAdjFASt"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1981:1: ruleAdjFASt returns [EObject current=null] : ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'AdjFASt' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) ;
    public final EObject ruleAdjFASt() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token lv_name_3_0=null;
        Token this_WS_4=null;
        Token this_SL_COMMENT_5=null;
        Token this_NEWLINE_6=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1985:28: ( ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'AdjFASt' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1986:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'AdjFASt' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1986:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'AdjFASt' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1986:2: (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'AdjFASt' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1986:2: (this_WS_0= RULE_WS )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_WS) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1986:3: this_WS_0= RULE_WS
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleAdjFASt3827); 
                     
                        newLeafNode(this_WS_0, grammarAccess.getAdjFAStAccess().getWSTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1990:3: ( (lv_value_1_0= ruletNUMBER ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1991:1: (lv_value_1_0= ruletNUMBER )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1991:1: (lv_value_1_0= ruletNUMBER )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:1992:3: lv_value_1_0= ruletNUMBER
            {
             
            	        newCompositeNode(grammarAccess.getAdjFAStAccess().getValueTNUMBERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruletNUMBER_in_ruleAdjFASt3849);
            lv_value_1_0=ruletNUMBER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAdjFAStRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"tNUMBER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleAdjFASt3860); 
             
                newLeafNode(this_WS_2, grammarAccess.getAdjFAStAccess().getWSTerminalRuleCall_2()); 
                
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2012:1: ( (lv_name_3_0= 'AdjFASt' ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2013:1: (lv_name_3_0= 'AdjFASt' )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2013:1: (lv_name_3_0= 'AdjFASt' )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2014:3: lv_name_3_0= 'AdjFASt'
            {
            lv_name_3_0=(Token)match(input,27,FOLLOW_27_in_ruleAdjFASt3877); 

                    newLeafNode(lv_name_3_0, grammarAccess.getAdjFAStAccess().getNameAdjFAStKeyword_3_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAdjFAStRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_3_0, "AdjFASt");
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2027:2: (this_WS_4= RULE_WS )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_WS) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2027:3: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleAdjFASt3902); 
                     
                        newLeafNode(this_WS_4, grammarAccess.getAdjFAStAccess().getWSTerminalRuleCall_4()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2031:3: (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_SL_COMMENT) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2031:4: this_SL_COMMENT_5= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_5=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleAdjFASt3915); 
                     
                        newLeafNode(this_SL_COMMENT_5, grammarAccess.getAdjFAStAccess().getSL_COMMENTTerminalRuleCall_5()); 
                        

                    }
                    break;

            }

            this_NEWLINE_6=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_ruleAdjFASt3927); 
             
                newLeafNode(this_NEWLINE_6, grammarAccess.getAdjFAStAccess().getNEWLINETerminalRuleCall_6()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleAdjFASt"


    // $ANTLR start "entryRuleAdjSSSt"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2050:1: entryRuleAdjSSSt returns [EObject current=null] : iv_ruleAdjSSSt= ruleAdjSSSt EOF ;
    public final EObject entryRuleAdjSSSt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdjSSSt = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2054:2: (iv_ruleAdjSSSt= ruleAdjSSSt EOF )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2055:2: iv_ruleAdjSSSt= ruleAdjSSSt EOF
            {
             newCompositeNode(grammarAccess.getAdjSSStRule()); 
            pushFollow(FOLLOW_ruleAdjSSSt_in_entryRuleAdjSSSt3972);
            iv_ruleAdjSSSt=ruleAdjSSSt();

            state._fsp--;

             current =iv_ruleAdjSSSt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdjSSSt3982); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleAdjSSSt"


    // $ANTLR start "ruleAdjSSSt"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2065:1: ruleAdjSSSt returns [EObject current=null] : ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'AdjSSSt' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) ;
    public final EObject ruleAdjSSSt() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token lv_name_3_0=null;
        Token this_WS_4=null;
        Token this_SL_COMMENT_5=null;
        Token this_NEWLINE_6=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2069:28: ( ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'AdjSSSt' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2070:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'AdjSSSt' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2070:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'AdjSSSt' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2070:2: (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'AdjSSSt' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2070:2: (this_WS_0= RULE_WS )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_WS) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2070:3: this_WS_0= RULE_WS
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleAdjSSSt4023); 
                     
                        newLeafNode(this_WS_0, grammarAccess.getAdjSSStAccess().getWSTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2074:3: ( (lv_value_1_0= ruletNUMBER ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2075:1: (lv_value_1_0= ruletNUMBER )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2075:1: (lv_value_1_0= ruletNUMBER )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2076:3: lv_value_1_0= ruletNUMBER
            {
             
            	        newCompositeNode(grammarAccess.getAdjSSStAccess().getValueTNUMBERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruletNUMBER_in_ruleAdjSSSt4045);
            lv_value_1_0=ruletNUMBER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAdjSSStRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"tNUMBER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleAdjSSSt4056); 
             
                newLeafNode(this_WS_2, grammarAccess.getAdjSSStAccess().getWSTerminalRuleCall_2()); 
                
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2096:1: ( (lv_name_3_0= 'AdjSSSt' ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2097:1: (lv_name_3_0= 'AdjSSSt' )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2097:1: (lv_name_3_0= 'AdjSSSt' )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2098:3: lv_name_3_0= 'AdjSSSt'
            {
            lv_name_3_0=(Token)match(input,28,FOLLOW_28_in_ruleAdjSSSt4073); 

                    newLeafNode(lv_name_3_0, grammarAccess.getAdjSSStAccess().getNameAdjSSStKeyword_3_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAdjSSStRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_3_0, "AdjSSSt");
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2111:2: (this_WS_4= RULE_WS )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_WS) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2111:3: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleAdjSSSt4098); 
                     
                        newLeafNode(this_WS_4, grammarAccess.getAdjSSStAccess().getWSTerminalRuleCall_4()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2115:3: (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_SL_COMMENT) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2115:4: this_SL_COMMENT_5= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_5=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleAdjSSSt4111); 
                     
                        newLeafNode(this_SL_COMMENT_5, grammarAccess.getAdjSSStAccess().getSL_COMMENTTerminalRuleCall_5()); 
                        

                    }
                    break;

            }

            this_NEWLINE_6=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_ruleAdjSSSt4123); 
             
                newLeafNode(this_NEWLINE_6, grammarAccess.getAdjSSStAccess().getNEWLINETerminalRuleCall_6()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleAdjSSSt"


    // $ANTLR start "entryRulenTwFAM1Sh2"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2134:1: entryRulenTwFAM1Sh2 returns [EObject current=null] : iv_rulenTwFAM1Sh2= rulenTwFAM1Sh2 EOF ;
    public final EObject entryRulenTwFAM1Sh2() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenTwFAM1Sh2 = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2138:2: (iv_rulenTwFAM1Sh2= rulenTwFAM1Sh2 EOF )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2139:2: iv_rulenTwFAM1Sh2= rulenTwFAM1Sh2 EOF
            {
             newCompositeNode(grammarAccess.getNTwFAM1Sh2Rule()); 
            pushFollow(FOLLOW_rulenTwFAM1Sh2_in_entryRulenTwFAM1Sh24168);
            iv_rulenTwFAM1Sh2=rulenTwFAM1Sh2();

            state._fsp--;

             current =iv_rulenTwFAM1Sh2; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenTwFAM1Sh24178); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulenTwFAM1Sh2"


    // $ANTLR start "rulenTwFAM1Sh2"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2149:1: rulenTwFAM1Sh2 returns [EObject current=null] : ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM1Sh(2)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) ;
    public final EObject rulenTwFAM1Sh2() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token lv_name_3_0=null;
        Token this_WS_4=null;
        Token this_SL_COMMENT_5=null;
        Token this_NEWLINE_6=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2153:28: ( ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM1Sh(2)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2154:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM1Sh(2)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2154:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM1Sh(2)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2154:2: (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM1Sh(2)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2154:2: (this_WS_0= RULE_WS )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_WS) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2154:3: this_WS_0= RULE_WS
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwFAM1Sh24219); 
                     
                        newLeafNode(this_WS_0, grammarAccess.getNTwFAM1Sh2Access().getWSTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2158:3: ( (lv_value_1_0= ruletNUMBER ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2159:1: (lv_value_1_0= ruletNUMBER )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2159:1: (lv_value_1_0= ruletNUMBER )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2160:3: lv_value_1_0= ruletNUMBER
            {
             
            	        newCompositeNode(grammarAccess.getNTwFAM1Sh2Access().getValueTNUMBERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruletNUMBER_in_rulenTwFAM1Sh24241);
            lv_value_1_0=ruletNUMBER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNTwFAM1Sh2Rule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"tNUMBER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwFAM1Sh24252); 
             
                newLeafNode(this_WS_2, grammarAccess.getNTwFAM1Sh2Access().getWSTerminalRuleCall_2()); 
                
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2180:1: ( (lv_name_3_0= 'TwFAM1Sh(2)' ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2181:1: (lv_name_3_0= 'TwFAM1Sh(2)' )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2181:1: (lv_name_3_0= 'TwFAM1Sh(2)' )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2182:3: lv_name_3_0= 'TwFAM1Sh(2)'
            {
            lv_name_3_0=(Token)match(input,29,FOLLOW_29_in_rulenTwFAM1Sh24269); 

                    newLeafNode(lv_name_3_0, grammarAccess.getNTwFAM1Sh2Access().getNameTwFAM1Sh2Keyword_3_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNTwFAM1Sh2Rule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_3_0, "TwFAM1Sh(2)");
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2195:2: (this_WS_4= RULE_WS )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_WS) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2195:3: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwFAM1Sh24294); 
                     
                        newLeafNode(this_WS_4, grammarAccess.getNTwFAM1Sh2Access().getWSTerminalRuleCall_4()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2199:3: (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_SL_COMMENT) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2199:4: this_SL_COMMENT_5= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_5=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rulenTwFAM1Sh24307); 
                     
                        newLeafNode(this_SL_COMMENT_5, grammarAccess.getNTwFAM1Sh2Access().getSL_COMMENTTerminalRuleCall_5()); 
                        

                    }
                    break;

            }

            this_NEWLINE_6=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rulenTwFAM1Sh24319); 
             
                newLeafNode(this_NEWLINE_6, grammarAccess.getNTwFAM1Sh2Access().getNEWLINETerminalRuleCall_6()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulenTwFAM1Sh2"


    // $ANTLR start "entryRulenTwFAM1Sh3"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2218:1: entryRulenTwFAM1Sh3 returns [EObject current=null] : iv_rulenTwFAM1Sh3= rulenTwFAM1Sh3 EOF ;
    public final EObject entryRulenTwFAM1Sh3() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenTwFAM1Sh3 = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2222:2: (iv_rulenTwFAM1Sh3= rulenTwFAM1Sh3 EOF )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2223:2: iv_rulenTwFAM1Sh3= rulenTwFAM1Sh3 EOF
            {
             newCompositeNode(grammarAccess.getNTwFAM1Sh3Rule()); 
            pushFollow(FOLLOW_rulenTwFAM1Sh3_in_entryRulenTwFAM1Sh34364);
            iv_rulenTwFAM1Sh3=rulenTwFAM1Sh3();

            state._fsp--;

             current =iv_rulenTwFAM1Sh3; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenTwFAM1Sh34374); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulenTwFAM1Sh3"


    // $ANTLR start "rulenTwFAM1Sh3"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2233:1: rulenTwFAM1Sh3 returns [EObject current=null] : ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM1Sh(3)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) ;
    public final EObject rulenTwFAM1Sh3() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token lv_name_3_0=null;
        Token this_WS_4=null;
        Token this_SL_COMMENT_5=null;
        Token this_NEWLINE_6=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2237:28: ( ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM1Sh(3)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2238:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM1Sh(3)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2238:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM1Sh(3)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2238:2: (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM1Sh(3)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2238:2: (this_WS_0= RULE_WS )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_WS) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2238:3: this_WS_0= RULE_WS
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwFAM1Sh34415); 
                     
                        newLeafNode(this_WS_0, grammarAccess.getNTwFAM1Sh3Access().getWSTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2242:3: ( (lv_value_1_0= ruletNUMBER ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2243:1: (lv_value_1_0= ruletNUMBER )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2243:1: (lv_value_1_0= ruletNUMBER )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2244:3: lv_value_1_0= ruletNUMBER
            {
             
            	        newCompositeNode(grammarAccess.getNTwFAM1Sh3Access().getValueTNUMBERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruletNUMBER_in_rulenTwFAM1Sh34437);
            lv_value_1_0=ruletNUMBER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNTwFAM1Sh3Rule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"tNUMBER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwFAM1Sh34448); 
             
                newLeafNode(this_WS_2, grammarAccess.getNTwFAM1Sh3Access().getWSTerminalRuleCall_2()); 
                
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2264:1: ( (lv_name_3_0= 'TwFAM1Sh(3)' ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2265:1: (lv_name_3_0= 'TwFAM1Sh(3)' )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2265:1: (lv_name_3_0= 'TwFAM1Sh(3)' )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2266:3: lv_name_3_0= 'TwFAM1Sh(3)'
            {
            lv_name_3_0=(Token)match(input,30,FOLLOW_30_in_rulenTwFAM1Sh34465); 

                    newLeafNode(lv_name_3_0, grammarAccess.getNTwFAM1Sh3Access().getNameTwFAM1Sh3Keyword_3_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNTwFAM1Sh3Rule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_3_0, "TwFAM1Sh(3)");
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2279:2: (this_WS_4= RULE_WS )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_WS) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2279:3: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwFAM1Sh34490); 
                     
                        newLeafNode(this_WS_4, grammarAccess.getNTwFAM1Sh3Access().getWSTerminalRuleCall_4()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2283:3: (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_SL_COMMENT) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2283:4: this_SL_COMMENT_5= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_5=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rulenTwFAM1Sh34503); 
                     
                        newLeafNode(this_SL_COMMENT_5, grammarAccess.getNTwFAM1Sh3Access().getSL_COMMENTTerminalRuleCall_5()); 
                        

                    }
                    break;

            }

            this_NEWLINE_6=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rulenTwFAM1Sh34515); 
             
                newLeafNode(this_NEWLINE_6, grammarAccess.getNTwFAM1Sh3Access().getNEWLINETerminalRuleCall_6()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulenTwFAM1Sh3"


    // $ANTLR start "entryRulenTwFAM1Sh4"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2302:1: entryRulenTwFAM1Sh4 returns [EObject current=null] : iv_rulenTwFAM1Sh4= rulenTwFAM1Sh4 EOF ;
    public final EObject entryRulenTwFAM1Sh4() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenTwFAM1Sh4 = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2306:2: (iv_rulenTwFAM1Sh4= rulenTwFAM1Sh4 EOF )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2307:2: iv_rulenTwFAM1Sh4= rulenTwFAM1Sh4 EOF
            {
             newCompositeNode(grammarAccess.getNTwFAM1Sh4Rule()); 
            pushFollow(FOLLOW_rulenTwFAM1Sh4_in_entryRulenTwFAM1Sh44560);
            iv_rulenTwFAM1Sh4=rulenTwFAM1Sh4();

            state._fsp--;

             current =iv_rulenTwFAM1Sh4; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenTwFAM1Sh44570); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulenTwFAM1Sh4"


    // $ANTLR start "rulenTwFAM1Sh4"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2317:1: rulenTwFAM1Sh4 returns [EObject current=null] : ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM1Sh(4)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) ;
    public final EObject rulenTwFAM1Sh4() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token lv_name_3_0=null;
        Token this_WS_4=null;
        Token this_SL_COMMENT_5=null;
        Token this_NEWLINE_6=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2321:28: ( ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM1Sh(4)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2322:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM1Sh(4)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2322:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM1Sh(4)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2322:2: (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM1Sh(4)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2322:2: (this_WS_0= RULE_WS )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_WS) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2322:3: this_WS_0= RULE_WS
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwFAM1Sh44611); 
                     
                        newLeafNode(this_WS_0, grammarAccess.getNTwFAM1Sh4Access().getWSTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2326:3: ( (lv_value_1_0= ruletNUMBER ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2327:1: (lv_value_1_0= ruletNUMBER )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2327:1: (lv_value_1_0= ruletNUMBER )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2328:3: lv_value_1_0= ruletNUMBER
            {
             
            	        newCompositeNode(grammarAccess.getNTwFAM1Sh4Access().getValueTNUMBERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruletNUMBER_in_rulenTwFAM1Sh44633);
            lv_value_1_0=ruletNUMBER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNTwFAM1Sh4Rule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"tNUMBER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwFAM1Sh44644); 
             
                newLeafNode(this_WS_2, grammarAccess.getNTwFAM1Sh4Access().getWSTerminalRuleCall_2()); 
                
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2348:1: ( (lv_name_3_0= 'TwFAM1Sh(4)' ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2349:1: (lv_name_3_0= 'TwFAM1Sh(4)' )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2349:1: (lv_name_3_0= 'TwFAM1Sh(4)' )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2350:3: lv_name_3_0= 'TwFAM1Sh(4)'
            {
            lv_name_3_0=(Token)match(input,31,FOLLOW_31_in_rulenTwFAM1Sh44661); 

                    newLeafNode(lv_name_3_0, grammarAccess.getNTwFAM1Sh4Access().getNameTwFAM1Sh4Keyword_3_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNTwFAM1Sh4Rule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_3_0, "TwFAM1Sh(4)");
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2363:2: (this_WS_4= RULE_WS )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_WS) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2363:3: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwFAM1Sh44686); 
                     
                        newLeafNode(this_WS_4, grammarAccess.getNTwFAM1Sh4Access().getWSTerminalRuleCall_4()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2367:3: (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_SL_COMMENT) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2367:4: this_SL_COMMENT_5= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_5=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rulenTwFAM1Sh44699); 
                     
                        newLeafNode(this_SL_COMMENT_5, grammarAccess.getNTwFAM1Sh4Access().getSL_COMMENTTerminalRuleCall_5()); 
                        

                    }
                    break;

            }

            this_NEWLINE_6=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rulenTwFAM1Sh44711); 
             
                newLeafNode(this_NEWLINE_6, grammarAccess.getNTwFAM1Sh4Access().getNEWLINETerminalRuleCall_6()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulenTwFAM1Sh4"


    // $ANTLR start "entryRulenTwFAM1Sh5"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2386:1: entryRulenTwFAM1Sh5 returns [EObject current=null] : iv_rulenTwFAM1Sh5= rulenTwFAM1Sh5 EOF ;
    public final EObject entryRulenTwFAM1Sh5() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenTwFAM1Sh5 = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2390:2: (iv_rulenTwFAM1Sh5= rulenTwFAM1Sh5 EOF )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2391:2: iv_rulenTwFAM1Sh5= rulenTwFAM1Sh5 EOF
            {
             newCompositeNode(grammarAccess.getNTwFAM1Sh5Rule()); 
            pushFollow(FOLLOW_rulenTwFAM1Sh5_in_entryRulenTwFAM1Sh54756);
            iv_rulenTwFAM1Sh5=rulenTwFAM1Sh5();

            state._fsp--;

             current =iv_rulenTwFAM1Sh5; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenTwFAM1Sh54766); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulenTwFAM1Sh5"


    // $ANTLR start "rulenTwFAM1Sh5"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2401:1: rulenTwFAM1Sh5 returns [EObject current=null] : ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM1Sh(5)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) ;
    public final EObject rulenTwFAM1Sh5() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token lv_name_3_0=null;
        Token this_WS_4=null;
        Token this_SL_COMMENT_5=null;
        Token this_NEWLINE_6=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2405:28: ( ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM1Sh(5)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2406:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM1Sh(5)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2406:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM1Sh(5)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2406:2: (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM1Sh(5)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2406:2: (this_WS_0= RULE_WS )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_WS) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2406:3: this_WS_0= RULE_WS
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwFAM1Sh54807); 
                     
                        newLeafNode(this_WS_0, grammarAccess.getNTwFAM1Sh5Access().getWSTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2410:3: ( (lv_value_1_0= ruletNUMBER ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2411:1: (lv_value_1_0= ruletNUMBER )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2411:1: (lv_value_1_0= ruletNUMBER )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2412:3: lv_value_1_0= ruletNUMBER
            {
             
            	        newCompositeNode(grammarAccess.getNTwFAM1Sh5Access().getValueTNUMBERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruletNUMBER_in_rulenTwFAM1Sh54829);
            lv_value_1_0=ruletNUMBER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNTwFAM1Sh5Rule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"tNUMBER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwFAM1Sh54840); 
             
                newLeafNode(this_WS_2, grammarAccess.getNTwFAM1Sh5Access().getWSTerminalRuleCall_2()); 
                
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2432:1: ( (lv_name_3_0= 'TwFAM1Sh(5)' ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2433:1: (lv_name_3_0= 'TwFAM1Sh(5)' )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2433:1: (lv_name_3_0= 'TwFAM1Sh(5)' )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2434:3: lv_name_3_0= 'TwFAM1Sh(5)'
            {
            lv_name_3_0=(Token)match(input,32,FOLLOW_32_in_rulenTwFAM1Sh54857); 

                    newLeafNode(lv_name_3_0, grammarAccess.getNTwFAM1Sh5Access().getNameTwFAM1Sh5Keyword_3_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNTwFAM1Sh5Rule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_3_0, "TwFAM1Sh(5)");
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2447:2: (this_WS_4= RULE_WS )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_WS) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2447:3: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwFAM1Sh54882); 
                     
                        newLeafNode(this_WS_4, grammarAccess.getNTwFAM1Sh5Access().getWSTerminalRuleCall_4()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2451:3: (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_SL_COMMENT) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2451:4: this_SL_COMMENT_5= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_5=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rulenTwFAM1Sh54895); 
                     
                        newLeafNode(this_SL_COMMENT_5, grammarAccess.getNTwFAM1Sh5Access().getSL_COMMENTTerminalRuleCall_5()); 
                        

                    }
                    break;

            }

            this_NEWLINE_6=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rulenTwFAM1Sh54907); 
             
                newLeafNode(this_NEWLINE_6, grammarAccess.getNTwFAM1Sh5Access().getNEWLINETerminalRuleCall_6()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulenTwFAM1Sh5"


    // $ANTLR start "entryRulenTwFAM1Sh6"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2470:1: entryRulenTwFAM1Sh6 returns [EObject current=null] : iv_rulenTwFAM1Sh6= rulenTwFAM1Sh6 EOF ;
    public final EObject entryRulenTwFAM1Sh6() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenTwFAM1Sh6 = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2474:2: (iv_rulenTwFAM1Sh6= rulenTwFAM1Sh6 EOF )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2475:2: iv_rulenTwFAM1Sh6= rulenTwFAM1Sh6 EOF
            {
             newCompositeNode(grammarAccess.getNTwFAM1Sh6Rule()); 
            pushFollow(FOLLOW_rulenTwFAM1Sh6_in_entryRulenTwFAM1Sh64952);
            iv_rulenTwFAM1Sh6=rulenTwFAM1Sh6();

            state._fsp--;

             current =iv_rulenTwFAM1Sh6; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenTwFAM1Sh64962); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulenTwFAM1Sh6"


    // $ANTLR start "rulenTwFAM1Sh6"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2485:1: rulenTwFAM1Sh6 returns [EObject current=null] : ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM1Sh(6)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) ;
    public final EObject rulenTwFAM1Sh6() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token lv_name_3_0=null;
        Token this_WS_4=null;
        Token this_SL_COMMENT_5=null;
        Token this_NEWLINE_6=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2489:28: ( ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM1Sh(6)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2490:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM1Sh(6)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2490:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM1Sh(6)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2490:2: (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM1Sh(6)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2490:2: (this_WS_0= RULE_WS )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_WS) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2490:3: this_WS_0= RULE_WS
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwFAM1Sh65003); 
                     
                        newLeafNode(this_WS_0, grammarAccess.getNTwFAM1Sh6Access().getWSTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2494:3: ( (lv_value_1_0= ruletNUMBER ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2495:1: (lv_value_1_0= ruletNUMBER )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2495:1: (lv_value_1_0= ruletNUMBER )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2496:3: lv_value_1_0= ruletNUMBER
            {
             
            	        newCompositeNode(grammarAccess.getNTwFAM1Sh6Access().getValueTNUMBERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruletNUMBER_in_rulenTwFAM1Sh65025);
            lv_value_1_0=ruletNUMBER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNTwFAM1Sh6Rule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"tNUMBER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwFAM1Sh65036); 
             
                newLeafNode(this_WS_2, grammarAccess.getNTwFAM1Sh6Access().getWSTerminalRuleCall_2()); 
                
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2516:1: ( (lv_name_3_0= 'TwFAM1Sh(6)' ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2517:1: (lv_name_3_0= 'TwFAM1Sh(6)' )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2517:1: (lv_name_3_0= 'TwFAM1Sh(6)' )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2518:3: lv_name_3_0= 'TwFAM1Sh(6)'
            {
            lv_name_3_0=(Token)match(input,33,FOLLOW_33_in_rulenTwFAM1Sh65053); 

                    newLeafNode(lv_name_3_0, grammarAccess.getNTwFAM1Sh6Access().getNameTwFAM1Sh6Keyword_3_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNTwFAM1Sh6Rule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_3_0, "TwFAM1Sh(6)");
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2531:2: (this_WS_4= RULE_WS )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_WS) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2531:3: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwFAM1Sh65078); 
                     
                        newLeafNode(this_WS_4, grammarAccess.getNTwFAM1Sh6Access().getWSTerminalRuleCall_4()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2535:3: (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_SL_COMMENT) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2535:4: this_SL_COMMENT_5= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_5=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rulenTwFAM1Sh65091); 
                     
                        newLeafNode(this_SL_COMMENT_5, grammarAccess.getNTwFAM1Sh6Access().getSL_COMMENTTerminalRuleCall_5()); 
                        

                    }
                    break;

            }

            this_NEWLINE_6=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rulenTwFAM1Sh65103); 
             
                newLeafNode(this_NEWLINE_6, grammarAccess.getNTwFAM1Sh6Access().getNEWLINETerminalRuleCall_6()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulenTwFAM1Sh6"


    // $ANTLR start "entryRulenTwFAM2Sh2"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2554:1: entryRulenTwFAM2Sh2 returns [EObject current=null] : iv_rulenTwFAM2Sh2= rulenTwFAM2Sh2 EOF ;
    public final EObject entryRulenTwFAM2Sh2() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenTwFAM2Sh2 = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2558:2: (iv_rulenTwFAM2Sh2= rulenTwFAM2Sh2 EOF )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2559:2: iv_rulenTwFAM2Sh2= rulenTwFAM2Sh2 EOF
            {
             newCompositeNode(grammarAccess.getNTwFAM2Sh2Rule()); 
            pushFollow(FOLLOW_rulenTwFAM2Sh2_in_entryRulenTwFAM2Sh25148);
            iv_rulenTwFAM2Sh2=rulenTwFAM2Sh2();

            state._fsp--;

             current =iv_rulenTwFAM2Sh2; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenTwFAM2Sh25158); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulenTwFAM2Sh2"


    // $ANTLR start "rulenTwFAM2Sh2"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2569:1: rulenTwFAM2Sh2 returns [EObject current=null] : ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM2Sh(2)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) ;
    public final EObject rulenTwFAM2Sh2() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token lv_name_3_0=null;
        Token this_WS_4=null;
        Token this_SL_COMMENT_5=null;
        Token this_NEWLINE_6=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2573:28: ( ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM2Sh(2)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2574:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM2Sh(2)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2574:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM2Sh(2)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2574:2: (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM2Sh(2)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2574:2: (this_WS_0= RULE_WS )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_WS) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2574:3: this_WS_0= RULE_WS
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwFAM2Sh25199); 
                     
                        newLeafNode(this_WS_0, grammarAccess.getNTwFAM2Sh2Access().getWSTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2578:3: ( (lv_value_1_0= ruletNUMBER ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2579:1: (lv_value_1_0= ruletNUMBER )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2579:1: (lv_value_1_0= ruletNUMBER )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2580:3: lv_value_1_0= ruletNUMBER
            {
             
            	        newCompositeNode(grammarAccess.getNTwFAM2Sh2Access().getValueTNUMBERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruletNUMBER_in_rulenTwFAM2Sh25221);
            lv_value_1_0=ruletNUMBER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNTwFAM2Sh2Rule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"tNUMBER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwFAM2Sh25232); 
             
                newLeafNode(this_WS_2, grammarAccess.getNTwFAM2Sh2Access().getWSTerminalRuleCall_2()); 
                
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2600:1: ( (lv_name_3_0= 'TwFAM2Sh(2)' ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2601:1: (lv_name_3_0= 'TwFAM2Sh(2)' )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2601:1: (lv_name_3_0= 'TwFAM2Sh(2)' )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2602:3: lv_name_3_0= 'TwFAM2Sh(2)'
            {
            lv_name_3_0=(Token)match(input,34,FOLLOW_34_in_rulenTwFAM2Sh25249); 

                    newLeafNode(lv_name_3_0, grammarAccess.getNTwFAM2Sh2Access().getNameTwFAM2Sh2Keyword_3_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNTwFAM2Sh2Rule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_3_0, "TwFAM2Sh(2)");
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2615:2: (this_WS_4= RULE_WS )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_WS) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2615:3: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwFAM2Sh25274); 
                     
                        newLeafNode(this_WS_4, grammarAccess.getNTwFAM2Sh2Access().getWSTerminalRuleCall_4()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2619:3: (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_SL_COMMENT) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2619:4: this_SL_COMMENT_5= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_5=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rulenTwFAM2Sh25287); 
                     
                        newLeafNode(this_SL_COMMENT_5, grammarAccess.getNTwFAM2Sh2Access().getSL_COMMENTTerminalRuleCall_5()); 
                        

                    }
                    break;

            }

            this_NEWLINE_6=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rulenTwFAM2Sh25299); 
             
                newLeafNode(this_NEWLINE_6, grammarAccess.getNTwFAM2Sh2Access().getNEWLINETerminalRuleCall_6()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulenTwFAM2Sh2"


    // $ANTLR start "entryRulenTwFAM2Sh3"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2638:1: entryRulenTwFAM2Sh3 returns [EObject current=null] : iv_rulenTwFAM2Sh3= rulenTwFAM2Sh3 EOF ;
    public final EObject entryRulenTwFAM2Sh3() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenTwFAM2Sh3 = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2642:2: (iv_rulenTwFAM2Sh3= rulenTwFAM2Sh3 EOF )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2643:2: iv_rulenTwFAM2Sh3= rulenTwFAM2Sh3 EOF
            {
             newCompositeNode(grammarAccess.getNTwFAM2Sh3Rule()); 
            pushFollow(FOLLOW_rulenTwFAM2Sh3_in_entryRulenTwFAM2Sh35344);
            iv_rulenTwFAM2Sh3=rulenTwFAM2Sh3();

            state._fsp--;

             current =iv_rulenTwFAM2Sh3; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenTwFAM2Sh35354); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulenTwFAM2Sh3"


    // $ANTLR start "rulenTwFAM2Sh3"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2653:1: rulenTwFAM2Sh3 returns [EObject current=null] : ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM2Sh(3)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) ;
    public final EObject rulenTwFAM2Sh3() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token lv_name_3_0=null;
        Token this_WS_4=null;
        Token this_SL_COMMENT_5=null;
        Token this_NEWLINE_6=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2657:28: ( ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM2Sh(3)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2658:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM2Sh(3)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2658:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM2Sh(3)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2658:2: (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM2Sh(3)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2658:2: (this_WS_0= RULE_WS )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_WS) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2658:3: this_WS_0= RULE_WS
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwFAM2Sh35395); 
                     
                        newLeafNode(this_WS_0, grammarAccess.getNTwFAM2Sh3Access().getWSTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2662:3: ( (lv_value_1_0= ruletNUMBER ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2663:1: (lv_value_1_0= ruletNUMBER )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2663:1: (lv_value_1_0= ruletNUMBER )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2664:3: lv_value_1_0= ruletNUMBER
            {
             
            	        newCompositeNode(grammarAccess.getNTwFAM2Sh3Access().getValueTNUMBERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruletNUMBER_in_rulenTwFAM2Sh35417);
            lv_value_1_0=ruletNUMBER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNTwFAM2Sh3Rule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"tNUMBER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwFAM2Sh35428); 
             
                newLeafNode(this_WS_2, grammarAccess.getNTwFAM2Sh3Access().getWSTerminalRuleCall_2()); 
                
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2684:1: ( (lv_name_3_0= 'TwFAM2Sh(3)' ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2685:1: (lv_name_3_0= 'TwFAM2Sh(3)' )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2685:1: (lv_name_3_0= 'TwFAM2Sh(3)' )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2686:3: lv_name_3_0= 'TwFAM2Sh(3)'
            {
            lv_name_3_0=(Token)match(input,35,FOLLOW_35_in_rulenTwFAM2Sh35445); 

                    newLeafNode(lv_name_3_0, grammarAccess.getNTwFAM2Sh3Access().getNameTwFAM2Sh3Keyword_3_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNTwFAM2Sh3Rule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_3_0, "TwFAM2Sh(3)");
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2699:2: (this_WS_4= RULE_WS )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_WS) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2699:3: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwFAM2Sh35470); 
                     
                        newLeafNode(this_WS_4, grammarAccess.getNTwFAM2Sh3Access().getWSTerminalRuleCall_4()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2703:3: (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_SL_COMMENT) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2703:4: this_SL_COMMENT_5= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_5=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rulenTwFAM2Sh35483); 
                     
                        newLeafNode(this_SL_COMMENT_5, grammarAccess.getNTwFAM2Sh3Access().getSL_COMMENTTerminalRuleCall_5()); 
                        

                    }
                    break;

            }

            this_NEWLINE_6=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rulenTwFAM2Sh35495); 
             
                newLeafNode(this_NEWLINE_6, grammarAccess.getNTwFAM2Sh3Access().getNEWLINETerminalRuleCall_6()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulenTwFAM2Sh3"


    // $ANTLR start "entryRulenTwFAM2Sh4"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2722:1: entryRulenTwFAM2Sh4 returns [EObject current=null] : iv_rulenTwFAM2Sh4= rulenTwFAM2Sh4 EOF ;
    public final EObject entryRulenTwFAM2Sh4() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenTwFAM2Sh4 = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2726:2: (iv_rulenTwFAM2Sh4= rulenTwFAM2Sh4 EOF )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2727:2: iv_rulenTwFAM2Sh4= rulenTwFAM2Sh4 EOF
            {
             newCompositeNode(grammarAccess.getNTwFAM2Sh4Rule()); 
            pushFollow(FOLLOW_rulenTwFAM2Sh4_in_entryRulenTwFAM2Sh45540);
            iv_rulenTwFAM2Sh4=rulenTwFAM2Sh4();

            state._fsp--;

             current =iv_rulenTwFAM2Sh4; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenTwFAM2Sh45550); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulenTwFAM2Sh4"


    // $ANTLR start "rulenTwFAM2Sh4"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2737:1: rulenTwFAM2Sh4 returns [EObject current=null] : ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM2Sh(4)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) ;
    public final EObject rulenTwFAM2Sh4() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token lv_name_3_0=null;
        Token this_WS_4=null;
        Token this_SL_COMMENT_5=null;
        Token this_NEWLINE_6=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2741:28: ( ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM2Sh(4)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2742:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM2Sh(4)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2742:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM2Sh(4)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2742:2: (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM2Sh(4)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2742:2: (this_WS_0= RULE_WS )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_WS) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2742:3: this_WS_0= RULE_WS
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwFAM2Sh45591); 
                     
                        newLeafNode(this_WS_0, grammarAccess.getNTwFAM2Sh4Access().getWSTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2746:3: ( (lv_value_1_0= ruletNUMBER ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2747:1: (lv_value_1_0= ruletNUMBER )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2747:1: (lv_value_1_0= ruletNUMBER )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2748:3: lv_value_1_0= ruletNUMBER
            {
             
            	        newCompositeNode(grammarAccess.getNTwFAM2Sh4Access().getValueTNUMBERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruletNUMBER_in_rulenTwFAM2Sh45613);
            lv_value_1_0=ruletNUMBER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNTwFAM2Sh4Rule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"tNUMBER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwFAM2Sh45624); 
             
                newLeafNode(this_WS_2, grammarAccess.getNTwFAM2Sh4Access().getWSTerminalRuleCall_2()); 
                
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2768:1: ( (lv_name_3_0= 'TwFAM2Sh(4)' ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2769:1: (lv_name_3_0= 'TwFAM2Sh(4)' )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2769:1: (lv_name_3_0= 'TwFAM2Sh(4)' )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2770:3: lv_name_3_0= 'TwFAM2Sh(4)'
            {
            lv_name_3_0=(Token)match(input,36,FOLLOW_36_in_rulenTwFAM2Sh45641); 

                    newLeafNode(lv_name_3_0, grammarAccess.getNTwFAM2Sh4Access().getNameTwFAM2Sh4Keyword_3_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNTwFAM2Sh4Rule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_3_0, "TwFAM2Sh(4)");
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2783:2: (this_WS_4= RULE_WS )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_WS) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2783:3: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwFAM2Sh45666); 
                     
                        newLeafNode(this_WS_4, grammarAccess.getNTwFAM2Sh4Access().getWSTerminalRuleCall_4()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2787:3: (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_SL_COMMENT) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2787:4: this_SL_COMMENT_5= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_5=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rulenTwFAM2Sh45679); 
                     
                        newLeafNode(this_SL_COMMENT_5, grammarAccess.getNTwFAM2Sh4Access().getSL_COMMENTTerminalRuleCall_5()); 
                        

                    }
                    break;

            }

            this_NEWLINE_6=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rulenTwFAM2Sh45691); 
             
                newLeafNode(this_NEWLINE_6, grammarAccess.getNTwFAM2Sh4Access().getNEWLINETerminalRuleCall_6()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulenTwFAM2Sh4"


    // $ANTLR start "entryRulenTwFAM2Sh5"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2806:1: entryRulenTwFAM2Sh5 returns [EObject current=null] : iv_rulenTwFAM2Sh5= rulenTwFAM2Sh5 EOF ;
    public final EObject entryRulenTwFAM2Sh5() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenTwFAM2Sh5 = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2810:2: (iv_rulenTwFAM2Sh5= rulenTwFAM2Sh5 EOF )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2811:2: iv_rulenTwFAM2Sh5= rulenTwFAM2Sh5 EOF
            {
             newCompositeNode(grammarAccess.getNTwFAM2Sh5Rule()); 
            pushFollow(FOLLOW_rulenTwFAM2Sh5_in_entryRulenTwFAM2Sh55736);
            iv_rulenTwFAM2Sh5=rulenTwFAM2Sh5();

            state._fsp--;

             current =iv_rulenTwFAM2Sh5; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenTwFAM2Sh55746); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulenTwFAM2Sh5"


    // $ANTLR start "rulenTwFAM2Sh5"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2821:1: rulenTwFAM2Sh5 returns [EObject current=null] : ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM2Sh(5)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) ;
    public final EObject rulenTwFAM2Sh5() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token lv_name_3_0=null;
        Token this_WS_4=null;
        Token this_SL_COMMENT_5=null;
        Token this_NEWLINE_6=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2825:28: ( ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM2Sh(5)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2826:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM2Sh(5)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2826:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM2Sh(5)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2826:2: (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM2Sh(5)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2826:2: (this_WS_0= RULE_WS )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_WS) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2826:3: this_WS_0= RULE_WS
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwFAM2Sh55787); 
                     
                        newLeafNode(this_WS_0, grammarAccess.getNTwFAM2Sh5Access().getWSTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2830:3: ( (lv_value_1_0= ruletNUMBER ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2831:1: (lv_value_1_0= ruletNUMBER )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2831:1: (lv_value_1_0= ruletNUMBER )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2832:3: lv_value_1_0= ruletNUMBER
            {
             
            	        newCompositeNode(grammarAccess.getNTwFAM2Sh5Access().getValueTNUMBERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruletNUMBER_in_rulenTwFAM2Sh55809);
            lv_value_1_0=ruletNUMBER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNTwFAM2Sh5Rule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"tNUMBER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwFAM2Sh55820); 
             
                newLeafNode(this_WS_2, grammarAccess.getNTwFAM2Sh5Access().getWSTerminalRuleCall_2()); 
                
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2852:1: ( (lv_name_3_0= 'TwFAM2Sh(5)' ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2853:1: (lv_name_3_0= 'TwFAM2Sh(5)' )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2853:1: (lv_name_3_0= 'TwFAM2Sh(5)' )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2854:3: lv_name_3_0= 'TwFAM2Sh(5)'
            {
            lv_name_3_0=(Token)match(input,37,FOLLOW_37_in_rulenTwFAM2Sh55837); 

                    newLeafNode(lv_name_3_0, grammarAccess.getNTwFAM2Sh5Access().getNameTwFAM2Sh5Keyword_3_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNTwFAM2Sh5Rule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_3_0, "TwFAM2Sh(5)");
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2867:2: (this_WS_4= RULE_WS )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_WS) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2867:3: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwFAM2Sh55862); 
                     
                        newLeafNode(this_WS_4, grammarAccess.getNTwFAM2Sh5Access().getWSTerminalRuleCall_4()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2871:3: (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_SL_COMMENT) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2871:4: this_SL_COMMENT_5= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_5=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rulenTwFAM2Sh55875); 
                     
                        newLeafNode(this_SL_COMMENT_5, grammarAccess.getNTwFAM2Sh5Access().getSL_COMMENTTerminalRuleCall_5()); 
                        

                    }
                    break;

            }

            this_NEWLINE_6=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rulenTwFAM2Sh55887); 
             
                newLeafNode(this_NEWLINE_6, grammarAccess.getNTwFAM2Sh5Access().getNEWLINETerminalRuleCall_6()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulenTwFAM2Sh5"


    // $ANTLR start "entryRulenTwFAM2Sh6"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2890:1: entryRulenTwFAM2Sh6 returns [EObject current=null] : iv_rulenTwFAM2Sh6= rulenTwFAM2Sh6 EOF ;
    public final EObject entryRulenTwFAM2Sh6() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenTwFAM2Sh6 = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2894:2: (iv_rulenTwFAM2Sh6= rulenTwFAM2Sh6 EOF )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2895:2: iv_rulenTwFAM2Sh6= rulenTwFAM2Sh6 EOF
            {
             newCompositeNode(grammarAccess.getNTwFAM2Sh6Rule()); 
            pushFollow(FOLLOW_rulenTwFAM2Sh6_in_entryRulenTwFAM2Sh65932);
            iv_rulenTwFAM2Sh6=rulenTwFAM2Sh6();

            state._fsp--;

             current =iv_rulenTwFAM2Sh6; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenTwFAM2Sh65942); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulenTwFAM2Sh6"


    // $ANTLR start "rulenTwFAM2Sh6"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2905:1: rulenTwFAM2Sh6 returns [EObject current=null] : ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM2Sh(6)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) ;
    public final EObject rulenTwFAM2Sh6() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token lv_name_3_0=null;
        Token this_WS_4=null;
        Token this_SL_COMMENT_5=null;
        Token this_NEWLINE_6=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2909:28: ( ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM2Sh(6)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2910:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM2Sh(6)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2910:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM2Sh(6)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2910:2: (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwFAM2Sh(6)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2910:2: (this_WS_0= RULE_WS )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_WS) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2910:3: this_WS_0= RULE_WS
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwFAM2Sh65983); 
                     
                        newLeafNode(this_WS_0, grammarAccess.getNTwFAM2Sh6Access().getWSTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2914:3: ( (lv_value_1_0= ruletNUMBER ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2915:1: (lv_value_1_0= ruletNUMBER )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2915:1: (lv_value_1_0= ruletNUMBER )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2916:3: lv_value_1_0= ruletNUMBER
            {
             
            	        newCompositeNode(grammarAccess.getNTwFAM2Sh6Access().getValueTNUMBERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruletNUMBER_in_rulenTwFAM2Sh66005);
            lv_value_1_0=ruletNUMBER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNTwFAM2Sh6Rule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"tNUMBER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwFAM2Sh66016); 
             
                newLeafNode(this_WS_2, grammarAccess.getNTwFAM2Sh6Access().getWSTerminalRuleCall_2()); 
                
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2936:1: ( (lv_name_3_0= 'TwFAM2Sh(6)' ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2937:1: (lv_name_3_0= 'TwFAM2Sh(6)' )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2937:1: (lv_name_3_0= 'TwFAM2Sh(6)' )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2938:3: lv_name_3_0= 'TwFAM2Sh(6)'
            {
            lv_name_3_0=(Token)match(input,38,FOLLOW_38_in_rulenTwFAM2Sh66033); 

                    newLeafNode(lv_name_3_0, grammarAccess.getNTwFAM2Sh6Access().getNameTwFAM2Sh6Keyword_3_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNTwFAM2Sh6Rule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_3_0, "TwFAM2Sh(6)");
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2951:2: (this_WS_4= RULE_WS )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_WS) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2951:3: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwFAM2Sh66058); 
                     
                        newLeafNode(this_WS_4, grammarAccess.getNTwFAM2Sh6Access().getWSTerminalRuleCall_4()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2955:3: (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_SL_COMMENT) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2955:4: this_SL_COMMENT_5= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_5=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rulenTwFAM2Sh66071); 
                     
                        newLeafNode(this_SL_COMMENT_5, grammarAccess.getNTwFAM2Sh6Access().getSL_COMMENTTerminalRuleCall_5()); 
                        

                    }
                    break;

            }

            this_NEWLINE_6=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rulenTwFAM2Sh66083); 
             
                newLeafNode(this_NEWLINE_6, grammarAccess.getNTwFAM2Sh6Access().getNEWLINETerminalRuleCall_6()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulenTwFAM2Sh6"


    // $ANTLR start "entryRulenTwSSM1Sh2"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2974:1: entryRulenTwSSM1Sh2 returns [EObject current=null] : iv_rulenTwSSM1Sh2= rulenTwSSM1Sh2 EOF ;
    public final EObject entryRulenTwSSM1Sh2() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenTwSSM1Sh2 = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2978:2: (iv_rulenTwSSM1Sh2= rulenTwSSM1Sh2 EOF )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2979:2: iv_rulenTwSSM1Sh2= rulenTwSSM1Sh2 EOF
            {
             newCompositeNode(grammarAccess.getNTwSSM1Sh2Rule()); 
            pushFollow(FOLLOW_rulenTwSSM1Sh2_in_entryRulenTwSSM1Sh26128);
            iv_rulenTwSSM1Sh2=rulenTwSSM1Sh2();

            state._fsp--;

             current =iv_rulenTwSSM1Sh2; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenTwSSM1Sh26138); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulenTwSSM1Sh2"


    // $ANTLR start "rulenTwSSM1Sh2"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2989:1: rulenTwSSM1Sh2 returns [EObject current=null] : ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM1Sh(2)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) ;
    public final EObject rulenTwSSM1Sh2() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token lv_name_3_0=null;
        Token this_WS_4=null;
        Token this_SL_COMMENT_5=null;
        Token this_NEWLINE_6=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2993:28: ( ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM1Sh(2)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2994:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM1Sh(2)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2994:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM1Sh(2)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2994:2: (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM1Sh(2)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2994:2: (this_WS_0= RULE_WS )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_WS) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2994:3: this_WS_0= RULE_WS
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwSSM1Sh26179); 
                     
                        newLeafNode(this_WS_0, grammarAccess.getNTwSSM1Sh2Access().getWSTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2998:3: ( (lv_value_1_0= ruletNUMBER ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2999:1: (lv_value_1_0= ruletNUMBER )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:2999:1: (lv_value_1_0= ruletNUMBER )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3000:3: lv_value_1_0= ruletNUMBER
            {
             
            	        newCompositeNode(grammarAccess.getNTwSSM1Sh2Access().getValueTNUMBERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruletNUMBER_in_rulenTwSSM1Sh26201);
            lv_value_1_0=ruletNUMBER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNTwSSM1Sh2Rule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"tNUMBER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwSSM1Sh26212); 
             
                newLeafNode(this_WS_2, grammarAccess.getNTwSSM1Sh2Access().getWSTerminalRuleCall_2()); 
                
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3020:1: ( (lv_name_3_0= 'TwSSM1Sh(2)' ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3021:1: (lv_name_3_0= 'TwSSM1Sh(2)' )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3021:1: (lv_name_3_0= 'TwSSM1Sh(2)' )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3022:3: lv_name_3_0= 'TwSSM1Sh(2)'
            {
            lv_name_3_0=(Token)match(input,39,FOLLOW_39_in_rulenTwSSM1Sh26229); 

                    newLeafNode(lv_name_3_0, grammarAccess.getNTwSSM1Sh2Access().getNameTwSSM1Sh2Keyword_3_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNTwSSM1Sh2Rule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_3_0, "TwSSM1Sh(2)");
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3035:2: (this_WS_4= RULE_WS )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RULE_WS) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3035:3: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwSSM1Sh26254); 
                     
                        newLeafNode(this_WS_4, grammarAccess.getNTwSSM1Sh2Access().getWSTerminalRuleCall_4()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3039:3: (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_SL_COMMENT) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3039:4: this_SL_COMMENT_5= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_5=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rulenTwSSM1Sh26267); 
                     
                        newLeafNode(this_SL_COMMENT_5, grammarAccess.getNTwSSM1Sh2Access().getSL_COMMENTTerminalRuleCall_5()); 
                        

                    }
                    break;

            }

            this_NEWLINE_6=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rulenTwSSM1Sh26279); 
             
                newLeafNode(this_NEWLINE_6, grammarAccess.getNTwSSM1Sh2Access().getNEWLINETerminalRuleCall_6()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulenTwSSM1Sh2"


    // $ANTLR start "entryRulenTwSSM1Sh3"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3058:1: entryRulenTwSSM1Sh3 returns [EObject current=null] : iv_rulenTwSSM1Sh3= rulenTwSSM1Sh3 EOF ;
    public final EObject entryRulenTwSSM1Sh3() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenTwSSM1Sh3 = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3062:2: (iv_rulenTwSSM1Sh3= rulenTwSSM1Sh3 EOF )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3063:2: iv_rulenTwSSM1Sh3= rulenTwSSM1Sh3 EOF
            {
             newCompositeNode(grammarAccess.getNTwSSM1Sh3Rule()); 
            pushFollow(FOLLOW_rulenTwSSM1Sh3_in_entryRulenTwSSM1Sh36324);
            iv_rulenTwSSM1Sh3=rulenTwSSM1Sh3();

            state._fsp--;

             current =iv_rulenTwSSM1Sh3; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenTwSSM1Sh36334); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulenTwSSM1Sh3"


    // $ANTLR start "rulenTwSSM1Sh3"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3073:1: rulenTwSSM1Sh3 returns [EObject current=null] : ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM1Sh(3)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) ;
    public final EObject rulenTwSSM1Sh3() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token lv_name_3_0=null;
        Token this_WS_4=null;
        Token this_SL_COMMENT_5=null;
        Token this_NEWLINE_6=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3077:28: ( ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM1Sh(3)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3078:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM1Sh(3)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3078:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM1Sh(3)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3078:2: (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM1Sh(3)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3078:2: (this_WS_0= RULE_WS )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_WS) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3078:3: this_WS_0= RULE_WS
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwSSM1Sh36375); 
                     
                        newLeafNode(this_WS_0, grammarAccess.getNTwSSM1Sh3Access().getWSTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3082:3: ( (lv_value_1_0= ruletNUMBER ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3083:1: (lv_value_1_0= ruletNUMBER )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3083:1: (lv_value_1_0= ruletNUMBER )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3084:3: lv_value_1_0= ruletNUMBER
            {
             
            	        newCompositeNode(grammarAccess.getNTwSSM1Sh3Access().getValueTNUMBERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruletNUMBER_in_rulenTwSSM1Sh36397);
            lv_value_1_0=ruletNUMBER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNTwSSM1Sh3Rule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"tNUMBER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwSSM1Sh36408); 
             
                newLeafNode(this_WS_2, grammarAccess.getNTwSSM1Sh3Access().getWSTerminalRuleCall_2()); 
                
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3104:1: ( (lv_name_3_0= 'TwSSM1Sh(3)' ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3105:1: (lv_name_3_0= 'TwSSM1Sh(3)' )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3105:1: (lv_name_3_0= 'TwSSM1Sh(3)' )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3106:3: lv_name_3_0= 'TwSSM1Sh(3)'
            {
            lv_name_3_0=(Token)match(input,40,FOLLOW_40_in_rulenTwSSM1Sh36425); 

                    newLeafNode(lv_name_3_0, grammarAccess.getNTwSSM1Sh3Access().getNameTwSSM1Sh3Keyword_3_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNTwSSM1Sh3Rule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_3_0, "TwSSM1Sh(3)");
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3119:2: (this_WS_4= RULE_WS )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_WS) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3119:3: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwSSM1Sh36450); 
                     
                        newLeafNode(this_WS_4, grammarAccess.getNTwSSM1Sh3Access().getWSTerminalRuleCall_4()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3123:3: (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_SL_COMMENT) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3123:4: this_SL_COMMENT_5= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_5=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rulenTwSSM1Sh36463); 
                     
                        newLeafNode(this_SL_COMMENT_5, grammarAccess.getNTwSSM1Sh3Access().getSL_COMMENTTerminalRuleCall_5()); 
                        

                    }
                    break;

            }

            this_NEWLINE_6=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rulenTwSSM1Sh36475); 
             
                newLeafNode(this_NEWLINE_6, grammarAccess.getNTwSSM1Sh3Access().getNEWLINETerminalRuleCall_6()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulenTwSSM1Sh3"


    // $ANTLR start "entryRulenTwSSM1Sh4"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3142:1: entryRulenTwSSM1Sh4 returns [EObject current=null] : iv_rulenTwSSM1Sh4= rulenTwSSM1Sh4 EOF ;
    public final EObject entryRulenTwSSM1Sh4() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenTwSSM1Sh4 = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3146:2: (iv_rulenTwSSM1Sh4= rulenTwSSM1Sh4 EOF )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3147:2: iv_rulenTwSSM1Sh4= rulenTwSSM1Sh4 EOF
            {
             newCompositeNode(grammarAccess.getNTwSSM1Sh4Rule()); 
            pushFollow(FOLLOW_rulenTwSSM1Sh4_in_entryRulenTwSSM1Sh46520);
            iv_rulenTwSSM1Sh4=rulenTwSSM1Sh4();

            state._fsp--;

             current =iv_rulenTwSSM1Sh4; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenTwSSM1Sh46530); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulenTwSSM1Sh4"


    // $ANTLR start "rulenTwSSM1Sh4"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3157:1: rulenTwSSM1Sh4 returns [EObject current=null] : ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM1Sh(4)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) ;
    public final EObject rulenTwSSM1Sh4() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token lv_name_3_0=null;
        Token this_WS_4=null;
        Token this_SL_COMMENT_5=null;
        Token this_NEWLINE_6=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3161:28: ( ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM1Sh(4)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3162:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM1Sh(4)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3162:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM1Sh(4)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3162:2: (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM1Sh(4)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3162:2: (this_WS_0= RULE_WS )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_WS) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3162:3: this_WS_0= RULE_WS
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwSSM1Sh46571); 
                     
                        newLeafNode(this_WS_0, grammarAccess.getNTwSSM1Sh4Access().getWSTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3166:3: ( (lv_value_1_0= ruletNUMBER ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3167:1: (lv_value_1_0= ruletNUMBER )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3167:1: (lv_value_1_0= ruletNUMBER )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3168:3: lv_value_1_0= ruletNUMBER
            {
             
            	        newCompositeNode(grammarAccess.getNTwSSM1Sh4Access().getValueTNUMBERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruletNUMBER_in_rulenTwSSM1Sh46593);
            lv_value_1_0=ruletNUMBER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNTwSSM1Sh4Rule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"tNUMBER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwSSM1Sh46604); 
             
                newLeafNode(this_WS_2, grammarAccess.getNTwSSM1Sh4Access().getWSTerminalRuleCall_2()); 
                
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3188:1: ( (lv_name_3_0= 'TwSSM1Sh(4)' ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3189:1: (lv_name_3_0= 'TwSSM1Sh(4)' )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3189:1: (lv_name_3_0= 'TwSSM1Sh(4)' )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3190:3: lv_name_3_0= 'TwSSM1Sh(4)'
            {
            lv_name_3_0=(Token)match(input,41,FOLLOW_41_in_rulenTwSSM1Sh46621); 

                    newLeafNode(lv_name_3_0, grammarAccess.getNTwSSM1Sh4Access().getNameTwSSM1Sh4Keyword_3_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNTwSSM1Sh4Rule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_3_0, "TwSSM1Sh(4)");
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3203:2: (this_WS_4= RULE_WS )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_WS) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3203:3: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwSSM1Sh46646); 
                     
                        newLeafNode(this_WS_4, grammarAccess.getNTwSSM1Sh4Access().getWSTerminalRuleCall_4()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3207:3: (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_SL_COMMENT) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3207:4: this_SL_COMMENT_5= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_5=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rulenTwSSM1Sh46659); 
                     
                        newLeafNode(this_SL_COMMENT_5, grammarAccess.getNTwSSM1Sh4Access().getSL_COMMENTTerminalRuleCall_5()); 
                        

                    }
                    break;

            }

            this_NEWLINE_6=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rulenTwSSM1Sh46671); 
             
                newLeafNode(this_NEWLINE_6, grammarAccess.getNTwSSM1Sh4Access().getNEWLINETerminalRuleCall_6()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulenTwSSM1Sh4"


    // $ANTLR start "entryRulenTwSSM1Sh5"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3226:1: entryRulenTwSSM1Sh5 returns [EObject current=null] : iv_rulenTwSSM1Sh5= rulenTwSSM1Sh5 EOF ;
    public final EObject entryRulenTwSSM1Sh5() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenTwSSM1Sh5 = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3230:2: (iv_rulenTwSSM1Sh5= rulenTwSSM1Sh5 EOF )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3231:2: iv_rulenTwSSM1Sh5= rulenTwSSM1Sh5 EOF
            {
             newCompositeNode(grammarAccess.getNTwSSM1Sh5Rule()); 
            pushFollow(FOLLOW_rulenTwSSM1Sh5_in_entryRulenTwSSM1Sh56716);
            iv_rulenTwSSM1Sh5=rulenTwSSM1Sh5();

            state._fsp--;

             current =iv_rulenTwSSM1Sh5; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenTwSSM1Sh56726); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulenTwSSM1Sh5"


    // $ANTLR start "rulenTwSSM1Sh5"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3241:1: rulenTwSSM1Sh5 returns [EObject current=null] : ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM1Sh(5)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) ;
    public final EObject rulenTwSSM1Sh5() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token lv_name_3_0=null;
        Token this_WS_4=null;
        Token this_SL_COMMENT_5=null;
        Token this_NEWLINE_6=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3245:28: ( ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM1Sh(5)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3246:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM1Sh(5)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3246:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM1Sh(5)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3246:2: (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM1Sh(5)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3246:2: (this_WS_0= RULE_WS )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==RULE_WS) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3246:3: this_WS_0= RULE_WS
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwSSM1Sh56767); 
                     
                        newLeafNode(this_WS_0, grammarAccess.getNTwSSM1Sh5Access().getWSTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3250:3: ( (lv_value_1_0= ruletNUMBER ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3251:1: (lv_value_1_0= ruletNUMBER )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3251:1: (lv_value_1_0= ruletNUMBER )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3252:3: lv_value_1_0= ruletNUMBER
            {
             
            	        newCompositeNode(grammarAccess.getNTwSSM1Sh5Access().getValueTNUMBERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruletNUMBER_in_rulenTwSSM1Sh56789);
            lv_value_1_0=ruletNUMBER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNTwSSM1Sh5Rule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"tNUMBER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwSSM1Sh56800); 
             
                newLeafNode(this_WS_2, grammarAccess.getNTwSSM1Sh5Access().getWSTerminalRuleCall_2()); 
                
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3272:1: ( (lv_name_3_0= 'TwSSM1Sh(5)' ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3273:1: (lv_name_3_0= 'TwSSM1Sh(5)' )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3273:1: (lv_name_3_0= 'TwSSM1Sh(5)' )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3274:3: lv_name_3_0= 'TwSSM1Sh(5)'
            {
            lv_name_3_0=(Token)match(input,42,FOLLOW_42_in_rulenTwSSM1Sh56817); 

                    newLeafNode(lv_name_3_0, grammarAccess.getNTwSSM1Sh5Access().getNameTwSSM1Sh5Keyword_3_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNTwSSM1Sh5Rule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_3_0, "TwSSM1Sh(5)");
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3287:2: (this_WS_4= RULE_WS )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==RULE_WS) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3287:3: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwSSM1Sh56842); 
                     
                        newLeafNode(this_WS_4, grammarAccess.getNTwSSM1Sh5Access().getWSTerminalRuleCall_4()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3291:3: (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_SL_COMMENT) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3291:4: this_SL_COMMENT_5= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_5=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rulenTwSSM1Sh56855); 
                     
                        newLeafNode(this_SL_COMMENT_5, grammarAccess.getNTwSSM1Sh5Access().getSL_COMMENTTerminalRuleCall_5()); 
                        

                    }
                    break;

            }

            this_NEWLINE_6=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rulenTwSSM1Sh56867); 
             
                newLeafNode(this_NEWLINE_6, grammarAccess.getNTwSSM1Sh5Access().getNEWLINETerminalRuleCall_6()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulenTwSSM1Sh5"


    // $ANTLR start "entryRulenTwSSM1Sh6"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3310:1: entryRulenTwSSM1Sh6 returns [EObject current=null] : iv_rulenTwSSM1Sh6= rulenTwSSM1Sh6 EOF ;
    public final EObject entryRulenTwSSM1Sh6() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenTwSSM1Sh6 = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3314:2: (iv_rulenTwSSM1Sh6= rulenTwSSM1Sh6 EOF )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3315:2: iv_rulenTwSSM1Sh6= rulenTwSSM1Sh6 EOF
            {
             newCompositeNode(grammarAccess.getNTwSSM1Sh6Rule()); 
            pushFollow(FOLLOW_rulenTwSSM1Sh6_in_entryRulenTwSSM1Sh66912);
            iv_rulenTwSSM1Sh6=rulenTwSSM1Sh6();

            state._fsp--;

             current =iv_rulenTwSSM1Sh6; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenTwSSM1Sh66922); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulenTwSSM1Sh6"


    // $ANTLR start "rulenTwSSM1Sh6"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3325:1: rulenTwSSM1Sh6 returns [EObject current=null] : ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM1Sh(6)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) ;
    public final EObject rulenTwSSM1Sh6() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token lv_name_3_0=null;
        Token this_WS_4=null;
        Token this_SL_COMMENT_5=null;
        Token this_NEWLINE_6=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3329:28: ( ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM1Sh(6)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3330:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM1Sh(6)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3330:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM1Sh(6)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3330:2: (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM1Sh(6)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3330:2: (this_WS_0= RULE_WS )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==RULE_WS) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3330:3: this_WS_0= RULE_WS
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwSSM1Sh66963); 
                     
                        newLeafNode(this_WS_0, grammarAccess.getNTwSSM1Sh6Access().getWSTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3334:3: ( (lv_value_1_0= ruletNUMBER ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3335:1: (lv_value_1_0= ruletNUMBER )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3335:1: (lv_value_1_0= ruletNUMBER )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3336:3: lv_value_1_0= ruletNUMBER
            {
             
            	        newCompositeNode(grammarAccess.getNTwSSM1Sh6Access().getValueTNUMBERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruletNUMBER_in_rulenTwSSM1Sh66985);
            lv_value_1_0=ruletNUMBER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNTwSSM1Sh6Rule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"tNUMBER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwSSM1Sh66996); 
             
                newLeafNode(this_WS_2, grammarAccess.getNTwSSM1Sh6Access().getWSTerminalRuleCall_2()); 
                
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3356:1: ( (lv_name_3_0= 'TwSSM1Sh(6)' ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3357:1: (lv_name_3_0= 'TwSSM1Sh(6)' )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3357:1: (lv_name_3_0= 'TwSSM1Sh(6)' )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3358:3: lv_name_3_0= 'TwSSM1Sh(6)'
            {
            lv_name_3_0=(Token)match(input,43,FOLLOW_43_in_rulenTwSSM1Sh67013); 

                    newLeafNode(lv_name_3_0, grammarAccess.getNTwSSM1Sh6Access().getNameTwSSM1Sh6Keyword_3_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNTwSSM1Sh6Rule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_3_0, "TwSSM1Sh(6)");
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3371:2: (this_WS_4= RULE_WS )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==RULE_WS) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3371:3: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwSSM1Sh67038); 
                     
                        newLeafNode(this_WS_4, grammarAccess.getNTwSSM1Sh6Access().getWSTerminalRuleCall_4()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3375:3: (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==RULE_SL_COMMENT) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3375:4: this_SL_COMMENT_5= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_5=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rulenTwSSM1Sh67051); 
                     
                        newLeafNode(this_SL_COMMENT_5, grammarAccess.getNTwSSM1Sh6Access().getSL_COMMENTTerminalRuleCall_5()); 
                        

                    }
                    break;

            }

            this_NEWLINE_6=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rulenTwSSM1Sh67063); 
             
                newLeafNode(this_NEWLINE_6, grammarAccess.getNTwSSM1Sh6Access().getNEWLINETerminalRuleCall_6()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulenTwSSM1Sh6"


    // $ANTLR start "entryRulenTwSSM2Sh2"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3394:1: entryRulenTwSSM2Sh2 returns [EObject current=null] : iv_rulenTwSSM2Sh2= rulenTwSSM2Sh2 EOF ;
    public final EObject entryRulenTwSSM2Sh2() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenTwSSM2Sh2 = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3398:2: (iv_rulenTwSSM2Sh2= rulenTwSSM2Sh2 EOF )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3399:2: iv_rulenTwSSM2Sh2= rulenTwSSM2Sh2 EOF
            {
             newCompositeNode(grammarAccess.getNTwSSM2Sh2Rule()); 
            pushFollow(FOLLOW_rulenTwSSM2Sh2_in_entryRulenTwSSM2Sh27108);
            iv_rulenTwSSM2Sh2=rulenTwSSM2Sh2();

            state._fsp--;

             current =iv_rulenTwSSM2Sh2; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenTwSSM2Sh27118); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulenTwSSM2Sh2"


    // $ANTLR start "rulenTwSSM2Sh2"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3409:1: rulenTwSSM2Sh2 returns [EObject current=null] : ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM2Sh(2)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) ;
    public final EObject rulenTwSSM2Sh2() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token lv_name_3_0=null;
        Token this_WS_4=null;
        Token this_SL_COMMENT_5=null;
        Token this_NEWLINE_6=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3413:28: ( ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM2Sh(2)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3414:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM2Sh(2)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3414:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM2Sh(2)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3414:2: (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM2Sh(2)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3414:2: (this_WS_0= RULE_WS )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==RULE_WS) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3414:3: this_WS_0= RULE_WS
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwSSM2Sh27159); 
                     
                        newLeafNode(this_WS_0, grammarAccess.getNTwSSM2Sh2Access().getWSTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3418:3: ( (lv_value_1_0= ruletNUMBER ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3419:1: (lv_value_1_0= ruletNUMBER )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3419:1: (lv_value_1_0= ruletNUMBER )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3420:3: lv_value_1_0= ruletNUMBER
            {
             
            	        newCompositeNode(grammarAccess.getNTwSSM2Sh2Access().getValueTNUMBERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruletNUMBER_in_rulenTwSSM2Sh27181);
            lv_value_1_0=ruletNUMBER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNTwSSM2Sh2Rule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"tNUMBER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwSSM2Sh27192); 
             
                newLeafNode(this_WS_2, grammarAccess.getNTwSSM2Sh2Access().getWSTerminalRuleCall_2()); 
                
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3440:1: ( (lv_name_3_0= 'TwSSM2Sh(2)' ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3441:1: (lv_name_3_0= 'TwSSM2Sh(2)' )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3441:1: (lv_name_3_0= 'TwSSM2Sh(2)' )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3442:3: lv_name_3_0= 'TwSSM2Sh(2)'
            {
            lv_name_3_0=(Token)match(input,44,FOLLOW_44_in_rulenTwSSM2Sh27209); 

                    newLeafNode(lv_name_3_0, grammarAccess.getNTwSSM2Sh2Access().getNameTwSSM2Sh2Keyword_3_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNTwSSM2Sh2Rule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_3_0, "TwSSM2Sh(2)");
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3455:2: (this_WS_4= RULE_WS )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==RULE_WS) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3455:3: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwSSM2Sh27234); 
                     
                        newLeafNode(this_WS_4, grammarAccess.getNTwSSM2Sh2Access().getWSTerminalRuleCall_4()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3459:3: (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==RULE_SL_COMMENT) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3459:4: this_SL_COMMENT_5= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_5=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rulenTwSSM2Sh27247); 
                     
                        newLeafNode(this_SL_COMMENT_5, grammarAccess.getNTwSSM2Sh2Access().getSL_COMMENTTerminalRuleCall_5()); 
                        

                    }
                    break;

            }

            this_NEWLINE_6=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rulenTwSSM2Sh27259); 
             
                newLeafNode(this_NEWLINE_6, grammarAccess.getNTwSSM2Sh2Access().getNEWLINETerminalRuleCall_6()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulenTwSSM2Sh2"


    // $ANTLR start "entryRulenTwSSM2Sh3"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3478:1: entryRulenTwSSM2Sh3 returns [EObject current=null] : iv_rulenTwSSM2Sh3= rulenTwSSM2Sh3 EOF ;
    public final EObject entryRulenTwSSM2Sh3() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenTwSSM2Sh3 = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3482:2: (iv_rulenTwSSM2Sh3= rulenTwSSM2Sh3 EOF )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3483:2: iv_rulenTwSSM2Sh3= rulenTwSSM2Sh3 EOF
            {
             newCompositeNode(grammarAccess.getNTwSSM2Sh3Rule()); 
            pushFollow(FOLLOW_rulenTwSSM2Sh3_in_entryRulenTwSSM2Sh37304);
            iv_rulenTwSSM2Sh3=rulenTwSSM2Sh3();

            state._fsp--;

             current =iv_rulenTwSSM2Sh3; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenTwSSM2Sh37314); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulenTwSSM2Sh3"


    // $ANTLR start "rulenTwSSM2Sh3"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3493:1: rulenTwSSM2Sh3 returns [EObject current=null] : ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM2Sh(3)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) ;
    public final EObject rulenTwSSM2Sh3() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token lv_name_3_0=null;
        Token this_WS_4=null;
        Token this_SL_COMMENT_5=null;
        Token this_NEWLINE_6=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3497:28: ( ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM2Sh(3)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3498:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM2Sh(3)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3498:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM2Sh(3)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3498:2: (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM2Sh(3)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3498:2: (this_WS_0= RULE_WS )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==RULE_WS) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3498:3: this_WS_0= RULE_WS
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwSSM2Sh37355); 
                     
                        newLeafNode(this_WS_0, grammarAccess.getNTwSSM2Sh3Access().getWSTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3502:3: ( (lv_value_1_0= ruletNUMBER ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3503:1: (lv_value_1_0= ruletNUMBER )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3503:1: (lv_value_1_0= ruletNUMBER )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3504:3: lv_value_1_0= ruletNUMBER
            {
             
            	        newCompositeNode(grammarAccess.getNTwSSM2Sh3Access().getValueTNUMBERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruletNUMBER_in_rulenTwSSM2Sh37377);
            lv_value_1_0=ruletNUMBER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNTwSSM2Sh3Rule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"tNUMBER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwSSM2Sh37388); 
             
                newLeafNode(this_WS_2, grammarAccess.getNTwSSM2Sh3Access().getWSTerminalRuleCall_2()); 
                
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3524:1: ( (lv_name_3_0= 'TwSSM2Sh(3)' ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3525:1: (lv_name_3_0= 'TwSSM2Sh(3)' )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3525:1: (lv_name_3_0= 'TwSSM2Sh(3)' )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3526:3: lv_name_3_0= 'TwSSM2Sh(3)'
            {
            lv_name_3_0=(Token)match(input,45,FOLLOW_45_in_rulenTwSSM2Sh37405); 

                    newLeafNode(lv_name_3_0, grammarAccess.getNTwSSM2Sh3Access().getNameTwSSM2Sh3Keyword_3_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNTwSSM2Sh3Rule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_3_0, "TwSSM2Sh(3)");
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3539:2: (this_WS_4= RULE_WS )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==RULE_WS) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3539:3: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwSSM2Sh37430); 
                     
                        newLeafNode(this_WS_4, grammarAccess.getNTwSSM2Sh3Access().getWSTerminalRuleCall_4()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3543:3: (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==RULE_SL_COMMENT) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3543:4: this_SL_COMMENT_5= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_5=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rulenTwSSM2Sh37443); 
                     
                        newLeafNode(this_SL_COMMENT_5, grammarAccess.getNTwSSM2Sh3Access().getSL_COMMENTTerminalRuleCall_5()); 
                        

                    }
                    break;

            }

            this_NEWLINE_6=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rulenTwSSM2Sh37455); 
             
                newLeafNode(this_NEWLINE_6, grammarAccess.getNTwSSM2Sh3Access().getNEWLINETerminalRuleCall_6()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulenTwSSM2Sh3"


    // $ANTLR start "entryRulenTwSSM2Sh4"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3562:1: entryRulenTwSSM2Sh4 returns [EObject current=null] : iv_rulenTwSSM2Sh4= rulenTwSSM2Sh4 EOF ;
    public final EObject entryRulenTwSSM2Sh4() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenTwSSM2Sh4 = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3566:2: (iv_rulenTwSSM2Sh4= rulenTwSSM2Sh4 EOF )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3567:2: iv_rulenTwSSM2Sh4= rulenTwSSM2Sh4 EOF
            {
             newCompositeNode(grammarAccess.getNTwSSM2Sh4Rule()); 
            pushFollow(FOLLOW_rulenTwSSM2Sh4_in_entryRulenTwSSM2Sh47500);
            iv_rulenTwSSM2Sh4=rulenTwSSM2Sh4();

            state._fsp--;

             current =iv_rulenTwSSM2Sh4; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenTwSSM2Sh47510); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulenTwSSM2Sh4"


    // $ANTLR start "rulenTwSSM2Sh4"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3577:1: rulenTwSSM2Sh4 returns [EObject current=null] : ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM2Sh(4)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) ;
    public final EObject rulenTwSSM2Sh4() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token lv_name_3_0=null;
        Token this_WS_4=null;
        Token this_SL_COMMENT_5=null;
        Token this_NEWLINE_6=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3581:28: ( ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM2Sh(4)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3582:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM2Sh(4)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3582:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM2Sh(4)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3582:2: (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM2Sh(4)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3582:2: (this_WS_0= RULE_WS )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==RULE_WS) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3582:3: this_WS_0= RULE_WS
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwSSM2Sh47551); 
                     
                        newLeafNode(this_WS_0, grammarAccess.getNTwSSM2Sh4Access().getWSTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3586:3: ( (lv_value_1_0= ruletNUMBER ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3587:1: (lv_value_1_0= ruletNUMBER )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3587:1: (lv_value_1_0= ruletNUMBER )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3588:3: lv_value_1_0= ruletNUMBER
            {
             
            	        newCompositeNode(grammarAccess.getNTwSSM2Sh4Access().getValueTNUMBERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruletNUMBER_in_rulenTwSSM2Sh47573);
            lv_value_1_0=ruletNUMBER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNTwSSM2Sh4Rule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"tNUMBER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwSSM2Sh47584); 
             
                newLeafNode(this_WS_2, grammarAccess.getNTwSSM2Sh4Access().getWSTerminalRuleCall_2()); 
                
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3608:1: ( (lv_name_3_0= 'TwSSM2Sh(4)' ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3609:1: (lv_name_3_0= 'TwSSM2Sh(4)' )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3609:1: (lv_name_3_0= 'TwSSM2Sh(4)' )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3610:3: lv_name_3_0= 'TwSSM2Sh(4)'
            {
            lv_name_3_0=(Token)match(input,46,FOLLOW_46_in_rulenTwSSM2Sh47601); 

                    newLeafNode(lv_name_3_0, grammarAccess.getNTwSSM2Sh4Access().getNameTwSSM2Sh4Keyword_3_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNTwSSM2Sh4Rule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_3_0, "TwSSM2Sh(4)");
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3623:2: (this_WS_4= RULE_WS )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==RULE_WS) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3623:3: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwSSM2Sh47626); 
                     
                        newLeafNode(this_WS_4, grammarAccess.getNTwSSM2Sh4Access().getWSTerminalRuleCall_4()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3627:3: (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==RULE_SL_COMMENT) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3627:4: this_SL_COMMENT_5= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_5=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rulenTwSSM2Sh47639); 
                     
                        newLeafNode(this_SL_COMMENT_5, grammarAccess.getNTwSSM2Sh4Access().getSL_COMMENTTerminalRuleCall_5()); 
                        

                    }
                    break;

            }

            this_NEWLINE_6=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rulenTwSSM2Sh47651); 
             
                newLeafNode(this_NEWLINE_6, grammarAccess.getNTwSSM2Sh4Access().getNEWLINETerminalRuleCall_6()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulenTwSSM2Sh4"


    // $ANTLR start "entryRulenTwSSM2Sh5"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3646:1: entryRulenTwSSM2Sh5 returns [EObject current=null] : iv_rulenTwSSM2Sh5= rulenTwSSM2Sh5 EOF ;
    public final EObject entryRulenTwSSM2Sh5() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenTwSSM2Sh5 = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3650:2: (iv_rulenTwSSM2Sh5= rulenTwSSM2Sh5 EOF )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3651:2: iv_rulenTwSSM2Sh5= rulenTwSSM2Sh5 EOF
            {
             newCompositeNode(grammarAccess.getNTwSSM2Sh5Rule()); 
            pushFollow(FOLLOW_rulenTwSSM2Sh5_in_entryRulenTwSSM2Sh57696);
            iv_rulenTwSSM2Sh5=rulenTwSSM2Sh5();

            state._fsp--;

             current =iv_rulenTwSSM2Sh5; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenTwSSM2Sh57706); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulenTwSSM2Sh5"


    // $ANTLR start "rulenTwSSM2Sh5"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3661:1: rulenTwSSM2Sh5 returns [EObject current=null] : ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM2Sh(5)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) ;
    public final EObject rulenTwSSM2Sh5() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token lv_name_3_0=null;
        Token this_WS_4=null;
        Token this_SL_COMMENT_5=null;
        Token this_NEWLINE_6=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3665:28: ( ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM2Sh(5)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3666:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM2Sh(5)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3666:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM2Sh(5)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3666:2: (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM2Sh(5)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3666:2: (this_WS_0= RULE_WS )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==RULE_WS) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3666:3: this_WS_0= RULE_WS
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwSSM2Sh57747); 
                     
                        newLeafNode(this_WS_0, grammarAccess.getNTwSSM2Sh5Access().getWSTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3670:3: ( (lv_value_1_0= ruletNUMBER ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3671:1: (lv_value_1_0= ruletNUMBER )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3671:1: (lv_value_1_0= ruletNUMBER )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3672:3: lv_value_1_0= ruletNUMBER
            {
             
            	        newCompositeNode(grammarAccess.getNTwSSM2Sh5Access().getValueTNUMBERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruletNUMBER_in_rulenTwSSM2Sh57769);
            lv_value_1_0=ruletNUMBER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNTwSSM2Sh5Rule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"tNUMBER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwSSM2Sh57780); 
             
                newLeafNode(this_WS_2, grammarAccess.getNTwSSM2Sh5Access().getWSTerminalRuleCall_2()); 
                
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3692:1: ( (lv_name_3_0= 'TwSSM2Sh(5)' ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3693:1: (lv_name_3_0= 'TwSSM2Sh(5)' )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3693:1: (lv_name_3_0= 'TwSSM2Sh(5)' )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3694:3: lv_name_3_0= 'TwSSM2Sh(5)'
            {
            lv_name_3_0=(Token)match(input,47,FOLLOW_47_in_rulenTwSSM2Sh57797); 

                    newLeafNode(lv_name_3_0, grammarAccess.getNTwSSM2Sh5Access().getNameTwSSM2Sh5Keyword_3_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNTwSSM2Sh5Rule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_3_0, "TwSSM2Sh(5)");
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3707:2: (this_WS_4= RULE_WS )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==RULE_WS) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3707:3: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwSSM2Sh57822); 
                     
                        newLeafNode(this_WS_4, grammarAccess.getNTwSSM2Sh5Access().getWSTerminalRuleCall_4()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3711:3: (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==RULE_SL_COMMENT) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3711:4: this_SL_COMMENT_5= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_5=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rulenTwSSM2Sh57835); 
                     
                        newLeafNode(this_SL_COMMENT_5, grammarAccess.getNTwSSM2Sh5Access().getSL_COMMENTTerminalRuleCall_5()); 
                        

                    }
                    break;

            }

            this_NEWLINE_6=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rulenTwSSM2Sh57847); 
             
                newLeafNode(this_NEWLINE_6, grammarAccess.getNTwSSM2Sh5Access().getNEWLINETerminalRuleCall_6()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulenTwSSM2Sh5"


    // $ANTLR start "entryRulenTwSSM2Sh6"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3730:1: entryRulenTwSSM2Sh6 returns [EObject current=null] : iv_rulenTwSSM2Sh6= rulenTwSSM2Sh6 EOF ;
    public final EObject entryRulenTwSSM2Sh6() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenTwSSM2Sh6 = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3734:2: (iv_rulenTwSSM2Sh6= rulenTwSSM2Sh6 EOF )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3735:2: iv_rulenTwSSM2Sh6= rulenTwSSM2Sh6 EOF
            {
             newCompositeNode(grammarAccess.getNTwSSM2Sh6Rule()); 
            pushFollow(FOLLOW_rulenTwSSM2Sh6_in_entryRulenTwSSM2Sh67892);
            iv_rulenTwSSM2Sh6=rulenTwSSM2Sh6();

            state._fsp--;

             current =iv_rulenTwSSM2Sh6; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenTwSSM2Sh67902); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulenTwSSM2Sh6"


    // $ANTLR start "rulenTwSSM2Sh6"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3745:1: rulenTwSSM2Sh6 returns [EObject current=null] : ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM2Sh(6)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) ;
    public final EObject rulenTwSSM2Sh6() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token lv_name_3_0=null;
        Token this_WS_4=null;
        Token this_SL_COMMENT_5=null;
        Token this_NEWLINE_6=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3749:28: ( ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM2Sh(6)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3750:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM2Sh(6)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3750:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM2Sh(6)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3750:2: (this_WS_0= RULE_WS )? ( (lv_value_1_0= ruletNUMBER ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'TwSSM2Sh(6)' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3750:2: (this_WS_0= RULE_WS )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==RULE_WS) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3750:3: this_WS_0= RULE_WS
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwSSM2Sh67943); 
                     
                        newLeafNode(this_WS_0, grammarAccess.getNTwSSM2Sh6Access().getWSTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3754:3: ( (lv_value_1_0= ruletNUMBER ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3755:1: (lv_value_1_0= ruletNUMBER )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3755:1: (lv_value_1_0= ruletNUMBER )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3756:3: lv_value_1_0= ruletNUMBER
            {
             
            	        newCompositeNode(grammarAccess.getNTwSSM2Sh6Access().getValueTNUMBERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruletNUMBER_in_rulenTwSSM2Sh67965);
            lv_value_1_0=ruletNUMBER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNTwSSM2Sh6Rule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"tNUMBER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwSSM2Sh67976); 
             
                newLeafNode(this_WS_2, grammarAccess.getNTwSSM2Sh6Access().getWSTerminalRuleCall_2()); 
                
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3776:1: ( (lv_name_3_0= 'TwSSM2Sh(6)' ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3777:1: (lv_name_3_0= 'TwSSM2Sh(6)' )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3777:1: (lv_name_3_0= 'TwSSM2Sh(6)' )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3778:3: lv_name_3_0= 'TwSSM2Sh(6)'
            {
            lv_name_3_0=(Token)match(input,48,FOLLOW_48_in_rulenTwSSM2Sh67993); 

                    newLeafNode(lv_name_3_0, grammarAccess.getNTwSSM2Sh6Access().getNameTwSSM2Sh6Keyword_3_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNTwSSM2Sh6Rule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_3_0, "TwSSM2Sh(6)");
            	    

            }


            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3791:2: (this_WS_4= RULE_WS )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==RULE_WS) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3791:3: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulenTwSSM2Sh68018); 
                     
                        newLeafNode(this_WS_4, grammarAccess.getNTwSSM2Sh6Access().getWSTerminalRuleCall_4()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3795:3: (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==RULE_SL_COMMENT) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3795:4: this_SL_COMMENT_5= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_5=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rulenTwSSM2Sh68031); 
                     
                        newLeafNode(this_SL_COMMENT_5, grammarAccess.getNTwSSM2Sh6Access().getSL_COMMENTTerminalRuleCall_5()); 
                        

                    }
                    break;

            }

            this_NEWLINE_6=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rulenTwSSM2Sh68043); 
             
                newLeafNode(this_NEWLINE_6, grammarAccess.getNTwSSM2Sh6Access().getNEWLINETerminalRuleCall_6()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulenTwSSM2Sh6"


    // $ANTLR start "entryRuleaTwrStat"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3814:1: entryRuleaTwrStat returns [EObject current=null] : iv_ruleaTwrStat= ruleaTwrStat EOF ;
    public final EObject entryRuleaTwrStat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleaTwrStat = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3818:2: (iv_ruleaTwrStat= ruleaTwrStat EOF )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3819:2: iv_ruleaTwrStat= ruleaTwrStat EOF
            {
             newCompositeNode(grammarAccess.getATwrStatRule()); 
            pushFollow(FOLLOW_ruleaTwrStat_in_entryRuleaTwrStat8088);
            iv_ruleaTwrStat=ruleaTwrStat();

            state._fsp--;

             current =iv_ruleaTwrStat; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleaTwrStat8098); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleaTwrStat"


    // $ANTLR start "ruleaTwrStat"
    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3829:1: ruleaTwrStat returns [EObject current=null] : ( (this_WS_0= RULE_WS )? otherlv_1= 'HtFract' this_WS_2= RULE_WS otherlv_3= 'TMassDen' this_WS_4= RULE_WS otherlv_5= 'TwFAStif' this_WS_6= RULE_WS otherlv_7= 'TwSSStif' this_WS_8= RULE_WS otherlv_9= 'TwGJStif' this_WS_10= RULE_WS otherlv_11= 'TwEAStif' this_WS_12= RULE_WS otherlv_13= 'TwFAIner' this_WS_14= RULE_WS otherlv_15= 'TwSSIner' this_WS_16= RULE_WS otherlv_17= 'TwFAcgOf' this_WS_18= RULE_WS otherlv_19= 'TwSScgOf' (this_WS_20= RULE_WS )? (this_SL_COMMENT_21= RULE_SL_COMMENT )? this_NEWLINE_22= RULE_NEWLINE (this_WS_23= RULE_WS )? otherlv_24= '(-)' this_WS_25= RULE_WS otherlv_26= '(kg/m)' this_WS_27= RULE_WS otherlv_28= '(Nm^2)' this_WS_29= RULE_WS otherlv_30= '(Nm^2)' this_WS_31= RULE_WS otherlv_32= '(Nm^2)' this_WS_33= RULE_WS otherlv_34= '(N)' this_WS_35= RULE_WS otherlv_36= '(kg m)' this_WS_37= RULE_WS otherlv_38= '(kg m)' this_WS_39= RULE_WS otherlv_40= '(m)' this_WS_41= RULE_WS otherlv_42= '(m)' (this_WS_43= RULE_WS )? (this_SL_COMMENT_44= RULE_SL_COMMENT )? this_NEWLINE_45= RULE_NEWLINE ( (this_WS_46= RULE_WS )? ( (lv_HtFract_47_0= ruletNUMBER ) ) this_WS_48= RULE_WS ( (lv_TMassDen_49_0= ruletNUMBER ) ) this_WS_50= RULE_WS ( (lv_TwFAStif_51_0= ruletNUMBER ) ) this_WS_52= RULE_WS ( (lv_TwSSStif_53_0= ruletNUMBER ) ) this_WS_54= RULE_WS ( (lv_TwGJStif_55_0= ruletNUMBER ) ) this_WS_56= RULE_WS ( (lv_TwEAStif_57_0= ruletNUMBER ) ) this_WS_58= RULE_WS ( (lv_TwFAIner_59_0= ruletNUMBER ) ) this_WS_60= RULE_WS ( (lv_TwSSIner_61_0= ruletNUMBER ) ) this_WS_62= RULE_WS ( (lv_TwFAcgOf_63_0= ruletNUMBER ) ) this_WS_64= RULE_WS ( (lv_TwSScgOf_65_0= ruletNUMBER ) ) (this_WS_66= RULE_WS )? (this_SL_COMMENT_67= RULE_SL_COMMENT )? this_NEWLINE_68= RULE_NEWLINE )+ ) ;
    public final EObject ruleaTwrStat() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token otherlv_1=null;
        Token this_WS_2=null;
        Token otherlv_3=null;
        Token this_WS_4=null;
        Token otherlv_5=null;
        Token this_WS_6=null;
        Token otherlv_7=null;
        Token this_WS_8=null;
        Token otherlv_9=null;
        Token this_WS_10=null;
        Token otherlv_11=null;
        Token this_WS_12=null;
        Token otherlv_13=null;
        Token this_WS_14=null;
        Token otherlv_15=null;
        Token this_WS_16=null;
        Token otherlv_17=null;
        Token this_WS_18=null;
        Token otherlv_19=null;
        Token this_WS_20=null;
        Token this_SL_COMMENT_21=null;
        Token this_NEWLINE_22=null;
        Token this_WS_23=null;
        Token otherlv_24=null;
        Token this_WS_25=null;
        Token otherlv_26=null;
        Token this_WS_27=null;
        Token otherlv_28=null;
        Token this_WS_29=null;
        Token otherlv_30=null;
        Token this_WS_31=null;
        Token otherlv_32=null;
        Token this_WS_33=null;
        Token otherlv_34=null;
        Token this_WS_35=null;
        Token otherlv_36=null;
        Token this_WS_37=null;
        Token otherlv_38=null;
        Token this_WS_39=null;
        Token otherlv_40=null;
        Token this_WS_41=null;
        Token otherlv_42=null;
        Token this_WS_43=null;
        Token this_SL_COMMENT_44=null;
        Token this_NEWLINE_45=null;
        Token this_WS_46=null;
        Token this_WS_48=null;
        Token this_WS_50=null;
        Token this_WS_52=null;
        Token this_WS_54=null;
        Token this_WS_56=null;
        Token this_WS_58=null;
        Token this_WS_60=null;
        Token this_WS_62=null;
        Token this_WS_64=null;
        Token this_WS_66=null;
        Token this_SL_COMMENT_67=null;
        Token this_NEWLINE_68=null;
        AntlrDatatypeRuleToken lv_HtFract_47_0 = null;

        AntlrDatatypeRuleToken lv_TMassDen_49_0 = null;

        AntlrDatatypeRuleToken lv_TwFAStif_51_0 = null;

        AntlrDatatypeRuleToken lv_TwSSStif_53_0 = null;

        AntlrDatatypeRuleToken lv_TwGJStif_55_0 = null;

        AntlrDatatypeRuleToken lv_TwEAStif_57_0 = null;

        AntlrDatatypeRuleToken lv_TwFAIner_59_0 = null;

        AntlrDatatypeRuleToken lv_TwSSIner_61_0 = null;

        AntlrDatatypeRuleToken lv_TwFAcgOf_63_0 = null;

        AntlrDatatypeRuleToken lv_TwSScgOf_65_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3833:28: ( ( (this_WS_0= RULE_WS )? otherlv_1= 'HtFract' this_WS_2= RULE_WS otherlv_3= 'TMassDen' this_WS_4= RULE_WS otherlv_5= 'TwFAStif' this_WS_6= RULE_WS otherlv_7= 'TwSSStif' this_WS_8= RULE_WS otherlv_9= 'TwGJStif' this_WS_10= RULE_WS otherlv_11= 'TwEAStif' this_WS_12= RULE_WS otherlv_13= 'TwFAIner' this_WS_14= RULE_WS otherlv_15= 'TwSSIner' this_WS_16= RULE_WS otherlv_17= 'TwFAcgOf' this_WS_18= RULE_WS otherlv_19= 'TwSScgOf' (this_WS_20= RULE_WS )? (this_SL_COMMENT_21= RULE_SL_COMMENT )? this_NEWLINE_22= RULE_NEWLINE (this_WS_23= RULE_WS )? otherlv_24= '(-)' this_WS_25= RULE_WS otherlv_26= '(kg/m)' this_WS_27= RULE_WS otherlv_28= '(Nm^2)' this_WS_29= RULE_WS otherlv_30= '(Nm^2)' this_WS_31= RULE_WS otherlv_32= '(Nm^2)' this_WS_33= RULE_WS otherlv_34= '(N)' this_WS_35= RULE_WS otherlv_36= '(kg m)' this_WS_37= RULE_WS otherlv_38= '(kg m)' this_WS_39= RULE_WS otherlv_40= '(m)' this_WS_41= RULE_WS otherlv_42= '(m)' (this_WS_43= RULE_WS )? (this_SL_COMMENT_44= RULE_SL_COMMENT )? this_NEWLINE_45= RULE_NEWLINE ( (this_WS_46= RULE_WS )? ( (lv_HtFract_47_0= ruletNUMBER ) ) this_WS_48= RULE_WS ( (lv_TMassDen_49_0= ruletNUMBER ) ) this_WS_50= RULE_WS ( (lv_TwFAStif_51_0= ruletNUMBER ) ) this_WS_52= RULE_WS ( (lv_TwSSStif_53_0= ruletNUMBER ) ) this_WS_54= RULE_WS ( (lv_TwGJStif_55_0= ruletNUMBER ) ) this_WS_56= RULE_WS ( (lv_TwEAStif_57_0= ruletNUMBER ) ) this_WS_58= RULE_WS ( (lv_TwFAIner_59_0= ruletNUMBER ) ) this_WS_60= RULE_WS ( (lv_TwSSIner_61_0= ruletNUMBER ) ) this_WS_62= RULE_WS ( (lv_TwFAcgOf_63_0= ruletNUMBER ) ) this_WS_64= RULE_WS ( (lv_TwSScgOf_65_0= ruletNUMBER ) ) (this_WS_66= RULE_WS )? (this_SL_COMMENT_67= RULE_SL_COMMENT )? this_NEWLINE_68= RULE_NEWLINE )+ ) )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3834:1: ( (this_WS_0= RULE_WS )? otherlv_1= 'HtFract' this_WS_2= RULE_WS otherlv_3= 'TMassDen' this_WS_4= RULE_WS otherlv_5= 'TwFAStif' this_WS_6= RULE_WS otherlv_7= 'TwSSStif' this_WS_8= RULE_WS otherlv_9= 'TwGJStif' this_WS_10= RULE_WS otherlv_11= 'TwEAStif' this_WS_12= RULE_WS otherlv_13= 'TwFAIner' this_WS_14= RULE_WS otherlv_15= 'TwSSIner' this_WS_16= RULE_WS otherlv_17= 'TwFAcgOf' this_WS_18= RULE_WS otherlv_19= 'TwSScgOf' (this_WS_20= RULE_WS )? (this_SL_COMMENT_21= RULE_SL_COMMENT )? this_NEWLINE_22= RULE_NEWLINE (this_WS_23= RULE_WS )? otherlv_24= '(-)' this_WS_25= RULE_WS otherlv_26= '(kg/m)' this_WS_27= RULE_WS otherlv_28= '(Nm^2)' this_WS_29= RULE_WS otherlv_30= '(Nm^2)' this_WS_31= RULE_WS otherlv_32= '(Nm^2)' this_WS_33= RULE_WS otherlv_34= '(N)' this_WS_35= RULE_WS otherlv_36= '(kg m)' this_WS_37= RULE_WS otherlv_38= '(kg m)' this_WS_39= RULE_WS otherlv_40= '(m)' this_WS_41= RULE_WS otherlv_42= '(m)' (this_WS_43= RULE_WS )? (this_SL_COMMENT_44= RULE_SL_COMMENT )? this_NEWLINE_45= RULE_NEWLINE ( (this_WS_46= RULE_WS )? ( (lv_HtFract_47_0= ruletNUMBER ) ) this_WS_48= RULE_WS ( (lv_TMassDen_49_0= ruletNUMBER ) ) this_WS_50= RULE_WS ( (lv_TwFAStif_51_0= ruletNUMBER ) ) this_WS_52= RULE_WS ( (lv_TwSSStif_53_0= ruletNUMBER ) ) this_WS_54= RULE_WS ( (lv_TwGJStif_55_0= ruletNUMBER ) ) this_WS_56= RULE_WS ( (lv_TwEAStif_57_0= ruletNUMBER ) ) this_WS_58= RULE_WS ( (lv_TwFAIner_59_0= ruletNUMBER ) ) this_WS_60= RULE_WS ( (lv_TwSSIner_61_0= ruletNUMBER ) ) this_WS_62= RULE_WS ( (lv_TwFAcgOf_63_0= ruletNUMBER ) ) this_WS_64= RULE_WS ( (lv_TwSScgOf_65_0= ruletNUMBER ) ) (this_WS_66= RULE_WS )? (this_SL_COMMENT_67= RULE_SL_COMMENT )? this_NEWLINE_68= RULE_NEWLINE )+ )
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3834:1: ( (this_WS_0= RULE_WS )? otherlv_1= 'HtFract' this_WS_2= RULE_WS otherlv_3= 'TMassDen' this_WS_4= RULE_WS otherlv_5= 'TwFAStif' this_WS_6= RULE_WS otherlv_7= 'TwSSStif' this_WS_8= RULE_WS otherlv_9= 'TwGJStif' this_WS_10= RULE_WS otherlv_11= 'TwEAStif' this_WS_12= RULE_WS otherlv_13= 'TwFAIner' this_WS_14= RULE_WS otherlv_15= 'TwSSIner' this_WS_16= RULE_WS otherlv_17= 'TwFAcgOf' this_WS_18= RULE_WS otherlv_19= 'TwSScgOf' (this_WS_20= RULE_WS )? (this_SL_COMMENT_21= RULE_SL_COMMENT )? this_NEWLINE_22= RULE_NEWLINE (this_WS_23= RULE_WS )? otherlv_24= '(-)' this_WS_25= RULE_WS otherlv_26= '(kg/m)' this_WS_27= RULE_WS otherlv_28= '(Nm^2)' this_WS_29= RULE_WS otherlv_30= '(Nm^2)' this_WS_31= RULE_WS otherlv_32= '(Nm^2)' this_WS_33= RULE_WS otherlv_34= '(N)' this_WS_35= RULE_WS otherlv_36= '(kg m)' this_WS_37= RULE_WS otherlv_38= '(kg m)' this_WS_39= RULE_WS otherlv_40= '(m)' this_WS_41= RULE_WS otherlv_42= '(m)' (this_WS_43= RULE_WS )? (this_SL_COMMENT_44= RULE_SL_COMMENT )? this_NEWLINE_45= RULE_NEWLINE ( (this_WS_46= RULE_WS )? ( (lv_HtFract_47_0= ruletNUMBER ) ) this_WS_48= RULE_WS ( (lv_TMassDen_49_0= ruletNUMBER ) ) this_WS_50= RULE_WS ( (lv_TwFAStif_51_0= ruletNUMBER ) ) this_WS_52= RULE_WS ( (lv_TwSSStif_53_0= ruletNUMBER ) ) this_WS_54= RULE_WS ( (lv_TwGJStif_55_0= ruletNUMBER ) ) this_WS_56= RULE_WS ( (lv_TwEAStif_57_0= ruletNUMBER ) ) this_WS_58= RULE_WS ( (lv_TwFAIner_59_0= ruletNUMBER ) ) this_WS_60= RULE_WS ( (lv_TwSSIner_61_0= ruletNUMBER ) ) this_WS_62= RULE_WS ( (lv_TwFAcgOf_63_0= ruletNUMBER ) ) this_WS_64= RULE_WS ( (lv_TwSScgOf_65_0= ruletNUMBER ) ) (this_WS_66= RULE_WS )? (this_SL_COMMENT_67= RULE_SL_COMMENT )? this_NEWLINE_68= RULE_NEWLINE )+ )
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3834:2: (this_WS_0= RULE_WS )? otherlv_1= 'HtFract' this_WS_2= RULE_WS otherlv_3= 'TMassDen' this_WS_4= RULE_WS otherlv_5= 'TwFAStif' this_WS_6= RULE_WS otherlv_7= 'TwSSStif' this_WS_8= RULE_WS otherlv_9= 'TwGJStif' this_WS_10= RULE_WS otherlv_11= 'TwEAStif' this_WS_12= RULE_WS otherlv_13= 'TwFAIner' this_WS_14= RULE_WS otherlv_15= 'TwSSIner' this_WS_16= RULE_WS otherlv_17= 'TwFAcgOf' this_WS_18= RULE_WS otherlv_19= 'TwSScgOf' (this_WS_20= RULE_WS )? (this_SL_COMMENT_21= RULE_SL_COMMENT )? this_NEWLINE_22= RULE_NEWLINE (this_WS_23= RULE_WS )? otherlv_24= '(-)' this_WS_25= RULE_WS otherlv_26= '(kg/m)' this_WS_27= RULE_WS otherlv_28= '(Nm^2)' this_WS_29= RULE_WS otherlv_30= '(Nm^2)' this_WS_31= RULE_WS otherlv_32= '(Nm^2)' this_WS_33= RULE_WS otherlv_34= '(N)' this_WS_35= RULE_WS otherlv_36= '(kg m)' this_WS_37= RULE_WS otherlv_38= '(kg m)' this_WS_39= RULE_WS otherlv_40= '(m)' this_WS_41= RULE_WS otherlv_42= '(m)' (this_WS_43= RULE_WS )? (this_SL_COMMENT_44= RULE_SL_COMMENT )? this_NEWLINE_45= RULE_NEWLINE ( (this_WS_46= RULE_WS )? ( (lv_HtFract_47_0= ruletNUMBER ) ) this_WS_48= RULE_WS ( (lv_TMassDen_49_0= ruletNUMBER ) ) this_WS_50= RULE_WS ( (lv_TwFAStif_51_0= ruletNUMBER ) ) this_WS_52= RULE_WS ( (lv_TwSSStif_53_0= ruletNUMBER ) ) this_WS_54= RULE_WS ( (lv_TwGJStif_55_0= ruletNUMBER ) ) this_WS_56= RULE_WS ( (lv_TwEAStif_57_0= ruletNUMBER ) ) this_WS_58= RULE_WS ( (lv_TwFAIner_59_0= ruletNUMBER ) ) this_WS_60= RULE_WS ( (lv_TwSSIner_61_0= ruletNUMBER ) ) this_WS_62= RULE_WS ( (lv_TwFAcgOf_63_0= ruletNUMBER ) ) this_WS_64= RULE_WS ( (lv_TwSScgOf_65_0= ruletNUMBER ) ) (this_WS_66= RULE_WS )? (this_SL_COMMENT_67= RULE_SL_COMMENT )? this_NEWLINE_68= RULE_NEWLINE )+
            {
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3834:2: (this_WS_0= RULE_WS )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==RULE_WS) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3834:3: this_WS_0= RULE_WS
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaTwrStat8139); 
                     
                        newLeafNode(this_WS_0, grammarAccess.getATwrStatAccess().getWSTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleaTwrStat8152); 

                	newLeafNode(otherlv_1, grammarAccess.getATwrStatAccess().getHtFractKeyword_1());
                
            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaTwrStat8163); 
             
                newLeafNode(this_WS_2, grammarAccess.getATwrStatAccess().getWSTerminalRuleCall_2()); 
                
            otherlv_3=(Token)match(input,50,FOLLOW_50_in_ruleaTwrStat8174); 

                	newLeafNode(otherlv_3, grammarAccess.getATwrStatAccess().getTMassDenKeyword_3());
                
            this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaTwrStat8185); 
             
                newLeafNode(this_WS_4, grammarAccess.getATwrStatAccess().getWSTerminalRuleCall_4()); 
                
            otherlv_5=(Token)match(input,51,FOLLOW_51_in_ruleaTwrStat8196); 

                	newLeafNode(otherlv_5, grammarAccess.getATwrStatAccess().getTwFAStifKeyword_5());
                
            this_WS_6=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaTwrStat8207); 
             
                newLeafNode(this_WS_6, grammarAccess.getATwrStatAccess().getWSTerminalRuleCall_6()); 
                
            otherlv_7=(Token)match(input,52,FOLLOW_52_in_ruleaTwrStat8218); 

                	newLeafNode(otherlv_7, grammarAccess.getATwrStatAccess().getTwSSStifKeyword_7());
                
            this_WS_8=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaTwrStat8229); 
             
                newLeafNode(this_WS_8, grammarAccess.getATwrStatAccess().getWSTerminalRuleCall_8()); 
                
            otherlv_9=(Token)match(input,53,FOLLOW_53_in_ruleaTwrStat8240); 

                	newLeafNode(otherlv_9, grammarAccess.getATwrStatAccess().getTwGJStifKeyword_9());
                
            this_WS_10=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaTwrStat8251); 
             
                newLeafNode(this_WS_10, grammarAccess.getATwrStatAccess().getWSTerminalRuleCall_10()); 
                
            otherlv_11=(Token)match(input,54,FOLLOW_54_in_ruleaTwrStat8262); 

                	newLeafNode(otherlv_11, grammarAccess.getATwrStatAccess().getTwEAStifKeyword_11());
                
            this_WS_12=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaTwrStat8273); 
             
                newLeafNode(this_WS_12, grammarAccess.getATwrStatAccess().getWSTerminalRuleCall_12()); 
                
            otherlv_13=(Token)match(input,55,FOLLOW_55_in_ruleaTwrStat8284); 

                	newLeafNode(otherlv_13, grammarAccess.getATwrStatAccess().getTwFAInerKeyword_13());
                
            this_WS_14=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaTwrStat8295); 
             
                newLeafNode(this_WS_14, grammarAccess.getATwrStatAccess().getWSTerminalRuleCall_14()); 
                
            otherlv_15=(Token)match(input,56,FOLLOW_56_in_ruleaTwrStat8306); 

                	newLeafNode(otherlv_15, grammarAccess.getATwrStatAccess().getTwSSInerKeyword_15());
                
            this_WS_16=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaTwrStat8317); 
             
                newLeafNode(this_WS_16, grammarAccess.getATwrStatAccess().getWSTerminalRuleCall_16()); 
                
            otherlv_17=(Token)match(input,57,FOLLOW_57_in_ruleaTwrStat8328); 

                	newLeafNode(otherlv_17, grammarAccess.getATwrStatAccess().getTwFAcgOfKeyword_17());
                
            this_WS_18=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaTwrStat8339); 
             
                newLeafNode(this_WS_18, grammarAccess.getATwrStatAccess().getWSTerminalRuleCall_18()); 
                
            otherlv_19=(Token)match(input,58,FOLLOW_58_in_ruleaTwrStat8350); 

                	newLeafNode(otherlv_19, grammarAccess.getATwrStatAccess().getTwSScgOfKeyword_19());
                
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3914:1: (this_WS_20= RULE_WS )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==RULE_WS) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3914:2: this_WS_20= RULE_WS
                    {
                    this_WS_20=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaTwrStat8362); 
                     
                        newLeafNode(this_WS_20, grammarAccess.getATwrStatAccess().getWSTerminalRuleCall_20()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3918:3: (this_SL_COMMENT_21= RULE_SL_COMMENT )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==RULE_SL_COMMENT) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3918:4: this_SL_COMMENT_21= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_21=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleaTwrStat8375); 
                     
                        newLeafNode(this_SL_COMMENT_21, grammarAccess.getATwrStatAccess().getSL_COMMENTTerminalRuleCall_21()); 
                        

                    }
                    break;

            }

            this_NEWLINE_22=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_ruleaTwrStat8387); 
             
                newLeafNode(this_NEWLINE_22, grammarAccess.getATwrStatAccess().getNEWLINETerminalRuleCall_22()); 
                
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3926:1: (this_WS_23= RULE_WS )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==RULE_WS) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:3926:2: this_WS_23= RULE_WS
                    {
                    this_WS_23=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaTwrStat8398); 
                     
                        newLeafNode(this_WS_23, grammarAccess.getATwrStatAccess().getWSTerminalRuleCall_23()); 
                        

                    }
                    break;

            }

            otherlv_24=(Token)match(input,59,FOLLOW_59_in_ruleaTwrStat8411); 

                	newLeafNode(otherlv_24, grammarAccess.getATwrStatAccess().getLeftParenthesisHyphenMinusRightParenthesisKeyword_24());
                
            this_WS_25=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaTwrStat8422); 
             
                newLeafNode(this_WS_25, grammarAccess.getATwrStatAccess().getWSTerminalRuleCall_25()); 
                
            otherlv_26=(Token)match(input,60,FOLLOW_60_in_ruleaTwrStat8433); 

                	newLeafNode(otherlv_26, grammarAccess.getATwrStatAccess().getKgMKeyword_26());
                
            this_WS_27=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaTwrStat8444); 
             
                newLeafNode(this_WS_27, grammarAccess.getATwrStatAccess().getWSTerminalRuleCall_27()); 
                
            otherlv_28=(Token)match(input,61,FOLLOW_61_in_ruleaTwrStat8455); 

                	newLeafNode(otherlv_28, grammarAccess.getATwrStatAccess().getNm2Keyword_28());
                
            this_WS_29=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaTwrStat8466); 
             
                newLeafNode(this_WS_29, grammarAccess.getATwrStatAccess().getWSTerminalRuleCall_29()); 
                
            otherlv_30=(Token)match(input,61,FOLLOW_61_in_ruleaTwrStat8477); 

                	newLeafNode(otherlv_30, grammarAccess.getATwrStatAccess().getNm2Keyword_30());
                
            this_WS_31=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaTwrStat8488); 
             
                newLeafNode(this_WS_31, grammarAccess.getATwrStatAccess().getWSTerminalRuleCall_31()); 
                
            otherlv_32=(Token)match(input,61,FOLLOW_61_in_ruleaTwrStat8499); 

                	newLeafNode(otherlv_32, grammarAccess.getATwrStatAccess().getNm2Keyword_32());
                
            this_WS_33=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaTwrStat8510); 
             
                newLeafNode(this_WS_33, grammarAccess.getATwrStatAccess().getWSTerminalRuleCall_33()); 
                
            otherlv_34=(Token)match(input,62,FOLLOW_62_in_ruleaTwrStat8521); 

                	newLeafNode(otherlv_34, grammarAccess.getATwrStatAccess().getNKeyword_34());
                
            this_WS_35=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaTwrStat8532); 
             
                newLeafNode(this_WS_35, grammarAccess.getATwrStatAccess().getWSTerminalRuleCall_35()); 
                
            otherlv_36=(Token)match(input,63,FOLLOW_63_in_ruleaTwrStat8543); 

                	newLeafNode(otherlv_36, grammarAccess.getATwrStatAccess().getKgMKeyword_36());
                
            this_WS_37=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaTwrStat8554); 
             
                newLeafNode(this_WS_37, grammarAccess.getATwrStatAccess().getWSTerminalRuleCall_37()); 
                
            otherlv_38=(Token)match(input,63,FOLLOW_63_in_ruleaTwrStat8565); 

                	newLeafNode(otherlv_38, grammarAccess.getATwrStatAccess().getKgMKeyword_38());
                
            this_WS_39=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaTwrStat8576); 
             
                newLeafNode(this_WS_39, grammarAccess.getATwrStatAccess().getWSTerminalRuleCall_39()); 
                
            otherlv_40=(Token)match(input,64,FOLLOW_64_in_ruleaTwrStat8587); 

                	newLeafNode(otherlv_40, grammarAccess.getATwrStatAccess().getMKeyword_40());
                
            this_WS_41=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaTwrStat8598); 
             
                newLeafNode(this_WS_41, grammarAccess.getATwrStatAccess().getWSTerminalRuleCall_41()); 
                
            otherlv_42=(Token)match(input,64,FOLLOW_64_in_ruleaTwrStat8609); 

                	newLeafNode(otherlv_42, grammarAccess.getATwrStatAccess().getMKeyword_42());
                
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4006:1: (this_WS_43= RULE_WS )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==RULE_WS) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4006:2: this_WS_43= RULE_WS
                    {
                    this_WS_43=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaTwrStat8621); 
                     
                        newLeafNode(this_WS_43, grammarAccess.getATwrStatAccess().getWSTerminalRuleCall_43()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4010:3: (this_SL_COMMENT_44= RULE_SL_COMMENT )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==RULE_SL_COMMENT) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4010:4: this_SL_COMMENT_44= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_44=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleaTwrStat8634); 
                     
                        newLeafNode(this_SL_COMMENT_44, grammarAccess.getATwrStatAccess().getSL_COMMENTTerminalRuleCall_44()); 
                        

                    }
                    break;

            }

            this_NEWLINE_45=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_ruleaTwrStat8646); 
             
                newLeafNode(this_NEWLINE_45, grammarAccess.getATwrStatAccess().getNEWLINETerminalRuleCall_45()); 
                
            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4018:1: ( (this_WS_46= RULE_WS )? ( (lv_HtFract_47_0= ruletNUMBER ) ) this_WS_48= RULE_WS ( (lv_TMassDen_49_0= ruletNUMBER ) ) this_WS_50= RULE_WS ( (lv_TwFAStif_51_0= ruletNUMBER ) ) this_WS_52= RULE_WS ( (lv_TwSSStif_53_0= ruletNUMBER ) ) this_WS_54= RULE_WS ( (lv_TwGJStif_55_0= ruletNUMBER ) ) this_WS_56= RULE_WS ( (lv_TwEAStif_57_0= ruletNUMBER ) ) this_WS_58= RULE_WS ( (lv_TwFAIner_59_0= ruletNUMBER ) ) this_WS_60= RULE_WS ( (lv_TwSSIner_61_0= ruletNUMBER ) ) this_WS_62= RULE_WS ( (lv_TwFAcgOf_63_0= ruletNUMBER ) ) this_WS_64= RULE_WS ( (lv_TwSScgOf_65_0= ruletNUMBER ) ) (this_WS_66= RULE_WS )? (this_SL_COMMENT_67= RULE_SL_COMMENT )? this_NEWLINE_68= RULE_NEWLINE )+
            int cnt112=0;
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( (LA112_0==RULE_WS||(LA112_0>=RULE_INT && LA112_0<=RULE_NUMBER)) ) {
                    alt112=1;
                }


                switch (alt112) {
            	case 1 :
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4018:2: (this_WS_46= RULE_WS )? ( (lv_HtFract_47_0= ruletNUMBER ) ) this_WS_48= RULE_WS ( (lv_TMassDen_49_0= ruletNUMBER ) ) this_WS_50= RULE_WS ( (lv_TwFAStif_51_0= ruletNUMBER ) ) this_WS_52= RULE_WS ( (lv_TwSSStif_53_0= ruletNUMBER ) ) this_WS_54= RULE_WS ( (lv_TwGJStif_55_0= ruletNUMBER ) ) this_WS_56= RULE_WS ( (lv_TwEAStif_57_0= ruletNUMBER ) ) this_WS_58= RULE_WS ( (lv_TwFAIner_59_0= ruletNUMBER ) ) this_WS_60= RULE_WS ( (lv_TwSSIner_61_0= ruletNUMBER ) ) this_WS_62= RULE_WS ( (lv_TwFAcgOf_63_0= ruletNUMBER ) ) this_WS_64= RULE_WS ( (lv_TwSScgOf_65_0= ruletNUMBER ) ) (this_WS_66= RULE_WS )? (this_SL_COMMENT_67= RULE_SL_COMMENT )? this_NEWLINE_68= RULE_NEWLINE
            	    {
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4018:2: (this_WS_46= RULE_WS )?
            	    int alt109=2;
            	    int LA109_0 = input.LA(1);

            	    if ( (LA109_0==RULE_WS) ) {
            	        alt109=1;
            	    }
            	    switch (alt109) {
            	        case 1 :
            	            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4018:3: this_WS_46= RULE_WS
            	            {
            	            this_WS_46=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaTwrStat8658); 
            	             
            	                newLeafNode(this_WS_46, grammarAccess.getATwrStatAccess().getWSTerminalRuleCall_46_0()); 
            	                

            	            }
            	            break;

            	    }

            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4022:3: ( (lv_HtFract_47_0= ruletNUMBER ) )
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4023:1: (lv_HtFract_47_0= ruletNUMBER )
            	    {
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4023:1: (lv_HtFract_47_0= ruletNUMBER )
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4024:3: lv_HtFract_47_0= ruletNUMBER
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getATwrStatAccess().getHtFractTNUMBERParserRuleCall_46_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruletNUMBER_in_ruleaTwrStat8680);
            	    lv_HtFract_47_0=ruletNUMBER();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getATwrStatRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"HtFract",
            	            		lv_HtFract_47_0, 
            	            		"tNUMBER");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    this_WS_48=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaTwrStat8691); 
            	     
            	        newLeafNode(this_WS_48, grammarAccess.getATwrStatAccess().getWSTerminalRuleCall_46_2()); 
            	        
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4044:1: ( (lv_TMassDen_49_0= ruletNUMBER ) )
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4045:1: (lv_TMassDen_49_0= ruletNUMBER )
            	    {
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4045:1: (lv_TMassDen_49_0= ruletNUMBER )
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4046:3: lv_TMassDen_49_0= ruletNUMBER
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getATwrStatAccess().getTMassDenTNUMBERParserRuleCall_46_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruletNUMBER_in_ruleaTwrStat8711);
            	    lv_TMassDen_49_0=ruletNUMBER();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getATwrStatRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"TMassDen",
            	            		lv_TMassDen_49_0, 
            	            		"tNUMBER");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    this_WS_50=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaTwrStat8722); 
            	     
            	        newLeafNode(this_WS_50, grammarAccess.getATwrStatAccess().getWSTerminalRuleCall_46_4()); 
            	        
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4066:1: ( (lv_TwFAStif_51_0= ruletNUMBER ) )
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4067:1: (lv_TwFAStif_51_0= ruletNUMBER )
            	    {
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4067:1: (lv_TwFAStif_51_0= ruletNUMBER )
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4068:3: lv_TwFAStif_51_0= ruletNUMBER
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getATwrStatAccess().getTwFAStifTNUMBERParserRuleCall_46_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruletNUMBER_in_ruleaTwrStat8742);
            	    lv_TwFAStif_51_0=ruletNUMBER();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getATwrStatRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"TwFAStif",
            	            		lv_TwFAStif_51_0, 
            	            		"tNUMBER");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    this_WS_52=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaTwrStat8753); 
            	     
            	        newLeafNode(this_WS_52, grammarAccess.getATwrStatAccess().getWSTerminalRuleCall_46_6()); 
            	        
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4088:1: ( (lv_TwSSStif_53_0= ruletNUMBER ) )
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4089:1: (lv_TwSSStif_53_0= ruletNUMBER )
            	    {
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4089:1: (lv_TwSSStif_53_0= ruletNUMBER )
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4090:3: lv_TwSSStif_53_0= ruletNUMBER
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getATwrStatAccess().getTwSSStifTNUMBERParserRuleCall_46_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruletNUMBER_in_ruleaTwrStat8773);
            	    lv_TwSSStif_53_0=ruletNUMBER();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getATwrStatRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"TwSSStif",
            	            		lv_TwSSStif_53_0, 
            	            		"tNUMBER");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    this_WS_54=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaTwrStat8784); 
            	     
            	        newLeafNode(this_WS_54, grammarAccess.getATwrStatAccess().getWSTerminalRuleCall_46_8()); 
            	        
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4110:1: ( (lv_TwGJStif_55_0= ruletNUMBER ) )
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4111:1: (lv_TwGJStif_55_0= ruletNUMBER )
            	    {
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4111:1: (lv_TwGJStif_55_0= ruletNUMBER )
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4112:3: lv_TwGJStif_55_0= ruletNUMBER
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getATwrStatAccess().getTwGJStifTNUMBERParserRuleCall_46_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruletNUMBER_in_ruleaTwrStat8804);
            	    lv_TwGJStif_55_0=ruletNUMBER();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getATwrStatRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"TwGJStif",
            	            		lv_TwGJStif_55_0, 
            	            		"tNUMBER");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    this_WS_56=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaTwrStat8815); 
            	     
            	        newLeafNode(this_WS_56, grammarAccess.getATwrStatAccess().getWSTerminalRuleCall_46_10()); 
            	        
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4132:1: ( (lv_TwEAStif_57_0= ruletNUMBER ) )
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4133:1: (lv_TwEAStif_57_0= ruletNUMBER )
            	    {
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4133:1: (lv_TwEAStif_57_0= ruletNUMBER )
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4134:3: lv_TwEAStif_57_0= ruletNUMBER
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getATwrStatAccess().getTwEAStifTNUMBERParserRuleCall_46_11_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruletNUMBER_in_ruleaTwrStat8835);
            	    lv_TwEAStif_57_0=ruletNUMBER();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getATwrStatRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"TwEAStif",
            	            		lv_TwEAStif_57_0, 
            	            		"tNUMBER");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    this_WS_58=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaTwrStat8846); 
            	     
            	        newLeafNode(this_WS_58, grammarAccess.getATwrStatAccess().getWSTerminalRuleCall_46_12()); 
            	        
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4154:1: ( (lv_TwFAIner_59_0= ruletNUMBER ) )
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4155:1: (lv_TwFAIner_59_0= ruletNUMBER )
            	    {
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4155:1: (lv_TwFAIner_59_0= ruletNUMBER )
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4156:3: lv_TwFAIner_59_0= ruletNUMBER
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getATwrStatAccess().getTwFAInerTNUMBERParserRuleCall_46_13_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruletNUMBER_in_ruleaTwrStat8866);
            	    lv_TwFAIner_59_0=ruletNUMBER();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getATwrStatRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"TwFAIner",
            	            		lv_TwFAIner_59_0, 
            	            		"tNUMBER");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    this_WS_60=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaTwrStat8877); 
            	     
            	        newLeafNode(this_WS_60, grammarAccess.getATwrStatAccess().getWSTerminalRuleCall_46_14()); 
            	        
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4176:1: ( (lv_TwSSIner_61_0= ruletNUMBER ) )
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4177:1: (lv_TwSSIner_61_0= ruletNUMBER )
            	    {
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4177:1: (lv_TwSSIner_61_0= ruletNUMBER )
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4178:3: lv_TwSSIner_61_0= ruletNUMBER
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getATwrStatAccess().getTwSSInerTNUMBERParserRuleCall_46_15_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruletNUMBER_in_ruleaTwrStat8897);
            	    lv_TwSSIner_61_0=ruletNUMBER();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getATwrStatRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"TwSSIner",
            	            		lv_TwSSIner_61_0, 
            	            		"tNUMBER");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    this_WS_62=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaTwrStat8908); 
            	     
            	        newLeafNode(this_WS_62, grammarAccess.getATwrStatAccess().getWSTerminalRuleCall_46_16()); 
            	        
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4198:1: ( (lv_TwFAcgOf_63_0= ruletNUMBER ) )
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4199:1: (lv_TwFAcgOf_63_0= ruletNUMBER )
            	    {
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4199:1: (lv_TwFAcgOf_63_0= ruletNUMBER )
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4200:3: lv_TwFAcgOf_63_0= ruletNUMBER
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getATwrStatAccess().getTwFAcgOfTNUMBERParserRuleCall_46_17_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruletNUMBER_in_ruleaTwrStat8928);
            	    lv_TwFAcgOf_63_0=ruletNUMBER();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getATwrStatRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"TwFAcgOf",
            	            		lv_TwFAcgOf_63_0, 
            	            		"tNUMBER");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    this_WS_64=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaTwrStat8939); 
            	     
            	        newLeafNode(this_WS_64, grammarAccess.getATwrStatAccess().getWSTerminalRuleCall_46_18()); 
            	        
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4220:1: ( (lv_TwSScgOf_65_0= ruletNUMBER ) )
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4221:1: (lv_TwSScgOf_65_0= ruletNUMBER )
            	    {
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4221:1: (lv_TwSScgOf_65_0= ruletNUMBER )
            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4222:3: lv_TwSScgOf_65_0= ruletNUMBER
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getATwrStatAccess().getTwSScgOfTNUMBERParserRuleCall_46_19_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruletNUMBER_in_ruleaTwrStat8959);
            	    lv_TwSScgOf_65_0=ruletNUMBER();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getATwrStatRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"TwSScgOf",
            	            		lv_TwSScgOf_65_0, 
            	            		"tNUMBER");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4238:2: (this_WS_66= RULE_WS )?
            	    int alt110=2;
            	    int LA110_0 = input.LA(1);

            	    if ( (LA110_0==RULE_WS) ) {
            	        alt110=1;
            	    }
            	    switch (alt110) {
            	        case 1 :
            	            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4238:3: this_WS_66= RULE_WS
            	            {
            	            this_WS_66=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaTwrStat8971); 
            	             
            	                newLeafNode(this_WS_66, grammarAccess.getATwrStatAccess().getWSTerminalRuleCall_46_20()); 
            	                

            	            }
            	            break;

            	    }

            	    // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4242:3: (this_SL_COMMENT_67= RULE_SL_COMMENT )?
            	    int alt111=2;
            	    int LA111_0 = input.LA(1);

            	    if ( (LA111_0==RULE_SL_COMMENT) ) {
            	        alt111=1;
            	    }
            	    switch (alt111) {
            	        case 1 :
            	            // ../sc.ndt.editor.fast.twr/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFasttwr.g:4242:4: this_SL_COMMENT_67= RULE_SL_COMMENT
            	            {
            	            this_SL_COMMENT_67=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleaTwrStat8984); 
            	             
            	                newLeafNode(this_SL_COMMENT_67, grammarAccess.getATwrStatAccess().getSL_COMMENTTerminalRuleCall_46_21()); 
            	                

            	            }
            	            break;

            	    }

            	    this_NEWLINE_68=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_ruleaTwrStat8996); 
            	     
            	        newLeafNode(this_NEWLINE_68, grammarAccess.getATwrStatAccess().getNEWLINETerminalRuleCall_46_22()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt112 >= 1 ) break loop112;
                        EarlyExitException eee =
                            new EarlyExitException(112, input);
                        throw eee;
                }
                cnt112++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleaTwrStat"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModelFasttwr_in_entryRuleModelFasttwr75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelFasttwr85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader_in_ruleModelFasttwr131 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleSection_in_ruleModelFasttwr152 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_rulenNTwInpSt_in_ruleModelFasttwr173 = new BitSet(new long[]{0x000000000000FC10L});
    public static final BitSet FOLLOW_rulebCalcTMode_in_ruleModelFasttwr194 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_rulenTwrFADmp1_in_ruleModelFasttwr215 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_rulenTwrFADmp2_in_ruleModelFasttwr236 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_rulenTwrSSDmp1_in_ruleModelFasttwr257 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_rulenTwrSSDmp2_in_ruleModelFasttwr278 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleSection_in_ruleModelFasttwr299 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_rulenFAStTunr1_in_ruleModelFasttwr320 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_rulenFAStTunr2_in_ruleModelFasttwr341 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_rulenSSStTunr1_in_ruleModelFasttwr362 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_rulenSSStTunr2_in_ruleModelFasttwr383 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruleAdjTwMa_in_ruleModelFasttwr404 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruleAdjFASt_in_ruleModelFasttwr425 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruleAdjSSSt_in_ruleModelFasttwr446 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleSection_in_ruleModelFasttwr467 = new BitSet(new long[]{0x0002000000000010L});
    public static final BitSet FOLLOW_ruleaTwrStat_in_ruleModelFasttwr488 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleSection_in_ruleModelFasttwr509 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_rulenTwFAM1Sh2_in_ruleModelFasttwr530 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_rulenTwFAM1Sh3_in_ruleModelFasttwr551 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_rulenTwFAM1Sh4_in_ruleModelFasttwr572 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_rulenTwFAM1Sh5_in_ruleModelFasttwr593 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_rulenTwFAM1Sh6_in_ruleModelFasttwr614 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_rulenTwFAM2Sh2_in_ruleModelFasttwr635 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_rulenTwFAM2Sh3_in_ruleModelFasttwr656 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_rulenTwFAM2Sh4_in_ruleModelFasttwr677 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_rulenTwFAM2Sh5_in_ruleModelFasttwr698 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_rulenTwFAM2Sh6_in_ruleModelFasttwr719 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleSection_in_ruleModelFasttwr740 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_rulenTwSSM1Sh2_in_ruleModelFasttwr761 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_rulenTwSSM1Sh3_in_ruleModelFasttwr782 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_rulenTwSSM1Sh4_in_ruleModelFasttwr803 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_rulenTwSSM1Sh5_in_ruleModelFasttwr824 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_rulenTwSSM1Sh6_in_ruleModelFasttwr845 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_rulenTwSSM2Sh2_in_ruleModelFasttwr866 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_rulenTwSSM2Sh3_in_ruleModelFasttwr887 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_rulenTwSSM2Sh4_in_ruleModelFasttwr908 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_rulenTwSSM2Sh5_in_ruleModelFasttwr929 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_rulenTwSSM2Sh6_in_ruleModelFasttwr950 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleModelFasttwr962 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_ruleModelFasttwr978 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleModelFasttwr994 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_ruleHeader_in_entryRuleHeader1037 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeader1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleHeader1087 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_ruleHeader1097 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleHeader1107 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_ruleHeader1117 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleHeader1133 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_ruleHeader1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_entryRuleSection1194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleSection1250 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_ruleSection1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletNUMBER_in_entryRuletNUMBER1306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletNUMBER1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruletNUMBER1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruletNUMBER1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletBOOL_in_entryRuletBOOL1429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletBOOL1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruletBOOL1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruletBOOL1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruletBOOL1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruletBOOL1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruletBOOL1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruletBOOL1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenNTwInpSt_in_entryRulenNTwInpSt1619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenNTwInpSt1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenNTwInpSt1670 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INT_in_rulenNTwInpSt1688 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenNTwInpSt1704 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulenNTwInpSt1721 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenNTwInpSt1746 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rulenNTwInpSt1759 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rulenNTwInpSt1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulebCalcTMode_in_entryRulebCalcTMode1816 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulebCalcTMode1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rulebCalcTMode1867 = new BitSet(new long[]{0x000000000000FC10L});
    public static final BitSet FOLLOW_ruletBOOL_in_rulebCalcTMode1889 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_rulebCalcTMode1900 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulebCalcTMode1917 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_WS_in_rulebCalcTMode1942 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rulebCalcTMode1955 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rulebCalcTMode1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenTwrFADmp1_in_entryRulenTwrFADmp12012 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenTwrFADmp12022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwrFADmp12063 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruletNUMBER_in_rulenTwrFADmp12085 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwrFADmp12096 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulenTwrFADmp12113 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwrFADmp12138 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rulenTwrFADmp12151 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rulenTwrFADmp12163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenTwrFADmp2_in_entryRulenTwrFADmp22208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenTwrFADmp22218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwrFADmp22259 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruletNUMBER_in_rulenTwrFADmp22281 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwrFADmp22292 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulenTwrFADmp22309 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwrFADmp22334 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rulenTwrFADmp22347 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rulenTwrFADmp22359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenTwrSSDmp1_in_entryRulenTwrSSDmp12404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenTwrSSDmp12414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwrSSDmp12455 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruletNUMBER_in_rulenTwrSSDmp12477 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwrSSDmp12488 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulenTwrSSDmp12505 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwrSSDmp12530 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rulenTwrSSDmp12543 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rulenTwrSSDmp12555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenTwrSSDmp2_in_entryRulenTwrSSDmp22600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenTwrSSDmp22610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwrSSDmp22651 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruletNUMBER_in_rulenTwrSSDmp22673 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwrSSDmp22684 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulenTwrSSDmp22701 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwrSSDmp22726 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rulenTwrSSDmp22739 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rulenTwrSSDmp22751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenFAStTunr1_in_entryRulenFAStTunr12796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenFAStTunr12806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenFAStTunr12847 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruletNUMBER_in_rulenFAStTunr12869 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenFAStTunr12880 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulenFAStTunr12897 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenFAStTunr12922 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rulenFAStTunr12935 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rulenFAStTunr12947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenFAStTunr2_in_entryRulenFAStTunr22992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenFAStTunr23002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenFAStTunr23043 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruletNUMBER_in_rulenFAStTunr23065 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenFAStTunr23076 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulenFAStTunr23093 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenFAStTunr23118 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rulenFAStTunr23131 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rulenFAStTunr23143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenSSStTunr1_in_entryRulenSSStTunr13188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenSSStTunr13198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenSSStTunr13239 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruletNUMBER_in_rulenSSStTunr13261 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenSSStTunr13272 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulenSSStTunr13289 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenSSStTunr13314 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rulenSSStTunr13327 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rulenSSStTunr13339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenSSStTunr2_in_entryRulenSSStTunr23384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenSSStTunr23394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenSSStTunr23435 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruletNUMBER_in_rulenSSStTunr23457 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenSSStTunr23468 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rulenSSStTunr23485 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenSSStTunr23510 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rulenSSStTunr23523 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rulenSSStTunr23535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdjTwMa_in_entryRuleAdjTwMa3580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdjTwMa3590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleAdjTwMa3631 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruletNUMBER_in_ruleAdjTwMa3653 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleAdjTwMa3664 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleAdjTwMa3681 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleAdjTwMa3706 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleAdjTwMa3719 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_ruleAdjTwMa3731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdjFASt_in_entryRuleAdjFASt3776 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdjFASt3786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleAdjFASt3827 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruletNUMBER_in_ruleAdjFASt3849 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleAdjFASt3860 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleAdjFASt3877 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleAdjFASt3902 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleAdjFASt3915 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_ruleAdjFASt3927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdjSSSt_in_entryRuleAdjSSSt3972 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdjSSSt3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleAdjSSSt4023 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruletNUMBER_in_ruleAdjSSSt4045 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleAdjSSSt4056 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAdjSSSt4073 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleAdjSSSt4098 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleAdjSSSt4111 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_ruleAdjSSSt4123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenTwFAM1Sh2_in_entryRulenTwFAM1Sh24168 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenTwFAM1Sh24178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwFAM1Sh24219 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruletNUMBER_in_rulenTwFAM1Sh24241 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwFAM1Sh24252 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_rulenTwFAM1Sh24269 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwFAM1Sh24294 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rulenTwFAM1Sh24307 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rulenTwFAM1Sh24319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenTwFAM1Sh3_in_entryRulenTwFAM1Sh34364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenTwFAM1Sh34374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwFAM1Sh34415 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruletNUMBER_in_rulenTwFAM1Sh34437 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwFAM1Sh34448 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulenTwFAM1Sh34465 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwFAM1Sh34490 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rulenTwFAM1Sh34503 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rulenTwFAM1Sh34515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenTwFAM1Sh4_in_entryRulenTwFAM1Sh44560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenTwFAM1Sh44570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwFAM1Sh44611 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruletNUMBER_in_rulenTwFAM1Sh44633 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwFAM1Sh44644 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulenTwFAM1Sh44661 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwFAM1Sh44686 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rulenTwFAM1Sh44699 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rulenTwFAM1Sh44711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenTwFAM1Sh5_in_entryRulenTwFAM1Sh54756 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenTwFAM1Sh54766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwFAM1Sh54807 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruletNUMBER_in_rulenTwFAM1Sh54829 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwFAM1Sh54840 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rulenTwFAM1Sh54857 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwFAM1Sh54882 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rulenTwFAM1Sh54895 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rulenTwFAM1Sh54907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenTwFAM1Sh6_in_entryRulenTwFAM1Sh64952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenTwFAM1Sh64962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwFAM1Sh65003 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruletNUMBER_in_rulenTwFAM1Sh65025 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwFAM1Sh65036 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_rulenTwFAM1Sh65053 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwFAM1Sh65078 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rulenTwFAM1Sh65091 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rulenTwFAM1Sh65103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenTwFAM2Sh2_in_entryRulenTwFAM2Sh25148 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenTwFAM2Sh25158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwFAM2Sh25199 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruletNUMBER_in_rulenTwFAM2Sh25221 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwFAM2Sh25232 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_rulenTwFAM2Sh25249 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwFAM2Sh25274 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rulenTwFAM2Sh25287 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rulenTwFAM2Sh25299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenTwFAM2Sh3_in_entryRulenTwFAM2Sh35344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenTwFAM2Sh35354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwFAM2Sh35395 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruletNUMBER_in_rulenTwFAM2Sh35417 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwFAM2Sh35428 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_rulenTwFAM2Sh35445 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwFAM2Sh35470 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rulenTwFAM2Sh35483 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rulenTwFAM2Sh35495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenTwFAM2Sh4_in_entryRulenTwFAM2Sh45540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenTwFAM2Sh45550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwFAM2Sh45591 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruletNUMBER_in_rulenTwFAM2Sh45613 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwFAM2Sh45624 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulenTwFAM2Sh45641 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwFAM2Sh45666 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rulenTwFAM2Sh45679 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rulenTwFAM2Sh45691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenTwFAM2Sh5_in_entryRulenTwFAM2Sh55736 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenTwFAM2Sh55746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwFAM2Sh55787 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruletNUMBER_in_rulenTwFAM2Sh55809 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwFAM2Sh55820 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulenTwFAM2Sh55837 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwFAM2Sh55862 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rulenTwFAM2Sh55875 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rulenTwFAM2Sh55887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenTwFAM2Sh6_in_entryRulenTwFAM2Sh65932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenTwFAM2Sh65942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwFAM2Sh65983 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruletNUMBER_in_rulenTwFAM2Sh66005 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwFAM2Sh66016 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_rulenTwFAM2Sh66033 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwFAM2Sh66058 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rulenTwFAM2Sh66071 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rulenTwFAM2Sh66083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenTwSSM1Sh2_in_entryRulenTwSSM1Sh26128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenTwSSM1Sh26138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwSSM1Sh26179 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruletNUMBER_in_rulenTwSSM1Sh26201 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwSSM1Sh26212 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_rulenTwSSM1Sh26229 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwSSM1Sh26254 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rulenTwSSM1Sh26267 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rulenTwSSM1Sh26279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenTwSSM1Sh3_in_entryRulenTwSSM1Sh36324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenTwSSM1Sh36334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwSSM1Sh36375 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruletNUMBER_in_rulenTwSSM1Sh36397 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwSSM1Sh36408 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_rulenTwSSM1Sh36425 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwSSM1Sh36450 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rulenTwSSM1Sh36463 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rulenTwSSM1Sh36475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenTwSSM1Sh4_in_entryRulenTwSSM1Sh46520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenTwSSM1Sh46530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwSSM1Sh46571 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruletNUMBER_in_rulenTwSSM1Sh46593 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwSSM1Sh46604 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_rulenTwSSM1Sh46621 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwSSM1Sh46646 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rulenTwSSM1Sh46659 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rulenTwSSM1Sh46671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenTwSSM1Sh5_in_entryRulenTwSSM1Sh56716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenTwSSM1Sh56726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwSSM1Sh56767 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruletNUMBER_in_rulenTwSSM1Sh56789 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwSSM1Sh56800 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_rulenTwSSM1Sh56817 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwSSM1Sh56842 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rulenTwSSM1Sh56855 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rulenTwSSM1Sh56867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenTwSSM1Sh6_in_entryRulenTwSSM1Sh66912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenTwSSM1Sh66922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwSSM1Sh66963 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruletNUMBER_in_rulenTwSSM1Sh66985 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwSSM1Sh66996 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_rulenTwSSM1Sh67013 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwSSM1Sh67038 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rulenTwSSM1Sh67051 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rulenTwSSM1Sh67063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenTwSSM2Sh2_in_entryRulenTwSSM2Sh27108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenTwSSM2Sh27118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwSSM2Sh27159 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruletNUMBER_in_rulenTwSSM2Sh27181 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwSSM2Sh27192 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_rulenTwSSM2Sh27209 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwSSM2Sh27234 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rulenTwSSM2Sh27247 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rulenTwSSM2Sh27259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenTwSSM2Sh3_in_entryRulenTwSSM2Sh37304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenTwSSM2Sh37314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwSSM2Sh37355 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruletNUMBER_in_rulenTwSSM2Sh37377 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwSSM2Sh37388 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_rulenTwSSM2Sh37405 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwSSM2Sh37430 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rulenTwSSM2Sh37443 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rulenTwSSM2Sh37455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenTwSSM2Sh4_in_entryRulenTwSSM2Sh47500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenTwSSM2Sh47510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwSSM2Sh47551 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruletNUMBER_in_rulenTwSSM2Sh47573 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwSSM2Sh47584 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_rulenTwSSM2Sh47601 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwSSM2Sh47626 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rulenTwSSM2Sh47639 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rulenTwSSM2Sh47651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenTwSSM2Sh5_in_entryRulenTwSSM2Sh57696 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenTwSSM2Sh57706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwSSM2Sh57747 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruletNUMBER_in_rulenTwSSM2Sh57769 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwSSM2Sh57780 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_rulenTwSSM2Sh57797 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwSSM2Sh57822 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rulenTwSSM2Sh57835 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rulenTwSSM2Sh57847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenTwSSM2Sh6_in_entryRulenTwSSM2Sh67892 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenTwSSM2Sh67902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwSSM2Sh67943 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruletNUMBER_in_rulenTwSSM2Sh67965 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwSSM2Sh67976 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_rulenTwSSM2Sh67993 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_WS_in_rulenTwSSM2Sh68018 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rulenTwSSM2Sh68031 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rulenTwSSM2Sh68043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleaTwrStat_in_entryRuleaTwrStat8088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleaTwrStat8098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaTwrStat8139 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleaTwrStat8152 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaTwrStat8163 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleaTwrStat8174 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaTwrStat8185 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleaTwrStat8196 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaTwrStat8207 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleaTwrStat8218 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaTwrStat8229 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleaTwrStat8240 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaTwrStat8251 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleaTwrStat8262 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaTwrStat8273 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleaTwrStat8284 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaTwrStat8295 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleaTwrStat8306 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaTwrStat8317 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleaTwrStat8328 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaTwrStat8339 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleaTwrStat8350 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaTwrStat8362 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleaTwrStat8375 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_ruleaTwrStat8387 = new BitSet(new long[]{0x0800000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaTwrStat8398 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleaTwrStat8411 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaTwrStat8422 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleaTwrStat8433 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaTwrStat8444 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleaTwrStat8455 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaTwrStat8466 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleaTwrStat8477 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaTwrStat8488 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleaTwrStat8499 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaTwrStat8510 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleaTwrStat8521 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaTwrStat8532 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleaTwrStat8543 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaTwrStat8554 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleaTwrStat8565 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaTwrStat8576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleaTwrStat8587 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaTwrStat8598 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleaTwrStat8609 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaTwrStat8621 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleaTwrStat8634 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_ruleaTwrStat8646 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaTwrStat8658 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruletNUMBER_in_ruleaTwrStat8680 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaTwrStat8691 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruletNUMBER_in_ruleaTwrStat8711 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaTwrStat8722 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruletNUMBER_in_ruleaTwrStat8742 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaTwrStat8753 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruletNUMBER_in_ruleaTwrStat8773 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaTwrStat8784 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruletNUMBER_in_ruleaTwrStat8804 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaTwrStat8815 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruletNUMBER_in_ruleaTwrStat8835 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaTwrStat8846 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruletNUMBER_in_ruleaTwrStat8866 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaTwrStat8877 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruletNUMBER_in_ruleaTwrStat8897 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaTwrStat8908 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruletNUMBER_in_ruleaTwrStat8928 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaTwrStat8939 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruletNUMBER_in_ruleaTwrStat8959 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaTwrStat8971 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleaTwrStat8984 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_ruleaTwrStat8996 = new BitSet(new long[]{0x0000000000000192L});

}