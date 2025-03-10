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

        Position pos = new Position(0,0);
        System.out.println(areaFigura(matrice, pos, Direction.UP));

    }

    public static boolean daContare(Plant[][] matrice, Position pos){
        if (pos.getX() < 0 || pos.getX() >= matrice.length || pos.getY() < 0 || pos.getY() >= matrice[0].length || matrice[pos.getX()][pos.getY()].getVisitato() == 1){
            return false;
        }else {
            return true;
        }
    }

    public static int areaFigura(Plant[][] matrice, Position pos, Direction dir){ //da riformulare
        int area = 0;
        switch (dir){
            case UP:
                Position nuovaPos = new Position((pos.getX() + dir.x), (pos.getY() + dir.y));
                if (daContare(matrice, nuovaPos) && matrice[pos.getX()][pos.getY()].getValore() == matrice[nuovaPos.getX()][nuovaPos.getY()].getValore()){
                    matrice[pos.getX()][pos.getY()].setVisitato(1);
                    area += areaFigura(matrice, nuovaPos, Direction.UP);
                }
                area += areaFigura(matrice, pos, Direction.getNextDirezione(dir));
                break;
            case RIGHT:
                Position nuovaPos2 = new Position((pos.getX() + dir.x), (pos.getY() + dir.y));
                if (daContare(matrice, nuovaPos2) && matrice[pos.getX()][pos.getY()].getValore() == matrice[nuovaPos2.getX()][nuovaPos2.getY()].getValore()){
                    matrice[pos.getX()][pos.getY()].setVisitato(1);
                    area += areaFigura(matrice, nuovaPos2, Direction.UP);
                }
                area += areaFigura(matrice, pos, Direction.getNextDirezione(dir));
                break;
            case DOWN:
                Position nuovaPos3 = new Position((pos.getX() + dir.x), (pos.getY() + dir.y));
                if (daContare(matrice, nuovaPos3) && matrice[pos.getX()][pos.getY()].getValore() == matrice[nuovaPos3.getX()][nuovaPos3.getY()].getValore()){
                    matrice[pos.getX()][pos.getY()].setVisitato(1);
                    area += areaFigura(matrice, nuovaPos3, Direction.UP);
                }
                area += areaFigura(matrice, pos, Direction.getNextDirezione(dir));
                break;
            default:
                Position nuovaPos4 = new Position((pos.getX() + dir.x), (pos.getY() + dir.y));
                if (daContare(matrice, nuovaPos4) && matrice[pos.getX()][pos.getY()].getValore() == matrice[nuovaPos4.getX()][nuovaPos4.getY()].getValore()){
                    area += areaFigura(matrice, nuovaPos4, Direction.UP);
                }else {
                    matrice[pos.getX()][pos.getY()].setVisitato(1);
                    return 1;
                }
        }
        return area;
    }

}
