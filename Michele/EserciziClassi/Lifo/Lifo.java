package Lifo;

import java.util.ArrayList;
import java.util.List;

public class Lifo {
    private List<Integer> numeri = new ArrayList<>();

    public void put(int num){
        numeri .add(num);
    }

    public void get(){
        int i = numeri.size() -1;
        System.out.println(numeri.get(i));
        numeri.remove(i);
    }
}

class Prova{
    public static void main(String[] args){
        Lifo lifo = new Lifo();
        lifo.put(1);
        lifo.put(2);
        lifo.get();
        lifo.get();
    }
}