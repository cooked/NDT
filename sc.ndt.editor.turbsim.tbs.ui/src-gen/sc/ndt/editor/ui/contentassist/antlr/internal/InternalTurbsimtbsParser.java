package sc.ndt.editor.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import sc.ndt.editor.services.TurbsimtbsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTurbsimtbsParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../sc.ndt.editor.turbsim.tbs.ui/src-gen/sc/ndt/editor/ui/contentassist/antlr/internal/InternalTurbsimtbs.g"; }


     
     	private TurbsimtbsGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(TurbsimtbsGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../sc.ndt.editor.turbsim.tbs.ui/src-gen/sc/ndt/editor/ui/contentassist/antlr/internal/InternalTurbsimtbs.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../sc.ndt.editor.turbsim.tbs.ui/src-gen/sc/ndt/editor/ui/contentassist/antlr/internal/InternalTurbsimtbs.g:61:1: ( ruleModel EOF )
            // ../sc.ndt.editor.turbsim.tbs.ui/src-gen/sc/ndt/editor/ui/contentassist/antlr/internal/InternalTurbsimtbs.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../sc.ndt.editor.turbsim.tbs.ui/src-gen/sc/ndt/editor/ui/contentassist/antlr/internal/InternalTurbsimtbs.g:69:1: ruleModel : ( ( rule__Model__AAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sc.ndt.editor.turbsim.tbs.ui/src-gen/sc/ndt/editor/ui/contentassist/antlr/internal/InternalTurbsimtbs.g:73:2: ( ( ( rule__Model__AAssignment ) ) )
            // ../sc.ndt.editor.turbsim.tbs.ui/src-gen/sc/ndt/editor/ui/contentassist/antlr/internal/InternalTurbsimtbs.g:74:1: ( ( rule__Model__AAssignment ) )
            {
            // ../sc.ndt.editor.turbsim.tbs.ui/src-gen/sc/ndt/editor/ui/contentassist/antlr/internal/InternalTurbsimtbs.g:74:1: ( ( rule__Model__AAssignment ) )
            // ../sc.ndt.editor.turbsim.tbs.ui/src-gen/sc/ndt/editor/ui/contentassist/antlr/internal/InternalTurbsimtbs.g:75:1: ( rule__Model__AAssignment )
            {
             before(grammarAccess.getModelAccess().getAAssignment()); 
            // ../sc.ndt.editor.turbsim.tbs.ui/src-gen/sc/ndt/editor/ui/contentassist/antlr/internal/InternalTurbsimtbs.g:76:1: ( rule__Model__AAssignment )
            // ../sc.ndt.editor.turbsim.tbs.ui/src-gen/sc/ndt/editor/ui/contentassist/antlr/internal/InternalTurbsimtbs.g:76:2: rule__Model__AAssignment
            {
            pushFollow(FOLLOW_rule__Model__AAssignment_in_ruleModel94);
            rule__Model__AAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getAAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "rule__Model__AAssignment"
    // ../sc.ndt.editor.turbsim.tbs.ui/src-gen/sc/ndt/editor/ui/contentassist/antlr/internal/InternalTurbsimtbs.g:91:1: rule__Model__AAssignment : ( RULE_INT ) ;
    public final void rule__Model__AAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sc.ndt.editor.turbsim.tbs.ui/src-gen/sc/ndt/editor/ui/contentassist/antlr/internal/InternalTurbsimtbs.g:95:1: ( ( RULE_INT ) )
            // ../sc.ndt.editor.turbsim.tbs.ui/src-gen/sc/ndt/editor/ui/contentassist/antlr/internal/InternalTurbsimtbs.g:96:1: ( RULE_INT )
            {
            // ../sc.ndt.editor.turbsim.tbs.ui/src-gen/sc/ndt/editor/ui/contentassist/antlr/internal/InternalTurbsimtbs.g:96:1: ( RULE_INT )
            // ../sc.ndt.editor.turbsim.tbs.ui/src-gen/sc/ndt/editor/ui/contentassist/antlr/internal/InternalTurbsimtbs.g:97:1: RULE_INT
            {
             before(grammarAccess.getModelAccess().getAINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Model__AAssignment133); 
             after(grammarAccess.getModelAccess().getAINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__AAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__AAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Model__AAssignment133 = new BitSet(new long[]{0x0000000000000002L});

}