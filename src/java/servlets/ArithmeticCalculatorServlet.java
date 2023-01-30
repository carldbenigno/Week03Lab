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
        request.setAttribute("calculation", "Result: ---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");
        
        request.setAttribute("num1", num1);
        request.setAttribute("num2", num2);
        
        if (num1 == null || num1.equals("") || num2 == null || num2.equals("")) {
            request.setAttribute("message", "Result: invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        } else {
            int newNum1 = Integer.parseInt(num1);
            int newNum2 = Integer.parseInt(num2);
            
            int calculation = 0;
            
            switch(request.getParameter("operation")) {
                case"+":
                    calculation = newNum1 + newNum2;
                break;
                case"-":
                    calculation = newNum1 - newNum2;
                break;
                case"*":
                    calculation = newNum1 * newNum2;
                break;
                case"%":
                    calculation = newNum1 % newNum2;
                break;
            }
            
            request.setAttribute("calculation", calculation);
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
}
