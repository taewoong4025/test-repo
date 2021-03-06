package com.bit.frame.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class Ex02Filter implements Filter {
	String encoding;
	@Override
	public void init(FilterConfig config) throws ServletException {
		System.out.println("Ex02Filter init");
		encoding = config.getInitParameter("encoding");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		if(!"GET".equals(req.getMethod())) req.setCharacterEncoding(encoding);
		
		System.out.println("before Ex02Filter doFilter");
		chain.doFilter(request, response);
		System.out.println("after Ex02Filter doFilter");
	}

	@Override
	public void destroy() {
		System.out.println("Ex02Filter destroy");
	}
}
