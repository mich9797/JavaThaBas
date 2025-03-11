package advent.day9;
import java.util.List;
import java.util.stream.IntStream;

public class Ordina {
    public void sort(List<Integer> code) {
        if (code == null) {
            throw new IllegalArgumentException("Code list cannot be null, mona.");
        }
        for (int i = 0; i < code.size(); i++) {
            if (code.get(i) == -1) {
                int lastNumIndex = findLastNumberIndex(code);
                if (lastNumIndex <= i) {
                    break;
                }
                int temp = code.get(lastNumIndex);
                code.set(lastNumIndex, code.get(i));
                code.set(i, temp);
            }
        }
    }

    private int findLastNumberIndex(List<Integer> code) {
        return IntStream.range(0, code.size())
                .map(i -> code.size() - 1 - i)
                .filter(i -> code.get(i) != -1)
                .findFirst()
                .orElse(-1);
    }
}
