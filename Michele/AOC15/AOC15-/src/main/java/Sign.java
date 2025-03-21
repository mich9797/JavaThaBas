public enum Sign{
    WALL('#'),
    BOX('O'),
    NOTHING('.'),
    ROBOT('@');

    public char c;
    Sign(char c){
        this.c = c;
    }

    public char getC(){
        return this.c;
    }

    public Sign whatSymbol(char c){
        return switch (c){
            case '#' -> WALL;
            case 'O' -> BOX;
            case '.' -> NOTHING;
            default -> ROBOT;
        };
    }
}