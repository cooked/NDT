package sc.ndt.editor.bmodes.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import sc.ndt.editor.bmodes.services.BmodestspGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBmodestspParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NEWLINE", "RULE_WS", "RULE_SL_COMMENT", "RULE_INT", "RULE_NUMBER", "RULE_STRING", "'n_secs'", "'sec_loc'", "'str_tw'", "'tw_iner'", "'mass_den'", "'flp_iner'", "'edge_iner'", "'flp_stff'", "'edge_stff'", "'tor_stff'", "'axial_stff'", "'cg_offst'", "'sc_offst'", "'tc_offst'", "'(-)'", "'(deg)'", "'(kg/m)'", "'(kg-m)'", "'(Nm^2)'", "'(N)'", "'(m)'"
    };
    public static final int RULE_NEWLINE=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=6;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int RULE_STRING=9;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_NUMBER=8;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int RULE_INT=7;
    public static final int RULE_WS=5;

    // delegates
    // delegators


        public InternalBmodestspParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBmodestspParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBmodestspParser.tokenNames; }
    public String getGrammarFileName() { return "../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g"; }



     	private BmodestspGrammarAccess grammarAccess;
     	
        public InternalBmodestspParser(TokenStream input, BmodestspGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ModelBmodestsp";	
       	}
       	
       	@Override
       	protected BmodestspGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModelBmodestsp"
    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:67:1: entryRuleModelBmodestsp returns [EObject current=null] : iv_ruleModelBmodestsp= ruleModelBmodestsp EOF ;
    public final EObject entryRuleModelBmodestsp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelBmodestsp = null;


        try {
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:68:2: (iv_ruleModelBmodestsp= ruleModelBmodestsp EOF )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:69:2: iv_ruleModelBmodestsp= ruleModelBmodestsp EOF
            {
             newCompositeNode(grammarAccess.getModelBmodestspRule()); 
            pushFollow(FOLLOW_ruleModelBmodestsp_in_entryRuleModelBmodestsp75);
            iv_ruleModelBmodestsp=ruleModelBmodestsp();

            state._fsp--;

             current =iv_ruleModelBmodestsp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelBmodestsp85); 

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
    // $ANTLR end "entryRuleModelBmodestsp"


    // $ANTLR start "ruleModelBmodestsp"
    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:76:1: ruleModelBmodestsp returns [EObject current=null] : ( ( (lv_Head_0_0= ruleHeader ) ) ( (lv_NNodes_1_0= ruleiNodes ) ) this_NEWLINE_2= RULE_NEWLINE ( (lv_Sections_3_0= ruleaSec ) ) (this_WS_4= RULE_WS | this_NEWLINE_5= RULE_NEWLINE | this_SL_COMMENT_6= RULE_SL_COMMENT )* ) ;
    public final EObject ruleModelBmodestsp() throws RecognitionException {
        EObject current = null;

        Token this_NEWLINE_2=null;
        Token this_WS_4=null;
        Token this_NEWLINE_5=null;
        Token this_SL_COMMENT_6=null;
        EObject lv_Head_0_0 = null;

        EObject lv_NNodes_1_0 = null;

        EObject lv_Sections_3_0 = null;


         enterRule(); 
            
        try {
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:79:28: ( ( ( (lv_Head_0_0= ruleHeader ) ) ( (lv_NNodes_1_0= ruleiNodes ) ) this_NEWLINE_2= RULE_NEWLINE ( (lv_Sections_3_0= ruleaSec ) ) (this_WS_4= RULE_WS | this_NEWLINE_5= RULE_NEWLINE | this_SL_COMMENT_6= RULE_SL_COMMENT )* ) )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:80:1: ( ( (lv_Head_0_0= ruleHeader ) ) ( (lv_NNodes_1_0= ruleiNodes ) ) this_NEWLINE_2= RULE_NEWLINE ( (lv_Sections_3_0= ruleaSec ) ) (this_WS_4= RULE_WS | this_NEWLINE_5= RULE_NEWLINE | this_SL_COMMENT_6= RULE_SL_COMMENT )* )
            {
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:80:1: ( ( (lv_Head_0_0= ruleHeader ) ) ( (lv_NNodes_1_0= ruleiNodes ) ) this_NEWLINE_2= RULE_NEWLINE ( (lv_Sections_3_0= ruleaSec ) ) (this_WS_4= RULE_WS | this_NEWLINE_5= RULE_NEWLINE | this_SL_COMMENT_6= RULE_SL_COMMENT )* )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:80:2: ( (lv_Head_0_0= ruleHeader ) ) ( (lv_NNodes_1_0= ruleiNodes ) ) this_NEWLINE_2= RULE_NEWLINE ( (lv_Sections_3_0= ruleaSec ) ) (this_WS_4= RULE_WS | this_NEWLINE_5= RULE_NEWLINE | this_SL_COMMENT_6= RULE_SL_COMMENT )*
            {
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:80:2: ( (lv_Head_0_0= ruleHeader ) )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:81:1: (lv_Head_0_0= ruleHeader )
            {
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:81:1: (lv_Head_0_0= ruleHeader )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:82:3: lv_Head_0_0= ruleHeader
            {
             
            	        newCompositeNode(grammarAccess.getModelBmodestspAccess().getHeadHeaderParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleHeader_in_ruleModelBmodestsp131);
            lv_Head_0_0=ruleHeader();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelBmodestspRule());
            	        }
                   		set(
                   			current, 
                   			"Head",
                    		lv_Head_0_0, 
                    		"Header");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:98:2: ( (lv_NNodes_1_0= ruleiNodes ) )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:99:1: (lv_NNodes_1_0= ruleiNodes )
            {
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:99:1: (lv_NNodes_1_0= ruleiNodes )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:100:3: lv_NNodes_1_0= ruleiNodes
            {
             
            	        newCompositeNode(grammarAccess.getModelBmodestspAccess().getNNodesINodesParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleiNodes_in_ruleModelBmodestsp152);
            lv_NNodes_1_0=ruleiNodes();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelBmodestspRule());
            	        }
                   		set(
                   			current, 
                   			"NNodes",
                    		lv_NNodes_1_0, 
                    		"iNodes");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_NEWLINE_2=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_ruleModelBmodestsp163); 
             
                newLeafNode(this_NEWLINE_2, grammarAccess.getModelBmodestspAccess().getNEWLINETerminalRuleCall_2()); 
                
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:120:1: ( (lv_Sections_3_0= ruleaSec ) )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:121:1: (lv_Sections_3_0= ruleaSec )
            {
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:121:1: (lv_Sections_3_0= ruleaSec )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:122:3: lv_Sections_3_0= ruleaSec
            {
             
            	        newCompositeNode(grammarAccess.getModelBmodestspAccess().getSectionsASecParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleaSec_in_ruleModelBmodestsp183);
            lv_Sections_3_0=ruleaSec();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelBmodestspRule());
            	        }
                   		set(
                   			current, 
                   			"Sections",
                    		lv_Sections_3_0, 
                    		"aSec");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:138:2: (this_WS_4= RULE_WS | this_NEWLINE_5= RULE_NEWLINE | this_SL_COMMENT_6= RULE_SL_COMMENT )*
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
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:138:3: this_WS_4= RULE_WS
            	    {
            	    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleModelBmodestsp195); 
            	     
            	        newLeafNode(this_WS_4, grammarAccess.getModelBmodestspAccess().getWSTerminalRuleCall_4_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:143:6: this_NEWLINE_5= RULE_NEWLINE
            	    {
            	    this_NEWLINE_5=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_ruleModelBmodestsp211); 
            	     
            	        newLeafNode(this_NEWLINE_5, grammarAccess.getModelBmodestspAccess().getNEWLINETerminalRuleCall_4_1()); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:148:6: this_SL_COMMENT_6= RULE_SL_COMMENT
            	    {
            	    this_SL_COMMENT_6=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleModelBmodestsp227); 
            	     
            	        newLeafNode(this_SL_COMMENT_6, grammarAccess.getModelBmodestspAccess().getSL_COMMENTTerminalRuleCall_4_2()); 
            	        

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
    // $ANTLR end "ruleModelBmodestsp"


    // $ANTLR start "entryRuletNUMBER"
    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:160:1: entryRuletNUMBER returns [String current=null] : iv_ruletNUMBER= ruletNUMBER EOF ;
    public final String entryRuletNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletNUMBER = null;


        try {
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:161:2: (iv_ruletNUMBER= ruletNUMBER EOF )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:162:2: iv_ruletNUMBER= ruletNUMBER EOF
            {
             newCompositeNode(grammarAccess.getTNUMBERRule()); 
            pushFollow(FOLLOW_ruletNUMBER_in_entryRuletNUMBER265);
            iv_ruletNUMBER=ruletNUMBER();

            state._fsp--;

             current =iv_ruletNUMBER.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletNUMBER276); 

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
    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:169:1: ruletNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_NUMBER_1= RULE_NUMBER ) ;
    public final AntlrDatatypeRuleToken ruletNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_NUMBER_1=null;

         enterRule(); 
            
        try {
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:172:28: ( (this_INT_0= RULE_INT | this_NUMBER_1= RULE_NUMBER ) )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:173:1: (this_INT_0= RULE_INT | this_NUMBER_1= RULE_NUMBER )
            {
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:173:1: (this_INT_0= RULE_INT | this_NUMBER_1= RULE_NUMBER )
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
                    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:173:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruletNUMBER316); 

                    		current.merge(this_INT_0);
                        
                     
                        newLeafNode(this_INT_0, grammarAccess.getTNUMBERAccess().getINTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:181:10: this_NUMBER_1= RULE_NUMBER
                    {
                    this_NUMBER_1=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruletNUMBER342); 

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


    // $ANTLR start "entryRuleHeader"
    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:198:1: entryRuleHeader returns [EObject current=null] : iv_ruleHeader= ruleHeader EOF ;
    public final EObject entryRuleHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:202:2: (iv_ruleHeader= ruleHeader EOF )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:203:2: iv_ruleHeader= ruleHeader EOF
            {
             newCompositeNode(grammarAccess.getHeaderRule()); 
            pushFollow(FOLLOW_ruleHeader_in_entryRuleHeader395);
            iv_ruleHeader=ruleHeader();

            state._fsp--;

             current =iv_ruleHeader; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeader405); 

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
    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:213:1: ruleHeader returns [EObject current=null] : ( ( (lv_name_0_0= RULE_SL_COMMENT ) ) this_NEWLINE_1= RULE_NEWLINE ) ;
    public final EObject ruleHeader() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_NEWLINE_1=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:217:28: ( ( ( (lv_name_0_0= RULE_SL_COMMENT ) ) this_NEWLINE_1= RULE_NEWLINE ) )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:218:1: ( ( (lv_name_0_0= RULE_SL_COMMENT ) ) this_NEWLINE_1= RULE_NEWLINE )
            {
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:218:1: ( ( (lv_name_0_0= RULE_SL_COMMENT ) ) this_NEWLINE_1= RULE_NEWLINE )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:218:2: ( (lv_name_0_0= RULE_SL_COMMENT ) ) this_NEWLINE_1= RULE_NEWLINE
            {
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:218:2: ( (lv_name_0_0= RULE_SL_COMMENT ) )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:219:1: (lv_name_0_0= RULE_SL_COMMENT )
            {
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:219:1: (lv_name_0_0= RULE_SL_COMMENT )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:220:3: lv_name_0_0= RULE_SL_COMMENT
            {
            lv_name_0_0=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleHeader451); 

            			newLeafNode(lv_name_0_0, grammarAccess.getHeaderAccess().getNameSL_COMMENTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHeaderRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"SL_COMMENT");
            	    

            }


            }

            this_NEWLINE_1=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_ruleHeader467); 
             
                newLeafNode(this_NEWLINE_1, grammarAccess.getHeaderAccess().getNEWLINETerminalRuleCall_1()); 
                

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


    // $ANTLR start "entryRuleiNodes"
    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:251:1: entryRuleiNodes returns [EObject current=null] : iv_ruleiNodes= ruleiNodes EOF ;
    public final EObject entryRuleiNodes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleiNodes = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:255:2: (iv_ruleiNodes= ruleiNodes EOF )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:256:2: iv_ruleiNodes= ruleiNodes EOF
            {
             newCompositeNode(grammarAccess.getINodesRule()); 
            pushFollow(FOLLOW_ruleiNodes_in_entryRuleiNodes512);
            iv_ruleiNodes=ruleiNodes();

            state._fsp--;

             current =iv_ruleiNodes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleiNodes522); 

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
    // $ANTLR end "entryRuleiNodes"


    // $ANTLR start "ruleiNodes"
    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:266:1: ruleiNodes returns [EObject current=null] : ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= RULE_INT ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'n_secs' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) ;
    public final EObject ruleiNodes() throws RecognitionException {
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
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:270:28: ( ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= RULE_INT ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'n_secs' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE ) )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:271:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= RULE_INT ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'n_secs' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            {
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:271:1: ( (this_WS_0= RULE_WS )? ( (lv_value_1_0= RULE_INT ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'n_secs' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:271:2: (this_WS_0= RULE_WS )? ( (lv_value_1_0= RULE_INT ) ) this_WS_2= RULE_WS ( (lv_name_3_0= 'n_secs' ) ) (this_WS_4= RULE_WS )? (this_SL_COMMENT_5= RULE_SL_COMMENT )? this_NEWLINE_6= RULE_NEWLINE
            {
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:271:2: (this_WS_0= RULE_WS )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_WS) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:271:3: this_WS_0= RULE_WS
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleiNodes563); 
                     
                        newLeafNode(this_WS_0, grammarAccess.getINodesAccess().getWSTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:275:3: ( (lv_value_1_0= RULE_INT ) )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:276:1: (lv_value_1_0= RULE_INT )
            {
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:276:1: (lv_value_1_0= RULE_INT )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:277:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleiNodes581); 

            			newLeafNode(lv_value_1_0, grammarAccess.getINodesAccess().getValueINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getINodesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"INT");
            	    

            }


            }

            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleiNodes597); 
             
                newLeafNode(this_WS_2, grammarAccess.getINodesAccess().getWSTerminalRuleCall_2()); 
                
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:297:1: ( (lv_name_3_0= 'n_secs' ) )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:298:1: (lv_name_3_0= 'n_secs' )
            {
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:298:1: (lv_name_3_0= 'n_secs' )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:299:3: lv_name_3_0= 'n_secs'
            {
            lv_name_3_0=(Token)match(input,10,FOLLOW_10_in_ruleiNodes614); 

                    newLeafNode(lv_name_3_0, grammarAccess.getINodesAccess().getNameN_secsKeyword_3_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getINodesRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_3_0, "n_secs");
            	    

            }


            }

            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:312:2: (this_WS_4= RULE_WS )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_WS) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:312:3: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleiNodes639); 
                     
                        newLeafNode(this_WS_4, grammarAccess.getINodesAccess().getWSTerminalRuleCall_4()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:316:3: (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_SL_COMMENT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:316:4: this_SL_COMMENT_5= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_5=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleiNodes652); 
                     
                        newLeafNode(this_SL_COMMENT_5, grammarAccess.getINodesAccess().getSL_COMMENTTerminalRuleCall_5()); 
                        

                    }
                    break;

            }

            this_NEWLINE_6=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_ruleiNodes664); 
             
                newLeafNode(this_NEWLINE_6, grammarAccess.getINodesAccess().getNEWLINETerminalRuleCall_6()); 
                

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
    // $ANTLR end "ruleiNodes"


    // $ANTLR start "entryRuleaSec"
    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:335:1: entryRuleaSec returns [EObject current=null] : iv_ruleaSec= ruleaSec EOF ;
    public final EObject entryRuleaSec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleaSec = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:339:2: (iv_ruleaSec= ruleaSec EOF )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:340:2: iv_ruleaSec= ruleaSec EOF
            {
             newCompositeNode(grammarAccess.getASecRule()); 
            pushFollow(FOLLOW_ruleaSec_in_entryRuleaSec709);
            iv_ruleaSec=ruleaSec();

            state._fsp--;

             current =iv_ruleaSec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleaSec719); 

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
    // $ANTLR end "entryRuleaSec"


    // $ANTLR start "ruleaSec"
    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:350:1: ruleaSec returns [EObject current=null] : ( (this_WS_0= RULE_WS )? otherlv_1= 'sec_loc' this_WS_2= RULE_WS otherlv_3= 'str_tw' this_WS_4= RULE_WS otherlv_5= 'tw_iner' this_WS_6= RULE_WS otherlv_7= 'mass_den' this_WS_8= RULE_WS otherlv_9= 'flp_iner' this_WS_10= RULE_WS otherlv_11= 'edge_iner' this_WS_12= RULE_WS otherlv_13= 'flp_stff' this_WS_14= RULE_WS otherlv_15= 'edge_stff' this_WS_16= RULE_WS otherlv_17= 'tor_stff' this_WS_18= RULE_WS otherlv_19= 'axial_stff' this_WS_20= RULE_WS otherlv_21= 'cg_offst' this_WS_22= RULE_WS otherlv_23= 'sc_offst' this_WS_24= RULE_WS otherlv_25= 'tc_offst' (this_WS_26= RULE_WS )? (this_SL_COMMENT_27= RULE_SL_COMMENT )? this_NEWLINE_28= RULE_NEWLINE (this_WS_29= RULE_WS )? otherlv_30= '(-)' this_WS_31= RULE_WS otherlv_32= '(deg)' this_WS_33= RULE_WS otherlv_34= '(deg)' this_WS_35= RULE_WS otherlv_36= '(kg/m)' this_WS_37= RULE_WS otherlv_38= '(kg-m)' this_WS_39= RULE_WS otherlv_40= '(kg-m)' this_WS_41= RULE_WS otherlv_42= '(Nm^2)' this_WS_43= RULE_WS otherlv_44= '(Nm^2)' this_WS_45= RULE_WS otherlv_46= '(Nm^2)' this_WS_47= RULE_WS otherlv_48= '(N)' this_WS_49= RULE_WS otherlv_50= '(m)' this_WS_51= RULE_WS otherlv_52= '(m)' this_WS_53= RULE_WS otherlv_54= '(m)' (this_WS_55= RULE_WS )? (this_SL_COMMENT_56= RULE_SL_COMMENT )? this_NEWLINE_57= RULE_NEWLINE ( (this_WS_58= RULE_WS )? ( (lv_sec_loc_59_0= ruletNUMBER ) ) this_WS_60= RULE_WS ( (lv_str_tw_61_0= ruletNUMBER ) ) this_WS_62= RULE_WS ( (lv_tw_iner_63_0= ruletNUMBER ) ) this_WS_64= RULE_WS ( (lv_mass_den_65_0= ruletNUMBER ) ) this_WS_66= RULE_WS ( (lv_flp_iner_67_0= ruletNUMBER ) ) this_WS_68= RULE_WS ( (lv_edge_iner_69_0= ruletNUMBER ) ) this_WS_70= RULE_WS ( (lv_flp_stff_71_0= ruletNUMBER ) ) this_WS_72= RULE_WS ( (lv_edge_stff_73_0= ruletNUMBER ) ) this_WS_74= RULE_WS ( (lv_tor_stff_75_0= ruletNUMBER ) ) this_WS_76= RULE_WS ( (lv_axial_stff_77_0= ruletNUMBER ) ) this_WS_78= RULE_WS ( (lv_cg_offst_79_0= ruletNUMBER ) ) this_WS_80= RULE_WS ( (lv_sc_offst_81_0= ruletNUMBER ) ) this_WS_82= RULE_WS ( (lv_tc_offst_83_0= ruletNUMBER ) ) (this_WS_84= RULE_WS )? (this_SL_COMMENT_85= RULE_SL_COMMENT )? this_NEWLINE_86= RULE_NEWLINE )+ ) ;
    public final EObject ruleaSec() throws RecognitionException {
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
        Token otherlv_21=null;
        Token this_WS_22=null;
        Token otherlv_23=null;
        Token this_WS_24=null;
        Token otherlv_25=null;
        Token this_WS_26=null;
        Token this_SL_COMMENT_27=null;
        Token this_NEWLINE_28=null;
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
        Token otherlv_44=null;
        Token this_WS_45=null;
        Token otherlv_46=null;
        Token this_WS_47=null;
        Token otherlv_48=null;
        Token this_WS_49=null;
        Token otherlv_50=null;
        Token this_WS_51=null;
        Token otherlv_52=null;
        Token this_WS_53=null;
        Token otherlv_54=null;
        Token this_WS_55=null;
        Token this_SL_COMMENT_56=null;
        Token this_NEWLINE_57=null;
        Token this_WS_58=null;
        Token this_WS_60=null;
        Token this_WS_62=null;
        Token this_WS_64=null;
        Token this_WS_66=null;
        Token this_WS_68=null;
        Token this_WS_70=null;
        Token this_WS_72=null;
        Token this_WS_74=null;
        Token this_WS_76=null;
        Token this_WS_78=null;
        Token this_WS_80=null;
        Token this_WS_82=null;
        Token this_WS_84=null;
        Token this_SL_COMMENT_85=null;
        Token this_NEWLINE_86=null;
        AntlrDatatypeRuleToken lv_sec_loc_59_0 = null;

        AntlrDatatypeRuleToken lv_str_tw_61_0 = null;

        AntlrDatatypeRuleToken lv_tw_iner_63_0 = null;

        AntlrDatatypeRuleToken lv_mass_den_65_0 = null;

        AntlrDatatypeRuleToken lv_flp_iner_67_0 = null;

        AntlrDatatypeRuleToken lv_edge_iner_69_0 = null;

        AntlrDatatypeRuleToken lv_flp_stff_71_0 = null;

        AntlrDatatypeRuleToken lv_edge_stff_73_0 = null;

        AntlrDatatypeRuleToken lv_tor_stff_75_0 = null;

        AntlrDatatypeRuleToken lv_axial_stff_77_0 = null;

        AntlrDatatypeRuleToken lv_cg_offst_79_0 = null;

        AntlrDatatypeRuleToken lv_sc_offst_81_0 = null;

        AntlrDatatypeRuleToken lv_tc_offst_83_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:354:28: ( ( (this_WS_0= RULE_WS )? otherlv_1= 'sec_loc' this_WS_2= RULE_WS otherlv_3= 'str_tw' this_WS_4= RULE_WS otherlv_5= 'tw_iner' this_WS_6= RULE_WS otherlv_7= 'mass_den' this_WS_8= RULE_WS otherlv_9= 'flp_iner' this_WS_10= RULE_WS otherlv_11= 'edge_iner' this_WS_12= RULE_WS otherlv_13= 'flp_stff' this_WS_14= RULE_WS otherlv_15= 'edge_stff' this_WS_16= RULE_WS otherlv_17= 'tor_stff' this_WS_18= RULE_WS otherlv_19= 'axial_stff' this_WS_20= RULE_WS otherlv_21= 'cg_offst' this_WS_22= RULE_WS otherlv_23= 'sc_offst' this_WS_24= RULE_WS otherlv_25= 'tc_offst' (this_WS_26= RULE_WS )? (this_SL_COMMENT_27= RULE_SL_COMMENT )? this_NEWLINE_28= RULE_NEWLINE (this_WS_29= RULE_WS )? otherlv_30= '(-)' this_WS_31= RULE_WS otherlv_32= '(deg)' this_WS_33= RULE_WS otherlv_34= '(deg)' this_WS_35= RULE_WS otherlv_36= '(kg/m)' this_WS_37= RULE_WS otherlv_38= '(kg-m)' this_WS_39= RULE_WS otherlv_40= '(kg-m)' this_WS_41= RULE_WS otherlv_42= '(Nm^2)' this_WS_43= RULE_WS otherlv_44= '(Nm^2)' this_WS_45= RULE_WS otherlv_46= '(Nm^2)' this_WS_47= RULE_WS otherlv_48= '(N)' this_WS_49= RULE_WS otherlv_50= '(m)' this_WS_51= RULE_WS otherlv_52= '(m)' this_WS_53= RULE_WS otherlv_54= '(m)' (this_WS_55= RULE_WS )? (this_SL_COMMENT_56= RULE_SL_COMMENT )? this_NEWLINE_57= RULE_NEWLINE ( (this_WS_58= RULE_WS )? ( (lv_sec_loc_59_0= ruletNUMBER ) ) this_WS_60= RULE_WS ( (lv_str_tw_61_0= ruletNUMBER ) ) this_WS_62= RULE_WS ( (lv_tw_iner_63_0= ruletNUMBER ) ) this_WS_64= RULE_WS ( (lv_mass_den_65_0= ruletNUMBER ) ) this_WS_66= RULE_WS ( (lv_flp_iner_67_0= ruletNUMBER ) ) this_WS_68= RULE_WS ( (lv_edge_iner_69_0= ruletNUMBER ) ) this_WS_70= RULE_WS ( (lv_flp_stff_71_0= ruletNUMBER ) ) this_WS_72= RULE_WS ( (lv_edge_stff_73_0= ruletNUMBER ) ) this_WS_74= RULE_WS ( (lv_tor_stff_75_0= ruletNUMBER ) ) this_WS_76= RULE_WS ( (lv_axial_stff_77_0= ruletNUMBER ) ) this_WS_78= RULE_WS ( (lv_cg_offst_79_0= ruletNUMBER ) ) this_WS_80= RULE_WS ( (lv_sc_offst_81_0= ruletNUMBER ) ) this_WS_82= RULE_WS ( (lv_tc_offst_83_0= ruletNUMBER ) ) (this_WS_84= RULE_WS )? (this_SL_COMMENT_85= RULE_SL_COMMENT )? this_NEWLINE_86= RULE_NEWLINE )+ ) )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:355:1: ( (this_WS_0= RULE_WS )? otherlv_1= 'sec_loc' this_WS_2= RULE_WS otherlv_3= 'str_tw' this_WS_4= RULE_WS otherlv_5= 'tw_iner' this_WS_6= RULE_WS otherlv_7= 'mass_den' this_WS_8= RULE_WS otherlv_9= 'flp_iner' this_WS_10= RULE_WS otherlv_11= 'edge_iner' this_WS_12= RULE_WS otherlv_13= 'flp_stff' this_WS_14= RULE_WS otherlv_15= 'edge_stff' this_WS_16= RULE_WS otherlv_17= 'tor_stff' this_WS_18= RULE_WS otherlv_19= 'axial_stff' this_WS_20= RULE_WS otherlv_21= 'cg_offst' this_WS_22= RULE_WS otherlv_23= 'sc_offst' this_WS_24= RULE_WS otherlv_25= 'tc_offst' (this_WS_26= RULE_WS )? (this_SL_COMMENT_27= RULE_SL_COMMENT )? this_NEWLINE_28= RULE_NEWLINE (this_WS_29= RULE_WS )? otherlv_30= '(-)' this_WS_31= RULE_WS otherlv_32= '(deg)' this_WS_33= RULE_WS otherlv_34= '(deg)' this_WS_35= RULE_WS otherlv_36= '(kg/m)' this_WS_37= RULE_WS otherlv_38= '(kg-m)' this_WS_39= RULE_WS otherlv_40= '(kg-m)' this_WS_41= RULE_WS otherlv_42= '(Nm^2)' this_WS_43= RULE_WS otherlv_44= '(Nm^2)' this_WS_45= RULE_WS otherlv_46= '(Nm^2)' this_WS_47= RULE_WS otherlv_48= '(N)' this_WS_49= RULE_WS otherlv_50= '(m)' this_WS_51= RULE_WS otherlv_52= '(m)' this_WS_53= RULE_WS otherlv_54= '(m)' (this_WS_55= RULE_WS )? (this_SL_COMMENT_56= RULE_SL_COMMENT )? this_NEWLINE_57= RULE_NEWLINE ( (this_WS_58= RULE_WS )? ( (lv_sec_loc_59_0= ruletNUMBER ) ) this_WS_60= RULE_WS ( (lv_str_tw_61_0= ruletNUMBER ) ) this_WS_62= RULE_WS ( (lv_tw_iner_63_0= ruletNUMBER ) ) this_WS_64= RULE_WS ( (lv_mass_den_65_0= ruletNUMBER ) ) this_WS_66= RULE_WS ( (lv_flp_iner_67_0= ruletNUMBER ) ) this_WS_68= RULE_WS ( (lv_edge_iner_69_0= ruletNUMBER ) ) this_WS_70= RULE_WS ( (lv_flp_stff_71_0= ruletNUMBER ) ) this_WS_72= RULE_WS ( (lv_edge_stff_73_0= ruletNUMBER ) ) this_WS_74= RULE_WS ( (lv_tor_stff_75_0= ruletNUMBER ) ) this_WS_76= RULE_WS ( (lv_axial_stff_77_0= ruletNUMBER ) ) this_WS_78= RULE_WS ( (lv_cg_offst_79_0= ruletNUMBER ) ) this_WS_80= RULE_WS ( (lv_sc_offst_81_0= ruletNUMBER ) ) this_WS_82= RULE_WS ( (lv_tc_offst_83_0= ruletNUMBER ) ) (this_WS_84= RULE_WS )? (this_SL_COMMENT_85= RULE_SL_COMMENT )? this_NEWLINE_86= RULE_NEWLINE )+ )
            {
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:355:1: ( (this_WS_0= RULE_WS )? otherlv_1= 'sec_loc' this_WS_2= RULE_WS otherlv_3= 'str_tw' this_WS_4= RULE_WS otherlv_5= 'tw_iner' this_WS_6= RULE_WS otherlv_7= 'mass_den' this_WS_8= RULE_WS otherlv_9= 'flp_iner' this_WS_10= RULE_WS otherlv_11= 'edge_iner' this_WS_12= RULE_WS otherlv_13= 'flp_stff' this_WS_14= RULE_WS otherlv_15= 'edge_stff' this_WS_16= RULE_WS otherlv_17= 'tor_stff' this_WS_18= RULE_WS otherlv_19= 'axial_stff' this_WS_20= RULE_WS otherlv_21= 'cg_offst' this_WS_22= RULE_WS otherlv_23= 'sc_offst' this_WS_24= RULE_WS otherlv_25= 'tc_offst' (this_WS_26= RULE_WS )? (this_SL_COMMENT_27= RULE_SL_COMMENT )? this_NEWLINE_28= RULE_NEWLINE (this_WS_29= RULE_WS )? otherlv_30= '(-)' this_WS_31= RULE_WS otherlv_32= '(deg)' this_WS_33= RULE_WS otherlv_34= '(deg)' this_WS_35= RULE_WS otherlv_36= '(kg/m)' this_WS_37= RULE_WS otherlv_38= '(kg-m)' this_WS_39= RULE_WS otherlv_40= '(kg-m)' this_WS_41= RULE_WS otherlv_42= '(Nm^2)' this_WS_43= RULE_WS otherlv_44= '(Nm^2)' this_WS_45= RULE_WS otherlv_46= '(Nm^2)' this_WS_47= RULE_WS otherlv_48= '(N)' this_WS_49= RULE_WS otherlv_50= '(m)' this_WS_51= RULE_WS otherlv_52= '(m)' this_WS_53= RULE_WS otherlv_54= '(m)' (this_WS_55= RULE_WS )? (this_SL_COMMENT_56= RULE_SL_COMMENT )? this_NEWLINE_57= RULE_NEWLINE ( (this_WS_58= RULE_WS )? ( (lv_sec_loc_59_0= ruletNUMBER ) ) this_WS_60= RULE_WS ( (lv_str_tw_61_0= ruletNUMBER ) ) this_WS_62= RULE_WS ( (lv_tw_iner_63_0= ruletNUMBER ) ) this_WS_64= RULE_WS ( (lv_mass_den_65_0= ruletNUMBER ) ) this_WS_66= RULE_WS ( (lv_flp_iner_67_0= ruletNUMBER ) ) this_WS_68= RULE_WS ( (lv_edge_iner_69_0= ruletNUMBER ) ) this_WS_70= RULE_WS ( (lv_flp_stff_71_0= ruletNUMBER ) ) this_WS_72= RULE_WS ( (lv_edge_stff_73_0= ruletNUMBER ) ) this_WS_74= RULE_WS ( (lv_tor_stff_75_0= ruletNUMBER ) ) this_WS_76= RULE_WS ( (lv_axial_stff_77_0= ruletNUMBER ) ) this_WS_78= RULE_WS ( (lv_cg_offst_79_0= ruletNUMBER ) ) this_WS_80= RULE_WS ( (lv_sc_offst_81_0= ruletNUMBER ) ) this_WS_82= RULE_WS ( (lv_tc_offst_83_0= ruletNUMBER ) ) (this_WS_84= RULE_WS )? (this_SL_COMMENT_85= RULE_SL_COMMENT )? this_NEWLINE_86= RULE_NEWLINE )+ )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:355:2: (this_WS_0= RULE_WS )? otherlv_1= 'sec_loc' this_WS_2= RULE_WS otherlv_3= 'str_tw' this_WS_4= RULE_WS otherlv_5= 'tw_iner' this_WS_6= RULE_WS otherlv_7= 'mass_den' this_WS_8= RULE_WS otherlv_9= 'flp_iner' this_WS_10= RULE_WS otherlv_11= 'edge_iner' this_WS_12= RULE_WS otherlv_13= 'flp_stff' this_WS_14= RULE_WS otherlv_15= 'edge_stff' this_WS_16= RULE_WS otherlv_17= 'tor_stff' this_WS_18= RULE_WS otherlv_19= 'axial_stff' this_WS_20= RULE_WS otherlv_21= 'cg_offst' this_WS_22= RULE_WS otherlv_23= 'sc_offst' this_WS_24= RULE_WS otherlv_25= 'tc_offst' (this_WS_26= RULE_WS )? (this_SL_COMMENT_27= RULE_SL_COMMENT )? this_NEWLINE_28= RULE_NEWLINE (this_WS_29= RULE_WS )? otherlv_30= '(-)' this_WS_31= RULE_WS otherlv_32= '(deg)' this_WS_33= RULE_WS otherlv_34= '(deg)' this_WS_35= RULE_WS otherlv_36= '(kg/m)' this_WS_37= RULE_WS otherlv_38= '(kg-m)' this_WS_39= RULE_WS otherlv_40= '(kg-m)' this_WS_41= RULE_WS otherlv_42= '(Nm^2)' this_WS_43= RULE_WS otherlv_44= '(Nm^2)' this_WS_45= RULE_WS otherlv_46= '(Nm^2)' this_WS_47= RULE_WS otherlv_48= '(N)' this_WS_49= RULE_WS otherlv_50= '(m)' this_WS_51= RULE_WS otherlv_52= '(m)' this_WS_53= RULE_WS otherlv_54= '(m)' (this_WS_55= RULE_WS )? (this_SL_COMMENT_56= RULE_SL_COMMENT )? this_NEWLINE_57= RULE_NEWLINE ( (this_WS_58= RULE_WS )? ( (lv_sec_loc_59_0= ruletNUMBER ) ) this_WS_60= RULE_WS ( (lv_str_tw_61_0= ruletNUMBER ) ) this_WS_62= RULE_WS ( (lv_tw_iner_63_0= ruletNUMBER ) ) this_WS_64= RULE_WS ( (lv_mass_den_65_0= ruletNUMBER ) ) this_WS_66= RULE_WS ( (lv_flp_iner_67_0= ruletNUMBER ) ) this_WS_68= RULE_WS ( (lv_edge_iner_69_0= ruletNUMBER ) ) this_WS_70= RULE_WS ( (lv_flp_stff_71_0= ruletNUMBER ) ) this_WS_72= RULE_WS ( (lv_edge_stff_73_0= ruletNUMBER ) ) this_WS_74= RULE_WS ( (lv_tor_stff_75_0= ruletNUMBER ) ) this_WS_76= RULE_WS ( (lv_axial_stff_77_0= ruletNUMBER ) ) this_WS_78= RULE_WS ( (lv_cg_offst_79_0= ruletNUMBER ) ) this_WS_80= RULE_WS ( (lv_sc_offst_81_0= ruletNUMBER ) ) this_WS_82= RULE_WS ( (lv_tc_offst_83_0= ruletNUMBER ) ) (this_WS_84= RULE_WS )? (this_SL_COMMENT_85= RULE_SL_COMMENT )? this_NEWLINE_86= RULE_NEWLINE )+
            {
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:355:2: (this_WS_0= RULE_WS )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_WS) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:355:3: this_WS_0= RULE_WS
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaSec760); 
                     
                        newLeafNode(this_WS_0, grammarAccess.getASecAccess().getWSTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleaSec773); 

                	newLeafNode(otherlv_1, grammarAccess.getASecAccess().getSec_locKeyword_1());
                
            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaSec784); 
             
                newLeafNode(this_WS_2, grammarAccess.getASecAccess().getWSTerminalRuleCall_2()); 
                
            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleaSec795); 

                	newLeafNode(otherlv_3, grammarAccess.getASecAccess().getStr_twKeyword_3());
                
            this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaSec806); 
             
                newLeafNode(this_WS_4, grammarAccess.getASecAccess().getWSTerminalRuleCall_4()); 
                
            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleaSec817); 

                	newLeafNode(otherlv_5, grammarAccess.getASecAccess().getTw_inerKeyword_5());
                
            this_WS_6=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaSec828); 
             
                newLeafNode(this_WS_6, grammarAccess.getASecAccess().getWSTerminalRuleCall_6()); 
                
            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleaSec839); 

                	newLeafNode(otherlv_7, grammarAccess.getASecAccess().getMass_denKeyword_7());
                
            this_WS_8=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaSec850); 
             
                newLeafNode(this_WS_8, grammarAccess.getASecAccess().getWSTerminalRuleCall_8()); 
                
            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleaSec861); 

                	newLeafNode(otherlv_9, grammarAccess.getASecAccess().getFlp_inerKeyword_9());
                
            this_WS_10=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaSec872); 
             
                newLeafNode(this_WS_10, grammarAccess.getASecAccess().getWSTerminalRuleCall_10()); 
                
            otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleaSec883); 

                	newLeafNode(otherlv_11, grammarAccess.getASecAccess().getEdge_inerKeyword_11());
                
            this_WS_12=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaSec894); 
             
                newLeafNode(this_WS_12, grammarAccess.getASecAccess().getWSTerminalRuleCall_12()); 
                
            otherlv_13=(Token)match(input,17,FOLLOW_17_in_ruleaSec905); 

                	newLeafNode(otherlv_13, grammarAccess.getASecAccess().getFlp_stffKeyword_13());
                
            this_WS_14=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaSec916); 
             
                newLeafNode(this_WS_14, grammarAccess.getASecAccess().getWSTerminalRuleCall_14()); 
                
            otherlv_15=(Token)match(input,18,FOLLOW_18_in_ruleaSec927); 

                	newLeafNode(otherlv_15, grammarAccess.getASecAccess().getEdge_stffKeyword_15());
                
            this_WS_16=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaSec938); 
             
                newLeafNode(this_WS_16, grammarAccess.getASecAccess().getWSTerminalRuleCall_16()); 
                
            otherlv_17=(Token)match(input,19,FOLLOW_19_in_ruleaSec949); 

                	newLeafNode(otherlv_17, grammarAccess.getASecAccess().getTor_stffKeyword_17());
                
            this_WS_18=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaSec960); 
             
                newLeafNode(this_WS_18, grammarAccess.getASecAccess().getWSTerminalRuleCall_18()); 
                
            otherlv_19=(Token)match(input,20,FOLLOW_20_in_ruleaSec971); 

                	newLeafNode(otherlv_19, grammarAccess.getASecAccess().getAxial_stffKeyword_19());
                
            this_WS_20=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaSec982); 
             
                newLeafNode(this_WS_20, grammarAccess.getASecAccess().getWSTerminalRuleCall_20()); 
                
            otherlv_21=(Token)match(input,21,FOLLOW_21_in_ruleaSec993); 

                	newLeafNode(otherlv_21, grammarAccess.getASecAccess().getCg_offstKeyword_21());
                
            this_WS_22=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaSec1004); 
             
                newLeafNode(this_WS_22, grammarAccess.getASecAccess().getWSTerminalRuleCall_22()); 
                
            otherlv_23=(Token)match(input,22,FOLLOW_22_in_ruleaSec1015); 

                	newLeafNode(otherlv_23, grammarAccess.getASecAccess().getSc_offstKeyword_23());
                
            this_WS_24=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaSec1026); 
             
                newLeafNode(this_WS_24, grammarAccess.getASecAccess().getWSTerminalRuleCall_24()); 
                
            otherlv_25=(Token)match(input,23,FOLLOW_23_in_ruleaSec1037); 

                	newLeafNode(otherlv_25, grammarAccess.getASecAccess().getTc_offstKeyword_25());
                
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:459:1: (this_WS_26= RULE_WS )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_WS) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:459:2: this_WS_26= RULE_WS
                    {
                    this_WS_26=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaSec1049); 
                     
                        newLeafNode(this_WS_26, grammarAccess.getASecAccess().getWSTerminalRuleCall_26()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:463:3: (this_SL_COMMENT_27= RULE_SL_COMMENT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_SL_COMMENT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:463:4: this_SL_COMMENT_27= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_27=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleaSec1062); 
                     
                        newLeafNode(this_SL_COMMENT_27, grammarAccess.getASecAccess().getSL_COMMENTTerminalRuleCall_27()); 
                        

                    }
                    break;

            }

            this_NEWLINE_28=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_ruleaSec1074); 
             
                newLeafNode(this_NEWLINE_28, grammarAccess.getASecAccess().getNEWLINETerminalRuleCall_28()); 
                
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:471:1: (this_WS_29= RULE_WS )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_WS) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:471:2: this_WS_29= RULE_WS
                    {
                    this_WS_29=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaSec1085); 
                     
                        newLeafNode(this_WS_29, grammarAccess.getASecAccess().getWSTerminalRuleCall_29()); 
                        

                    }
                    break;

            }

            otherlv_30=(Token)match(input,24,FOLLOW_24_in_ruleaSec1098); 

                	newLeafNode(otherlv_30, grammarAccess.getASecAccess().getLeftParenthesisHyphenMinusRightParenthesisKeyword_30());
                
            this_WS_31=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaSec1109); 
             
                newLeafNode(this_WS_31, grammarAccess.getASecAccess().getWSTerminalRuleCall_31()); 
                
            otherlv_32=(Token)match(input,25,FOLLOW_25_in_ruleaSec1120); 

                	newLeafNode(otherlv_32, grammarAccess.getASecAccess().getDegKeyword_32());
                
            this_WS_33=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaSec1131); 
             
                newLeafNode(this_WS_33, grammarAccess.getASecAccess().getWSTerminalRuleCall_33()); 
                
            otherlv_34=(Token)match(input,25,FOLLOW_25_in_ruleaSec1142); 

                	newLeafNode(otherlv_34, grammarAccess.getASecAccess().getDegKeyword_34());
                
            this_WS_35=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaSec1153); 
             
                newLeafNode(this_WS_35, grammarAccess.getASecAccess().getWSTerminalRuleCall_35()); 
                
            otherlv_36=(Token)match(input,26,FOLLOW_26_in_ruleaSec1164); 

                	newLeafNode(otherlv_36, grammarAccess.getASecAccess().getKgMKeyword_36());
                
            this_WS_37=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaSec1175); 
             
                newLeafNode(this_WS_37, grammarAccess.getASecAccess().getWSTerminalRuleCall_37()); 
                
            otherlv_38=(Token)match(input,27,FOLLOW_27_in_ruleaSec1186); 

                	newLeafNode(otherlv_38, grammarAccess.getASecAccess().getKgMKeyword_38());
                
            this_WS_39=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaSec1197); 
             
                newLeafNode(this_WS_39, grammarAccess.getASecAccess().getWSTerminalRuleCall_39()); 
                
            otherlv_40=(Token)match(input,27,FOLLOW_27_in_ruleaSec1208); 

                	newLeafNode(otherlv_40, grammarAccess.getASecAccess().getKgMKeyword_40());
                
            this_WS_41=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaSec1219); 
             
                newLeafNode(this_WS_41, grammarAccess.getASecAccess().getWSTerminalRuleCall_41()); 
                
            otherlv_42=(Token)match(input,28,FOLLOW_28_in_ruleaSec1230); 

                	newLeafNode(otherlv_42, grammarAccess.getASecAccess().getNm2Keyword_42());
                
            this_WS_43=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaSec1241); 
             
                newLeafNode(this_WS_43, grammarAccess.getASecAccess().getWSTerminalRuleCall_43()); 
                
            otherlv_44=(Token)match(input,28,FOLLOW_28_in_ruleaSec1252); 

                	newLeafNode(otherlv_44, grammarAccess.getASecAccess().getNm2Keyword_44());
                
            this_WS_45=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaSec1263); 
             
                newLeafNode(this_WS_45, grammarAccess.getASecAccess().getWSTerminalRuleCall_45()); 
                
            otherlv_46=(Token)match(input,28,FOLLOW_28_in_ruleaSec1274); 

                	newLeafNode(otherlv_46, grammarAccess.getASecAccess().getNm2Keyword_46());
                
            this_WS_47=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaSec1285); 
             
                newLeafNode(this_WS_47, grammarAccess.getASecAccess().getWSTerminalRuleCall_47()); 
                
            otherlv_48=(Token)match(input,29,FOLLOW_29_in_ruleaSec1296); 

                	newLeafNode(otherlv_48, grammarAccess.getASecAccess().getNKeyword_48());
                
            this_WS_49=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaSec1307); 
             
                newLeafNode(this_WS_49, grammarAccess.getASecAccess().getWSTerminalRuleCall_49()); 
                
            otherlv_50=(Token)match(input,30,FOLLOW_30_in_ruleaSec1318); 

                	newLeafNode(otherlv_50, grammarAccess.getASecAccess().getMKeyword_50());
                
            this_WS_51=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaSec1329); 
             
                newLeafNode(this_WS_51, grammarAccess.getASecAccess().getWSTerminalRuleCall_51()); 
                
            otherlv_52=(Token)match(input,30,FOLLOW_30_in_ruleaSec1340); 

                	newLeafNode(otherlv_52, grammarAccess.getASecAccess().getMKeyword_52());
                
            this_WS_53=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaSec1351); 
             
                newLeafNode(this_WS_53, grammarAccess.getASecAccess().getWSTerminalRuleCall_53()); 
                
            otherlv_54=(Token)match(input,30,FOLLOW_30_in_ruleaSec1362); 

                	newLeafNode(otherlv_54, grammarAccess.getASecAccess().getMKeyword_54());
                
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:575:1: (this_WS_55= RULE_WS )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_WS) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:575:2: this_WS_55= RULE_WS
                    {
                    this_WS_55=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaSec1374); 
                     
                        newLeafNode(this_WS_55, grammarAccess.getASecAccess().getWSTerminalRuleCall_55()); 
                        

                    }
                    break;

            }

            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:579:3: (this_SL_COMMENT_56= RULE_SL_COMMENT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_SL_COMMENT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:579:4: this_SL_COMMENT_56= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_56=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleaSec1387); 
                     
                        newLeafNode(this_SL_COMMENT_56, grammarAccess.getASecAccess().getSL_COMMENTTerminalRuleCall_56()); 
                        

                    }
                    break;

            }

            this_NEWLINE_57=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_ruleaSec1399); 
             
                newLeafNode(this_NEWLINE_57, grammarAccess.getASecAccess().getNEWLINETerminalRuleCall_57()); 
                
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:587:1: ( (this_WS_58= RULE_WS )? ( (lv_sec_loc_59_0= ruletNUMBER ) ) this_WS_60= RULE_WS ( (lv_str_tw_61_0= ruletNUMBER ) ) this_WS_62= RULE_WS ( (lv_tw_iner_63_0= ruletNUMBER ) ) this_WS_64= RULE_WS ( (lv_mass_den_65_0= ruletNUMBER ) ) this_WS_66= RULE_WS ( (lv_flp_iner_67_0= ruletNUMBER ) ) this_WS_68= RULE_WS ( (lv_edge_iner_69_0= ruletNUMBER ) ) this_WS_70= RULE_WS ( (lv_flp_stff_71_0= ruletNUMBER ) ) this_WS_72= RULE_WS ( (lv_edge_stff_73_0= ruletNUMBER ) ) this_WS_74= RULE_WS ( (lv_tor_stff_75_0= ruletNUMBER ) ) this_WS_76= RULE_WS ( (lv_axial_stff_77_0= ruletNUMBER ) ) this_WS_78= RULE_WS ( (lv_cg_offst_79_0= ruletNUMBER ) ) this_WS_80= RULE_WS ( (lv_sc_offst_81_0= ruletNUMBER ) ) this_WS_82= RULE_WS ( (lv_tc_offst_83_0= ruletNUMBER ) ) (this_WS_84= RULE_WS )? (this_SL_COMMENT_85= RULE_SL_COMMENT )? this_NEWLINE_86= RULE_NEWLINE )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_WS) ) {
                    int LA15_1 = input.LA(2);

                    if ( ((LA15_1>=RULE_INT && LA15_1<=RULE_NUMBER)) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>=RULE_INT && LA15_0<=RULE_NUMBER)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:587:2: (this_WS_58= RULE_WS )? ( (lv_sec_loc_59_0= ruletNUMBER ) ) this_WS_60= RULE_WS ( (lv_str_tw_61_0= ruletNUMBER ) ) this_WS_62= RULE_WS ( (lv_tw_iner_63_0= ruletNUMBER ) ) this_WS_64= RULE_WS ( (lv_mass_den_65_0= ruletNUMBER ) ) this_WS_66= RULE_WS ( (lv_flp_iner_67_0= ruletNUMBER ) ) this_WS_68= RULE_WS ( (lv_edge_iner_69_0= ruletNUMBER ) ) this_WS_70= RULE_WS ( (lv_flp_stff_71_0= ruletNUMBER ) ) this_WS_72= RULE_WS ( (lv_edge_stff_73_0= ruletNUMBER ) ) this_WS_74= RULE_WS ( (lv_tor_stff_75_0= ruletNUMBER ) ) this_WS_76= RULE_WS ( (lv_axial_stff_77_0= ruletNUMBER ) ) this_WS_78= RULE_WS ( (lv_cg_offst_79_0= ruletNUMBER ) ) this_WS_80= RULE_WS ( (lv_sc_offst_81_0= ruletNUMBER ) ) this_WS_82= RULE_WS ( (lv_tc_offst_83_0= ruletNUMBER ) ) (this_WS_84= RULE_WS )? (this_SL_COMMENT_85= RULE_SL_COMMENT )? this_NEWLINE_86= RULE_NEWLINE
            	    {
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:587:2: (this_WS_58= RULE_WS )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==RULE_WS) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:587:3: this_WS_58= RULE_WS
            	            {
            	            this_WS_58=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaSec1411); 
            	             
            	                newLeafNode(this_WS_58, grammarAccess.getASecAccess().getWSTerminalRuleCall_58_0()); 
            	                

            	            }
            	            break;

            	    }

            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:591:3: ( (lv_sec_loc_59_0= ruletNUMBER ) )
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:592:1: (lv_sec_loc_59_0= ruletNUMBER )
            	    {
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:592:1: (lv_sec_loc_59_0= ruletNUMBER )
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:593:3: lv_sec_loc_59_0= ruletNUMBER
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getASecAccess().getSec_locTNUMBERParserRuleCall_58_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruletNUMBER_in_ruleaSec1433);
            	    lv_sec_loc_59_0=ruletNUMBER();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getASecRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sec_loc",
            	            		lv_sec_loc_59_0, 
            	            		"tNUMBER");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    this_WS_60=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaSec1444); 
            	     
            	        newLeafNode(this_WS_60, grammarAccess.getASecAccess().getWSTerminalRuleCall_58_2()); 
            	        
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:613:1: ( (lv_str_tw_61_0= ruletNUMBER ) )
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:614:1: (lv_str_tw_61_0= ruletNUMBER )
            	    {
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:614:1: (lv_str_tw_61_0= ruletNUMBER )
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:615:3: lv_str_tw_61_0= ruletNUMBER
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getASecAccess().getStr_twTNUMBERParserRuleCall_58_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruletNUMBER_in_ruleaSec1464);
            	    lv_str_tw_61_0=ruletNUMBER();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getASecRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"str_tw",
            	            		lv_str_tw_61_0, 
            	            		"tNUMBER");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    this_WS_62=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaSec1475); 
            	     
            	        newLeafNode(this_WS_62, grammarAccess.getASecAccess().getWSTerminalRuleCall_58_4()); 
            	        
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:635:1: ( (lv_tw_iner_63_0= ruletNUMBER ) )
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:636:1: (lv_tw_iner_63_0= ruletNUMBER )
            	    {
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:636:1: (lv_tw_iner_63_0= ruletNUMBER )
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:637:3: lv_tw_iner_63_0= ruletNUMBER
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getASecAccess().getTw_inerTNUMBERParserRuleCall_58_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruletNUMBER_in_ruleaSec1495);
            	    lv_tw_iner_63_0=ruletNUMBER();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getASecRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"tw_iner",
            	            		lv_tw_iner_63_0, 
            	            		"tNUMBER");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    this_WS_64=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaSec1506); 
            	     
            	        newLeafNode(this_WS_64, grammarAccess.getASecAccess().getWSTerminalRuleCall_58_6()); 
            	        
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:657:1: ( (lv_mass_den_65_0= ruletNUMBER ) )
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:658:1: (lv_mass_den_65_0= ruletNUMBER )
            	    {
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:658:1: (lv_mass_den_65_0= ruletNUMBER )
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:659:3: lv_mass_den_65_0= ruletNUMBER
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getASecAccess().getMass_denTNUMBERParserRuleCall_58_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruletNUMBER_in_ruleaSec1526);
            	    lv_mass_den_65_0=ruletNUMBER();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getASecRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"mass_den",
            	            		lv_mass_den_65_0, 
            	            		"tNUMBER");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    this_WS_66=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaSec1537); 
            	     
            	        newLeafNode(this_WS_66, grammarAccess.getASecAccess().getWSTerminalRuleCall_58_8()); 
            	        
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:679:1: ( (lv_flp_iner_67_0= ruletNUMBER ) )
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:680:1: (lv_flp_iner_67_0= ruletNUMBER )
            	    {
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:680:1: (lv_flp_iner_67_0= ruletNUMBER )
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:681:3: lv_flp_iner_67_0= ruletNUMBER
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getASecAccess().getFlp_inerTNUMBERParserRuleCall_58_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruletNUMBER_in_ruleaSec1557);
            	    lv_flp_iner_67_0=ruletNUMBER();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getASecRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"flp_iner",
            	            		lv_flp_iner_67_0, 
            	            		"tNUMBER");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    this_WS_68=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaSec1568); 
            	     
            	        newLeafNode(this_WS_68, grammarAccess.getASecAccess().getWSTerminalRuleCall_58_10()); 
            	        
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:701:1: ( (lv_edge_iner_69_0= ruletNUMBER ) )
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:702:1: (lv_edge_iner_69_0= ruletNUMBER )
            	    {
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:702:1: (lv_edge_iner_69_0= ruletNUMBER )
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:703:3: lv_edge_iner_69_0= ruletNUMBER
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getASecAccess().getEdge_inerTNUMBERParserRuleCall_58_11_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruletNUMBER_in_ruleaSec1588);
            	    lv_edge_iner_69_0=ruletNUMBER();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getASecRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"edge_iner",
            	            		lv_edge_iner_69_0, 
            	            		"tNUMBER");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    this_WS_70=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaSec1599); 
            	     
            	        newLeafNode(this_WS_70, grammarAccess.getASecAccess().getWSTerminalRuleCall_58_12()); 
            	        
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:723:1: ( (lv_flp_stff_71_0= ruletNUMBER ) )
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:724:1: (lv_flp_stff_71_0= ruletNUMBER )
            	    {
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:724:1: (lv_flp_stff_71_0= ruletNUMBER )
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:725:3: lv_flp_stff_71_0= ruletNUMBER
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getASecAccess().getFlp_stffTNUMBERParserRuleCall_58_13_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruletNUMBER_in_ruleaSec1619);
            	    lv_flp_stff_71_0=ruletNUMBER();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getASecRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"flp_stff",
            	            		lv_flp_stff_71_0, 
            	            		"tNUMBER");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    this_WS_72=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaSec1630); 
            	     
            	        newLeafNode(this_WS_72, grammarAccess.getASecAccess().getWSTerminalRuleCall_58_14()); 
            	        
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:745:1: ( (lv_edge_stff_73_0= ruletNUMBER ) )
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:746:1: (lv_edge_stff_73_0= ruletNUMBER )
            	    {
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:746:1: (lv_edge_stff_73_0= ruletNUMBER )
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:747:3: lv_edge_stff_73_0= ruletNUMBER
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getASecAccess().getEdge_stffTNUMBERParserRuleCall_58_15_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruletNUMBER_in_ruleaSec1650);
            	    lv_edge_stff_73_0=ruletNUMBER();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getASecRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"edge_stff",
            	            		lv_edge_stff_73_0, 
            	            		"tNUMBER");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    this_WS_74=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaSec1661); 
            	     
            	        newLeafNode(this_WS_74, grammarAccess.getASecAccess().getWSTerminalRuleCall_58_16()); 
            	        
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:767:1: ( (lv_tor_stff_75_0= ruletNUMBER ) )
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:768:1: (lv_tor_stff_75_0= ruletNUMBER )
            	    {
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:768:1: (lv_tor_stff_75_0= ruletNUMBER )
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:769:3: lv_tor_stff_75_0= ruletNUMBER
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getASecAccess().getTor_stffTNUMBERParserRuleCall_58_17_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruletNUMBER_in_ruleaSec1681);
            	    lv_tor_stff_75_0=ruletNUMBER();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getASecRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"tor_stff",
            	            		lv_tor_stff_75_0, 
            	            		"tNUMBER");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    this_WS_76=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaSec1692); 
            	     
            	        newLeafNode(this_WS_76, grammarAccess.getASecAccess().getWSTerminalRuleCall_58_18()); 
            	        
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:789:1: ( (lv_axial_stff_77_0= ruletNUMBER ) )
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:790:1: (lv_axial_stff_77_0= ruletNUMBER )
            	    {
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:790:1: (lv_axial_stff_77_0= ruletNUMBER )
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:791:3: lv_axial_stff_77_0= ruletNUMBER
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getASecAccess().getAxial_stffTNUMBERParserRuleCall_58_19_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruletNUMBER_in_ruleaSec1712);
            	    lv_axial_stff_77_0=ruletNUMBER();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getASecRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"axial_stff",
            	            		lv_axial_stff_77_0, 
            	            		"tNUMBER");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    this_WS_78=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaSec1723); 
            	     
            	        newLeafNode(this_WS_78, grammarAccess.getASecAccess().getWSTerminalRuleCall_58_20()); 
            	        
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:811:1: ( (lv_cg_offst_79_0= ruletNUMBER ) )
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:812:1: (lv_cg_offst_79_0= ruletNUMBER )
            	    {
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:812:1: (lv_cg_offst_79_0= ruletNUMBER )
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:813:3: lv_cg_offst_79_0= ruletNUMBER
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getASecAccess().getCg_offstTNUMBERParserRuleCall_58_21_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruletNUMBER_in_ruleaSec1743);
            	    lv_cg_offst_79_0=ruletNUMBER();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getASecRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"cg_offst",
            	            		lv_cg_offst_79_0, 
            	            		"tNUMBER");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    this_WS_80=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaSec1754); 
            	     
            	        newLeafNode(this_WS_80, grammarAccess.getASecAccess().getWSTerminalRuleCall_58_22()); 
            	        
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:833:1: ( (lv_sc_offst_81_0= ruletNUMBER ) )
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:834:1: (lv_sc_offst_81_0= ruletNUMBER )
            	    {
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:834:1: (lv_sc_offst_81_0= ruletNUMBER )
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:835:3: lv_sc_offst_81_0= ruletNUMBER
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getASecAccess().getSc_offstTNUMBERParserRuleCall_58_23_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruletNUMBER_in_ruleaSec1774);
            	    lv_sc_offst_81_0=ruletNUMBER();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getASecRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sc_offst",
            	            		lv_sc_offst_81_0, 
            	            		"tNUMBER");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    this_WS_82=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaSec1785); 
            	     
            	        newLeafNode(this_WS_82, grammarAccess.getASecAccess().getWSTerminalRuleCall_58_24()); 
            	        
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:855:1: ( (lv_tc_offst_83_0= ruletNUMBER ) )
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:856:1: (lv_tc_offst_83_0= ruletNUMBER )
            	    {
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:856:1: (lv_tc_offst_83_0= ruletNUMBER )
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:857:3: lv_tc_offst_83_0= ruletNUMBER
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getASecAccess().getTc_offstTNUMBERParserRuleCall_58_25_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruletNUMBER_in_ruleaSec1805);
            	    lv_tc_offst_83_0=ruletNUMBER();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getASecRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"tc_offst",
            	            		lv_tc_offst_83_0, 
            	            		"tNUMBER");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:873:2: (this_WS_84= RULE_WS )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==RULE_WS) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:873:3: this_WS_84= RULE_WS
            	            {
            	            this_WS_84=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleaSec1817); 
            	             
            	                newLeafNode(this_WS_84, grammarAccess.getASecAccess().getWSTerminalRuleCall_58_26()); 
            	                

            	            }
            	            break;

            	    }

            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:877:3: (this_SL_COMMENT_85= RULE_SL_COMMENT )?
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==RULE_SL_COMMENT) ) {
            	        alt14=1;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:877:4: this_SL_COMMENT_85= RULE_SL_COMMENT
            	            {
            	            this_SL_COMMENT_85=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleaSec1830); 
            	             
            	                newLeafNode(this_SL_COMMENT_85, grammarAccess.getASecAccess().getSL_COMMENTTerminalRuleCall_58_27()); 
            	                

            	            }
            	            break;

            	    }

            	    this_NEWLINE_86=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_ruleaSec1842); 
            	     
            	        newLeafNode(this_NEWLINE_86, grammarAccess.getASecAccess().getNEWLINETerminalRuleCall_58_28()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
    // $ANTLR end "ruleaSec"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModelBmodestsp_in_entryRuleModelBmodestsp75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelBmodestsp85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader_in_ruleModelBmodestsp131 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_ruleiNodes_in_ruleModelBmodestsp152 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_ruleModelBmodestsp163 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_ruleaSec_in_ruleModelBmodestsp183 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleModelBmodestsp195 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_ruleModelBmodestsp211 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleModelBmodestsp227 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_ruletNUMBER_in_entryRuletNUMBER265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletNUMBER276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruletNUMBER316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruletNUMBER342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader_in_entryRuleHeader395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeader405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleHeader451 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_ruleHeader467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleiNodes_in_entryRuleiNodes512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleiNodes522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleiNodes563 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleiNodes581 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleiNodes597 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ruleiNodes614 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleiNodes639 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleiNodes652 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_ruleiNodes664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleaSec_in_entryRuleaSec709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleaSec719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaSec760 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleaSec773 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaSec784 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleaSec795 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaSec806 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleaSec817 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaSec828 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleaSec839 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaSec850 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleaSec861 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaSec872 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleaSec883 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaSec894 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleaSec905 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaSec916 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleaSec927 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaSec938 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleaSec949 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaSec960 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleaSec971 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaSec982 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleaSec993 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaSec1004 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleaSec1015 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaSec1026 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleaSec1037 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaSec1049 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleaSec1062 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_ruleaSec1074 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaSec1085 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleaSec1098 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaSec1109 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleaSec1120 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaSec1131 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleaSec1142 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaSec1153 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleaSec1164 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaSec1175 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleaSec1186 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaSec1197 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleaSec1208 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaSec1219 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleaSec1230 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaSec1241 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleaSec1252 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaSec1263 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleaSec1274 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaSec1285 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleaSec1296 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaSec1307 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleaSec1318 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaSec1329 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleaSec1340 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaSec1351 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleaSec1362 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaSec1374 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleaSec1387 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_ruleaSec1399 = new BitSet(new long[]{0x00000000000001A0L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaSec1411 = new BitSet(new long[]{0x00000000000001A0L});
    public static final BitSet FOLLOW_ruletNUMBER_in_ruleaSec1433 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaSec1444 = new BitSet(new long[]{0x00000000000001A0L});
    public static final BitSet FOLLOW_ruletNUMBER_in_ruleaSec1464 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaSec1475 = new BitSet(new long[]{0x00000000000001A0L});
    public static final BitSet FOLLOW_ruletNUMBER_in_ruleaSec1495 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaSec1506 = new BitSet(new long[]{0x00000000000001A0L});
    public static final BitSet FOLLOW_ruletNUMBER_in_ruleaSec1526 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaSec1537 = new BitSet(new long[]{0x00000000000001A0L});
    public static final BitSet FOLLOW_ruletNUMBER_in_ruleaSec1557 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaSec1568 = new BitSet(new long[]{0x00000000000001A0L});
    public static final BitSet FOLLOW_ruletNUMBER_in_ruleaSec1588 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaSec1599 = new BitSet(new long[]{0x00000000000001A0L});
    public static final BitSet FOLLOW_ruletNUMBER_in_ruleaSec1619 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaSec1630 = new BitSet(new long[]{0x00000000000001A0L});
    public static final BitSet FOLLOW_ruletNUMBER_in_ruleaSec1650 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaSec1661 = new BitSet(new long[]{0x00000000000001A0L});
    public static final BitSet FOLLOW_ruletNUMBER_in_ruleaSec1681 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaSec1692 = new BitSet(new long[]{0x00000000000001A0L});
    public static final BitSet FOLLOW_ruletNUMBER_in_ruleaSec1712 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaSec1723 = new BitSet(new long[]{0x00000000000001A0L});
    public static final BitSet FOLLOW_ruletNUMBER_in_ruleaSec1743 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaSec1754 = new BitSet(new long[]{0x00000000000001A0L});
    public static final BitSet FOLLOW_ruletNUMBER_in_ruleaSec1774 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaSec1785 = new BitSet(new long[]{0x00000000000001A0L});
    public static final BitSet FOLLOW_ruletNUMBER_in_ruleaSec1805 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleaSec1817 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleaSec1830 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_ruleaSec1842 = new BitSet(new long[]{0x00000000000001A2L});

}