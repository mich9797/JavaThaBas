import java.util.EnumSet;
import java.util.Optional;

public enum Direction {
    UP(-1, 0, '^'),
    RIGHT(0, 1, '>'),
    DOWN(1, 0, 'v'),
    LEFT(0, -1, '<');

    public final int x;
    public final int y;
    private final char id;

    Direction(int x, int y, char id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public static Optional<Direction> parse(char c) {
        return EnumSet.allOf(Direction.class).stream().filter(d -> d.id == c).findAny();
    }
//        return Optional.ofNullable(switch (c) {
//            case '>' -> RIGHT;
//            case 'v' -> DOWN;
//            case '<' -> LEFT;
//            case '^' -> UP;
//            default -> null;
//        });
//    }

    public static Direction whatDirection(char c) {
        return switch (c) {
            case '>' -> RIGHT;
            case 'v' -> DOWN;
            case '<' -> LEFT;
            case '^' -> UP;
            default -> throw new IllegalArgumentException();
        };
    }
}