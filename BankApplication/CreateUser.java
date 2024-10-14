import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreateUser extends Database{
    Scanner input = new Scanner(System.in);
    String PASSWORD_VERI;

    public CreateUser() throws SQLException {

        System.out.println("Please create a username");
        String USERNAME = input.next();
        setUsername(USERNAME);

        System.out.println("Create a Password");
        String PASSWORD = input.next();
        setPassword(PASSWORD);

        System.out.println("Please confirm Password");
        PASSWORD_VERI = input.next();


        Authenticate();

    }

    public void Authenticate() throws SQLException {

        Pattern pattern = Pattern.compile(getPassword());
        Matcher matcher = pattern.matcher(PASSWORD_VERI);

        boolean MatchFound = matcher.find();

        if (MatchFound) {

            PreparedStatement pstmt = connection.prepareStatement("INSERT INTO users(username,pass_word) VALUES(?,?)");

            // Set the values for the placeholders (?)
            pstmt.setString(1, getUsername());  // 1st parameter, replaces the first '?'
            pstmt.setString(2, getPassword());      // 2nd parameter, replaces the second '?'

            // Execute the query
            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " row(s) inserted.");
            System.out.println("Account has been successfully added");
        } else {
            System.out.println("Account not added\nMake sure to confirm your password");
        }

    }

}
