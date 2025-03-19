import java.util.List;
public class House {
    private Cell[][] matrix;
    private Position robot;

    public House(List<String> file){
        int righe = file.size();
        int colonne = file.get(0).length();
        Cell[][] matrix = new Cell[righe][colonne];

        Position robot = new Position();

        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                if(file.get(i).charAt(j) == '@'){
                    robot.setX(i);
                    robot.setY(j);
                }
                matrix[i][j] = new Cell(file.get(i).charAt(j), new Position(i, j));
            }
        }

        this.matrix = matrix;
        this.robot = robot;
    }

    public Position getRobot() {
        return robot;
    }

    public Cell[][] getMatrix() {
        return matrix;
    }

    public boolean tryToMoveInDirection(Cell cell, Direction direction){
        Cell nextCell = cellAtDirection(cell,direction);
        if (nextCell.getValue() == '#'){
            return false;
        } else if (nextCell.getValue() == '.') {
            return true;
        } else {
            return tryToMoveInDirection(nextCell, direction);
        }
    }

    public Cell cellAtPosition(Position position){
        return this.matrix[position.getX()][position.getY()];
    }

    public Cell cellAtDirection(Position position, Direction direction){
        return this.matrix[position.getX() + direction.x][position.getY() + direction.y];
    }

    public Cell cellAtDirection(Cell cell, Direction direction){
        return cellAtDirection(cell.getPosition(), direction);
    }

    public void changeValueCells(Cell cell, Cell nextCell){
        char temp = nextCell.getValue();
        nextCell.setValue(cell.getValue());
        cell.setValue(temp);
    }

    public void tryChangeCells(Cell cell, Direction direction){
        Cell nextCell = cellAtDirection(cell, direction);
        if ( nextCell.getValue() == 'O'){
            tryChangeCells(nextCell, direction); //la richiamo per vedere se ci sono altri pacchi
        }
        changeValueCells(cell, nextCell);  //scambio i valori delle celle
    }

}
