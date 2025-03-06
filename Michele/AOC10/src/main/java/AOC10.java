import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AOC10 {
    public static void main(String[] args){
        var input = AOC10.class.getResourceAsStream("input");
        final List<String> linee = new BufferedReader(new InputStreamReader(input)).lines().toList();

        int righe = linee.size();
        int colonne = linee.get(0).length();
        int[][] matrice = new int[righe][colonne];


        for (int i=0; i < righe; i++){
            for (int j=0; j < colonne; j++){
                matrice[i][j] = Character.getNumericValue(linee.get(i).charAt(j));
            }
        }

        System.out.println(percorriMatrice(matrice));

    }

    public static int percorriMatrice(int[][] matrice){
        int cont = 0;
        for (int i=0; i < matrice.length; i++){
            for (int j=0; j < matrice[0].length; j++){
                if(matrice[i][j] == 0) {
                    List<Posizione> lista = new ArrayList<>();
                    cont += cercaPercorsi(matrice, new Posizione(i,j), 0, Direzione.UP, lista);
                }
            }
        }
        return cont;
    }

    public static int cercaPercorsi(int[][] matrice, Posizione pos, int num, Direzione dir, List<Posizione> lista){
        if (matrice[pos.getx()][pos.gety()] == 9){
            if (coordinataGiaVisitata(lista, pos)){
                return 0;
            }
            lista.add(pos);
            return 1;
        }
        int percorsi = 0;
        Posizione nuovaPos = new Posizione((pos.getx()+dir.x), (pos.gety()+dir.y));
        if (miInteressa(matrice, nuovaPos, num)){
            percorsi += cercaPercorsi(matrice, nuovaPos, num+1, Direzione.UP, lista);
        }
        if(Direzione.getNextDirezione(dir) == Direzione.UP){
            return  percorsi;
        }
        percorsi += cercaPercorsi(matrice, pos, num, Direzione.getNextDirezione(dir), lista);

        return percorsi;
    }

    public static boolean miInteressa(int[][] matrice, Posizione pos, int num){ //controllo se la posizione è interna alla matrice e contiene un num maggiore di una unità
        if(pos.getx() < 0 || pos.getx() >= matrice.length || pos.gety() < 0 || pos.gety() >= matrice[0].length){
            return false;
        } else if (matrice[pos.getx()][pos.gety()] == num+1) {
            return true;
        }
        return false;
    }

    public static boolean coordinataGiaVisitata(List<Posizione> lista, Posizione pos){
        for (Posizione posizione : lista){
            if (pos.getx() == posizione.getx() && pos.gety() == posizione.gety()){
                return true;
            }
        }
        return false;
    }

}
