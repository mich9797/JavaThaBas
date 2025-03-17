package advent.day12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
    static int n, m;
    static char[][] grid;
    static boolean[][] visited;

    public static void main(String[] args) {
        var input = advent.day12.Main.class.getResourceAsStream("input.txt");// Legge il file "input.txt" usando il codice fornito
        if (input == null) {
            System.err.println("Impossibile trovare il file input.txt");
            return;
        }
        List<String> file = new BufferedReader(new InputStreamReader(input)).lines().toList();

        n = file.size();
        if (n == 0) {
            System.out.println("Costo totale del recinto: 0");
            return;
        }
        m = file.get(0).length();
        grid = new char[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            grid[i] = file.get(i).toCharArray();
        }
        // Esplora mappa
        long totalPrice = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j]) {
                    int[] stats = new int[2]; // stats[0] = area, stats[1] = perimetro
                    char letter = grid[i][j];
                    dfs(i, j, letter, stats);
                    totalPrice += (long) stats[0] * stats[1];
                }
            }
        }
        System.out.println("Costo totale del recinto: " + totalPrice);
    }

    static void dfs(int i, int j, char letter, int[] stats) {
        if (i < 0 || i >= n || j < 0 || j >= m || grid[i][j] != letter) {
            return;
        }
        if (visited[i][j]) {
            return;
        }
        visited[i][j] = true;
        stats[0]++;

        int[] di = {-1, 1, 0, 0};
        int[] dj = {0, 0, -1, 1};
        for (int d = 0; d < 4; d++) {
            int ni = i + di[d];
            int nj = j + dj[d];
            if (ni < 0 || ni >= n || nj < 0 || nj >= m || grid[ni][nj] != letter) {
                stats[1]++;
            } else if (!visited[ni][nj]) {
                dfs(ni, nj, letter, stats);
            }
        }
    }
}
