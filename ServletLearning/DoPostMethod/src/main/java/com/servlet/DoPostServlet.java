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

//        response.setHeader("studentName", name);
//        response.setHeader("studentAge", age);

        response.sendRedirect(
                request.getContextPath() +
                        "/registrationSuccess.jsp?name=" + name + "&age=" + age
        );

//        response.sendRedirect(request.getContextPath() +"/registrationSuccess.js");
//        this well not sent the data to jsp


    }
    
}
