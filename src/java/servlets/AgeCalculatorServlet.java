package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Load JSP
        getServletContext().getRequestDispatcher("/WEB-INF/AgeCalculator.jsp").forward(request, response);
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userinput = request.getParameter("user_age");
        boolean validNumber = false;
        
        if (userinput.isEmpty()){

            request.setAttribute("output", "You must give your current age");
        } else if (!isValid(userinput)){

            request.setAttribute("output", "You must enter a number");
        } else if (Integer.parseInt(userinput) < 0 ){
            request.setAttribute("output", "You must give a valid age");
        }else {
            validNumber = true;
        }
        
            
        if (validNumber == true){
            int userAge = Integer.parseInt(userinput);
            request.setAttribute("output", String.format("Your age next birthday will be %d", userAge+1));
        }

        
        
        getServletContext().getRequestDispatcher("/WEB-INF/AgeCalculator.jsp").forward(request, response);
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
