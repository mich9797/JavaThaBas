package advent.day9;

import java.util.ArrayList;
import java.util.List;

public class Mappa {
    public List<Integer> compile(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Input no null or empty.");
        }
        List<Integer> code = new ArrayList<>();
        int id = 0;
        boolean writeId = true;
        for (int idx = 0; idx < input.length(); idx++) {
            int repetitions = Character.getNumericValue(input.charAt(idx));
            if (repetitions < 0) {
                throw new IllegalArgumentException("Invalid character at point" + idx);
            }
            if (writeId) {
                for (int i = 0; i < repetitions; i++) {
                    code.add(id);
                }
                id++;
            } else {
                for (int i = 0; i < repetitions; i++) {
                    code.add(-1);
                }
            }
            writeId = !writeId;
        }
        return code;
    }
}
