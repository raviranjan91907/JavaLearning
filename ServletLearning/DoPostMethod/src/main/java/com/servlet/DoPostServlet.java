package com.servlet;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/student")
public class DoPostServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        // Get data from HTML form
        String name = request.getParameter("username");
        String age = request.getParameter("age");

        // Set response type
        response.setContentType("text/html;charset=UTF-8");

        // Send response to browser
        PrintWriter out = response.getWriter();

        out.println("<h1>Registration Successful!</h1>");
        out.println("<h2>Name: " + name + "</h2>");
        out.println("<h2>Age: " + age + "</h2>");
    }
    
}
