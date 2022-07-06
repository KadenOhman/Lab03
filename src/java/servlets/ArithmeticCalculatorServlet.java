package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Load JSP
        request.setAttribute("output", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstInput = request.getParameter("first");
        String secInput = request.getParameter("second");
        String mathFunc = request.getParameter("math");
        
        if (firstInput == null || secInput == null || isValid(firstInput) != true || isValid(secInput) != true){
            request.setAttribute("output", String.format("Invalid"));
        } else if ("+".equals(mathFunc)){
            request.setAttribute("output", Integer.parseInt(firstInput) + Integer.parseInt(secInput));
        } else if ("-".equals(mathFunc)){
            request.setAttribute("output", Integer.parseInt(firstInput) - Integer.parseInt(secInput));
        } else if ("*".equals(mathFunc)){
            request.setAttribute("output", Integer.parseInt(firstInput) * Integer.parseInt(secInput));
        } else if ("%".equals(mathFunc)){
            request.setAttribute("output", Integer.parseInt(firstInput) & Integer.parseInt(secInput));
        }
        
        
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return;
    }
    
    private boolean isValid(String number) {
        try{
            Integer.parseInt(number);
            return true;
        }catch (NumberFormatException exception){
            return false;
            }
    }

}
