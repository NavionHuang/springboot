package com.light.springboot.web;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class TimeFilter
 */
@WebFilter("/TimeFilter")
public class TimeFilter implements Filter {

    /**
     * Default constructor. 
     */
    public TimeFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("=======销毁过滤器=========");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		long start=System.currentTimeMillis();
		chain.doFilter(request, response);
		System.out.println("filter 耗时：" + (System.currentTimeMillis() - start));
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("=======初始化过滤器=========");
	}

}
