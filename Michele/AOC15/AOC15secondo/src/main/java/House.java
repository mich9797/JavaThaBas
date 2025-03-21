import java.util.List;

public class House {
    private Cell[][] matrix;
    private Position robotPos;

    public House(List<String> file){
        int righe = file.size();
        int colonne = file.get(0).length()*2;
        Cell[][] matrix = new Cell[righe][colonne];

        Position robot = new Position();

        for (int i = 0; i < file.size(); i++) {
            for (int j = 0; j < file.get(0).length(); j++) {
                int k = j*2;
                char c = file.get(i).charAt(j);
                switch (c){
                    case '#':
                        matrix[i][k] = new Cell(Sign.NOTHING.whatSign(c), new Position(i,k));
                        matrix[i][k+1] = new Cell(Sign.NOTHING.whatSign(c), new Position(i,k+1));
                        break;
                    case 'O':
                        matrix[i][k] = new Cell(Sign.NOTHING.whatSign('['), new Position(i,k));
                        matrix[i][k+1] = new Cell(Sign.NOTHING.whatSign(']'), new Position(i,k+1));
                        break;
                    case '.':
                        matrix[i][k] = new Cell(Sign.NOTHING.whatSign(c), new Position(i,k));
                        matrix[i][k+1] = new Cell(Sign.NOTHING.whatSign(c), new Position(i,k+1));
                        break;
                    default:
                        robot.setX(i);
                        robot.setY(k);
                        matrix[i][k] = new Cell(Sign.NOTHING.whatSign(c), new Position(i,k));
                        matrix[i][k+1] = new Cell(Sign.NOTHING.whatSign('.'), new Position(i,k+1));
                }
            }
        }

        this.matrix = matrix;
        this.robotPos = robot;
    }

    public Cell[][] getMatrix() {
        return matrix;
    }

    public Position getRobotPos() {
        return robotPos;
    }

    public Cell cellAtPosition(Position position){
        return this.matrix[position.getX()][position.getY()];
    }

    public boolean tryToMoveInDirection(Cell cell, Direction direction){
        Cell nextCell = cellAtDirection(cell, direction);
        if (nextCell.getSign() == Sign.NOTHING){
            return true;
        } else if (nextCell.getSign() == Sign.WALL) {
            return false;
        }else {
            if ( direction == Direction.RIGHT || direction == Direction.LEFT){
                return tryToMoveInDirection(cellAtDirection(nextCell, direction), direction);
            }else{
                if (nextCell.getSign() == Sign.LEFTBOX){
                    return (tryToMoveInDirection(nextCell, direction) && tryToMoveInDirection(cellAtDirection(nextCell, Direction.RIGHT), direction));
                }else{
                    return (tryToMoveInDirection(nextCell, direction) && tryToMoveInDirection(cellAtDirection(nextCell, Direction.LEFT), direction));
                }
            }
        }
    }

    public Cell cellAtDirection(Cell cell, Direction direction){
        return cellAtDirection(cell.getPosition(), direction);
    }

    public Cell cellAtDirection(Position position, Direction direction){
        return this.matrix[position.getX() + direction.x][position.getY() + direction.y];
    }

    public void changeCells(Cell cell, Direction direction){
        Cell nextCell = cellAtDirection(cell, direction);
        if (nextCell.getSign() != Sign.NOTHING){
            if (direction == Direction.RIGHT || direction == Direction.LEFT){
                changeCells(nextCell, direction);
            }else {
                if(nextCell.getSign() == Sign.LEFTBOX){
                    changeCells(nextCell,direction);
                    changeCells(cellAtDirection(nextCell, Direction.RIGHT), direction);
                }else{
                    changeCells(nextCell,direction);
                    changeCells(cellAtDirection(nextCell, Direction.LEFT), direction);
                }
            }
        }
        changeSignCells(cell, nextCell);
    }

    public void changeSignCells(Cell cell, Cell nextCell){
        Sign temp = nextCell.getSign();
        nextCell.setSign(cell.getSign());
        cell.setSign(temp);
    }
}
