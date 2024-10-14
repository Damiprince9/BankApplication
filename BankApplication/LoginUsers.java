import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class LoginUsers extends Database{
    Scanner input = new Scanner(System.in);

    public LoginUsers() throws SQLException {

        System.out.println("Welcome Back\nPlease Enter Username");
        String USERNAME = input.next();
        setUsername(USERNAME);

        System.out.println("Enter your password");
        String PASSWORD = input.next();
        setPassword(PASSWORD);

        PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM users WHERE username = ? AND pass_ word = ?");

        boolean isValid = checkCredentials(getUsername(), getPassword());

        if (isValid) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }

    }

    public static boolean checkCredentials(String UserName, String PassWord) {
        return false;
    }
}
