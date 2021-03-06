package com.yimo.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

//@WebServlet(urlPatterns = {},loadOnStartup = 2)
@WebServlet(loadOnStartup = 2)
public class WebPathInitsServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
//        在整体的应用上下文当中 存储了一个ctx的值 用它来引用上下文路径

        config.getServletContext().setAttribute("ctx",config.getServletContext().getContextPath());
        System.out.println(config);
        System.out.println(config.getServletContext().getContextPath());
    }
}
