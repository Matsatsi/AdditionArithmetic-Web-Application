/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.ArithmeticManager;
import za.ac.tut.model.ArithmeticManagerInterface;

/**
 *
 * @author Student
 */
public class MultiplyServlet extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        
        //business logic 
        ArithmeticManagerInterface ami = new ArithmeticManager();//ArithmeticManager ami = new ArithmeticManager();
        int product = ami.multiply(num1, num2);
        request.setAttribute("product", product);
        request.setAttribute("num1", num1);
        request.setAttribute("num2", num2);
        
        RequestDispatcher disp = request.getRequestDispatcher("multiply_outcome.jsp");
        disp.forward(request, response);        
    }

}
