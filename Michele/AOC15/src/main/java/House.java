public class House {
    private Cell[][] matrix;


    public House(Cell[][] matrix) {
        this.matrix = matrix;
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
