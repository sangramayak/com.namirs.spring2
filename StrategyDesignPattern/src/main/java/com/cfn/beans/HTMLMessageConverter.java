package com.cfn.beans;

public class HTMLMessageConverter implements IMessageConverter {

	public String convert(String message) {
		
		return "<html><body>"+message+"</body></html>";
	}

}
