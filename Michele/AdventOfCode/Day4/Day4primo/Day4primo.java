import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Day4primo{
    public static void main(String[] args) {
        try {
            var src = new BufferedReader(new InputStreamReader(new FileInputStream("input4.txt")));

            src.lines()
                .map(riga -> {
                    List<Character> caratteri = new ArrayList<>();
                    for (int i=0; i < riga.length(); i++){
                        caratteri.add(riga.charAt(i));
                    }
                    return caratteri.stream().toList();  //lista
                })
                .forEach(System.out::println);

        } catch (Exception e) {
            // TODO: handle exception
        }
        

    }
}