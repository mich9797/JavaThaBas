package ContoCorrente;

import java.util.ArrayList;
import java.util.List;

public class ContoCorrente {
    private int saldo = 0;
    private List<Integer> movimenti = new ArrayList<>();

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public List<Integer> getMovimenti(){
        return movimenti;
    }

    public void versamento(int valore){
        setSaldo(getSaldo() + valore);
        if(movimenti.size() < 5) {
            movimenti.add(valore);
        }else{
            movimenti.remove(0);
            movimenti.add(valore);
        }
    }

    public void prelievo(int valore){
        setSaldo(getSaldo() - valore);
        if(movimenti.size() < 5) {
            movimenti.add(-valore);
        }else{
            movimenti.remove(0);
            movimenti.add(-valore);
        }
    }
}

class Prova{
    public static void main(String[] args) {
        ContoCorrente conto = new ContoCorrente();
        conto.versamento(1000);
        System.out.println(conto.getSaldo());
        conto.prelievo(500);
        System.out.println(conto.getSaldo());
        conto.versamento(1000);
        conto.versamento(1000);
        conto.versamento(1000);
        conto.versamento(1000);
        conto.prelievo(999);

        System.out.println(conto.getMovimenti());
    }
}
