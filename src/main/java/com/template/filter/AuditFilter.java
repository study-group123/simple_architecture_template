package com.template.filter;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class AuditFilter implements Filter {

    private AuditHandler auditHandler;
	
	private String appName;

	public AuditFilter() {}
	
    public AuditFilter(AuditHandler auditHandler) {
        this.auditHandler = auditHandler;
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        auditHandler.auditRequest(appName,request);
        chain.doFilter(request, response);
    }

    public void init(FilterConfig filterConfig) throws ServletException {
    	appName = filterConfig.getInitParameter("appName");
    }

    public void destroy() {}
}
