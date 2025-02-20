package AdvendtCode1.java;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


public class AdvendtCode1 {
 public static void main(String[] args) {
  String filePath = "AdventCode1.txt";
  ArrayList<Integer> rightList = new ArrayList<Integer>(); //up or down?
  ArrayList<Integer> leftList = new ArrayList<Integer>();

  try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) { //no empty lines
                if (line.trim().isEmpty()) {
                    continue;
                }
           
                String[] parts = line.trim().split("\\s+"); //space between numbers
                if (parts.length >= 2) {
                    int left = Integer.parseInt(parts[0]);
                    int right = Integer.parseInt(parts[1]);
                    leftList.add(left);
                    rightList.add(right);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }



  
    Collections.sort(leftList);
    Collections.sort(rightList);

  int totDist = 0; {
    for (int i = 0; i < leftList.size(); i++){
          totDist += Math.abs(rightList.get(i) - leftList.get(i));
      }
 }
 System.out.println("The value is: " + totDist);
}
}