package com.servlet;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


/*

    doGet()->
    It is called automatically by the Servlet Container when a GET request reaches the mapped Servlet.
    It is generally used to retrieve information from the server.
    Data can be passed through URL query parameters.
    Query parameters are visible in the URL, so don't use GET for passwords or sensitive information.
    GET requests should not be used to perform operations that change server data.
    doGet() can be called concurrently by multiple request threads.


    Syntax	                                Explanation
    @Override	                            Indicates that we are overriding the parent class method.
    protected	                            Access modifier of the method.
    void	                                The method does not return a value.
    doGet()	                                Method that handles GET requests.
    HttpServletRequest request	            Contains information sent by the client.
    HttpServletResponse response	        Used to send a response to the client.
    throws ServletException, IOException	Declares exceptions that may occur during Servlet processing.

    ->output of the http url
      http://localhost:8085/DoPostMethod/DoGetServlet?username=Ravi+Ranjan&city=Pune

     response.setContentType("text/html"); is used in Java Servlet to tell the browser what type of content the server is sending in the HTTP response.

     response.setContentType("application/json");
     out.println("{\"name\":\"Ravi\",\"age\":24}");

     OutPut
     {
    "name": "Ravi",
    "age": 24
     }


     Common content         types
    Content type	        Purpose
    text/html	            HTML content
    text/plain	            Normal text
    application/json	    JSON data
    application/xml	XML     data
    text/css	            CSS content
    application/pdf	PDF     document
    image/png	            PNG image


    Important: When should we call it?
    Usually, set the content type before obtaining the response writer and writing the response:

 */

@WebServlet("/DoGetServlet")
public class DoGetServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        String name = request.getParameter("username");
        String age = request.getParameter("city");

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<h1>Hello " + name + "</h1>");
        out.println("<h2>Your age is " + age + "</h2>");

    }

}