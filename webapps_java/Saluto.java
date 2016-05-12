import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Saluto extends HttpServlet {

  protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String nome=request.getParameter("nome");
            out.println("<h2> Ciao! "+nome+"</h2>");
        } finally {            
            out.close();
        }
    }
}
