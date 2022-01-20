
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
public class ArithmeticCalculatorServlet extends HttpServlet {
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
        request.setAttribute("result", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
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
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        int result = 0;
        
        request.setAttribute("result", first + second);
        if (first != "" && second != "") {

            try {
                int first1 = Integer.parseInt(first);
                int second1 = Integer.parseInt(second);
                
                String math = request.getParameter("math");
                
                switch(math)
                {
                    case "plus" :
                        result = first1 + second1;
                        break;
                     case "minus" :
                        result = first1 - second1;
                        break;
                     case "multi" :
                        result = first1 * second1;
                        break;
                     case "divi" :
                        result = first1 % second1;
                        break;
                }

                request.setAttribute("result", result);

                

            } catch (Exception ex) {
                //request.setAttribute("result", "Put Integer Number(s)");
            }
        }else
        {
            //request.setAttribute("result", "INVALID");
        }

            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        
    }

}