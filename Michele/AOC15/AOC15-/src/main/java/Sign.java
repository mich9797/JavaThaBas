public enum Sign{
    WALL,
    BOX,
    NOTHING,
    ROBOT;

    public static Sign whatSign(char c){
        return switch (c){
            case '#' -> WALL;
            case 'O' -> BOX;
            case '.' -> NOTHING;
            default -> ROBOT;
        };
    }
}