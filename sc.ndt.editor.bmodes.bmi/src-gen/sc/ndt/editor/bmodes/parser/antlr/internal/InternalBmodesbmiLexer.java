package sc.ndt.editor.bmodes.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBmodesbmiLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__10=10;
    public static final int T__54=54;
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
    public static final int RULE_NEWLINE=4;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=6;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=5;
    public static final int RULE_NUMBER=8;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalBmodesbmiLexer() {;} 
    public InternalBmodesbmiLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalBmodesbmiLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g"; }

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:11:7: ( 'TRUE' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:11:9: 'TRUE'
            {
            match("TRUE"); 


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
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:12:7: ( 'True' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:12:9: 'True'
            {
            match("True"); 


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
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:13:7: ( 'true' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:13:9: 'true'
            {
            match("true"); 


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
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:14:7: ( 'FALSE' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:14:9: 'FALSE'
            {
            match("FALSE"); 


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
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:15:7: ( 'False' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:15:9: 'False'
            {
            match("False"); 


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
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:16:7: ( 'false' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:16:9: 'false'
            {
            match("false"); 


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
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:17:7: ( 'Echo' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:17:9: 'Echo'
            {
            match("Echo"); 


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
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:18:7: ( 'beam_type' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:18:9: 'beam_type'
            {
            match("beam_type"); 


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
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:19:7: ( 'rot_rpm' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:19:9: 'rot_rpm'
            {
            match("rot_rpm"); 


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
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:20:7: ( 'rpm_mult' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:20:9: 'rpm_mult'
            {
            match("rpm_mult"); 


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
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:21:7: ( 'radius' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:21:9: 'radius'
            {
            match("radius"); 


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
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:22:7: ( 'hub_rad' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:22:9: 'hub_rad'
            {
            match("hub_rad"); 


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
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:23:7: ( 'precone' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:23:9: 'precone'
            {
            match("precone"); 


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
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:24:7: ( 'bl_thp' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:24:9: 'bl_thp'
            {
            match("bl_thp"); 


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
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:25:7: ( 'hub_conn' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:25:9: 'hub_conn'
            {
            match("hub_conn"); 


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
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:26:7: ( 'modepr' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:26:9: 'modepr'
            {
            match("modepr"); 


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
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:27:7: ( 'TabDelim' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:27:9: 'TabDelim'
            {
            match("TabDelim"); 


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
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:28:7: ( 'mid_node_tw' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:28:9: 'mid_node_tw'
            {
            match("mid_node_tw"); 


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
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:29:7: ( 'tip_mass' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:29:9: 'tip_mass'
            {
            match("tip_mass"); 


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
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:30:7: ( 'cm_loc' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:30:9: 'cm_loc'
            {
            match("cm_loc"); 


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
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:31:7: ( 'cm_axial' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:31:9: 'cm_axial'
            {
            match("cm_axial"); 


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
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:32:7: ( 'ixx_tip' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:32:9: 'ixx_tip'
            {
            match("ixx_tip"); 


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
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:33:7: ( 'iyy_tip' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:33:9: 'iyy_tip'
            {
            match("iyy_tip"); 


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
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:34:7: ( 'izz_tip' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:34:9: 'izz_tip'
            {
            match("izz_tip"); 


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
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:35:7: ( 'ixy_tip' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:35:9: 'ixy_tip'
            {
            match("ixy_tip"); 


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
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:36:7: ( 'izx_tip' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:36:9: 'izx_tip'
            {
            match("izx_tip"); 


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
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:37:7: ( 'iyz_tip' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:37:9: 'iyz_tip'
            {
            match("iyz_tip"); 


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
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:38:7: ( 'id_mat' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:38:9: 'id_mat'
            {
            match("id_mat"); 


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
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:39:7: ( 'sec_props_file' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:39:9: 'sec_props_file'
            {
            match("sec_props_file"); 


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
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:40:7: ( 'sec_mass_mult' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:40:9: 'sec_mass_mult'
            {
            match("sec_mass_mult"); 


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
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:41:7: ( 'flp_iner_mult' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:41:9: 'flp_iner_mult'
            {
            match("flp_iner_mult"); 


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
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:42:7: ( 'lag_iner_mult' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:42:9: 'lag_iner_mult'
            {
            match("lag_iner_mult"); 


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
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:43:7: ( 'flp_stff_mult' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:43:9: 'flp_stff_mult'
            {
            match("flp_stff_mult"); 


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
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:44:7: ( 'edge_stff_mult' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:44:9: 'edge_stff_mult'
            {
            match("edge_stff_mult"); 


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
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:45:7: ( 'tor_stff_mult' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:45:9: 'tor_stff_mult'
            {
            match("tor_stff_mult"); 


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
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:46:7: ( 'axial_stff_mult' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:46:9: 'axial_stff_mult'
            {
            match("axial_stff_mult"); 


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
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:47:7: ( 'cg_offst_mult' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:47:9: 'cg_offst_mult'
            {
            match("cg_offst_mult"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:48:7: ( 'sc_offst_mult' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:48:9: 'sc_offst_mult'
            {
            match("sc_offst_mult"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:49:7: ( 'tc_offst_mult' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:49:9: 'tc_offst_mult'
            {
            match("tc_offst_mult"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:50:7: ( 'nselt' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:50:9: 'nselt'
            {
            match("nselt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:51:7: ( 'tow_support' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:51:9: 'tow_support'
            {
            match("tow_support"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:52:7: ( 'n_attachments' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:52:9: 'n_attachments'
            {
            match("n_attachments"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:53:7: ( 'n_wires' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:53:9: 'n_wires'
            {
            match("n_wires"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:54:7: ( 'node_attach' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:54:9: 'node_attach'
            {
            match("node_attach"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:55:7: ( 'wire_stfness' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:55:9: 'wire_stfness'
            {
            match("wire_stfness"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:56:7: ( 'th_wire' )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:56:9: 'th_wire'
            {
            match("th_wire"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4698:10: ( ( '0' .. '9' )+ )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4698:12: ( '0' .. '9' )+
            {
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4698:12: ( '0' .. '9' )+
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
            	    // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4698:13: '0' .. '9'
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
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4700:13: ( ( ( '+' | '-' )? RULE_INT '.' ( RULE_INT )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? | ( '+' | '-' )? RULE_INT ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT | '.' RULE_INT ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? | '-' RULE_INT ) )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4700:15: ( ( '+' | '-' )? RULE_INT '.' ( RULE_INT )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? | ( '+' | '-' )? RULE_INT ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT | '.' RULE_INT ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? | '-' RULE_INT )
            {
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4700:15: ( ( '+' | '-' )? RULE_INT '.' ( RULE_INT )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? | ( '+' | '-' )? RULE_INT ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT | '.' RULE_INT ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? | '-' RULE_INT )
            int alt10=4;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4700:16: ( '+' | '-' )? RULE_INT '.' ( RULE_INT )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )?
                    {
                    // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4700:16: ( '+' | '-' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='+'||LA2_0=='-') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:
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
                    // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4700:40: ( RULE_INT )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4700:40: RULE_INT
                            {
                            mRULE_INT(); 

                            }
                            break;

                    }

                    // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4700:50: ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='E'||LA5_0=='e') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4700:51: ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4700:61: ( '+' | '-' )?
                            int alt4=2;
                            int LA4_0 = input.LA(1);

                            if ( (LA4_0=='+'||LA4_0=='-') ) {
                                alt4=1;
                            }
                            switch (alt4) {
                                case 1 :
                                    // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:
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
                    // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4700:83: ( '+' | '-' )? RULE_INT ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT
                    {
                    // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4700:83: ( '+' | '-' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='+'||LA6_0=='-') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:
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

                    // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4700:113: ( '+' | '-' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='+'||LA7_0=='-') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:
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
                    // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4700:133: '.' RULE_INT ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )?
                    {
                    match('.'); 
                    mRULE_INT(); 
                    // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4700:146: ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='E'||LA9_0=='e') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4700:147: ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4700:157: ( '+' | '-' )?
                            int alt8=2;
                            int LA8_0 = input.LA(1);

                            if ( (LA8_0=='+'||LA8_0=='-') ) {
                                alt8=1;
                            }
                            switch (alt8) {
                                case 1 :
                                    // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:
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
                    // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4700:179: '-' RULE_INT
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
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4702:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4702:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4702:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4702:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4702:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4702:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4702:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4702:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4702:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4702:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4702:137: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4704:14: ( ( '\\r' | '\\n' | '\\r\\n' ) )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4704:16: ( '\\r' | '\\n' | '\\r\\n' )
            {
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4704:16: ( '\\r' | '\\n' | '\\r\\n' )
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
                    // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4704:17: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 2 :
                    // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4704:22: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 3 :
                    // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4704:27: '\\r\\n'
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
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4706:17: ( '-' ~ ( '0' .. '9' ) (~ ( ( '\\r' | '\\n' | '\\r\\n' ) ) )* )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4706:19: '-' ~ ( '0' .. '9' ) (~ ( ( '\\r' | '\\n' | '\\r\\n' ) ) )*
            {
            match('-'); 
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='/')||(input.LA(1)>=':' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4706:35: (~ ( ( '\\r' | '\\n' | '\\r\\n' ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4706:35: ~ ( ( '\\r' | '\\n' | '\\r\\n' ) )
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
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4708:9: ( ( ' ' | '\\t' )+ )
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4708:11: ( ' ' | '\\t' )+
            {
            // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:4708:11: ( ' ' | '\\t' )+
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
            	    // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:
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
        // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | RULE_INT | RULE_NUMBER | RULE_STRING | RULE_NEWLINE | RULE_SL_COMMENT | RULE_WS )
        int alt17=52;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:10: T__10
                {
                mT__10(); 

                }
                break;
            case 2 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:16: T__11
                {
                mT__11(); 

                }
                break;
            case 3 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:22: T__12
                {
                mT__12(); 

                }
                break;
            case 4 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:28: T__13
                {
                mT__13(); 

                }
                break;
            case 5 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:34: T__14
                {
                mT__14(); 

                }
                break;
            case 6 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:40: T__15
                {
                mT__15(); 

                }
                break;
            case 7 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:46: T__16
                {
                mT__16(); 

                }
                break;
            case 8 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:52: T__17
                {
                mT__17(); 

                }
                break;
            case 9 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:58: T__18
                {
                mT__18(); 

                }
                break;
            case 10 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:64: T__19
                {
                mT__19(); 

                }
                break;
            case 11 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:70: T__20
                {
                mT__20(); 

                }
                break;
            case 12 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:76: T__21
                {
                mT__21(); 

                }
                break;
            case 13 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:82: T__22
                {
                mT__22(); 

                }
                break;
            case 14 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:88: T__23
                {
                mT__23(); 

                }
                break;
            case 15 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:94: T__24
                {
                mT__24(); 

                }
                break;
            case 16 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:100: T__25
                {
                mT__25(); 

                }
                break;
            case 17 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:106: T__26
                {
                mT__26(); 

                }
                break;
            case 18 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:112: T__27
                {
                mT__27(); 

                }
                break;
            case 19 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:118: T__28
                {
                mT__28(); 

                }
                break;
            case 20 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:124: T__29
                {
                mT__29(); 

                }
                break;
            case 21 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:130: T__30
                {
                mT__30(); 

                }
                break;
            case 22 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:136: T__31
                {
                mT__31(); 

                }
                break;
            case 23 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:142: T__32
                {
                mT__32(); 

                }
                break;
            case 24 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:148: T__33
                {
                mT__33(); 

                }
                break;
            case 25 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:154: T__34
                {
                mT__34(); 

                }
                break;
            case 26 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:160: T__35
                {
                mT__35(); 

                }
                break;
            case 27 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:166: T__36
                {
                mT__36(); 

                }
                break;
            case 28 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:172: T__37
                {
                mT__37(); 

                }
                break;
            case 29 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:178: T__38
                {
                mT__38(); 

                }
                break;
            case 30 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:184: T__39
                {
                mT__39(); 

                }
                break;
            case 31 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:190: T__40
                {
                mT__40(); 

                }
                break;
            case 32 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:196: T__41
                {
                mT__41(); 

                }
                break;
            case 33 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:202: T__42
                {
                mT__42(); 

                }
                break;
            case 34 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:208: T__43
                {
                mT__43(); 

                }
                break;
            case 35 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:214: T__44
                {
                mT__44(); 

                }
                break;
            case 36 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:220: T__45
                {
                mT__45(); 

                }
                break;
            case 37 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:226: T__46
                {
                mT__46(); 

                }
                break;
            case 38 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:232: T__47
                {
                mT__47(); 

                }
                break;
            case 39 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:238: T__48
                {
                mT__48(); 

                }
                break;
            case 40 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:244: T__49
                {
                mT__49(); 

                }
                break;
            case 41 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:250: T__50
                {
                mT__50(); 

                }
                break;
            case 42 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:256: T__51
                {
                mT__51(); 

                }
                break;
            case 43 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:262: T__52
                {
                mT__52(); 

                }
                break;
            case 44 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:268: T__53
                {
                mT__53(); 

                }
                break;
            case 45 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:274: T__54
                {
                mT__54(); 

                }
                break;
            case 46 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:280: T__55
                {
                mT__55(); 

                }
                break;
            case 47 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:286: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 48 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:295: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 49 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:307: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 50 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:319: RULE_NEWLINE
                {
                mRULE_NEWLINE(); 

                }
                break;
            case 51 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:332: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 52 :
                // ../sc.ndt.editor.bmodes.bmi/src-gen/sc/ndt/editor/bmodes/parser/antlr/internal/InternalBmodesbmi.g:1:348: RULE_WS
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
            return "4700:15: ( ( '+' | '-' )? RULE_INT '.' ( RULE_INT )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? | ( '+' | '-' )? RULE_INT ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT | '.' RULE_INT ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? | '-' RULE_INT )";
        }
    }
    static final String DFA17_eotS =
        "\23\uffff\1\70\77\uffff";
    static final String DFA17_eofS =
        "\123\uffff";
    static final String DFA17_minS =
        "\1\11\1\122\1\143\1\101\1\141\1\uffff\1\145\1\141\1\165\1\uffff\1\151\1\147\1\144\1\143\3\uffff\1\137\1\uffff\1\56\1\0\11\uffff\1\162\5\uffff\1\160\5\uffff\1\142\2\uffff\1\137\1\uffff\1\170\1\171\1\170\1\uffff\1\143\2\uffff\1\141\5\uffff\2\137\1\141\6\uffff\1\137\2\uffff\1\151\1\143\2\uffff\1\155\6\uffff";
    static final String DFA17_maxS =
        "\1\167\2\162\1\141\1\154\1\uffff\1\154\1\160\1\165\1\uffff\1\157\1\155\1\172\1\145\3\uffff\1\163\1\uffff\1\145\1\uffff\11\uffff\1\167\5\uffff\1\160\5\uffff\1\142\2\uffff\1\137\1\uffff\1\171\2\172\1\uffff\1\143\2\uffff\1\167\5\uffff\2\137\1\154\6\uffff\1\137\2\uffff\1\163\1\162\2\uffff\1\160\6\uffff";
    static final String DFA17_acceptS =
        "\5\uffff\1\7\3\uffff\1\15\4\uffff\1\40\1\42\1\44\1\uffff\1\55\2\uffff\1\60\1\61\1\62\1\64\1\1\1\2\1\21\1\3\1\23\1\uffff\1\47\1\56\1\4\1\5\1\6\1\uffff\1\10\1\16\1\11\1\12\1\13\1\uffff\1\20\1\22\1\uffff\1\45\3\uffff\1\34\1\uffff\1\46\1\50\1\uffff\1\54\1\57\1\63\1\43\1\51\3\uffff\1\26\1\31\1\27\1\33\1\30\1\32\1\uffff\1\52\1\53\2\uffff\1\24\1\25\1\uffff\1\37\1\41\1\14\1\17\1\35\1\36";
    static final String DFA17_specialS =
        "\24\uffff\1\0\76\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\30\1\27\2\uffff\1\27\22\uffff\1\30\1\uffff\1\26\4\uffff\1\26\3\uffff\1\25\1\uffff\1\24\1\25\1\uffff\12\23\13\uffff\1\5\1\3\15\uffff\1\1\14\uffff\1\20\1\6\1\13\1\uffff\1\17\1\4\1\uffff\1\10\1\14\2\uffff\1\16\1\12\1\21\1\uffff\1\11\1\uffff\1\7\1\15\1\2\2\uffff\1\22",
            "\1\31\16\uffff\1\33\20\uffff\1\32",
            "\1\37\4\uffff\1\40\1\35\5\uffff\1\36\2\uffff\1\34",
            "\1\41\37\uffff\1\42",
            "\1\43\12\uffff\1\44",
            "",
            "\1\45\6\uffff\1\46",
            "\1\51\15\uffff\1\47\1\50",
            "\1\52",
            "",
            "\1\54\5\uffff\1\53",
            "\1\56\5\uffff\1\55",
            "\1\62\23\uffff\1\57\1\60\1\61",
            "\1\64\1\uffff\1\63",
            "",
            "",
            "",
            "\1\66\17\uffff\1\67\3\uffff\1\65",
            "",
            "\1\25\1\uffff\12\23\13\uffff\1\25\37\uffff\1\25",
            "\60\71\12\25\uffc6\71",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\72\4\uffff\1\73",
            "",
            "",
            "",
            "",
            "",
            "\1\74",
            "",
            "",
            "",
            "",
            "",
            "\1\75",
            "",
            "",
            "\1\76",
            "",
            "\1\77\1\100",
            "\1\101\1\102",
            "\1\104\1\uffff\1\103",
            "",
            "\1\105",
            "",
            "",
            "\1\106\25\uffff\1\107",
            "",
            "",
            "",
            "",
            "",
            "\1\110",
            "\1\111",
            "\1\113\12\uffff\1\112",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\114",
            "",
            "",
            "\1\115\11\uffff\1\116",
            "\1\120\16\uffff\1\117",
            "",
            "",
            "\1\122\2\uffff\1\121",
            "",
            "",
            "",
            "",
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
            return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | RULE_INT | RULE_NUMBER | RULE_STRING | RULE_NEWLINE | RULE_SL_COMMENT | RULE_WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_20 = input.LA(1);

                        s = -1;
                        if ( ((LA17_20>='\u0000' && LA17_20<='/')||(LA17_20>=':' && LA17_20<='\uFFFF')) ) {s = 57;}

                        else if ( ((LA17_20>='0' && LA17_20<='9')) ) {s = 21;}

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