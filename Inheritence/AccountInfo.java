package Inheritence;
import java.util.*;
class Account
{
    private int accountNumber;  
    private int balance;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getDetails()
    {
        return "accountNumber: " + accountNumber + ", balance: " + balance;
    }
}

class SavingsAccount extends Account
{
    private double interestRate;

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Interest Rate: " + interestRate;
    }
}
class CurrentAccount extends Account
{
    private double overdraftLimit;

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Overdraft Limit: " + overdraftLimit;
    }
}
public class AccountInfo 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in); 
        String type = scan.nextLine().trim();
        if (type.equalsIgnoreCase("SavingsAccount"))
        {
            String data[]=scan.nextLine().split(",");
            SavingsAccount savingsAccount = new SavingsAccount();
            savingsAccount.setAccountNumber(Integer.parseInt(data[0]));
            savingsAccount.setBalance(Integer.parseInt(data[1]));
            savingsAccount.setInterestRate(Double.parseDouble(data[2]));
            System.out.println("Account Details: " + savingsAccount.getDetails());
        }
        else if (type.equalsIgnoreCase("CurrentAccount"))
        {
            String data[]=scan.nextLine().split(",");
            CurrentAccount currentAccount = new CurrentAccount();
            currentAccount.setAccountNumber(Integer.parseInt(data[0]));
            currentAccount.setBalance(Integer.parseInt(data[1]));
            currentAccount.setOverdraftLimit(Double.parseDouble(data[2]));
            System.out.println("Account Details: " + currentAccount.getDetails());
        }
    }
}
