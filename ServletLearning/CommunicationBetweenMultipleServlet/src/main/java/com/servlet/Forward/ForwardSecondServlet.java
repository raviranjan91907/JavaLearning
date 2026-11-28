package com.servlet.Forward;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ForwordSecondServlet")
public class ForwardSecondServlet extends HttpServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        System.out.println("Before Control in Second Servlet");
        PrintWriter printWriter=res.getWriter();

        printWriter.println("<H2>This Response if from Second Servlet</<H2>");


        System.out.println("After Control in Second Servlet");


    }
}
