public enum Sign{
    WALL,
    LEFTBOX,
    RIGHTBOX,
    BOX,
    NOTHING,
    ROBOT;

    public Sign whatSign(char c){
        return switch (c){
            case '#' -> WALL;
            case '.' -> NOTHING;
            case 'O' -> BOX;
            default -> ROBOT;
        };
    }
}