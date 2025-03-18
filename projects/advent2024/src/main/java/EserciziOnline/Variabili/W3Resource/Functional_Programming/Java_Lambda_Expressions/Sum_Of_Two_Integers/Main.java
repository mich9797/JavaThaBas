package EserciziOnline.Variabili.W3Resource.Functional_Programming.Java_Lambda_Expressions.Sum_Of_Two_Integers;

public class Main {
    public static void main(String[] args) {
        Interface.SumCalculator sumCalculator = (x, y) -> x + y;
        int result = sumCalculator.sum(7,6);
        System.out.println("(Sum 7,6): " + result);
        result = sumCalculator.sum(15, -35);
        System.out.println("(Sum 15,-35): " + result);
    }
}
