import java.sql.*;
import java.util.Scanner;

class Main extends Database{ //Checkout and try to extend the other classes here
    private static Scanner input;

    private static Bank bank;

    public Main() throws SQLException{

        bank = new Bank();
        input = new Scanner(System.in);


        System.out.println("Welcome to the website\nEnter a number\n1.Create An Account\n2.Log In\n3.Exit");
        int choice = input.nextInt();

        if (choice == 1) {
            new CreateUser();
            bank.createPIN();
            new LoginUsers();

        } else if(choice ==2) {
            new LoginUsers();

        }else if(choice ==3){
            connection.close();
            input.close();

        }else{
            connection.close();
            input.close();

        }

    }






    public static void main(String[] args) throws SQLException {
        new Main();
    }

}