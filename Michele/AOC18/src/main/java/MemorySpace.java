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

    public boolean canEnter(Cell currentCell, Cell nextCell){
        return nextCell.getValue() != '#' && (nextCell.getPoints() > currentCell.getPoints()+1 || nextCell.getPoints() == 0);
    }

    public void reachTheExit(Position start, Direction direction){
        Cell currentCell = cellAtPosition(start);
        for (Direction dir : Direction.values()){
            if (dir != Direction.getOppositeDirection(direction)){
                Position nextPos = start.positionAtDirection(dir);
                if (positionExist(nextPos)){
                    Cell nextCell = cellAtPosition(nextPos);
                        if (canEnter(currentCell, nextCell)){
                            nextCell.setPoints(currentCell.getPoints() +1);
                            reachTheExit(nextCell.getCellPosition(), dir);
                        }
                }
            }
        }
    }
}