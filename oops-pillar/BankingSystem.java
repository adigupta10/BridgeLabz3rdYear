//package Encapsulation;
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public abstract double calculateInterest();

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate = 0.04;
    private double loanLimit = 50000;
    private boolean loanApproved = false;

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        if (amount <= loanLimit && getBalance() > 2000) {
            loanApproved = true;
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return loanApproved;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    private double interestRate = 0.02;
    private double loanLimit = 100000;
    private boolean loanApproved = false;

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        if (amount <= loanLimit && getBalance() > 5000) {
            loanApproved = true;
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return loanApproved;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount[] accounts = {
            new SavingsAccount("SAV123", "Alice", 20000),
            new CurrentAccount("CUR456", "Bob", 50000)
        };

        for (BankAccount acc : accounts) {
            acc.displayDetails();
            System.out.println("Interest: " + acc.calculateInterest());

            if (acc instanceof Loanable) {
                Loanable l = (Loanable) acc;
                l.applyForLoan(30000);
                System.out.println("Loan Eligibility: " + l.calculateLoanEligibility());
            }

            System.out.println("----------------------------");
        }
    }
}
