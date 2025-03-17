package advent.day8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrovaAntenne {
    public static Map<Character, List<Vector>> findAntennas(char[][] grid) {
        Map<Character, List<Vector>> antennas = new HashMap<>();
        int columns = grid[0].length;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < columns; col++) {
                char cell = grid[row][col];
                if (isValidAntennaCell(cell)) {
                    antennas.computeIfAbsent(cell, k -> new ArrayList<>()).add(new Vector(row, col));
                }
            }
        }
        return antennas;
    }

    private static boolean isValidAntennaCell(char cell) {
        return Character.isLetterOrDigit(cell);
    }

}
