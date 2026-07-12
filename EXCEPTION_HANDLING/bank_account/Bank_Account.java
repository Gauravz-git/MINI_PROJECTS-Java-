package bank_account;

import java.util.InputMismatchException;
import java.util.Scanner;

class Bank_Account {
    double balance;

    //constructor
    public Bank_Account(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insuffient Balance");
        } else {
            balance = balance - amount;
            System.out.println("Current Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        Bank_Account b1 = new Bank_Account(20000);
        Scanner sc = new Scanner(System.in);


        try {
            System.out.println("Enter the Withdrawal Amount: ");
            double amount = sc.nextDouble();
            b1.withdraw(amount);

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");

        } catch (IllegalArgumentException e ) {
            System.out.println(e.getMessage());
        }
        

        sc.close();

    }


}
