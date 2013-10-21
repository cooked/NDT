/*******************************************************************************
 * Copyright (C) 2013 Stefano Cottafavi - All Rights Reserved
 ******************************************************************************/
package sc.ndt.editor.fast.addon.valueconverter;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractDeclarativeValueConverterService;
import org.eclipse.xtext.conversion.impl.STRINGValueConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Strings;

import com.google.inject.Inject;

public class FastadnConverterService extends
		AbstractDeclarativeValueConverterService {

	
	@Inject
	private STRINGValueConverter stringValueConverter;

	// SC: see, http://www.eclipse.org/forums/index.php/mv/msg/282701/787968/
	@ValueConverter(rule = "tNUMBER")
	public IValueConverter<Float> gettNUMBERConverter() {
		return new tNUMBERValueConverter();
	}

	@ValueConverter(rule = "STRING")
	public IValueConverter<String> getaSTRINGConverter() {
		return stringValueConverter;
	}

	/*@ValueConverter(rule = "PRINT")
	public IValueConverter<Boolean> getPRINTConverter() {
		return new PRINTValueConverter();
	}*/
	
	@ValueConverter(rule = "aAirfoilList")
	public IValueConverter<String> getaAirfoilListConverter() {
		return new tAirfoilListValueConverter();
	}
	
	

	public class tNUMBERValueConverter extends DefaultTerminalConverters implements IValueConverter<Float> {

		public String toString(Float value) {
			return value.toString();
		}

		public Float toValue(String string, INode node) {
			if (string == null)
				return 0F;
			else if (Strings.isEmpty(string))
				throw new ValueConverterException(
						"Could not convert empty string to float", node, null);
			else
				return Float.parseFloat(string);
		}

	};
	
	public class PRINTValueConverter extends DefaultTerminalConverters implements IValueConverter<Boolean> {

		@Override
		public Boolean toValue(String string, INode node) throws ValueConverterException {
			if (string == null || string.equalsIgnoreCase("NOPRINT"))
				return false;
			else
				return true;
		}

		@Override
		public String toString(Boolean value) throws ValueConverterException {

			if(value)
				return "PRINT";
			else
				return "NOPRINT";

		}

	}
	
	public class tAirfoilListValueConverter extends DefaultTerminalConverters
			implements IValueConverter<String> {

		@Override
		public String toValue(String string, INode node) throws ValueConverterException {
			if (string == null)
				return "";
			string = string.replace("\"", "");
			string = string.replace(" ", "");
			string = string.replace("\t", "");
			string = string.replace("\r\n", ",");
			string = string.replace("\n", ",");
			return string;
		}

		@Override
		public String toString(String value) throws ValueConverterException {

			String out = "";

			if (value == "")
				return out;

			String[] splitted = value.split(",");
			for (int i = 0; i < splitted.length; i++) {
				if (splitted[i] != "")
					out += splitted[i] + ",";
			}
			return out.substring(0, out.length() - 1);

		}

	}
	
	
}
