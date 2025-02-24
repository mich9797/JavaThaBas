import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Gioco2{
    int reportSafe = 0;
    public static void main(String[] args){
        
        Gioco2 game = new Gioco2();
        game.leggi();
        System.out.println(game.reportSafe);

    }

    void leggi(){
        try {
            List<String> lines = Files.readAllLines(Paths.get("input.txt"));
            for (String line : lines){

                String[] valori =line.split(" ");

                ArrayList<Integer> report = new ArrayList<>();

                for (String num : valori){
                    int a = Integer.parseInt(num);
                    report.add(a);
                }
                
                if((Crescente(report) == true || Decrescente(report) == true) && DistanzaNum(report) == true){
                    reportSafe++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
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
