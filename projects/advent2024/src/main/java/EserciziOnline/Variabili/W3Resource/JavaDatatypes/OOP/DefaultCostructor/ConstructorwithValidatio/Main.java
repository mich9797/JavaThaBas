package EserciziOnline.Variabili.W3Resource.JavaDatatypes.OOP.DefaultCostructor.ConstructorwithValidatio;

public class Main {
    public static void main(String[] args) {

            // Test with valid data
            Account account1 = new Account("12340009", 1000.00);
            System.out.println("Account 1 Number: " + account1.accountNumber);
            System.out.println("Account 1 Balance: " + account1.balance);

            // Test with invalid accountNumber
            Account account2 = new Account("", 400.00);

            // Test with invalid balance
            Account account3 = new Account("1230000873", -200.00);
    }
}
