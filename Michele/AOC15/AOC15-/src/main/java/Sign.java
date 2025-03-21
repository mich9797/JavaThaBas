public enum Sign{
    WALL,
    BOX,
    NOTHING,
    ROBOT;

    public Sign whatSign(char c){
        return switch (c){
            case '#' -> WALL;
            case 'O' -> BOX;
            case '.' -> NOTHING;
            default -> ROBOT;
        };
    }
}