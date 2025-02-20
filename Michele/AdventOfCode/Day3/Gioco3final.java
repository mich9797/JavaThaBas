import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Gioco3final{
    public static void main(String[] args) {
        try {
            CharSequence sequenza = "mul(";
            Stream<String> lines = Files.lines(Paths.get("inputFinal.txt"));
            List<String> righe = lines.filter(riga -> riga.contains(sequenza)).collect(Collectors.toList());
            righe.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}