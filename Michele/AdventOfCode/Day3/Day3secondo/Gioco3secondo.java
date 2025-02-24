import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Gioco3secondo{
   
    public static void main(String[] args){

        try {

        String testo = Files.readString(Paths.get("input3.txt"));
        int somma = 0;
                        
        Pattern pattern = Pattern.compile("mul\\([0-9]{1,3},[0-9]{1,3}\\)|don't\\(\\)|do\\(\\)");
        Matcher match = pattern.matcher(testo); 
    
        boolean conta = true;

        while(match.find()){     //trovo elemento
            String patternTrovato = match.group();
            switch (patternTrovato) {
                case "don't()":
                    conta = false;
                    break;
                case "do()":
                    conta = true;
                    break;
                default:
                    if(conta){
                        String[] numeri = patternTrovato.substring(4, patternTrovato.length() - 1).split(",");  //separo i due numeri che mi interessano che sono letti ancora in stringhe
                        int num1 = Integer.parseInt(numeri[0]);  // trasformo in interi
                        int num2 = Integer.parseInt(numeri[1]);  // trasformo in interi
                        somma += num1 * num2;
                    }
                    break;
            }
        }
        
        System.out.println(somma);

        } catch (Exception e) {
            // TODO: handle exception
        }          
    }
}