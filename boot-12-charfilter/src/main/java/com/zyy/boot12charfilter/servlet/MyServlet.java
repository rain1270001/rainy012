package com.zyy.boot12charfilter.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 花间影
 * 19:59
 **/
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;chatset=utf-8");
        PrintWriter writer = resp.getWriter();
        writer.println("hello这是个测试");
        writer.flush();
        writer.close();
    }
}
