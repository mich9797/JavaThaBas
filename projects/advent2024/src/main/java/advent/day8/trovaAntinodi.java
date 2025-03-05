package advent.day8;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class trovaAntinodi {
    public static int trovaAntinodes(Map<Character, List<int[]>> antenne, int righe, int colonne) {
        Set<String> antinodi = new HashSet<>(); //no duplicati + insieme

        for (List<int[]> positions : antenne.values()) { //ciclo per ogni lista di posizioni, si spera
            if (positions == null) continue;

            for (int i = 0; i < positions.size(); i++) {
                for (int j = i + 1; j < positions.size(); j++) {
                    int[] pos1 = positions.get(i);
                    int[] pos2 = positions.get(j);


                    if (pos1.length != 2 || pos2.length != 2) continue;

                    int x1 = pos1[0], y1 = pos1[1]; //calcolo distanza
                    int x2 = pos2[0], y2 = pos2[1];


                    int dx = Math.abs(x1 - x2);
                    int dy = Math.abs(y1 - y2);


                    if (dx == 2 * dy && dy != 0) {
                        int antinodeX = (x1 + x2) / 2; //media matemartica
                        int antinodeY = (y1 + y2) / 2;


                        if (antinodeX >= 0 && antinodeX < righe && antinodeY >= 0 && antinodeY < colonne) {
                            antinodi.add(antinodeX + "," + antinodeY);
                        }
                    }
                }
            }
        }

        return antinodi.size();
    }
}

