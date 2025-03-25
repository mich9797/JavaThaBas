package EserciziOnline.Variabili.W3Resource.OOP.Object_Oriented_Programming.Exercise_7;


// Write a Java program to create a class called "Bank" with
// a collection of accounts and methods to add and remove accounts,
// and to deposit and withdraw money. Also define a class called "Account" to maintain account details of a particular customer.


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();

        Account account1 = new Account("Alessandro Barbero", "A9045", 70000);
        Account account2 = new Account("gino Cannavacciuolo", "B78045", 801010);
        Account account3 = new Account("Palindromo Cresetta", "c90565", 86000);

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);


        ArrayList<Account> accounts = bank.getAccount();

        for (Account account: accounts) {
            System.out.println(account.getAccountInfo());
        }

        System.out.println("\nAfter depositing 5000 into account1: ");
        bank.depositMoney(account1, 4000);
        System.out.println(account1.getAccountInfo());

        System.out.println("\nNo account deposit");
        System.out.println(account2.getAccountInfo());

        System.out.println("\n After withdraw 4000 from account3: ");
        bank.withdrawMoney(account3, 4000);
        System.out.println(account3.getAccountInfo());
    }
}
