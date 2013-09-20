package sc.ndt.editor.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import sc.ndt.editor.services.TurbsimtbsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTurbsimtbsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT"
    };
    public static final int RULE_INT=4;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalTurbsimtbsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTurbsimtbsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTurbsimtbsParser.tokenNames; }
    public String getGrammarFileName() { return "../sc.ndt.editor.turbsim.tbs/src-gen/sc/ndt/editor/parser/antlr/internal/InternalTurbsimtbs.g"; }



     	private TurbsimtbsGrammarAccess grammarAccess;
     	
        public InternalTurbsimtbsParser(TokenStream input, TurbsimtbsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected TurbsimtbsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../sc.ndt.editor.turbsim.tbs/src-gen/sc/ndt/editor/parser/antlr/internal/InternalTurbsimtbs.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../sc.ndt.editor.turbsim.tbs/src-gen/sc/ndt/editor/parser/antlr/internal/InternalTurbsimtbs.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../sc.ndt.editor.turbsim.tbs/src-gen/sc/ndt/editor/parser/antlr/internal/InternalTurbsimtbs.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../sc.ndt.editor.turbsim.tbs/src-gen/sc/ndt/editor/parser/antlr/internal/InternalTurbsimtbs.g:76:1: ruleModel returns [EObject current=null] : ( (lv_a_0_0= RULE_INT ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_a_0_0=null;

         enterRule(); 
            
        try {
            // ../sc.ndt.editor.turbsim.tbs/src-gen/sc/ndt/editor/parser/antlr/internal/InternalTurbsimtbs.g:79:28: ( ( (lv_a_0_0= RULE_INT ) ) )
            // ../sc.ndt.editor.turbsim.tbs/src-gen/sc/ndt/editor/parser/antlr/internal/InternalTurbsimtbs.g:80:1: ( (lv_a_0_0= RULE_INT ) )
            {
            // ../sc.ndt.editor.turbsim.tbs/src-gen/sc/ndt/editor/parser/antlr/internal/InternalTurbsimtbs.g:80:1: ( (lv_a_0_0= RULE_INT ) )
            // ../sc.ndt.editor.turbsim.tbs/src-gen/sc/ndt/editor/parser/antlr/internal/InternalTurbsimtbs.g:81:1: (lv_a_0_0= RULE_INT )
            {
            // ../sc.ndt.editor.turbsim.tbs/src-gen/sc/ndt/editor/parser/antlr/internal/InternalTurbsimtbs.g:81:1: (lv_a_0_0= RULE_INT )
            // ../sc.ndt.editor.turbsim.tbs/src-gen/sc/ndt/editor/parser/antlr/internal/InternalTurbsimtbs.g:82:3: lv_a_0_0= RULE_INT
            {
            lv_a_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleModel126); 

            			newLeafNode(lv_a_0_0, grammarAccess.getModelAccess().getAINTTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"a",
                    		lv_a_0_0, 
                    		"INT");
            	    

            }


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
    // $ANTLR end "ruleModel"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleModel126 = new BitSet(new long[]{0x0000000000000002L});

}