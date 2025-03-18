package EserciziOnline.Variabili.W3Resource.Functional_Programming.Java_Lambda_Expressions.Remove_Duplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,2,4,4,4,7,8,7,7,9,8,8,5,5,4);

        System.out.println("Lista elementi " + nums);

        List<Integer> uniquenums = new ArrayList<>();
        nums.stream()
                .distinct()
                .forEach(uniquenums::add);

        System.out.println("\nElementi senza duplicati: " + uniquenums);

    }
}
