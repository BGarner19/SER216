package core;

public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;
    private int accountType;

    public BankAccount() {

        accountNumber = "none";
        accountHolder = "Unknown";
        balance = 0;
        accountType = 0;
    }

    public BankAccount(String accountNumber, String accountHolder, double balance, int accountType) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountType = accountType;
    }

    public double calculateTotalBalance() {
        return 0;
    }

    public double getInterestRate() {

        switch (accountType) {

            case 1:
                return .005;
            case 2:
                return .045;
            case 3:
                return .01;
            case 4:
                return .15;
            default:
                return 0;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountType() {
        return accountType;
    }

    public void setAccountType(int accountType) {
        this.accountType = accountType;
    }
}
