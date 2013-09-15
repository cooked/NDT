/*******************************************************************************
 * Copyright (C) 2013 Stefano Cottafavi - All Rights Reserved
 ******************************************************************************/
package sc.ndt.editor.fast.addon.formatting;

import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.parsetree.reconstr.ITokenStream;

// PAY ATTENTION - this could break binding!!!!
public class FastfstFormatter2 extends AbstractDeclarativeFormatter /*
																	 * or
																	 * implement
																	 * IFormatter
																	 */{

	// TODO column formatter (aka table column)
	@Override
	public ITokenStream createFormatterStream(String initalIndentation,
			ITokenStream outputStream, boolean preserveWhitespaces) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void configureFormatting(FormattingConfig config) {
		// TODO Auto-generated method stub

	}

}
