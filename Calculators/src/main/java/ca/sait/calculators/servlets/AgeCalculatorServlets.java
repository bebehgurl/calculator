
package ca.sait.calculators.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Determines the next age of the person
 * @author Jae Choi
 */

public class AgeCalculatorServlets extends HttpServlet {
     /**
      * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String ageInput = request.getParameter("age");
        
        if (ageInput != null) {
            try{
                
                 int age = Integer.parseInt(ageInput);
                age++;
        
        String message = String.format("You will be %d after your next birthday." , age);
        
        request.setAttribute("message", message);
        
         getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
                
            } catch (Exception ex){
                //age input exists but not a number
            }
            
           
        
        
        } else {
            // age input is missing
        }
               
    }
}
