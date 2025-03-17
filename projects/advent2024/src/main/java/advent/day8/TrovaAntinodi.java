package advent.day8;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TrovaAntinodi {

    public static int trovaAntinodi(Map<Character, List<Vector>> antenne, int righe, int colonne) {
        Set<Vector> antinodi = new HashSet<>();
        for (List<Vector> positions : antenne.values()) {

            for (int i = 0; i < positions.size(); i++) {
                for (int j = i + 1; j < positions.size(); j++) {
                    Vector p1 = positions.get(i);
                    Vector p2 = positions.get(j);

                    // REMINDER: Avoid witchcraft
                    var diff = p2.sub(p1);
                    var a2 = p2.add(diff);
                    var a1 = p1.sub(diff);
                    for (var a: List.of(a1, a2)) {
                        if (a.x >= 0 && a.x < righe && a.y >= 0 && a.y < colonne) {
                            antinodi.add(a);
                        }
                    }
                }
            }
        }
        return antinodi.size();
    }
}
