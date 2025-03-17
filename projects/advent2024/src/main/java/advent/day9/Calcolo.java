package advent.day9;
import java.util.List;
import java.util.stream.IntStream;

public class Calcolo {
    public static long calcoloIlTotale(List<Integer> code) {
        if (code == null) {
            throw new IllegalArgumentException("Code list cannot be null, mona.");
        }
        return IntStream.range(0, code.size())
                .takeWhile(i -> code.get(i) != -1)
                .mapToLong(i -> (long) code.get(i) * i)
                .sum();
    }
}
