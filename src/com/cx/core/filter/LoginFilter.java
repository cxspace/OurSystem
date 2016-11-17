package com.cx.core.filter;

import com.cx.core.constant.Constant;
import com.cx.sys.user.entity.User;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
 * Created by cxspace on 16-11-16.
 */
public class LoginFilter implements javax.servlet.Filter {

    @Override
    public void destroy() {

    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletResponse response = (HttpServletResponse) servletResponse;

        HttpServletRequest request = (HttpServletRequest) servletRequest;

        String uri = request.getRequestURI();

        if (!uri.contains("login")){

            if (request.getSession().getAttribute(Constant.USER)!=null){
                //鉴定系统管理访问权限
                if (uri.contains("/system_")){

                    User user = (User) request.getSession().getAttribute(Constant.USER);

                    if (user.getRole()==1){
                        filterChain.doFilter(request,response);
                    }else {
                        response.sendRedirect(request.getContextPath()+"/user_noPermissionUI.action");
                    }

                }else {

                    //非系统管理,放行
                    filterChain.doFilter(request,response);
                }

            }else {
                response.sendRedirect(request.getContextPath()+"/user_loginUI.action");
            }

        }else {
            //包含login,登录相关请求放行
            filterChain.doFilter(request,response);
        }
    }
}
