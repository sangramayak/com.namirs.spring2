package com.cfn.sp.beans;

public class PDFMessageConverter implements IMessageConverter {

	public String convert(String message) {
		return "<pdf>"+message+"</pdf>";
	}

}
