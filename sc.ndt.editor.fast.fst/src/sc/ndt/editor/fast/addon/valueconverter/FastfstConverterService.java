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

public class FastfstConverterService extends
		AbstractDeclarativeValueConverterService {

	@Inject
	private STRINGValueConverter stringValueConverter;

	
	
	// SC: see, http://www.eclipse.org/forums/index.php/mv/msg/282701/787968/
	@ValueConverter(rule = "tNUMBER")
	public IValueConverter<Float> gettNUMBERConverter() {
		return new tNUMBERValueConverter();
	}

	@ValueConverter(rule = "tBOOL")
	public IValueConverter<Boolean> gettBOOLConverter() {
		return new tBOOLValueConverter();
	}

	@ValueConverter(rule = "STRING")
	public IValueConverter<String> getaSTRINGConverter() {
		return stringValueConverter;
	}

	@ValueConverter(rule = "FILE")
	public IValueConverter<String> getaFILEConverter() {
		return stringValueConverter;
	}

	@ValueConverter(rule = "tARRAY_INT")
	public IValueConverter<String> getaBldGagNdConverter() {
		return new tArrayValueConverter();
	}

	@ValueConverter(rule = "tARRAY_STR")
	public IValueConverter<String> getaOutListConverter() {
		return new tOutListValueConverter();
	}

	
	
	public class tNUMBERValueConverter extends DefaultTerminalConverters		implements IValueConverter<Float> {

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

	public class tBOOLValueConverter extends DefaultTerminalConverters
			implements IValueConverter<Boolean> {

		@Override
		public String toString(Boolean value) {
			return value.toString();
		}

		@Override
		public Boolean toValue(String string, INode node) {
			if (Strings.isEmpty(string))
				throw new ValueConverterException(
						"Could not convert empty string to boolean", node, null);
			if (string.toLowerCase().startsWith("t"))
				return Boolean.TRUE;
			if (string.toLowerCase().startsWith("f"))
				return Boolean.FALSE;
			return null;
		}

	};

	public class tArrayValueConverter extends DefaultTerminalConverters
			implements IValueConverter<String> {

		@Override
		public String toValue(String string, INode node)
				throws ValueConverterException {
			if (string == null)
				return "";
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

	public class tOutListValueConverter extends DefaultTerminalConverters
			implements IValueConverter<String> {

		@Override
		public String toValue(String string, INode node)
				throws ValueConverterException {
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
