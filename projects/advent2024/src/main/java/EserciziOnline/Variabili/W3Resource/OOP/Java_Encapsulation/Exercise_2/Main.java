package EserciziOnline.Variabili.W3Resource.OOP.Java_Encapsulation.Exercise_2;


// Write a Java program to create a class called BankAccount with private instance variables accountNumber and balance.
// Provide public getter and setter methods to access and modify these variables.
public class Main {
    public static void main(String[] args) {

        BankAccount member = new BankAccount();

        member.setAccountNumber(567);
        member.setBalance(104500.98);

        int accountNumber = member.getAccountNumber();
        double balance = member.getBalance();

        System.out.println("Member Account Number: " + accountNumber);
        System.out.println("Member Balance: " + balance);
    }


}
