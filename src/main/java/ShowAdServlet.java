import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ShowAdServlet", urlPatterns = "ads/show")
public class ShowAdServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        long adId = Long.parseLong(request.getParameter("id"));

        Ads adDao = DaoFactory.getAdsDao();

        Ad ad = adDao.findById(adId);

        request.setAttribute("ad", ad);
        request.getRequestDispatcher("ad/ad-show.jsp").forward(request, response);
    }
}
