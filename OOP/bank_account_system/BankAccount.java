package bank_account_system;

abstract class BankAccount {
    private String accountNumber;
    private double balance;

    // constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // getter
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // setter
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // abstract method
    abstract public double calculateInterest();

    // deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited successfully");
        } else {
            System.out.println("Invalid amount");
        }
    }
}

class SavingAccount extends BankAccount {

    public SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.05; // 5% of balance
    }
}

class CurrentAccount extends BankAccount {

    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateInterest() {
        return 200; // flat ₹200
    }
}

class Main {
    public static void main(String[] args) {
        BankAccount[] accounts = {
            new SavingAccount("SA001", 10000),
            new CurrentAccount("CA001", 10000)
        };

        for (BankAccount acc : accounts) {
            acc.deposit(500);
            System.out.println("Account: " + acc.getAccountNumber());
            System.out.println("Balance: " + acc.getBalance());
            System.out.println("Interest: " + acc.calculateInterest());
            System.out.println("----");
        }
    }
}