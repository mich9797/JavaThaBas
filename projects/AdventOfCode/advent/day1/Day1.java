package advent.day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


public class Day1 {
    public static void main(String[] args) throws IOException {
        String filePath = "advent/day1/input.txt"; // Better from args
        ArrayList<Integer> rightList = new ArrayList<Integer>(); // Better use the interface on the left hand side
        ArrayList<Integer> leftList = new ArrayList<Integer>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) { // Explain Try-with-resources
            // Explain reader
            // Explain BufferedReader
            String line;
            while ((line = br.readLine()) != null) {

                String[] parts = line.trim().split("\\s+");
                if (parts.length == 2) {
                    leftList.add(Integer.parseInt(parts[0]));
                    rightList.add(Integer.parseInt(parts[1]));
                } else {
                    // Report error, or throw
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        } catch (NumberFormatException ex) {
            // TODO
        }
        // Should not continue in case of exception
        
        Collections.sort(leftList);
        Collections.sort(rightList); // arrange in decrescent

        int totDist = 0;
        for (int i = 0; i < leftList.size(); i++) {
            totDist += Math.abs(rightList.get(i) - leftList.get(i));
        }

        System.out.println("The value is: " + totDist);
    }
}

//packaging
