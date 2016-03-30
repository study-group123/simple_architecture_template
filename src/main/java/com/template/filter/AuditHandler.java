package com.template.filter;

import javax.servlet.ServletRequest;

import org.apache.log4j.Logger;

public class AuditHandler {

	private static Logger logger = Logger.getLogger(AuditHandler.class); 
	
	public void auditRequest(String appName,ServletRequest request) {
		//logger.info(appName+" received request from " + request.toString());
    }
}
