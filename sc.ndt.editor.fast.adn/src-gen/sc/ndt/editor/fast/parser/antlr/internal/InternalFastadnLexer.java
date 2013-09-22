package sc.ndt.editor.fast.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFastadnLexer extends Lexer {
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
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_NUMBER=8;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=7;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int RULE_PRINT=10;
    public static final int T__41=41;
    public static final int RULE_NEWLINE=5;
    public static final int T__46=46;
    public static final int T__44=44;
    public static final int T__45=45;
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

    public InternalFastadnLexer() {;} 
    public InternalFastadnLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalFastadnLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:11:7: ( 'SI' )
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:11:9: 'SI'
            {
            match("SI"); 


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
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:12:7: ( 'SysUnits' )
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:12:9: 'SysUnits'
            {
            match("SysUnits"); 


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
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:13:7: ( 'BEDDOES' )
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:13:9: 'BEDDOES'
            {
            match("BEDDOES"); 


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
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:14:7: ( 'StallMod' )
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:14:9: 'StallMod'
            {
            match("StallMod"); 


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
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:15:7: ( 'NO_CM' )
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:15:9: 'NO_CM'
            {
            match("NO_CM"); 


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
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:16:7: ( 'USE_CM' )
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:16:9: 'USE_CM'
            {
            match("USE_CM"); 


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
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:17:7: ( 'UseCm' )
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:17:9: 'UseCm'
            {
            match("UseCm"); 


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
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:18:7: ( 'EQUIL' )
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:18:9: 'EQUIL'
            {
            match("EQUIL"); 


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
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:19:7: ( 'DYNIN' )
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:19:9: 'DYNIN'
            {
            match("DYNIN"); 


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
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:20:7: ( 'InfModel' )
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:20:9: 'InfModel'
            {
            match("InfModel"); 


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
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:21:7: ( 'SWIRL' )
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:21:9: 'SWIRL'
            {
            match("SWIRL"); 


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
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:22:7: ( 'IndModel' )
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:22:9: 'IndModel'
            {
            match("IndModel"); 


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
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:23:7: ( 'Atoler' )
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:23:9: 'Atoler'
            {
            match("Atoler"); 


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
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:24:7: ( 'AToler' )
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:24:9: 'AToler'
            {
            match("AToler"); 


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
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:25:7: ( 'PRANDtl' )
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:25:9: 'PRANDtl'
            {
            match("PRANDtl"); 


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
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:26:7: ( 'NONE' )
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:26:9: 'NONE'
            {
            match("NONE"); 


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
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:27:7: ( 'TLModel' )
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:27:9: 'TLModel'
            {
            match("TLModel"); 


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
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:28:7: ( 'HLModel' )
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:28:9: 'HLModel'
            {
            match("HLModel"); 


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
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:29:7: ( 'WindFile' )
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:29:9: 'WindFile'
            {
            match("WindFile"); 


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
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:30:7: ( 'HH' )
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:30:9: 'HH'
            {
            match("HH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:31:7: ( 'TwrShad' )
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:31:9: 'TwrShad'
            {
            match("TwrShad"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:32:7: ( 'ShadHWid' )
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:32:9: 'ShadHWid'
            {
            match("ShadHWid"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:33:7: ( 'T_Shad_Refpt' )
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:33:9: 'T_Shad_Refpt'
            {
            match("T_Shad_Refpt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:34:7: ( 'Rho' )
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:34:9: 'Rho'
            {
            match("Rho"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:35:7: ( 'AirDens' )
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:35:9: 'AirDens'
            {
            match("AirDens"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:36:7: ( 'KinVisc' )
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:36:9: 'KinVisc'
            {
            match("KinVisc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:37:7: ( 'DTAero' )
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:37:9: 'DTAero'
            {
            match("DTAero"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:38:7: ( 'NumFoil' )
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:38:9: 'NumFoil'
            {
            match("NumFoil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:39:7: ( 'FoilNm' )
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:39:9: 'FoilNm'
            {
            match("FoilNm"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:40:7: ( 'BldNodes' )
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:40:9: 'BldNodes'
            {
            match("BldNodes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:41:7: ( 'RNodes' )
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:41:9: 'RNodes'
            {
            match("RNodes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:42:7: ( 'AeroTwst' )
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:42:9: 'AeroTwst'
            {
            match("AeroTwst"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:43:7: ( 'DRNodes' )
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:43:9: 'DRNodes'
            {
            match("DRNodes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:44:7: ( 'Chord' )
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:44:9: 'Chord'
            {
            match("Chord"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:45:7: ( 'NFoil' )
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:45:9: 'NFoil'
            {
            match("NFoil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:46:7: ( 'PrnElm' )
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:46:9: 'PrnElm'
            {
            match("PrnElm"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2502:10: ( ( '0' .. '9' )+ )
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2502:12: ( '0' .. '9' )+
            {
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2502:12: ( '0' .. '9' )+
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
            	    // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2502:13: '0' .. '9'
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
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2504:13: ( ( ( '+' | '-' )? RULE_INT '.' ( RULE_INT )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? | ( '+' | '-' )? RULE_INT ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT | '.' RULE_INT ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? | '-' RULE_INT ) )
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2504:15: ( ( '+' | '-' )? RULE_INT '.' ( RULE_INT )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? | ( '+' | '-' )? RULE_INT ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT | '.' RULE_INT ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? | '-' RULE_INT )
            {
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2504:15: ( ( '+' | '-' )? RULE_INT '.' ( RULE_INT )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? | ( '+' | '-' )? RULE_INT ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT | '.' RULE_INT ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? | '-' RULE_INT )
            int alt10=4;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2504:16: ( '+' | '-' )? RULE_INT '.' ( RULE_INT )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )?
                    {
                    // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2504:16: ( '+' | '-' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='+'||LA2_0=='-') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:
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
                    // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2504:40: ( RULE_INT )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2504:40: RULE_INT
                            {
                            mRULE_INT(); 

                            }
                            break;

                    }

                    // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2504:50: ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='E'||LA5_0=='e') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2504:51: ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2504:61: ( '+' | '-' )?
                            int alt4=2;
                            int LA4_0 = input.LA(1);

                            if ( (LA4_0=='+'||LA4_0=='-') ) {
                                alt4=1;
                            }
                            switch (alt4) {
                                case 1 :
                                    // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:
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
                    // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2504:83: ( '+' | '-' )? RULE_INT ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT
                    {
                    // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2504:83: ( '+' | '-' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='+'||LA6_0=='-') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:
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

                    // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2504:113: ( '+' | '-' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='+'||LA7_0=='-') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:
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
                    // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2504:133: '.' RULE_INT ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )?
                    {
                    match('.'); 
                    mRULE_INT(); 
                    // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2504:146: ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='E'||LA9_0=='e') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2504:147: ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2504:157: ( '+' | '-' )?
                            int alt8=2;
                            int LA8_0 = input.LA(1);

                            if ( (LA8_0=='+'||LA8_0=='-') ) {
                                alt8=1;
                            }
                            switch (alt8) {
                                case 1 :
                                    // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:
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
                    // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2504:179: '-' RULE_INT
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

    // $ANTLR start "RULE_PRINT"
    public final void mRULE_PRINT() throws RecognitionException {
        try {
            int _type = RULE_PRINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2506:12: ( ( 'PRINT' | 'NOPRINT' ) )
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2506:14: ( 'PRINT' | 'NOPRINT' )
            {
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2506:14: ( 'PRINT' | 'NOPRINT' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='P') ) {
                alt11=1;
            }
            else if ( (LA11_0=='N') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2506:15: 'PRINT'
                    {
                    match("PRINT"); 


                    }
                    break;
                case 2 :
                    // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2506:23: 'NOPRINT'
                    {
                    match("NOPRINT"); 


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
    // $ANTLR end "RULE_PRINT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2508:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2508:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2508:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\"') ) {
                alt14=1;
            }
            else if ( (LA14_0=='\'') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2508:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2508:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='!')||(LA12_0>='#' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2508:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2508:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop12;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2508:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2508:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2508:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2508:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop13;
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
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2510:14: ( ( '\\r' | '\\n' | '\\r\\n' ) )
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2510:16: ( '\\r' | '\\n' | '\\r\\n' )
            {
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2510:16: ( '\\r' | '\\n' | '\\r\\n' )
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\r') ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1=='\n') ) {
                    alt15=3;
                }
                else {
                    alt15=1;}
            }
            else if ( (LA15_0=='\n') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2510:17: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 2 :
                    // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2510:22: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 3 :
                    // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2510:27: '\\r\\n'
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
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2512:17: ( '-' ~ ( '0' .. '9' ) (~ ( ( '\\r' | '\\n' | '\\r\\n' ) ) )* )
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2512:19: '-' ~ ( '0' .. '9' ) (~ ( ( '\\r' | '\\n' | '\\r\\n' ) ) )*
            {
            match('-'); 
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='/')||(input.LA(1)>=':' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2512:35: (~ ( ( '\\r' | '\\n' | '\\r\\n' ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\u0000' && LA16_0<='\t')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2512:35: ~ ( ( '\\r' | '\\n' | '\\r\\n' ) )
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
            	    break loop16;
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
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2514:9: ( ( ' ' | '\\t' )+ )
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2514:11: ( ' ' | '\\t' )+
            {
            // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:2514:11: ( ' ' | '\\t' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='\t'||LA17_0==' ') ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:
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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
        // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_INT | RULE_NUMBER | RULE_PRINT | RULE_STRING | RULE_NEWLINE | RULE_SL_COMMENT | RULE_WS )
        int alt18=43;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:226: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 38 :
                // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:235: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 39 :
                // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:247: RULE_PRINT
                {
                mRULE_PRINT(); 

                }
                break;
            case 40 :
                // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:258: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 41 :
                // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:270: RULE_NEWLINE
                {
                mRULE_NEWLINE(); 

                }
                break;
            case 42 :
                // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:283: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 43 :
                // ../sc.ndt.editor.fast.adn/src-gen/sc/ndt/editor/fast/parser/antlr/internal/InternalFastadn.g:1:299: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA10_eotS =
        "\5\uffff\1\10\3\uffff";
    static final String DFA10_eofS =
        "\11\uffff";
    static final String DFA10_minS =
        "\1\53\1\60\1\56\1\uffff\1\60\1\56\3\uffff";
    static final String DFA10_maxS =
        "\2\71\1\145\1\uffff\1\71\1\145\3\uffff";
    static final String DFA10_acceptS =
        "\3\uffff\1\3\2\uffff\1\1\1\2\1\4";
    static final String DFA10_specialS =
        "\11\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\4\1\uffff\1\1\1\3\1\uffff\12\2",
            "\12\5",
            "\1\6\1\uffff\12\2\13\uffff\1\7\37\uffff\1\7",
            "",
            "\12\2",
            "\1\6\1\uffff\12\5\13\uffff\1\7\37\uffff\1\7",
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
            return "2504:15: ( ( '+' | '-' )? RULE_INT '.' ( RULE_INT )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? | ( '+' | '-' )? RULE_INT ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT | '.' RULE_INT ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? | '-' RULE_INT )";
        }
    }
    static final String DFA18_eotS =
        "\21\uffff\1\64\52\uffff";
    static final String DFA18_eofS =
        "\74\uffff";
    static final String DFA18_minS =
        "\1\11\1\111\1\105\1\106\1\123\1\uffff\1\122\1\156\1\124\1\122\1"+
        "\114\1\110\1\uffff\1\116\3\uffff\1\56\1\0\13\uffff\1\116\7\uffff"+
        "\1\144\4\uffff\1\101\20\uffff";
    static final String DFA18_maxS =
        "\1\127\1\171\1\154\1\165\1\163\1\uffff\1\131\1\156\1\164\1\162\1"+
        "\167\1\114\1\uffff\1\150\3\uffff\1\145\1\uffff\13\uffff\1\137\7"+
        "\uffff\1\146\4\uffff\1\111\20\uffff";
    static final String DFA18_acceptS =
        "\5\uffff\1\10\6\uffff\1\23\1\uffff\1\32\1\35\1\42\2\uffff\1\46\1"+
        "\50\1\51\1\53\1\1\1\2\1\4\1\13\1\26\1\3\1\36\1\uffff\1\34\1\43\1"+
        "\6\1\7\1\11\1\33\1\41\1\uffff\1\15\1\16\1\31\1\40\1\uffff\1\44\1"+
        "\21\1\25\1\27\1\22\1\24\1\30\1\37\1\45\1\52\1\5\1\20\1\47\1\12\1"+
        "\14\1\17";
    static final String DFA18_specialS =
        "\22\uffff\1\0\51\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\26\1\25\2\uffff\1\25\22\uffff\1\26\1\uffff\1\24\4\uffff\1"+
            "\24\3\uffff\1\23\1\uffff\1\22\1\23\1\uffff\12\21\7\uffff\1\10"+
            "\1\2\1\20\1\6\1\5\1\17\1\uffff\1\13\1\7\1\uffff\1\16\2\uffff"+
            "\1\3\1\uffff\1\11\1\uffff\1\15\1\1\1\12\1\4\1\uffff\1\14",
            "\1\27\15\uffff\1\32\20\uffff\1\33\13\uffff\1\31\4\uffff\1\30",
            "\1\34\46\uffff\1\35",
            "\1\40\10\uffff\1\36\45\uffff\1\37",
            "\1\41\37\uffff\1\42",
            "",
            "\1\45\1\uffff\1\44\4\uffff\1\43",
            "\1\46",
            "\1\50\20\uffff\1\52\3\uffff\1\51\12\uffff\1\47",
            "\1\53\37\uffff\1\54",
            "\1\55\22\uffff\1\57\27\uffff\1\56",
            "\1\61\3\uffff\1\60",
            "",
            "\1\63\31\uffff\1\62",
            "",
            "",
            "",
            "\1\23\1\uffff\12\21\13\uffff\1\23\37\uffff\1\23",
            "\60\65\12\23\uffc6\65",
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
            "",
            "\1\67\1\uffff\1\70\16\uffff\1\66",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\72\1\uffff\1\71",
            "",
            "",
            "",
            "",
            "\1\73\7\uffff\1\70",
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
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_INT | RULE_NUMBER | RULE_PRINT | RULE_STRING | RULE_NEWLINE | RULE_SL_COMMENT | RULE_WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_18 = input.LA(1);

                        s = -1;
                        if ( ((LA18_18>='\u0000' && LA18_18<='/')||(LA18_18>=':' && LA18_18<='\uFFFF')) ) {s = 53;}

                        else if ( ((LA18_18>='0' && LA18_18<='9')) ) {s = 19;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}