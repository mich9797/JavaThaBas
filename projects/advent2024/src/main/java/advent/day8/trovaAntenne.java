package advent.day8;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class trovaAntenne {
    public static Map<Character, List<int[]>> trovaAntenne(char[][] grid) {
        Map<Character, List<int[]>> antenne = new HashMap<>();

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
             char cell = grid [r][c];
             if (Character.isLetterOrDigit(cell)) {
                 antenne.computeIfAbsent(cell, k -> new ArrayList<>()).add(new int[]{r, c}); //creo nuova lista se non c'è cell sopra
             }

            }
        }
        return antenne;
    }
}
