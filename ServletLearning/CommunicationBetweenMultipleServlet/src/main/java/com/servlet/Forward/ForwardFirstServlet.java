package com.servlet.Forward;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ForwordFirstServlet")
public class ForwardFirstServlet extends HttpServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        // Set response type
        res.setContentType("text/html");

        System.out.println("Before Control in First Servlet");
        RequestDispatcher requestDispatcher=req.getRequestDispatcher("/ForwordSecondServlet");

        requestDispatcher.forward(req,res);

        PrintWriter printWriter=res.getWriter();
        printWriter.println("<h1>This response is from first Servlet</h1>");
        printWriter.close();

        System.out.println("After Control in First Servlet");


    }
}
