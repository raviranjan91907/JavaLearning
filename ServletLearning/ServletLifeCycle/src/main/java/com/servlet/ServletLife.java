package com.servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


/*
    Servlet Lifecycle in Java
    The Servlet Lifecycle describes the complete process of how a Servlet is created, initialized, used to handle requests, and finally destroyed by the Servlet Container.

    In simple words, it explains what happens to a Servlet from the moment it is loaded into the application until it is removed.

    Important: The Servlet Container (for example, Apache Tomcat) manages the entire Servlet lifecycle. You don't need to manage it manually.
    1. Different stages of Servlet Lifecycle
    There are three main lifecycle methods:
    1. init() – Initializes the Servlet.
    2. service() – Processes client requests.
    3. destroy() – Destroys the Servlet
 */
@WebServlet("/ServletLife")
public class ServletLife extends HttpServlet {
    static{
        System.out.println("This is the static block");
    }

    public ServletLife(){
        System.out.println("This is the Constructor Block");
    }


    /*
    2. First stage: init() method
    The init() method is responsible for initializing the Servlet.

    When is it called?
    - When the Servlet Container loads the Servlet.
    - It is generally called only once during that Servlet instance's lifecycle.

    The Servlet Container:
    1. Creates the Servlet object.
    2. Calls the init() method.
    3. Initializes the Servlet.
     */
    public void init(ServletConfig config) throws ServletException{
        System.out.println("This is Initialization Block");
    }

    /*

    Second stage: service() method
    The service() method is responsible for processing incoming client requests.

    Whenever a client sends a request to your Servlet, the Servlet Container calls the service() method.

    Suppose three users send requests to your Servlet.
    The service() method will be invoked for each request

    Important: What happens inside service()?
    Since we are working with HttpServlet, its inherited service() method identifies the HTTP request method and dispatches it to the appropriate method.

    For example:
    HTTP Request	Method called
    GET	            doGet()
    POST	        doPost()
    PUT	            doPut()
    DELETE	        doDelete()


    If a browser sends a GET request, the container invokes service(), which dispatches it to doGet().

    Remember: Normally, when developing an HttpServlet, you override doGet() and doPost() instead of overriding service().
     */

    protected void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        System.out.println("This is Service method used to handle request");
    }


    /*
    Third stage: destroy() method
    The destroy() method is called when the Servlet Container is removing the Servlet from service.

    It is generally called only once for a Servlet instance.

    When can it happen?
    - When you stop the Tomcat server.
    - When you undeploy your web application.
    - When the container decides to remove the Servlet.
     */
    public void destroy(){
        System.out.println("This is the Destroy Method");
    }
}
