package EserciziOnline.Variabili.Costanti;

import java.util.stream.Stream;

public class Esercizio12 {
    public static void main (String[] args)  {
        String str33 ="1234";
        String srText = String.valueOf(str33);
        int xxuu = Stream.of(str33).map(Integer::valueOf).findAny().get();
        int xxyu = Stream.of(str33).map(Integer::parseInt).findAny().get();
        System.out.println(xxyu );
        System.out.println(xxuu );
        System.out.println(srText);

    }
}
