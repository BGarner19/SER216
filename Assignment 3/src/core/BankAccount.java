package core;

/**
 * The BankAccount class simulates several different types of bank accounts such as credit cards, savings, award
 * savings, and checking accounts. This class contains methods that calculate interest rate and total balance of the
 * different accounts given their interest rates.
 *
 * @author Bailey Garner
 * @version 1.0.0 February 6, 2018
 */

public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;
    private int accountType;

    /**
     * The default constructor constructs a "blank" bank account with an unknown account number and unknown account
     * holder. It also initializes the balance to 0 and accountType to the unknown value of 0.
     */

    public BankAccount() {

        accountNumber = "none";
        accountHolder = "Unknown";
        balance = 0;
        accountType = 0;
    }

    /**
     * This constructor creates a bank account using a customers information and initializes the bank accounts values
     * using the given parameters.
     *
     * @param accountNumber The account number identifying the account
     * @param accountHolder The name of the account owner
     * @param balance The current balance of the account
     * @param accountType The type of the account. Integers correspond to account types.
     */

    public BankAccount(String accountNumber, String accountHolder, double balance, int accountType) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountType = accountType;
    }

    /**
     * Calculates the total balance of the account given the interest rate and the current balance.
     *
     * @return A double containing the balance of the account after the interest rate calculation
     */

    public double calculateTotalBalance() {
        return balance + (balance * getInterestRate()/100);
    }

    /**
     * Decides the interest rate based on the type of account. 1: Savings account .5%, 2: Award Savings 4.5%,
     * 3: Checking, 1.0%, and 4: Credit Card, 15%. If any other account type is given then the interest rate is
     * considered to be 0%.
     *
     * @return Returns the interest rate as a percentage.
     */

    public double getInterestRate() {

        switch (accountType) {

            case 1:
                return .5;
            case 2:
                return 4.5;
            case 3:
                return 1;
            case 4:
                return 15;
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
