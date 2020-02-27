import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ConvertServlet",urlPatterns = "/convert")
public class ConvertServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Float rate=Float.parseFloat(request.getParameter("rate"));
        Float usd=Float.parseFloat(request.getParameter("usd"));
        Float vnd=rate*usd;
        PrintWriter printWriter=response.getWriter();
        printWriter.println("<html>");
        printWriter.println("<h1> USD : "+usd+"<h1>");
        printWriter.println("<h1> RETE : "+rate+"<h1>");
        printWriter.println("<h1 VND : >"+vnd+"<h1>");
        printWriter.println("<html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Float rate=Float.parseFloat(request.getParameter("rate"));
        Float usd=Float.parseFloat(request.getParameter("usd"));
        Float vnd=rate*usd;
        PrintWriter printWriter=response.getWriter();
        printWriter.println("<html>");
        printWriter.println("<h1> USD : "+usd+"<h1>");
        printWriter.println("<h1> RETE : "+rate+"<h1>");
        printWriter.println("<h1 VND : >"+vnd+"<h1>");
        printWriter.println("<html>");
    }
}
