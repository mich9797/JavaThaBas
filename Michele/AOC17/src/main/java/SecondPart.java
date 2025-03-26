public class SecondPart {
    public int A = 2024;
    public int B = 0;
    public int C = 0;
    public int[] program = {0,1,5,4,3,0};

    public int returnComboValue(int combo){
        return switch (combo){
            case 0 -> 0;
            case 1 -> 1;
            case 2 -> 2;
            case 3 -> 3;
            case 4 -> this.A;
            case 5 -> this.B;
            case 6 -> this.C;
            default -> 7;
        };
    }


}
