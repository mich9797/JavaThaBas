import java.util.List;

public class Labirint {
    private Cell[][] matrix;
    private Position pawn;
    private Position end;

    public Labirint(List<String> file) {
        int righe = file.size();
        int colonne = file.get(0).length();
        Cell[][] matrix = new Cell[righe][colonne];

        Position pawn = new Position();
        Position end = new Position();

        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                matrix[i][j] = new Cell(file.get(i).charAt(j), new Position(i,j));
                if(file.get(i).charAt(j) == 'S'){
                    pawn.setX(i);
                    pawn.setY(j);
                    matrix[i][j].setPoints(0);
                } else if (file.get(i).charAt(j) == 'E') {
                    end.setX(i);
                    end.setY(j);
                }
            }
        }

        this.matrix = matrix;
        this.pawn = pawn;
        this.end = end;
    }

    public Cell[][] getMatrix() {
        return matrix;
    }

    public Position getPawn() {
        return pawn;
    }

    public Position getEnd() {
        return end;
    }

    public boolean checkNextPosition(Cell cell, Direction direction, int num){
        Cell nextCell = cellAtDirection(cell, direction);
        if (nextCell.getLetter() != '#' && nextCell.getPoints() == -1){
            return true;
        } else if (nextCell.getPoints() > num) {
            return true;
        }else {
            return false;
        }
//        return !(nextCell.getLetter() == '#' || (nextCell.getPoints() < cell.getPoints() && nextCell.getPoints() > 0));
    }

    public boolean checkBestPath(Cell cell, Direction direction){
        Cell nextCell = cellAtDirection(cell, direction);
        return (nextCell.getPoints() == (cell.getPoints() -1001)) || (nextCell.getPoints() == (cell.getPoints()-1))
                || (nextCell.getPoints() == (cell.getPoints() + 999));
    }

    public Cell cellAtDirection(Cell cell, Direction direction){
        return  cellAtDirection(cell.getCellPos(), direction);
    }

    public Cell cellAtDirection(Position position, Direction direction){
        return this.matrix[position.getX() + direction.x][position.getY() + direction.y];
    }

    public Cell cellAtPosition(Position position){
        return this.matrix[position.getX()][position.getY()];
    }

    public void play(Position position, Direction direction){
        Cell currentCell = cellAtPosition(position);
        for (Direction dir : Direction.values()){
            if (dir != Direction.getOppositeDirection(direction)){
                int num;
                if (dir == direction){
                    num = currentCell.getPoints() + 1;
                }else {
                    num = currentCell.getPoints() + 1001;
                }
                if (checkNextPosition(currentCell, dir, num)){
                    Cell nextCell = cellAtDirection(currentCell, dir);
                    nextCell.setPoints(num);
                    play(nextCell.getCellPos(), dir);
                }
            }
        }
    }

    public void setBestPath(Position position, Direction direction){
        Cell currentCell = cellAtPosition(position);
        if (currentCell.getLetter() == 'E'){
            Cell nextCell = smallCellNearEnd(currentCell);
            currentCell.setLetter('O');
            setBestPath(nextCell.getCellPos(), direction);
        }else{
            for (Direction dir : Direction.values()){
                if (dir != Direction.getOppositeDirection(direction)){
                    if (checkBestPath(currentCell, dir)){
                        Cell nextCell = cellAtDirection(currentCell, dir);
                        currentCell.setLetter('O');
                        if (nextCell.getPoints() != 0){
                            setBestPath(nextCell.getCellPos(), dir);
                        }else {
                            nextCell.setLetter('O');
                        }

                    }
                }
            }
        }

    }

    public Cell smallCellNearEnd(Cell cell){
        Cell bestCell = cell;
        for (Direction dir : Direction.values()){
            Cell nextCell = cellAtDirection(cell, dir);
            if (nextCell.getPoints()<bestCell.getPoints() && nextCell.getPoints() != -1){
                bestCell = nextCell;
            }
        }
        return bestCell;
    }
}
