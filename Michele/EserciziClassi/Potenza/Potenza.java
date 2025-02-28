package Potenza;

public class Potenza {
    private int base;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public Potenza(int base) {
        this.base = base;
    }

    public void pow(){
        System.out.println(this.base*this.base);
    }

    public void cambioBase(int newBase){
        this.base = newBase;
    }
}

class gioco{
    public static void  main (String[] args){
        Potenza p = new Potenza(3);
        p.pow();
        p.cambioBase(2);
        p.pow();
    }
}