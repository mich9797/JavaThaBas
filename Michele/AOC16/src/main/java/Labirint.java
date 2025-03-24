import java.util.List;

public class Labirint {
    private char[][] matrix;
    private Position pawn;
    private Position end;
    private int points;

    public Labirint(List<String> file) {
        int righe = file.size();
        int colonne = file.get(0).length();
        char[][] matrix = new char[righe][colonne];

        Position pawn = new Position();
        Position end = new Position();

        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                if(file.get(i).charAt(j) == 'S'){
                    pawn.setX(i);
                    pawn.setY(j);
                } else if (file.get(i).charAt(j) == 'E') {
                    end.setX(i);
                    end.setY(j);
                }
                matrix[i][j] = file.get(i).charAt(j);
            }
        }

        this.matrix = matrix;
        this.pawn = pawn;
        this.end = end;
        this.points = 0;
    }

    public char[][] getMatrix() {
        return matrix;
    }

    public Position getPawn() {
        return pawn;
    }

    public void setPawn(Position pawn) {
        this.pawn = pawn;
    }

    public Position getEnd() {
        return end;
    }

    public void setEnd(Position end) {
        this.end = end;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public boolean checkNextPosition(Position pos, Direction direction){
        Position nextPos = positionAtDirection(pos, direction);
        return (this.matrix[nextPos.getX()][nextPos.getY()] == '.');
    }

    public Position positionAtDirection(Position pos, Direction direction){
        int nextX = pos.getX() + direction.x;
        int nextY = pos.getY() + direction.y;
        return new Position(nextX, nextY);
    }

    public void play(Position pos, Direction direction){

    }
}
