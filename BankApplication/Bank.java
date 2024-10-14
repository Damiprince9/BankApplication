import java.util.Scanner;
import java.util.Random;

public class Bank {
    Scanner input = new Scanner(System.in);


    public Bank(){

    }

    private double accountBalance = 50000;
    private long accountNumber;
    private int pin;

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void createPIN(){

        System.out.println("Create a PIN for transactions");
        int Pin = input.nextInt();
        setPin(Pin);

        generateAccountNumber();
        System.out.println("Account number "+ getAccountNumber());
    }

    public void generateAccountNumber(){
        Random random = new Random();
        long AccountNumber = 1000000000L + (long)(random.nextDouble() * 9000000000L);
        setAccountNumber(AccountNumber);
    }

    public void loginBankAccount(){
        System.out.println("Welcome back");

    }
}
