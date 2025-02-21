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
                .map(arrayOfIntegers -> Stream.of(arrayOfIntegers));


            

        } catch (Exception e) {
            // TODO: handle exception
        } 
    }
}