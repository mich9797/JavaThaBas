package advent.day9;
import java.util.List;
import java.util.stream.IntStream;

public class Ordina {
    public static void sort(List<Integer> code) {
        if (code == null) {
            throw new IllegalArgumentException("Code list cannot be null, mona.");
        }
        for (int i = 0, j = code.size() - 1; i < j; i++) {
            if (code.get(i) == -1) {
                while (code.get(j) < 0) {
                    j--;
                }
                if (j < i) {
                    break;
                }
                code.set(i, code.get(j));
                j--;
            }
        }
    }
}
