package advent.day7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {

            // TODO: discuss try-with-resources
            var input = Main.class.getResourceAsStream("input.txt");
            final List<String> lines = new BufferedReader(new InputStreamReader(input)).lines().toList();

            long totalCalibrationResult = 0; // Risultato totale da sommare
            for (String line : lines) {
                String[] parts = line.split(": ");     // Pars test value e i numeri
                long target = Long.parseLong(parts[0].trim());
                String[] numbers = parts[1].split(" ");
                int[] nums = new int[numbers.length];
                for (int i = 0; i < numbers.length; i++) {
                    nums[i] = Integer.parseInt(numbers[i]);
                }


                if (isValidEquation(nums, target)) {// Se l'equazione valida, somma il target al risultato totale
                    totalCalibrationResult += target;
                }
            }


            System.out.println("Total Calibration Result: " + totalCalibrationResult);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private static boolean isValidEquation(int[] nums, long target) {
        if (nums.length == 0) return false;


        List<String> operatorsCombinations = generateOperatorsCombinations(nums.length - 1);


        for (String operators : operatorsCombinations) {
            if (evaluate(nums, operators) == target) {
                return true;
            }
        }
        return false;
    }


    private static List<String> generateOperatorsCombinations(int length) {
        List<String> combinations = new ArrayList<>();
        int totalCombinations = (int) Math.pow(2, length);
        for (int i = 0; i < totalCombinations; i++) {
            StringBuilder combination = new StringBuilder();
            for (int j = 0; j < length; j++) {
                if ((i & (1 << j)) != 0) {
                    combination.append("*");
                } else {
                    combination.append("+");
                }
            }
            combinations.add(combination.toString());
        }
        return combinations;
    }


    private static long evaluate(int[] nums, String operators) {
        long result = nums[0];
        for (int i = 0; i < operators.length(); i++) {
            char operator = operators.charAt(i);
            if (operator == '+') {
                result += nums[i + 1];
            } else if (operator == '*') {
                result *= nums[i + 1];
            }
        }
        return result;
    }
}