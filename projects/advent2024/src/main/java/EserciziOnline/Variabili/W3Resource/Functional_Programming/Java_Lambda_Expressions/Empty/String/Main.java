package EserciziOnline.Variabili.W3Resource.Functional_Programming.Java_Lambda_Expressions.Empty.String;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Predicate<String> isEmptyString = str -> str.isEmpty();

        // Test cases
        String str1 = "";
        String str2 = "Java lambda expression!";


        System.out.println("String 1:" + str1);
        System.out.println("String 1 is empty: " + isEmptyString.test(str1));
        System.out.println("\nString 2:" + str2);
        System.out.println("String 2 is empty: " + isEmptyString.test(str2));
    }
}
