import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class AOC8 {
    public static void main(String[] args) {
        var input = AOC8.class.getResourceAsStream("input");
        final List<String> linee = new BufferedReader(new InputStreamReader(input)).lines().toList();

        int righe = linee.size();
        int colonne = linee.get(0).length();
        Coppia[][] tabella = new Coppia[righe][colonne];  // creo tabella di coppie vuota

        for (int i=0; i < righe; i++){                    //riempo la tabella di coppie con simbolo carattere trovato e antinode = 0
            for (int j=0; j<colonne; j++){
                tabella[i][j] = new Coppia(linee.get(i).charAt(j));
            }
        }

        for (int i=0; i < tabella.length; i++){         //controllo coppie e setto antinodi e #
            for (int j=0; j < tabella[0].length; j++){
                if (tabella[i][j].getSimbolo() != '.' && tabella[i][j].getSimbolo() != '#' ){
                    cercoNellaTabella(tabella[i][j].getSimbolo(), tabella, j, i);
                }
            }
        }

        System.out.println(contaAntinode(tabella));
    }

    public static void cercoNellaTabella(char simboloDaTrovare, Coppia[][] tabella, int x, int y){
        for (int i=y; i < tabella.length; i++){
            for (int j=0; j<tabella[i].length; j++){
                if (i != y && j != x) {
                    if (tabella[i][j].getSimbolo() == simboloDaTrovare) {
                        int distX = j - x;
                        int distY = i - y;
                        if ((x - distX) >= 0 && (x - distX) < tabella[0].length && (y - distY) >= 0 && (y - distY) < tabella.length) {  //controllo se esiste la posizione in tabella
                            settoAntinodo(tabella, (x - distX), (y - distY));
                        }
                        if ((j + distX) < tabella[0].length && (j + distX) >= 0 && (i + distY) < tabella.length && (i + distY) >= 0) {   //controllo se esiste posizione in tabella
                            settoAntinodo(tabella, (j + distX), (i + distY));
                        }
                    }
                }
            }
        }
    }

    public static void settoAntinodo(Coppia[][] tabella, int x, int y) {
        tabella[y][x].setAntinode(1);
        if (tabella[y][x].getSimbolo() == '.') {
            tabella[y][x].setSimbolo('#');
        }
    }

    public static int contaAntinode(Coppia[][] tabella){
        int antinodiTot = 0;

        for (int i=0; i < tabella.length; i++){
            for (int j=0; j < tabella[0].length; j++){
                if (tabella[i][j].getAntinode() == 1){
                    antinodiTot++;
                }
            }
        }
        return antinodiTot;
    }
}
