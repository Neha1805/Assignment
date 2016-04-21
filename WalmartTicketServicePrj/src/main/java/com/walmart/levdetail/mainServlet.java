
package com.walmart.levdetail;

/**
 *
 * @author Neha
 */

//THIS WILL BE YOUR JAVA MIDDLEWARE TO GET THE VALUE
/*
 * This is the Servlet page for the application. 
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/mainServlet"})
public class mainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
            String Level_Id = request.getParameter("Level_Id");
            
            System.out.println("doGet()"+Level_Id);
           
             try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Welcome to Walmart Ticket Service</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Welcome to Walmart Ticket Service"+"</h1>");
            out.println("<h1>Level requested:" + Level_Id + "</h1>");
            out.println("</body>");
            out.println("</html>");
            
        }
            
    } 
        
        
           protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet mainServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Seats " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
        
        
    }
 }