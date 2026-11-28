package com.servlet.Include;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/IncludeSecondServlet")
public class IncludeSecondServlet extends HttpServlet {


    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        PrintWriter printWriter=res.getWriter();

        printWriter.println("<H2>This Response if from Second Servlet</<H2>");

    }
}
