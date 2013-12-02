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

	/*@ValueConverter(rule = "STALL")
	public IValueConverter<Integer> getSTALLConverter() {
		return new tSTALLValueConverter();
	}*/
	
	
	// SC: see, http://www.eclipse.org/forums/index.php/mv/msg/282701/787968/
	@ValueConverter(rule = "tNUMBER")
	public IValueConverter<Float> gettNUMBERConverter() {
		return new tNUMBERValueConverter();
	}

	@ValueConverter(rule = "STRING")
	public IValueConverter<String> getaSTRINGConverter() {
		return stringValueConverter;
	}
	
	@ValueConverter(rule = "aAirfoilList")
	public IValueConverter<String> getaAirfoilListConverter() {
		return new tAirfoilListValueConverter();
	}
	
	
	public class tSTALLValueConverter extends DefaultTerminalConverters	implements IValueConverter<Integer> {

		public String toString(Integer value) {
			String out;
			switch(value) {
			case 1: out = "BEDDOES";
			case 2: out = "STEADY";
			default: out = "";
			}
			return out;
		}

		public Integer toValue(String string, INode node) {
			if (string == null)
				return 0;
			else if (Strings.isEmpty(string))
				throw new ValueConverterException(
						"Could not convert empty string to int", node, null);
			else {
				if(string.toLowerCase().matches("beddoes"))
					return 1;
				return 2;
			}
		}

	};
	
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

		public Boolean toValue(String string, INode node) throws ValueConverterException {
			if (string == null || string.equalsIgnoreCase("NOPRINT"))
				return false;
			else
				return true;
		}

		public String toString(Boolean value) throws ValueConverterException {

			if(value)
				return "PRINT";
			else
				return "NOPRINT";

		}

	}
	
	public class tAirfoilListValueConverter extends DefaultTerminalConverters
			implements IValueConverter<String> {

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
