import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet" ,urlPatterns = "/tinhtoan")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Float gia=Float.parseFloat(request.getParameter("giasanpham")) ;
        Float chietkhau=Float.parseFloat(request.getParameter("tilechietkhau")) ;
        double sotienchietkhau=gia*chietkhau*0.1 ;
        PrintWriter writer=response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Gia : " +gia +"</h1>");
        writer.println("<h1>ti le chiet khau : " +chietkhau +"</h1>");
        writer.println("<h1>so tien chiet khau : " +sotienchietkhau +"</h1>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
