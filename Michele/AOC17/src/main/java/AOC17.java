public class AOC17 {
    static int A = 52884621;
    static int B = 0;
    static int C = 0;
    static int[] program = {2,4,1,3,7,5,4,7,0,3,1,5,5,5,3,0};

    public static void main(String[] args){

        readProgramSequence(program);

        System.out.println();
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

    }

    public static void readProgramSequence(int[] program){
        for (int i=0; i < program.length; i = i+2){
            switch (program[i]){
                case 0:
                    operandZero(program[i+1]);
                    break;
                case 1:
                    operandOne(program[i+1]);
                    break;
                case 2:
                    operandTwo(program[i+1]);
                    break;
                case 3:
                    if (A != 0){
                        i = program[i+1] - 2;
                    }
                    break;
                case 4:
                    operandFour();
                    break;
                case 5:
                    operandFive(program[i+1]);
                    break;
                case 6:
                    operandSix(program[i+1]);
                    break;
                case 7:
                    operandSeven(program[i+1]);
                    break;
                default:
                    throw new IllegalArgumentException("There is an invalid number ( number > 7 ) in the program");
            }
        }
    }

    public static int returnComboValue(int combo){
        return switch (combo){
            case 0 -> 0;
            case 1 -> 1;
            case 2 -> 2;
            case 3 -> 3;
            case 4 -> A;
            case 5 -> B;
            case 6 -> C;
            default -> 7;
        };
    }

    public static void operandZero(int combo){
        int num = returnComboValue(combo);
        A = (int) (A / (Math.pow(2, num)));
    }

    public static void operandOne(int literal){
        B = B^literal;  //fa in automatico bitwise tra due numeri e ritorna il numero intero in ris
    }

    public static void operandTwo(int combo){
        int num = returnComboValue(combo) % 8;
        String binario = Integer.toBinaryString(num);
        if (binario.length() > 3){
            B = Integer.parseInt(binario.substring(binario.length()-3), 2);
        }else{
            B = Integer.parseInt(binario, 2);
        }
    }

    public static void operandFour(){
        B = B^C;
    }

    public static void operandFive(int combo){
        int num = returnComboValue(combo) % 8;
        System.out.print(num + ",");
    }

    public static void operandSix(int combo){
        int num = returnComboValue(combo);
        B = (int) (A / (Math.pow(2, num)));
    }

    public static void operandSeven(int combo){
        int num = returnComboValue(combo);
        C = (int) (A / (Math.pow(2, num)));
    }
}
