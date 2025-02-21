import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collection;


public class Gioco3{
    public static void main(String[] args){

        try {
            
        var src = new BufferedReader(new InputStreamReader(new FileInputStream("input3.txt")));

        List<String> ripetizioni = src.lines()
                            .map(Gioco3::trovaMul) //arriva una List<String> con tre elementi      ci sono tre mul
                            .flatMap(Collection::stream)
                            .collect(Collectors.toList()); 
                            

        System.out.println(ripetizioni);

        } catch (Exception e) {
        // TODO: handle exception
        }

        
    }

    public static List<String> trovaMul(String s){
        List<String> tuttiMul = new ArrayList<>();
        for (int i=0; i < s.length(); i++){
            int inizioMul = s.indexOf("mul", i);
            int fineMul = inizioMul + ("mul".length());
            String mul = s.substring(inizioMul, fineMul);
            tuttiMul.add(mul);
            //System.out.println(mul);
            i = fineMul-1;
        }
        return tuttiMul;
    }


}