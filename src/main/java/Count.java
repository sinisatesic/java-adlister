import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//public class Count extends HelloWorldServlet {

    @WebServlet(name = "CountServlet", urlPatterns = "/count")
    public class Count extends HttpServlet {
        int count = 0;

        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            count++;

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<h1>Number of times page view " + count + "</h1>");

        }
}
