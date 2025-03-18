package EserciziOnline.Variabili.W3Resource.Functional_Programming.Java_Lambda_Expressions.Average_List;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Double> nums = Arrays.asList(3.5, 7.5, 4.3, 4.7, 5.1);

        System.out.println("Original values: " + nums);
        double average = nums.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println("\naverage of the original values: " + average);
    }
}
