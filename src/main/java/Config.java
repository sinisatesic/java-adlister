public class Config {
    //This class will not be pushed to Github, so it'll be only available on local machine

    // url host for mysql
    public String getUrl() {
        return "jdbc:mysql://localhost/contacts_db?serverTimezone=UTC&useSSL=false";
    }
    //mysql username
    public String getUsername() {
        return "root";
    }
    //mysql password
    public String getPassword() {
        return "!Tito91zerg";
    }
}
