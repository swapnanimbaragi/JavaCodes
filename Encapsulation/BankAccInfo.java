package Encapsulation;
import java.util.Scanner;
public class BankAccInfo {
    private String accountHolderName;
    private String accountNumber;   
    private double balance;
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public static void main(String[] args) {
        BankAccInfo account = new BankAccInfo();
        // account.setAccountHolderName("John Doe");
        // account.setAccountNumber("123456789");
        // account.setBalance(1000.50);
        Scanner scanner = new Scanner(System.in);
        String accountHolderName=scanner.nextLine();
        String accountNumber=scanner.nextLine();
        double balance=scanner.nextDouble();
        account.setAccountHolderName(accountHolderName);
        account.setAccountNumber(accountNumber);
        account.setBalance(balance);


        System.out.println("Account Holder Name: " + account.getAccountHolderName());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: $" + account.getBalance());
    }
}
