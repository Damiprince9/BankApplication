import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Database {

    private static String url = "jdbc:postgresql://localhost:5432/Login";
    private static String username = "postgres";
    private static String password = "Stuntinoh9";
    Connection connection;

    private String Username;
    private String Password, Password2;


    public Database() throws SQLException{
         connection = DriverManager.getConnection(url,username, password);
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPassword2() {
        return Password2;
    }

    public void setPassword2(String password2) {
        Password2 = password2;
    }

}
