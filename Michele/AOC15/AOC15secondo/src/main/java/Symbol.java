public enum Symbol{
    WALL('#'),
    LEFTBOX('['),
    RIGHTBOX(']'),
    NOTHING('.'),
    ROBOT('@');

    public char c;
    Symbol(char c){
        this.c = c;
    }

    public char getC(){
        return this.c;
    }

    public Symbol whatSymbol(char c){
        return switch (c){
            case '#' -> WALL;
            case '[' -> LEFTBOX;
            case ']' -> RIGHTBOX;
            case '.' -> NOTHING;
            default -> ROBOT;
        };
    }
}