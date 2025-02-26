import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class day4 {
    public static void main(String[] args) {
        List<String> linee;
        try {
            linee = Files.readAllLines(Paths.get("input.txt"));
        } catch (IOException e) {
            System.err.println("Error reading file input.txt: " + e.getMessage());
            return;
        }
        
        if (linee.isEmpty()) {
            System.out.println("Empty file, unlucky for you.");
            return;
        }
        
        int riga = linee.size();
        int colonna = linee.get(0).length();
        char[][] matrice = new char[riga][colonna];
    
        for (int i = 0; i < riga; i++) {
            matrice[i] = linee.get(i).toCharArray();
        }
        
        int count = 0;
        String target = "XMAS";
        
        // Cerca in tutte le 8 direzioni
        int[] dx = {-1, -1, -1,  0, 0, 1, 1, 1}; 
        int[] dy = {-1,  0,  1, -1, 1, -1, 0, 1}; 
        
        for (int i = 0; i < riga; i++) {
            for (int j = 0; j < colonna; j++) {
                for (int d = 0; d < 8; d++) {
                    int x = i;
                    int y = j;
                    StringBuilder parola = new StringBuilder();
                    
                    for (int k = 0; k < target.length(); k++) {
                        if (x < 0 || x >= riga || y < 0 || y >= colonna) {
                            break;
                        }
                        parola.append(matrice[x][y]);
                        x += dx[d];
                        y += dy[d];
                    }
            
                    if (parola.length() == target.length() && parola.toString().equals(target)) {
                        count++;
                    }
                }
            }
        }
        
        System.out.println("La parola XMAS appare: " + count + " volte.");
    }
}
