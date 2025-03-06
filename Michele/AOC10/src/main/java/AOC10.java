import java.io.BufferedReader;
import java.io.InputStreamReader;
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
                System.out.print(matrice[i][j]);
            }
            System.out.println();
        }

        System.out.println(percorri(matrice));


    }

    public static int percorri(int[][] matrice){
        int cont = 0;
        for (int i=0; i < matrice.length; i++){
            for (int j=0; j < matrice[0].length; j++){
                if(matrice[i][j] == 0){
                    cercaPercorsi(matrice, new Posizione(i,j), Direzione.UP, 0, cont);
                }
            }
        }
        return cont;
    }

    public static boolean controlloPosValida(int[][] matrice, Posizione pos){
        if(pos.getx() < 0 || pos.getx() >= matrice[0].length || pos.gety() < 0 || pos.gety() >= matrice.length){
            return false;
        }else {
            return true;
        }
    }

    public static void cercaPercorsi(int[][] matrice, Posizione posizione, Direzione direzione, int num, int cont){
        if(num == 9){
            cont++;
            return;
        }
        Posizione nuovaPos = new Posizione(posizione.getx()+ direzione.x, posizione.gety()+ direzione.y);
        if(controlloPosValida(matrice, nuovaPos)){
            if(matrice[nuovaPos.gety()][nuovaPos.getx()] == num+1){
                cercaPercorsi(matrice, nuovaPos, direzione, num+1, cont);
            }
        }
        if(Direzione.getNextCW(direzione) != Direzione.UP){
            cercaPercorsi(matrice, posizione, Direzione.getNextCW(direzione), num, cont);
        }
    }
}
