package sc.ndt.editor.bmodes.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBmodestspLexer extends Lexer {
    public static final int RULE_NEWLINE=4;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=6;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__10=10;
    public static final int RULE_WS=5;
    public static final int RULE_NUMBER=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalBmodestspLexer() {;} 
    public InternalBmodestspLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalBmodestspLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g"; }

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:11:7: ( 'n_secs' )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:11:9: 'n_secs'
            {
            match("n_secs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:12:7: ( 'sec_loc' )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:12:9: 'sec_loc'
            {
            match("sec_loc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:13:7: ( 'str_tw' )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:13:9: 'str_tw'
            {
            match("str_tw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:14:7: ( 'tw_iner' )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:14:9: 'tw_iner'
            {
            match("tw_iner"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:15:7: ( 'mass_den' )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:15:9: 'mass_den'
            {
            match("mass_den"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:16:7: ( 'flp_iner' )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:16:9: 'flp_iner'
            {
            match("flp_iner"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:17:7: ( 'edge_iner' )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:17:9: 'edge_iner'
            {
            match("edge_iner"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:18:7: ( 'flp_stff' )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:18:9: 'flp_stff'
            {
            match("flp_stff"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:19:7: ( 'edge_stff' )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:19:9: 'edge_stff'
            {
            match("edge_stff"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:20:7: ( 'tor_stff' )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:20:9: 'tor_stff'
            {
            match("tor_stff"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:21:7: ( 'axial_stff' )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:21:9: 'axial_stff'
            {
            match("axial_stff"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:22:7: ( 'cg_offst' )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:22:9: 'cg_offst'
            {
            match("cg_offst"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:23:7: ( 'sc_offst' )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:23:9: 'sc_offst'
            {
            match("sc_offst"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:24:7: ( 'tc_offst' )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:24:9: 'tc_offst'
            {
            match("tc_offst"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:25:7: ( '(-)' )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:25:9: '(-)'
            {
            match("(-)"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:26:7: ( '(deg)' )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:26:9: '(deg)'
            {
            match("(deg)"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:27:7: ( '(kg/m)' )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:27:9: '(kg/m)'
            {
            match("(kg/m)"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:28:7: ( '(kg-m)' )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:28:9: '(kg-m)'
            {
            match("(kg-m)"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:29:7: ( '(Nm^2)' )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:29:9: '(Nm^2)'
            {
            match("(Nm^2)"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:30:7: ( '(N)' )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:30:9: '(N)'
            {
            match("(N)"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:31:7: ( '(m)' )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:31:9: '(m)'
            {
            match("(m)"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:895:10: ( ( '0' .. '9' )+ )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:895:12: ( '0' .. '9' )+
            {
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:895:12: ( '0' .. '9' )+
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
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:895:13: '0' .. '9'
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

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:897:13: ( ( ( '+' | '-' )? RULE_INT '.' ( RULE_INT )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? | ( '+' | '-' )? RULE_INT ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT | '.' RULE_INT ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? | '-' RULE_INT ) )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:897:15: ( ( '+' | '-' )? RULE_INT '.' ( RULE_INT )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? | ( '+' | '-' )? RULE_INT ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT | '.' RULE_INT ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? | '-' RULE_INT )
            {
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:897:15: ( ( '+' | '-' )? RULE_INT '.' ( RULE_INT )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? | ( '+' | '-' )? RULE_INT ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT | '.' RULE_INT ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? | '-' RULE_INT )
            int alt10=4;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:897:16: ( '+' | '-' )? RULE_INT '.' ( RULE_INT )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )?
                    {
                    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:897:16: ( '+' | '-' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='+'||LA2_0=='-') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_INT(); 
                    match('.'); 
                    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:897:40: ( RULE_INT )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:897:40: RULE_INT
                            {
                            mRULE_INT(); 

                            }
                            break;

                    }

                    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:897:50: ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='E'||LA5_0=='e') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:897:51: ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:897:61: ( '+' | '-' )?
                            int alt4=2;
                            int LA4_0 = input.LA(1);

                            if ( (LA4_0=='+'||LA4_0=='-') ) {
                                alt4=1;
                            }
                            switch (alt4) {
                                case 1 :
                                    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:
                                    {
                                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                        input.consume();

                                    }
                                    else {
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;}


                                    }
                                    break;

                            }

                            mRULE_INT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:897:83: ( '+' | '-' )? RULE_INT ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT
                    {
                    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:897:83: ( '+' | '-' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='+'||LA6_0=='-') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_INT(); 
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:897:113: ( '+' | '-' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='+'||LA7_0=='-') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_INT(); 

                    }
                    break;
                case 3 :
                    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:897:133: '.' RULE_INT ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )?
                    {
                    match('.'); 
                    mRULE_INT(); 
                    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:897:146: ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='E'||LA9_0=='e') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:897:147: ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:897:157: ( '+' | '-' )?
                            int alt8=2;
                            int LA8_0 = input.LA(1);

                            if ( (LA8_0=='+'||LA8_0=='-') ) {
                                alt8=1;
                            }
                            switch (alt8) {
                                case 1 :
                                    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:
                                    {
                                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                        input.consume();

                                    }
                                    else {
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;}


                                    }
                                    break;

                            }

                            mRULE_INT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:897:179: '-' RULE_INT
                    {
                    match('-'); 
                    mRULE_INT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:899:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:899:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:899:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\"') ) {
                alt13=1;
            }
            else if ( (LA13_0=='\'') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:899:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:899:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:899:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:899:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:899:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:899:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:899:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:899:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_NEWLINE"
    public final void mRULE_NEWLINE() throws RecognitionException {
        try {
            int _type = RULE_NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:901:14: ( ( '\\r' | '\\n' | '\\r\\n' ) )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:901:16: ( '\\r' | '\\n' | '\\r\\n' )
            {
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:901:16: ( '\\r' | '\\n' | '\\r\\n' )
            int alt14=3;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\r') ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1=='\n') ) {
                    alt14=3;
                }
                else {
                    alt14=1;}
            }
            else if ( (LA14_0=='\n') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:901:17: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 2 :
                    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:901:22: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 3 :
                    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:901:27: '\\r\\n'
                    {
                    match("\r\n"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NEWLINE"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:903:17: ( '-' ~ ( '0' .. '9' ) (~ ( ( '\\r' | '\\n' | '\\r\\n' ) ) )* )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:903:19: '-' ~ ( '0' .. '9' ) (~ ( ( '\\r' | '\\n' | '\\r\\n' ) ) )*
            {
            match('-'); 
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='/')||(input.LA(1)>=':' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:903:35: (~ ( ( '\\r' | '\\n' | '\\r\\n' ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:903:35: ~ ( ( '\\r' | '\\n' | '\\r\\n' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:905:9: ( ( ' ' | '\\t' )+ )
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:905:11: ( ' ' | '\\t' )+
            {
            // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:905:11: ( ' ' | '\\t' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='\t'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | RULE_INT | RULE_NUMBER | RULE_STRING | RULE_NEWLINE | RULE_SL_COMMENT | RULE_WS )
        int alt17=27;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:1:10: T__10
                {
                mT__10(); 

                }
                break;
            case 2 :
                // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:1:16: T__11
                {
                mT__11(); 

                }
                break;
            case 3 :
                // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:1:22: T__12
                {
                mT__12(); 

                }
                break;
            case 4 :
                // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:1:28: T__13
                {
                mT__13(); 

                }
                break;
            case 5 :
                // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:1:34: T__14
                {
                mT__14(); 

                }
                break;
            case 6 :
                // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:1:40: T__15
                {
                mT__15(); 

                }
                break;
            case 7 :
                // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:1:46: T__16
                {
                mT__16(); 

                }
                break;
            case 8 :
                // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:1:52: T__17
                {
                mT__17(); 

                }
                break;
            case 9 :
                // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:1:58: T__18
                {
                mT__18(); 

                }
                break;
            case 10 :
                // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:1:64: T__19
                {
                mT__19(); 

                }
                break;
            case 11 :
                // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:1:70: T__20
                {
                mT__20(); 

                }
                break;
            case 12 :
                // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:1:76: T__21
                {
                mT__21(); 

                }
                break;
            case 13 :
                // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:1:82: T__22
                {
                mT__22(); 

                }
                break;
            case 14 :
                // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:1:88: T__23
                {
                mT__23(); 

                }
                break;
            case 15 :
                // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:1:94: T__24
                {
                mT__24(); 

                }
                break;
            case 16 :
                // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:1:100: T__25
                {
                mT__25(); 

                }
                break;
            case 17 :
                // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:1:106: T__26
                {
                mT__26(); 

                }
                break;
            case 18 :
                // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:1:112: T__27
                {
                mT__27(); 

                }
                break;
            case 19 :
                // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:1:118: T__28
                {
                mT__28(); 

                }
                break;
            case 20 :
                // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:1:124: T__29
                {
                mT__29(); 

                }
                break;
            case 21 :
                // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:1:130: T__30
                {
                mT__30(); 

                }
                break;
            case 22 :
                // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:1:136: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 23 :
                // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:1:145: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 24 :
                // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:1:157: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 25 :
                // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:1:169: RULE_NEWLINE
                {
                mRULE_NEWLINE(); 

                }
                break;
            case 26 :
                // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:1:182: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 27 :
                // ../sc.ndt.editor.bmodes.tsp/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodestsp.g:1:198: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA10_eotS =
        "\5\uffff\1\10\3\uffff";
    static final String DFA10_eofS =
        "\11\uffff";
    static final String DFA10_minS =
        "\1\53\1\60\1\56\1\uffff\1\60\1\56\3\uffff";
    static final String DFA10_maxS =
        "\2\71\1\145\1\uffff\1\71\1\145\3\uffff";
    static final String DFA10_acceptS =
        "\3\uffff\1\3\2\uffff\1\2\1\1\1\4";
    static final String DFA10_specialS =
        "\11\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\4\1\uffff\1\1\1\3\1\uffff\12\2",
            "\12\5",
            "\1\7\1\uffff\12\2\13\uffff\1\6\37\uffff\1\6",
            "",
            "\12\2",
            "\1\7\1\uffff\12\5\13\uffff\1\6\37\uffff\1\6",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "897:15: ( ( '+' | '-' )? RULE_INT '.' ( RULE_INT )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? | ( '+' | '-' )? RULE_INT ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT | '.' RULE_INT ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? | '-' RULE_INT )";
        }
    }
    static final String DFA17_eotS =
        "\12\uffff\1\35\42\uffff";
    static final String DFA17_eofS =
        "\55\uffff";
    static final String DFA17_minS =
        "\1\11\1\uffff\2\143\1\uffff\1\154\1\144\2\uffff\1\55\1\56\1\0\12\uffff\1\160\1\147\2\uffff\1\147\1\51\3\uffff\1\137\1\145\1\55\2\uffff\1\151\1\137\4\uffff\1\151\2\uffff";
    static final String DFA17_maxS =
        "\1\164\1\uffff\1\164\1\167\1\uffff\1\154\1\144\2\uffff\1\155\1\145\1\uffff\12\uffff\1\160\1\147\2\uffff\1\147\1\155\3\uffff\1\137\1\145\1\57\2\uffff\1\163\1\137\4\uffff\1\163\2\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\1\2\uffff\1\5\2\uffff\1\13\1\14\3\uffff\1\27\1\30\1\31\1\33\1\2\1\3\1\15\1\4\1\12\1\16\2\uffff\1\17\1\20\2\uffff\1\25\1\26\1\32\3\uffff\1\23\1\24\2\uffff\1\21\1\22\1\6\1\10\1\uffff\1\7\1\11";
    static final String DFA17_specialS =
        "\13\uffff\1\0\41\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\17\1\16\2\uffff\1\16\22\uffff\1\17\1\uffff\1\15\4\uffff\1\15\1\11\2\uffff\1\14\1\uffff\1\13\1\14\1\uffff\12\12\47\uffff\1\7\1\uffff\1\10\1\uffff\1\6\1\5\6\uffff\1\4\1\1\4\uffff\1\2\1\3",
            "",
            "\1\22\1\uffff\1\20\16\uffff\1\21",
            "\1\25\13\uffff\1\24\7\uffff\1\23",
            "",
            "\1\26",
            "\1\27",
            "",
            "",
            "\1\30\40\uffff\1\33\25\uffff\1\31\6\uffff\1\32\1\uffff\1\34",
            "\1\14\1\uffff\12\12\13\uffff\1\14\37\uffff\1\14",
            "\60\36\12\14\uffc6\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\37",
            "\1\40",
            "",
            "",
            "\1\41",
            "\1\43\103\uffff\1\42",
            "",
            "",
            "",
            "\1\44",
            "\1\45",
            "\1\47\1\uffff\1\46",
            "",
            "",
            "\1\50\11\uffff\1\51",
            "\1\52",
            "",
            "",
            "",
            "",
            "\1\53\11\uffff\1\54",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | RULE_INT | RULE_NUMBER | RULE_STRING | RULE_NEWLINE | RULE_SL_COMMENT | RULE_WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_11 = input.LA(1);

                        s = -1;
                        if ( ((LA17_11>='\u0000' && LA17_11<='/')||(LA17_11>=':' && LA17_11<='\uFFFF')) ) {s = 30;}

                        else if ( ((LA17_11>='0' && LA17_11<='9')) ) {s = 12;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}