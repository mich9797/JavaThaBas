public enum Sign{
    WALL('#'),
    LEFTBOX('['),
    RIGHTBOX(']'),
    NOTHING('.'),
    ROBOT('@');

    public char c;
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
            default -> ROBOT;
        };
    }
}