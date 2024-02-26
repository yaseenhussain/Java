package OOP.part1;

import java.util.Random;


public class BankAccount{
    private int accountNumber;
    private  double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    private static int sequence = 1;

    public BankAccount(int accountNumber, double accountBalance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", accountBalance=" + accountBalance +
                ", customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(sequence, 0, customerName, email, phoneNumber );
        sequence++;
    }

    public void depositFunds(double balance){
        if (balance <= 0){
            System.out.printf("Invalid balance");
        }
//        setAccountBalance(getAccountBalance() + balance);
        else {
            this.accountBalance +=balance;
            System.out.printf("Your current balance after deposit is = %.2f", this.accountBalance);
        }
    }

    public void withdrawFunds(double balance){
        if (balance <=0){
            System.out.println("Invalid balance value, please provide correct value");
        } else if ( balance > getAccountBalance()) {
            System.out.println("Withdrawal amount is more than balance");
        }
        else {
            this.accountBalance -= balance;
            System.out.printf("Your current balance after withdrawal is = %f", this.accountBalance);
        }
//        setAccountBalance(getAccountBalance() - balance);
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
