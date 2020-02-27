import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

@WebServlet(name = "DictionaryServlet",urlPatterns = "/dich")
public class DictionaryServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HashMap<String,String> dictionary=new HashMap<>();
        dictionary.put("hello","xin chao");
        dictionary.put("bye bye","tam biet");
        dictionary.put("red","mau do");
        dictionary.put("black","mau den");
        String serch=request.getParameter("txtSearch");
        String  ketqua=dictionary.get(serch);
        PrintWriter printWriter=response.getWriter();
        if (ketqua!=null){
            printWriter.println("<html>");
            printWriter.println("<h1>serch : "+serch+"</h1>");
            printWriter.println("<h1>ket qua : "+ketqua+"</h1>");
            printWriter.println("</html>");
        }else {
            printWriter.println("<html>");
            printWriter.println("<h1>ko co trong tu dien</h1>");
            printWriter.println("</html>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
