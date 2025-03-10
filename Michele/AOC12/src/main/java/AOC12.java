import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class AOC12 {
    public static void main(String[] args){

        var input = AOC12.class.getResourceAsStream("input");
        List<String> file = new BufferedReader(new InputStreamReader(input)).lines().toList();

        int righe = file.size();
        int colonne = file.get(0).length();
        Plant[][] matrice = new Plant[righe][colonne];

        for (int i=0; i < righe; i++){
            for (int j=0; j < colonne; j++){
                matrice[i][j] = new Plant(file.get(i).charAt(j));
                System.out.print(matrice[i][j].getValore());
            }
            System.out.println();
        }

        for (int i=0; i < righe; i++){
            for (int j=0; j < colonne; j++){
                if (matrice[i][j].getVisitato() != 1){
                    System.out.println(areaFigura(matrice, new Position(i,j)));
                }
            }
        }



    }

    public static boolean daContare(Plant[][] matrice, Position pos){
        if (pos.getX() < 0 || pos.getX() >= matrice.length || pos.getY() < 0 || pos.getY() >= matrice[0].length || matrice[pos.getX()][pos.getY()].getVisitato() == 1){
            return false;
        }else {
            return true;
        }
    }

    public static int areaFigura(Plant[][] matrice, Position pos) {
        matrice[pos.getX()][pos.getY()].setVisitato(1);
        int area = 1;
        char valoreCorrente = matrice[pos.getX()][pos.getY()].getValore();

        for (Direction dir : Direction.values()) {
            Position nuovaPos = new Position(pos.getX() + dir.x, pos.getY() + dir.y);
            if (daContare(matrice, nuovaPos) && matrice[nuovaPos.getX()][nuovaPos.getY()].getValore() == valoreCorrente) {
                area += areaFigura(matrice, nuovaPos);
            }
        }
        return area;
    }
}
