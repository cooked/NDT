package sc.ndt.editor.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTurbsimtbsLexer extends Lexer {
    public static final int RULE_INT=4;
    public static final int EOF=-1;

    // delegates
    // delegators

    public InternalTurbsimtbsLexer() {;} 
    public InternalTurbsimtbsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalTurbsimtbsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../sc.ndt.editor.turbsim.tbs/src-gen/sc/ndt/editor/parser/antlr/internal/InternalTurbsimtbs.g"; }

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.turbsim.tbs/src-gen/sc/ndt/editor/parser/antlr/internal/InternalTurbsimtbs.g:105:10: ( ( '0' .. '9' )+ )
            // ../sc.ndt.editor.turbsim.tbs/src-gen/sc/ndt/editor/parser/antlr/internal/InternalTurbsimtbs.g:105:12: ( '0' .. '9' )+
            {
            // ../sc.ndt.editor.turbsim.tbs/src-gen/sc/ndt/editor/parser/antlr/internal/InternalTurbsimtbs.g:105:12: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../sc.ndt.editor.turbsim.tbs/src-gen/sc/ndt/editor/parser/antlr/internal/InternalTurbsimtbs.g:105:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    public void mTokens() throws RecognitionException {
        // ../sc.ndt.editor.turbsim.tbs/src-gen/sc/ndt/editor/parser/antlr/internal/InternalTurbsimtbs.g:1:8: ( RULE_INT )
        // ../sc.ndt.editor.turbsim.tbs/src-gen/sc/ndt/editor/parser/antlr/internal/InternalTurbsimtbs.g:1:10: RULE_INT
        {
        mRULE_INT(); 

        }


    }


 

}