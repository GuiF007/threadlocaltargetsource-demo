package com.asimio.demo.web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import com.asimio.demo.tenant.TenantStore;

public class TenantFilter implements Filter {

	private static final String TENANT_HEADER_NAME = "X-TENANT-ID";

	@Autowired
	private TenantStore tenantStore;

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// NOOP
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest request = (HttpServletRequest) servletRequest;
		String tenantId = request.getHeader(TENANT_HEADER_NAME);
		this.tenantStore.setTenantId(tenantId);
		chain.doFilter(servletRequest, servletResponse);
	}

	@Override
	public void destroy() {
		// NOOP
	}

}