package advent.day8;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class trovaAntinodi {
    public static int trovaAntinodi(Map<Character, List<int[]>> antenne, int righe, int colonne) {
        Set<String> antinodi = new HashSet<>();
        for (List<int[]> positions : antenne.values()) {
            for (int i = 0; i < positions.size(); i++) {
                for (int j = i + 1; j < positions.size(); j++) {
                    int[] pos1 = positions.get(i);
                    int[] pos2 = positions.get(j);
                    int x1 = pos1[0], y1 = pos1[1];
                    int x2 = pos2[0], y2 = pos2[1];
                    if ((2 * x1 + x2) % 3 == 0 && (2 * y1 + y2) % 3 == 0) {
                        int antinodeX1 = (2 * x1 + x2) / 3;
                        int antinodeY1 = (2 * y1 + y2) / 3;
                        addAntinode.add(antinodeX1, antinodeY1, righe, colonne, antinodi);
                    }
                    if ((x1 + 2 * x2) % 3 == 0 && (y1 + 2 * y2) % 3 == 0) {
                        int antinodeX2 = (x1 + 2 * x2) / 3;
                        int antinodeY2 = (y1 + 2 * y2) / 3;
                        addAntinode.add(antinodeX2, antinodeY2, righe, colonne, antinodi);
                    }
                }
            }
        }
        return antinodi.size();
    }
}
