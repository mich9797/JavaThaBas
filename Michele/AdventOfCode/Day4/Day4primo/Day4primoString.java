import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;


public class Day4primoString{
    public static void main(String[] args) {
        try {
            var src = new BufferedReader(new InputStreamReader(new FileInputStream("input4.txt")));
            List<String> testo = new ArrayList<>();

            src.lines()
                .forEach(riga -> {
                    testo.add(riga);
                });

            System.out.println(testo);
            int xmas = 0;

            for (String stringa : testo) {
                Pattern pattern = Pattern.compile("XMAS");
                Matcher match = pattern.matcher(stringa); 
                while(match.find()){ //orizzontale
                    xmas++;
                }
                String stringaReverse = reverseString(stringa); // orizzontale contrario
                match = pattern.matcher(stringaReverse);
                while(match.find()){
                    xmas++;
                }                                
            }

            for (int i=0; i < testo.get(0).length(); i++){
                String verticale = "";
                for (String string : testo) {
                    verticale = verticale + string.charAt(i);
                }
                Pattern pattern = Pattern.compile("XMAS");
                Matcher match = pattern.matcher(verticale); 
                while(match.find()){
                    xmas++;
                }
                String stringaReverse = reverseString(verticale); // verticale contrario
                match = pattern.matcher(stringaReverse);
                while(match.find()){
                    xmas++;
                }   
            }


            
           

            System.out.println(xmas);
     
        
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static String reverseString(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
           result = str.charAt(i) + result;
        }
        return result;
      }
}