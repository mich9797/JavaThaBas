package EserciziOnline.Variabili.W3Resource.Functional_Programming.Java_Lambda_Expressions.Sort_of_List;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> orderLetter = Arrays.asList("b", "a", "f", "r");

        System.out.print("Original String: ");
        for (String str : orderLetter) {
            System.out.print(str + "");
        }

        orderLetter.sort((str1, str2) -> str1.compareToIgnoreCase(str2));

        System.out.print("\nSorted String: ");
        for (String str : orderLetter) {
            System.out.print(str + "");
        }
    }
}
