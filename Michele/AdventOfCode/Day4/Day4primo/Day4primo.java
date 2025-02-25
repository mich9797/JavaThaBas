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

public class Day4primo{
    public static void main(String[] args) {
        try {
            var src = new BufferedReader(new InputStreamReader(new FileInputStream("input4.txt")));
            List<List<Integer>> tabella = new ArrayList<>();

            src.lines()
                .map(riga -> {
                    List<Integer> caratteri = new ArrayList<>();
                    for (int i=0; i < riga.length(); i++){
                        caratteri.add(convertiChar(riga.charAt(i)));
                    }
                    return caratteri.stream().toList();  //lista
                })
                .forEach(lista -> {
                    tabella.add(lista);
                });

                System.out.println(tabella); //stampo tutta lista

                //System.out.println(tabella.get(0).get(4));   // stampo carattere in posizione indice 4 della lista con indice 0  ( quinto carattere della prima lista )
                int cont = 0;
                for (int i=0; i < tabella.size(); i++){
                    for (int j=0; j < tabella.get(i).size(); j++){
                        if (tabella.get(i).get(j) == 1){

                            if(orizzontale(tabella.get(i), j)){
                                cont++;
                            }

                        }
                    }
                }
                System.out.println(cont);
                

        } catch (Exception e) {
            // TODO: handle exception
        }
        

    }

    public static int convertiChar(char c){
        switch (c) {
            case 'X':
                return 1;
            case 'M':
                return 2;
            case 'A':
                return 3;
            case 'S':
                return 4;
            default:
                return 0;
        }
    }

    public static boolean orizzontale(List<Integer> tabella, int j){
        int xmas = 0;
        if ((j+3) < tabella.size() ){
            for (int x=j; x<=(j+3); x++){
                switch (tabella.get(x)) {
                    case 1:
                        if(xmas == 0){
                            xmas += tabella.get(x);
                        };
                        break;
                    case 2:
                        if(xmas == 1){
                            xmas += tabella.get(x);
                        };
                        break;
                    case 3:
                        if(xmas == 3){
                            xmas += tabella.get(x);
                        };
                        break;
                    default:
                        if(xmas == 6){
                            xmas += tabella.get(x);
                        };
                        break;
                };
            }
        }
        if (xmas == 10){
            return true;
        }
        return false;
    }


}