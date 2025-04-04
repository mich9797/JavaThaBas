//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.List;
//
//public class AOC12 {
//    public static void main(String[] args){
//
//        var input = AOC12.class.getResourceAsStream("input");
//        List<String> file = new BufferedReader(new InputStreamReader(input)).lines().toList();
//
//        int righe = file.size();
//        int colonne = file.get(0).length();
//        Cell[][] matrice = new Cell[righe][colonne];
//
//        for (int i=0; i < righe; i++){
//            for (int j=0; j < colonne; j++){
//                matrice[i][j] = new Cell(file.get(i).charAt(j));
//            }
//        }
//
//        List<Integer> area = new ArrayList<>();
//
//        salvaAree(matrice, area);
//
//        azzeraMatrice(matrice);
//
//        List<Integer> perimetro = new ArrayList<>();
//
//        salvaPerimetri(matrice, perimetro);
//
//        System.out.println(sommaTot(area, perimetro));
//
//    }
//
//    public static void azzeraMatrice(Cell[][] matrice){
//        for (int i=0; i < matrice.length; i++) {
//            for (int j = 0; j < matrice[0].length; j++) {
//                matrice[i][j].setVisitato(0);
//            }
//        }
//    }
//
//    public static int areaFigura(Cell[][] matrice, Position pos) {
//        matrice[pos.getX()][pos.getY()].setVisitato(1);
//        int area = 1;
//        char valoreCorrente = matrice[pos.getX()][pos.getY()].getValore();
//
//        for (Direction dir : Direction.values()) {
//            Position nuovaPos = new Position(pos.getX() + dir.x, pos.getY() + dir.y);
//            if (nuovaPos.esiste(matrice) && matrice[nuovaPos.getX()][nuovaPos.getY()].getVisitato() != 1 && matrice[nuovaPos.getX()][nuovaPos.getY()].getValore() == valoreCorrente) {
//                area += areaFigura(matrice, nuovaPos);
//            }
//        }
//        return area;
//    }
//
//    public static int perimetroFigura(Cell[][] matrice, Position pos) {
//        matrice[pos.getX()][pos.getY()].setVisitato(1);
//        int perimetro = 0;
//        char valoreCorrente = matrice[pos.getX()][pos.getY()].getValore();
//
//        for (Direction dir : Direction.values()) {
//            Position nuovaPos = new Position(pos.getX() + dir.x, pos.getY() + dir.y);
//            if (nuovaPos.esiste(matrice) && matrice[nuovaPos.getX()][nuovaPos.getY()].getVisitato() != 1 && matrice[nuovaPos.getX()][nuovaPos.getY()].getValore() == valoreCorrente) {
//                perimetro += perimetroFigura(matrice, nuovaPos);
//            }else if (!nuovaPos.esiste(matrice) || matrice[nuovaPos.getX()][nuovaPos.getY()].getValore() != valoreCorrente){
//                perimetro += 1;
//            }
//        }
//        return perimetro;
//    }
//
//    public static void salvaAree(Cell[][] matrice, List<Integer> area){
//        for (int i=0; i < matrice.length; i++){
//            for (int j=0; j < matrice[0].length; j++){
//                if (matrice[i][j].getVisitato() != 1){
//                    area.add(areaFigura(matrice, new Position(i,j)));
//                }
//            }
//        }
//    }
//
//    public static void salvaPerimetri(Cell[][] matrice, List<Integer> perimetro){
//        for (int i=0; i < matrice.length; i++){
//            for (int j=0; j < matrice[0].length; j++){
//                if (matrice[i][j].getVisitato() != 1){
//                    perimetro.add(perimetroFigura(matrice, new Position(i,j)));
//                }
//            }
//        }
//    }
//
//    public static int sommaTot(List<Integer> aree, List<Integer> perimetri){
//        int somma = 0;
//        for (int i=0; i < aree.size(); i++){
//            somma += aree.get(i)*perimetri.get(i);
//        }
//        return somma;
//    }
//}
