import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Gioco2stream{
    public static void main(String[] args) {
        try {
            Files.lines(Paths.get("input.txt"))
                .map(riga -> riga.split(" "))
                .map(arrayOfStrings -> Stream.of(arrayOfStrings).map(Integer::parseInt).toArray(i -> new Integer[i]))
                .map(arrayOfIntegers)


        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }

    boolean Crescente(ArrayList<Integer> report){      //controllo se il report è crescente
        for (int i=0; i < report.size()-1; i++){
            if(report.get(i) >= report.get(i+1)){
                return false;
            }
        }
    return true;
    } 

    boolean Decrescente(ArrayList<Integer> report){      //controllo se il report è decrescente
        for (int i=0; i < report.size()-1; i++){
            if(report.get(i) <= report.get(i+1)){
                return false;
            }
        }
    return true;
    }

    boolean DistanzaNum(ArrayList<Integer> report){                  //controlla la differenza se è accettabile
        for(int i=0; i < report.size()-1; i++){
            if (Math.abs(report.get(i) - report.get(i+1)) < 1 ||  Math.abs(report.get(i) - report.get(i+1)) > 3 ){
                return false;
            }
        }
    return true;
    }
}