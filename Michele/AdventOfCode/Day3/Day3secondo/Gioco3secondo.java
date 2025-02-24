import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
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
            var src = new BufferedReader(new InputStreamReader(new FileInputStream("input3.txt")));

        int somma = src.lines()
                        .flatMap(riga -> {
                            Pattern pattern = Pattern.compile("mul\\([0-9]{1,3},[0-9]{1,3}\\)");
                            Matcher match = pattern.matcher(riga);

                            Pattern patDont = Pattern.compile("don't");
                            Matcher dontMatch = patDont.matcher(riga);    
                            
                            Pattern patDo = Pattern.compile("do");
                            Matcher doMatch = patDo.matcher(riga); 
                           
                            List<Integer> trovati = new ArrayList<>();
                            
                            int x = 0;
                            boolean calcola = true;
                                while(match.find(x) && x < riga.length() ){ // se trovo un elemento che corrisponde
                                        if(calcola){
                                            String matchGroup = match.group();   // lo raccolgo
                                            String[] numeri = matchGroup.substring(4, matchGroup.length() - 1).split(",");  //separo i due numeri che mi interessano che sono letti ancora in stringhe
                                            int num1 = Integer.parseInt(numeri[0]);  // trasformo in interi
                                            int num2 = Integer.parseInt(numeri[1]);  // trasformo in interi
                                            trovati.add(num1 * num2);//aggiungo alla mia lista solo il risultato della moltriplicazione tra i due numeri 
                                        }
                                        x = match.end();
                                        if(dontMatch.find()){
                                            
                                        }
                                    
                                }
                            return trovati.stream();   //passo stream lista come return
                            
                        })
                        .mapToInt(Integer::intValue)
                        .sum();  

        System.out.println(somma);

        } catch (Exception e) {
            // TODO: handle exception
        }
        
          
            
            
            

    }


}