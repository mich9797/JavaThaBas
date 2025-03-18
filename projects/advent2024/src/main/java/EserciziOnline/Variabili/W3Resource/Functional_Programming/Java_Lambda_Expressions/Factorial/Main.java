package EserciziOnline.Variabili.W3Resource.Functional_Programming.Java_Lambda_Expressions.Factorial;

import java.util.function.LongUnaryOperator;

public class Main {
    public static void main(String[] args) {

        LongUnaryOperator factorial = n -> {
            long result = 1;
            for (long j = 1; j <= n; j++) {
                result*= j;
            }
            return result;
        };

        long n = 7;
        long factorial_result = factorial.applyAsLong(n);

        System.out.println("factorial of " +n+ " is " + factorial_result);
    }
}
