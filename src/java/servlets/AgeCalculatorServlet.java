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
        String userage = request.getParameter("user_age");
        
        if (userage.isEmpty()){
            request.setAttribute("output", "You mus give your current age");
        } eles if (Integer.parseInt(userage) != true){
            request.setAttribute("output", "You must enter a number");
        } else if (Integer.parseInt(userage) = true){
            request.setAttribute("output", String.format("Your age nesxt birthday will be %d", Integer.parseInt(userage + 1)));
        }
        
        System.out.println(userage + 1);
        
        request.setAttribute("output", userage);
        
        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return;
    }

}
