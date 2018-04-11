import java.sql.*;

/**
 * Created by alexander on 2018-02-14.
 */

public class Login {
    private ResultSet rs;

    private static final String DEFAULT_DRIVER_CLASS = "com.mysql.jdbc.Driver";
    private static String hostname = "localhost";
    private static String dbName = "javagame";
    private static final String DEFAULT_URL = "jdbc:mysql://"+ hostname+":3306/"+dbName;
    private static final String DEFAULT_USERNAME = "root";
    private static final String DEFAULT_PASSWORD = "password";


    public Login() {
        Connection con  = null;
        try{
            Class.forName(DEFAULT_DRIVER_CLASS);
            con = DriverManager.getConnection(DEFAULT_URL, DEFAULT_USERNAME, "");


            PreparedStatement ps = null;
            ResultSet rs = null;
            ps = con.prepareStatement("select * from users");
            rs = ps.executeQuery();
            this.rs = rs;


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public boolean tryLogin(ResultSet rs, String username, String password) {
        try {
            while(rs.next()) {
                System.out.println(rs.getString("username") + " " + username);
                System.out.println(rs.getString("password") + " " + password);
                if (rs.getString("username").equals(username) && rs.getString("password").equals(password)) {
                    return true;
                } else {
                    return false;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public ResultSet getRs() {
        return this.rs;
    }


}
