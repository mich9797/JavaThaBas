package advent.day8;

import java.util.Set;

public class addAntinode {
    private static void addAntinode(int x, int y, int righe, int colonne, Set<String> antinodi) {
        if (x >= 0 && x < righe && y >= 0 && y < colonne) {
            antinodi.add(x + "," + y);
        }
    }
}

