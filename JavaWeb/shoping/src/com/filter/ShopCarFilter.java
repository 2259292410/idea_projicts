package com.filter;


import com.entity.User;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ShopCarFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response =(HttpServletResponse)servletResponse;

       User user = (User)request.getSession().getAttribute("user");
       if(user==null){
           request.getRequestDispatcher("/pages/user/login.jsp").forward(request,response);
       }else {
           filterChain.doFilter(request,response);
       }
    }

    @Override
    public void destroy() {

    }
}
