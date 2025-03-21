public enum Sign{
    WALL('#'),
    LEFTBOX('['),
    RIGHTBOX(']'),
    BOX('O'),
    NOTHING('.'),
    ROBOT('@');

    public final char c;
    Sign(char c){
        this.c = c;
    }

    public char getC(){
        return this.c;
    }

    public Sign whatSign(char c){
        return switch (c){
            case '#' -> WALL;
            case '[' -> LEFTBOX;
            case ']' -> RIGHTBOX;
            case '.' -> NOTHING;
            case 'O' -> BOX;
            default -> ROBOT;
        };
    }
}