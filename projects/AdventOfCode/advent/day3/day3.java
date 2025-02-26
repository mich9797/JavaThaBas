import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class day3 {
    public static void main(String[] args) {
        String input = "";
        try (BufferedReader src = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")))) {
            input = src.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        
   
        Pattern pattern = Pattern.compile("(mul\\((\\d{1,3}),(\\d{1,3})\\))|(do\\(\\))|(don't\\(\\))");
        Matcher matcher = pattern.matcher(input);
        
        boolean enabled = true; 
        int Sum = 0;
        
        while (matcher.find()) {
            if (matcher.group(1) != null) { 
             
                if (enabled) {
                    int num1 = Integer.parseInt(matcher.group(2));
                    int num2 = Integer.parseInt(matcher.group(3));
                    Sum += num1 * num2;
                }
            } else if (matcher.group(4) != null) { 
              
                enabled = true;
            } else if (matcher.group(5) != null) { 
        
                enabled = false;
            }
        }
        
        System.out.println("La somma totale è: " + Sum);
    }
}
