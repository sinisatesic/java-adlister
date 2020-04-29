//
//
//import com.mysql.cj.jdbc.Driver;
//
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.util.List;
//
//public class MySQLAdsDao implements Ads{
//
//    private Connection conn;
//
//    public MySQLAdsDao() throws SQLException {
//
//        Config config = new Config();
//
//        DriverManager.registerDriver(new Driver());
//
//        this.conn = DriverManager.registerDriver((new Driver());
//                config.getUrl(),
//                config.getUsername(),
//                config.getPassword(),
//        );
//    }
//
//    @Override
//    public List<Ad> all() {
//        return null;
//    }
//
//    @Override
//    public Long insert(Ad ad) {
//        return null;
//    }
//}
