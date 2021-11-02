import org.apache.http.impl.bootstrap.HttpServer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Hello")
public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest reg, HttpServletResponse resp) throws ServletException, IOException{
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.write("Hello");
        printWriter.close();
    }
}
