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

            stampaDiagonaliPrincipali(testo);
     
        
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

    public static int orizzontale(List<String> testo){
        int xmas = 0;
        for (String stringa : testo) {
            xmas += conta(stringa);                        
        }
        return xmas;
    }

    public static void stampaDiagonaliPrincipali(List<String> testo) {
        int n = testo.size();

        // Diagonali sopra e sulla principale
        String diagonale ="";
        for (int col = 0; col < n; col++) {
            int i = 0, j = col;
            while (i < n && j < n) {
                diagonale = diagonale + (testo.get(i).charAt(j));
                i++;
                j++;
            }
            System.out.println();
        }

        // // Diagonali sotto la principale
        // for (int row = 1; row < n; row++) {
        //     int i = row, j = 0;
        //     while (i < n && j < n) {
        //         System.out.print(matrice[i][j] + " ");
        //         i++;
        //         j++;
        //     }
        //     System.out.println();
        // }
    }


    public static int verticale(List<String> testo){
        int xmas = 0;
        for (int i=0; i < testo.get(0).length(); i++){
            String verticale = "";
            for (String string : testo) {
                verticale = verticale + string.charAt(i);
            }
            
            xmas += conta(verticale);
        }
        return xmas;
    }

    

    public static int conta(String stringa){
        int xmas = 0;
        Pattern pattern = Pattern.compile("XMAS");
        Matcher match = pattern.matcher(stringa);
        while (match.find()) {
            xmas++;
        }

        String stringaReverse = reverseString(stringa);
        match = pattern.matcher(stringaReverse);
        while (match.find()) {
            xmas++;
        }
        return xmas;
    }
}