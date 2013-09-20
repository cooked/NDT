package sc.ndt.editor.iecwind.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIecwindiecLexer extends Lexer {
    public static final int RULE_CLASS=10;
    public static final int RULE_OUT=9;
    public static final int RULE_STRING=11;
    public static final int RULE_NEWLINE=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int RULE_NUMBER=8;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=7;
    public static final int RULE_WS=4;
    public static final int RULE_SL_COMMENT=6;
    public static final int EOF=-1;

    // delegates
    // delegators

    public InternalIecwindiecLexer() {;} 
    public InternalIecwindiecLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalIecwindiecLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:11:7: ( 'TRUE' )
            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:11:9: 'TRUE'
            {
            match("TRUE"); 


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
            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:12:7: ( 'True' )
            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:12:9: 'True'
            {
            match("True"); 


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
            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:13:7: ( 'true' )
            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:13:9: 'true'
            {
            match("true"); 


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
            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:14:7: ( 'FALSE' )
            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:14:9: 'FALSE'
            {
            match("FALSE"); 


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
            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:15:7: ( 'False' )
            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:15:9: 'False'
            {
            match("False"); 


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
            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:16:7: ( 'false' )
            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:16:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "RULE_OUT"
    public final void mRULE_OUT() throws RecognitionException {
        try {
            int _type = RULE_OUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3761:10: ( ( 'ECD' ( '-r' | '+r' ) ( ( '-' | '+' ) '2.0' )? | 'EWS' ( 'V' | 'H' ) ( '-' | '+' ) ( RULE_INT )+ ( '.' RULE_INT )? | 'EOG' ( 'i' | 'r' ( ( '-' | '+' ) '2.0' )? | 'o' ) | 'EDC' ( '-r' | '+r' ) ( ( '-' | '+' ) '2.0' )? | 'NWP' ( RULE_INT )+ ( '.' RULE_INT )? ) )
            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3761:12: ( 'ECD' ( '-r' | '+r' ) ( ( '-' | '+' ) '2.0' )? | 'EWS' ( 'V' | 'H' ) ( '-' | '+' ) ( RULE_INT )+ ( '.' RULE_INT )? | 'EOG' ( 'i' | 'r' ( ( '-' | '+' ) '2.0' )? | 'o' ) | 'EDC' ( '-r' | '+r' ) ( ( '-' | '+' ) '2.0' )? | 'NWP' ( RULE_INT )+ ( '.' RULE_INT )? )
            {
            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3761:12: ( 'ECD' ( '-r' | '+r' ) ( ( '-' | '+' ) '2.0' )? | 'EWS' ( 'V' | 'H' ) ( '-' | '+' ) ( RULE_INT )+ ( '.' RULE_INT )? | 'EOG' ( 'i' | 'r' ( ( '-' | '+' ) '2.0' )? | 'o' ) | 'EDC' ( '-r' | '+r' ) ( ( '-' | '+' ) '2.0' )? | 'NWP' ( RULE_INT )+ ( '.' RULE_INT )? )
            int alt11=5;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='E') ) {
                switch ( input.LA(2) ) {
                case 'C':
                    {
                    alt11=1;
                    }
                    break;
                case 'W':
                    {
                    alt11=2;
                    }
                    break;
                case 'O':
                    {
                    alt11=3;
                    }
                    break;
                case 'D':
                    {
                    alt11=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA11_0=='N') ) {
                alt11=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3761:13: 'ECD' ( '-r' | '+r' ) ( ( '-' | '+' ) '2.0' )?
                    {
                    match("ECD"); 

                    // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3761:19: ( '-r' | '+r' )
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0=='-') ) {
                        alt1=1;
                    }
                    else if ( (LA1_0=='+') ) {
                        alt1=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 0, input);

                        throw nvae;
                    }
                    switch (alt1) {
                        case 1 :
                            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3761:20: '-r'
                            {
                            match("-r"); 


                            }
                            break;
                        case 2 :
                            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3761:25: '+r'
                            {
                            match("+r"); 


                            }
                            break;

                    }

                    // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3761:31: ( ( '-' | '+' ) '2.0' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='+'||LA2_0=='-') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3761:32: ( '-' | '+' ) '2.0'
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            match("2.0"); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3761:50: 'EWS' ( 'V' | 'H' ) ( '-' | '+' ) ( RULE_INT )+ ( '.' RULE_INT )?
                    {
                    match("EWS"); 

                    if ( input.LA(1)=='H'||input.LA(1)=='V' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3761:76: ( RULE_INT )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3761:76: RULE_INT
                    	    {
                    	    mRULE_INT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);

                    // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3761:86: ( '.' RULE_INT )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='.') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3761:87: '.' RULE_INT
                            {
                            match('.'); 
                            mRULE_INT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3761:102: 'EOG' ( 'i' | 'r' ( ( '-' | '+' ) '2.0' )? | 'o' )
                    {
                    match("EOG"); 

                    // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3761:108: ( 'i' | 'r' ( ( '-' | '+' ) '2.0' )? | 'o' )
                    int alt6=3;
                    switch ( input.LA(1) ) {
                    case 'i':
                        {
                        alt6=1;
                        }
                        break;
                    case 'r':
                        {
                        alt6=2;
                        }
                        break;
                    case 'o':
                        {
                        alt6=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }

                    switch (alt6) {
                        case 1 :
                            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3761:109: 'i'
                            {
                            match('i'); 

                            }
                            break;
                        case 2 :
                            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3761:113: 'r' ( ( '-' | '+' ) '2.0' )?
                            {
                            match('r'); 
                            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3761:117: ( ( '-' | '+' ) '2.0' )?
                            int alt5=2;
                            int LA5_0 = input.LA(1);

                            if ( (LA5_0=='+'||LA5_0=='-') ) {
                                alt5=1;
                            }
                            switch (alt5) {
                                case 1 :
                                    // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3761:118: ( '-' | '+' ) '2.0'
                                    {
                                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                        input.consume();

                                    }
                                    else {
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;}

                                    match("2.0"); 


                                    }
                                    break;

                            }


                            }
                            break;
                        case 3 :
                            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3761:136: 'o'
                            {
                            match('o'); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3761:141: 'EDC' ( '-r' | '+r' ) ( ( '-' | '+' ) '2.0' )?
                    {
                    match("EDC"); 

                    // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3761:147: ( '-r' | '+r' )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='-') ) {
                        alt7=1;
                    }
                    else if ( (LA7_0=='+') ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3761:148: '-r'
                            {
                            match("-r"); 


                            }
                            break;
                        case 2 :
                            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3761:153: '+r'
                            {
                            match("+r"); 


                            }
                            break;

                    }

                    // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3761:159: ( ( '-' | '+' ) '2.0' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='+'||LA8_0=='-') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3761:160: ( '-' | '+' ) '2.0'
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            match("2.0"); 


                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3761:178: 'NWP' ( RULE_INT )+ ( '.' RULE_INT )?
                    {
                    match("NWP"); 

                    // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3761:184: ( RULE_INT )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3761:184: RULE_INT
                    	    {
                    	    mRULE_INT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);

                    // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3761:194: ( '.' RULE_INT )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='.') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3761:195: '.' RULE_INT
                            {
                            match('.'); 
                            mRULE_INT(); 

                            }
                            break;

                    }


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
    // $ANTLR end "RULE_OUT"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3763:10: ( ( '0' .. '9' )+ )
            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3763:12: ( '0' .. '9' )+
            {
            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3763:12: ( '0' .. '9' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3763:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3765:13: ( ( ( '+' | '-' )? RULE_INT '.' ( RULE_INT )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? | ( '+' | '-' )? RULE_INT ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT | '.' RULE_INT ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? | '-' RULE_INT ) )
            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3765:15: ( ( '+' | '-' )? RULE_INT '.' ( RULE_INT )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? | ( '+' | '-' )? RULE_INT ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT | '.' RULE_INT ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? | '-' RULE_INT )
            {
            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3765:15: ( ( '+' | '-' )? RULE_INT '.' ( RULE_INT )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? | ( '+' | '-' )? RULE_INT ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT | '.' RULE_INT ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? | '-' RULE_INT )
            int alt21=4;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3765:16: ( '+' | '-' )? RULE_INT '.' ( RULE_INT )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )?
                    {
                    // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3765:16: ( '+' | '-' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='+'||LA13_0=='-') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:
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
                    // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3765:40: ( RULE_INT )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3765:40: RULE_INT
                            {
                            mRULE_INT(); 

                            }
                            break;

                    }

                    // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3765:50: ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='E'||LA16_0=='e') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3765:51: ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3765:61: ( '+' | '-' )?
                            int alt15=2;
                            int LA15_0 = input.LA(1);

                            if ( (LA15_0=='+'||LA15_0=='-') ) {
                                alt15=1;
                            }
                            switch (alt15) {
                                case 1 :
                                    // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:
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
                    // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3765:83: ( '+' | '-' )? RULE_INT ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT
                    {
                    // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3765:83: ( '+' | '-' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='+'||LA17_0=='-') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:
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

                    // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3765:113: ( '+' | '-' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='+'||LA18_0=='-') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:
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
                    // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3765:133: '.' RULE_INT ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )?
                    {
                    match('.'); 
                    mRULE_INT(); 
                    // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3765:146: ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='E'||LA20_0=='e') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3765:147: ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3765:157: ( '+' | '-' )?
                            int alt19=2;
                            int LA19_0 = input.LA(1);

                            if ( (LA19_0=='+'||LA19_0=='-') ) {
                                alt19=1;
                            }
                            switch (alt19) {
                                case 1 :
                                    // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:
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
                    // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3765:179: '-' RULE_INT
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

    // $ANTLR start "RULE_CLASS"
    public final void mRULE_CLASS() throws RecognitionException {
        try {
            int _type = RULE_CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3767:12: ( ( 'A' | 'B' | 'C' ) )
            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3767:14: ( 'A' | 'B' | 'C' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='C') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CLASS"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3769:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3769:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3769:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='\"') ) {
                alt24=1;
            }
            else if ( (LA24_0=='\'') ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3769:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3769:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop22:
                    do {
                        int alt22=3;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0=='\\') ) {
                            alt22=1;
                        }
                        else if ( ((LA22_0>='\u0000' && LA22_0<='!')||(LA22_0>='#' && LA22_0<='[')||(LA22_0>=']' && LA22_0<='\uFFFF')) ) {
                            alt22=2;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3769:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3769:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop22;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3769:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3769:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop23:
                    do {
                        int alt23=3;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0=='\\') ) {
                            alt23=1;
                        }
                        else if ( ((LA23_0>='\u0000' && LA23_0<='&')||(LA23_0>='(' && LA23_0<='[')||(LA23_0>=']' && LA23_0<='\uFFFF')) ) {
                            alt23=2;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3769:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3769:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop23;
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

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3771:17: ( '!' (~ ( ( '\\r' | '\\n' | '\\r\\n' ) ) )* )
            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3771:19: '!' (~ ( ( '\\r' | '\\n' | '\\r\\n' ) ) )*
            {
            match('!'); 
            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3771:23: (~ ( ( '\\r' | '\\n' | '\\r\\n' ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='\u0000' && LA25_0<='\t')||(LA25_0>='\u000B' && LA25_0<='\f')||(LA25_0>='\u000E' && LA25_0<='\uFFFF')) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3771:23: ~ ( ( '\\r' | '\\n' | '\\r\\n' ) )
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
            	    break loop25;
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

    // $ANTLR start "RULE_NEWLINE"
    public final void mRULE_NEWLINE() throws RecognitionException {
        try {
            int _type = RULE_NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3773:14: ( ( '\\r' | '\\n' | '\\r\\n' ) )
            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3773:16: ( '\\r' | '\\n' | '\\r\\n' )
            {
            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3773:16: ( '\\r' | '\\n' | '\\r\\n' )
            int alt26=3;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='\r') ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1=='\n') ) {
                    alt26=3;
                }
                else {
                    alt26=1;}
            }
            else if ( (LA26_0=='\n') ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3773:17: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 2 :
                    // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3773:22: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 3 :
                    // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3773:27: '\\r\\n'
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3775:9: ( ( ' ' | '\\t' )+ )
            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3775:11: ( ' ' | '\\t' )+
            {
            // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:3775:11: ( ' ' | '\\t' )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0=='\t'||LA27_0==' ') ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:
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
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
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
        // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | RULE_OUT | RULE_INT | RULE_NUMBER | RULE_CLASS | RULE_STRING | RULE_SL_COMMENT | RULE_NEWLINE | RULE_WS )
        int alt28=14;
        alt28 = dfa28.predict(input);
        switch (alt28) {
            case 1 :
                // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:1:46: RULE_OUT
                {
                mRULE_OUT(); 

                }
                break;
            case 8 :
                // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:1:55: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 9 :
                // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:1:64: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 10 :
                // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:1:76: RULE_CLASS
                {
                mRULE_CLASS(); 

                }
                break;
            case 11 :
                // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:1:87: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 12 :
                // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:1:99: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 13 :
                // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:1:115: RULE_NEWLINE
                {
                mRULE_NEWLINE(); 

                }
                break;
            case 14 :
                // ../sc.ndt.editor.iecwind.iec.ui/src-gen/sc/ndt/editor/iecwind/ui/contentassist/antlr/internal/InternalIecwindiec.g:1:128: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA21 dfa21 = new DFA21(this);
    protected DFA28 dfa28 = new DFA28(this);
    static final String DFA21_eotS =
        "\5\uffff\1\10\3\uffff";
    static final String DFA21_eofS =
        "\11\uffff";
    static final String DFA21_minS =
        "\1\53\1\60\1\56\1\uffff\1\60\1\56\3\uffff";
    static final String DFA21_maxS =
        "\2\71\1\145\1\uffff\1\71\1\145\3\uffff";
    static final String DFA21_acceptS =
        "\3\uffff\1\3\2\uffff\1\2\1\1\1\4";
    static final String DFA21_specialS =
        "\11\uffff}>";
    static final String[] DFA21_transitionS = {
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

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "3765:15: ( ( '+' | '-' )? RULE_INT '.' ( RULE_INT )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? | ( '+' | '-' )? RULE_INT ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT | '.' RULE_INT ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? | '-' RULE_INT )";
        }
    }
    static final String DFA28_eotS =
        "\6\uffff\1\21\13\uffff";
    static final String DFA28_eofS =
        "\22\uffff";
    static final String DFA28_minS =
        "\1\11\1\122\1\uffff\1\101\2\uffff\1\56\13\uffff";
    static final String DFA28_maxS =
        "\1\164\1\162\1\uffff\1\141\2\uffff\1\145\13\uffff";
    static final String DFA28_acceptS =
        "\2\uffff\1\3\1\uffff\1\6\1\7\1\uffff\1\11\1\12\1\13\1\14\1\15\1"+
        "\16\1\1\1\2\1\4\1\5\1\10";
    static final String DFA28_specialS =
        "\22\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\14\1\13\2\uffff\1\13\22\uffff\1\14\1\12\1\11\4\uffff\1\11"+
            "\3\uffff\1\7\1\uffff\2\7\1\uffff\12\6\7\uffff\3\10\1\uffff\1"+
            "\5\1\3\7\uffff\1\5\5\uffff\1\1\21\uffff\1\4\15\uffff\1\2",
            "\1\15\37\uffff\1\16",
            "",
            "\1\17\37\uffff\1\20",
            "",
            "",
            "\1\7\1\uffff\12\6\13\uffff\1\7\37\uffff\1\7",
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
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | RULE_OUT | RULE_INT | RULE_NUMBER | RULE_CLASS | RULE_STRING | RULE_SL_COMMENT | RULE_NEWLINE | RULE_WS );";
        }
    }
 

}