import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class AOC16 {
    public static void main(String[] args){
        final var input = AOC16.class.getResourceAsStream("input");
        final List<String> file = new BufferedReader(new InputStreamReader(input)).lines().toList();

        Labirint labirint = new Labirint(file);


    }
}
