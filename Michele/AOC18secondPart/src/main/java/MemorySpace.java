public class MemorySpace {
    private Cell[][] memorySpace;
    public int row;
    public int column;

    public MemorySpace(int row, int column) {
        this.memorySpace = new Cell[row][column];
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                this.memorySpace[i][j] = new Cell(new Position(i,j));
            }
        }

        this.row = row;
        this.column = column;
    }

    public Cell[][] getMemorySpace() {
        return memorySpace;
    }

    public Cell cellAtPosition(Position position){
        return this.memorySpace[position.getX()][position.getY()];
    }

    public boolean positionExist(Position position){
        return !(position.getX() < 0 || position.getX() >= row || position.getY() < 0 || position.getY() >= column);
    }

    public boolean isExit(Cell cell){
        return (cell.getCellPosition().getX() == this.row-1 && cell.getCellPosition().getY() == this.column-1);
    }

    public boolean canEnterCell(Cell cell){
        return (cell.getValue() != '#' && !cell.isVisited());
    }

    public boolean reachTheExit(Position start, Direction direction){
        if (isExit(cellAtPosition(start))){
            return true;
        }
            for (Direction dir : Direction.values()) {
                if (dir != Direction.getOppositeDirection(direction)) {
                    Position nextPos = start.positionAtDirection(dir);
                    if (positionExist(nextPos)) {
                        Cell nextCell = cellAtPosition(nextPos);
                        if (canEnterCell(nextCell)) {
                            nextCell.setVisited(true);
                            if(reachTheExit(nextCell.getCellPosition(), dir)){
                                return true;
                            }
                        }
                    }
                }
            }
        return false;
    }

    public void resetLabirint(){
        for (Cell[] c : this.memorySpace){
            for (Cell cell : c){
                cell.setVisited(false);
            }
        }
    }
}