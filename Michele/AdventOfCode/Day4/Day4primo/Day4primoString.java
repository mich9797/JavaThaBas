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
                .forEach(riga -> testo.add(riga));

            int xmas = 0;

            xmas += orizzontale(testo);
            xmas += verticale(testo);
            xmas += DiagonaliPrincipali(testo);
            xmas += DiagonaliSecondarie(testo);
                
            System.out.println(xmas);


        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static int orizzontale(List<String> testo){
        int cont = 0;
        for (String stringa : testo) {
            cont += conta(stringa);                        
        }
        return cont;
    }

    public static int verticale(List<String> testo){
        int cont = 0;
        for (int i=0; i < testo.get(0).length(); i++){
            String verticale = "";
            for (String string : testo) {
                verticale = verticale + string.charAt(i);
            }
            
            cont += conta(verticale);
        }
        return cont;
    }

    public static int DiagonaliPrincipali(List<String> testo) {
        int n = testo.size();
        int cont = 0;

        // Diagonali sopra e sulla principale
        for (int col = 0; col < n; col++) {
            String diagonale ="";
            int i = 0, j = col;
            while (i < n && j < n) {
                diagonale = diagonale + (testo.get(i).charAt(j));
                i++;
                j++;
            }
            cont += conta(diagonale);
            
        }
        
         // Diagonali sotto la principale
        for (int row = 1; row < n; row++) {
             int i = row, j = 0;
             String diagonale ="";
             while (i < n && j < n) {
                 diagonale = diagonale + (testo.get(i).charAt(j));
                 i++;
                 j++;
             }
             cont += conta(diagonale);
        }
        return cont;
    }

    public static int DiagonaliSecondarie(List<String> testo) {
        int n = testo.size();
        int cont = 0;

        // Diagonali sopra e sulla secondaria
        for (int col = n - 1; col >= 0; col--) {
            int i = 0, j = col;
            String diagonale ="";
            while (i < n && j >= 0) {
                diagonale = diagonale + (testo.get(i).charAt(j));
                i++;
                j--;
            }
            cont += conta(diagonale);
        }

        // Diagonali sotto la secondaria
        for (int row = 1; row < n; row++) {
            int i = row, j = n - 1;
            String diagonale ="";
            while (i < n && j >= 0) {
                diagonale = diagonale + (testo.get(i).charAt(j));
                i++;
                j--;
            }
            cont += conta(diagonale);
        }

        return cont;
    }
    

    public static int conta(String stringa){
        int cont = 0;
        Pattern pattern = Pattern.compile("XMAS");
        Matcher match = pattern.matcher(stringa);
        while (match.find()) {
            cont++;
        }

        String stringaReverse = reverseString(stringa);
        match = pattern.matcher(stringaReverse);
        while (match.find()) {
            cont++;
        }
        return cont;
    }

    public static String reverseString(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
           result = str.charAt(i) + result;
        }
        return result;
    }
}