package sc.ndt.editor.fast.ui.addon.coloring;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class FastfstHighlightingConfiguration extends DefaultHighlightingConfiguration {

	public final static String NAME			= "name";
	public final static String VALUE 		= "value";
	
	public final static String INT 			= "INT";
	public final static String NUMBER 		= "tNUMBER";
	public final static String BOOL 		= "tBOOL";
	public final static String BOOL_F 		= "tBOOL_F";
	public final static String STRING 		= "STRING";
	public final static String URI 			= "importURI";
	public final static String FILE 		= "FILE";
	public static final String SL_COMMENT 	= "SL_COMMENT";
	public static final String SECTION 		= "Section";
	public final static String OUTLIST 		= "tARRAY_STR";
	public final static String NODES 		= "tARRAY_INT";
	//public static final String OUT_CH 		= "OUT_CH";
	
	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		
		// colors, 	see http://ray.robopuff.com/ 
		// hex,rgb, see http://stackoverflow.com/questions/4129666/how-to-convert-hex-to-rgb
		addType(acceptor, NAME, 		0x484848, 	SWT.NORMAL);
		
		addType(acceptor, INT, 			0x00FF00,	SWT.NORMAL);
		addType(acceptor, NUMBER, 		0x000000, 	SWT.NORMAL);
		addType(acceptor, SL_COMMENT, 	63,127,95/*0x989898*/, 	SWT.NORMAL);
		addType(acceptor, SECTION, 		0x989898, 	SWT.BOLD);
		
		addType(acceptor, BOOL, 		0x7FB20D, 	SWT.NORMAL);
		addType(acceptor, BOOL_F, 		0xFE4365, 	SWT.NORMAL);
		addType(acceptor, FILE, 		0x20ADCA, 	SWT.NORMAL);
		addType(acceptor, STRING, 		0x20ADCA, 	SWT.NORMAL);
		addType(acceptor, URI, 			0x20ADCA, 	SWT.NORMAL);
		addType(acceptor, OUTLIST, 		0x20ADCA, 	SWT.NORMAL);
		addType(acceptor, NODES, 		0xFF9900, 	SWT.NORMAL);		
	}
	
	@SuppressWarnings("unused")
	private void addType( IHighlightingConfigurationAcceptor acceptor, String s, int r, int g, int b, int style ) {
	    TextStyle textStyle = new TextStyle();
	    textStyle.setBackgroundColor(new RGB(255, 255, 255));
	    textStyle.setColor(new RGB(r, g, b));
	    textStyle.setStyle(style);
	    acceptor.acceptDefaultHighlighting(s, s, textStyle);
	}
		
	private void addType( IHighlightingConfigurationAcceptor acceptor, String s, int hex, int style ) {
	    TextStyle textStyle = new TextStyle();
	    textStyle.setBackgroundColor(new RGB(255, 255, 255));
	    textStyle.setColor(
	    		new RGB( (hex&0xFF0000)>>16, (hex&0xFF00)>>8, hex&0xFF ));
	    textStyle.setStyle(style);
	    acceptor.acceptDefaultHighlighting(s, s, textStyle);
	}
}
