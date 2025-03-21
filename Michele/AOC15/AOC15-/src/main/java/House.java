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
                Sign sign = Sign.NOTHING.whatSign(file.get(i).charAt(j));
                if(sign == Sign.ROBOT){
                    robot.setX(i);
                    robot.setY(j);
                }
                matrix[i][j] = new Cell(sign, new Position(i, j));
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
        if (nextCell.getSign() == Sign.WALL){
            return false;
        } else if (nextCell.getSign() == Sign.NOTHING) {
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

    public void changeSignCells(Cell cell, Cell nextCell){
        Sign temp = nextCell.getSign();
        nextCell.setSign(cell.getSign());
        cell.setSign(temp);
    }

    public void changeCells(Cell cell, Direction direction){
        Cell nextCell = cellAtDirection(cell, direction);
        if ( nextCell.getSign() == Sign.BOX){
            changeCells(nextCell, direction); //la richiamo per vedere se ci sono altri pacchi
        }
        changeSignCells(cell, nextCell);  //scambio i valori delle celle
    }

}
