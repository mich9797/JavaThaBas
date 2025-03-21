public enum Symbol{
    WALL('#'),
    BOX('O'),
    NOTHING('.'),
    ROBOT('@');

    public char c;
    Symbol(char c){
        this.c = c;
    }

    public char getC(){
        return this.c;
    }
}