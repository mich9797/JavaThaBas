package EserciziOnline.Variabili.W3Resource.Functional_Programming.Java_Lambda_Expressions.Convert_List_Of_Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> stringList = Arrays.asList("Red", "Green", "Blue", "PINK");


        System.out.println("\nOriginal strings:");
        for (String str : stringList) {
            System.out.println(str);
        }


        stringList.replaceAll(str -> str.toLowerCase());


        System.out.println("\nLowercase strings:");
        for (String str : stringList) {
            System.out.println(str);
        }

        stringList.replaceAll(str -> str.toUpperCase());

        // Print the list of uppercase strings
        System.out.println("\nUppercase strings:");
        for (String str : stringList) {
            System.out.println(str);
        }
    }
}
