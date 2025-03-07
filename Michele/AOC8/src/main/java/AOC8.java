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
                    Posizione pos = new Posizione(i,j);
                    cercoNellaTabella(tabella[i][j].getSimbolo(), tabella, pos);
                }
            }
        }

        System.out.println(contaAntinode(tabella));
    }

    public static void cercoNellaTabella(char simboloDaTrovare, Coppia[][] tabella, Posizione pos){
        for (int i=pos.getX(); i < tabella.length; i++){
            for (int j=0; j<tabella[i].length; j++){
                if (i != pos.getX() && j != pos.getY()) {
                    if (tabella[i][j].getSimbolo() == simboloDaTrovare) {
                        Posizione pos2 = new Posizione(i,j); //secondo simbolo trovato
                        int distX = i - pos.getX();
                        int distY = j - pos.getY();
                        Posizione antinode1 = new Posizione((pos.getX() - distX), (pos.getY() - distY));  //salvo le possibili posizioni degli antinode
                        Posizione antinode2 = new Posizione((pos2.getX() + distX), (pos2.getY() + distY));
                        if (esistePos(tabella, antinode1)) {  //controllo se esiste la posizione in tabella
                            settoAntinodo(tabella, antinode1);
                        }
                        if (esistePos(tabella, antinode2)) {   //controllo se esiste posizione in tabella
                            settoAntinodo(tabella, antinode2);
                        }
                    }
                }
            }
        }
    }

    public static boolean esistePos(Coppia[][] tabella, Posizione pos){
        if(pos.getX() < 0 || pos.getX() >= tabella.length || pos.getY() < 0 || pos.getY() >= tabella[0].length){
            return false;
        }
        return true;
    }

    public static void settoAntinodo(Coppia[][] tabella, Posizione pos) {
        tabella[pos.getX()][pos.getY()].setAntinode(1);
        if (tabella[pos.getX()][pos.getY()].getSimbolo() == '.') {
            tabella[pos.getX()][pos.getY()].setSimbolo('#');
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
