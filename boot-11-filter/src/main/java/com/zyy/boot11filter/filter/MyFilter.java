package com.zyy.boot11filter.filter;


import javax.servlet.*;
import java.io.IOException;

/**
 * 花间影
 * 19:14
 **/
//创建filter
public class MyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("过滤器的方法被执行和了");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}

