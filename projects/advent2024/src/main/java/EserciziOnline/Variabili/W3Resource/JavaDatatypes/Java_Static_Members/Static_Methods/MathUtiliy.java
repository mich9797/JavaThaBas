package EserciziOnline.Variabili.W3Resource.JavaDatatypes.Java_Static_Members.Static_Methods;

public class MathUtiliy {
    public static int add(int a, int b){
        return a +b;
    }

    public static void main(String[] args) {
        int sum = MathUtiliy.add(10,9);
        System.out.println(
                "The sum of 10 and 9 is: "
                +
                sum);
    }
}
