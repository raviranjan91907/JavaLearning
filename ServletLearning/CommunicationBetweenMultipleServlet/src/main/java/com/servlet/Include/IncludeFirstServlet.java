package com.servlet.Include;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/IncludeFirstServlet")
public class IncludeFirstServlet extends HttpServlet {

    public void service(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException{


        // Set response type
        response.setContentType("text/html");
        System.out.println("Before Control in First Servlet");

        RequestDispatcher requestDispatcher=request.getRequestDispatcher("/IncludeSecondServlet");

        requestDispatcher.include(request,response);

        PrintWriter printWriter=response.getWriter();

        printWriter.println("<H1>This Response from First Servlet</H1>");
        printWriter.close();

        System.out.println("After Control in First Servlet");
    }
}
