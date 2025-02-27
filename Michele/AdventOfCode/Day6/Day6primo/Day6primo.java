import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;

public class Day6primo{
    public static void main(String[] args) {
        List<String> linee = new ArrayList<>();
        try {
            linee = Files.readAllLines(Paths.get("input6.txt"));
        
        
        } catch (Exception e) {
            System.err.println("errore lettura file: " + e.getMessage());
            // TODO: handle exception
        }

        int riga = linee.size();
        int colonna = linee.get(0).length();
        char[][] matrice = new char[riga][colonna];

        int[] pedina = new int[2];
        String direzione = "up";
        int mosse = 0;
        boolean isPossible = true;

        for (int i = 0; i < riga; i++) {                 //ho riempito la matrice e salvato posizione pedina
            for ( int j=0; j < colonna; j++){
                matrice[i][j] = linee.get(i).charAt(j);
                if(matrice[i][j] == '^'){
                    pedina[0] = i;
                    pedina[1] = j;
                }
            }   
        }

        while(isPossible){
            switch (direzione) {
                case "up":
                    if((pedina[0]-1) < riga && (pedina[0]-1) >= 0){
                        if(matrice[pedina[0]-1][pedina[1]] == '#'){
                            direzione = "right";
                            break;
                        }else if(matrice[pedina[0]-1][pedina[1]] == 'X'){
                            matrice[pedina[0]][pedina[1]] = 'X';
                            pedina[0] -= 1;
                        }else{
                            matrice[pedina[0]][pedina[1]] = 'X';
                            pedina[0] -= 1;
                            mosse++;
                        }
                        break;
                    }else {
                        isPossible = false;
                    }
                    break;

                case "right":
                    if((pedina[1]+1) < colonna){
                        if(matrice[pedina[0]][pedina[1]+1] == '#'){
                            direzione = "down";
                            break;
                        }else if(matrice[pedina[0]][pedina[1]+1] == 'X'){
                            matrice[pedina[0]][pedina[1]] = 'X';
                            pedina[1] += 1;
                        }else {
                            matrice[pedina[0]][pedina[1]] = 'X';
                            pedina[1] += 1;
                            mosse++;
                        }
                        break;
                    }else {
                        isPossible = false;
                    }
                    break; 
                    
                case "down":
                    if((pedina[0]+1) < riga){
                        if(matrice[pedina[0]+1][pedina[1]] == '#'){
                            direzione = "left";
                            break;
                        }else if(matrice[pedina[0]+1][pedina[1]] == 'X'){
                            matrice[pedina[0]][pedina[1]] = 'X';
                            pedina[0] += 1;
                        }else {
                            matrice[pedina[0]][pedina[1]] = 'X';
                            pedina[0] += 1;
                            mosse++;
                        }
                        break;
                    }else {
                        isPossible = false;
                    }
                    break; 

                case "left":
                    if((pedina[1]-1) < colonna && (pedina[1]-1) >= 0 ){
                        if(matrice[pedina[0]][pedina[1]-1] == '#'){
                            direzione = "up";
                            break;
                        }else if(matrice[pedina[0]][pedina[1]-1] == 'X'){
                            matrice[pedina[0]][pedina[1]] = 'X';
                            pedina[1] -= 1;
                        }else {
                            matrice[pedina[0]][pedina[1]] = 'X';
                            pedina[1] -= 1;
                            mosse++;
                        }
                        break;
                    }else {
                        isPossible = false;
                    }
                    break; 

                default:
                    isPossible = false;
                    break;
            }
        }
        

        for (int i = 0; i < riga; i++) {
            for (int j = 0; j < colonna; j++) {
                System.out.print(matrice[i][j]);
            }
            System.out.println();
        }    

        mosse++;
        System.out.println(mosse);
        
    }

    public static void muoviPedina(int a, int b){

    }


    public enum Direction {
        UP, RIGHT, DOWN, LEFT
    }

    public static class DirectionChecker {
        public boolean tryDirection(Direction direction) {
            // do stuff
            return false;
        }
    }

}