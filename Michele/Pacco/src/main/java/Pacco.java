public class Pacco {
    private double base;
    private double altezza;
    private double profondità;
    private int numero;

    public Pacco(double base, double altezza, double profondità){
        this.base = base;
        this.altezza = altezza;
        this.profondità = profondità;
    }

    public double getBase() {
        return base;
    }

    public double getAltezza() {
        return altezza;
    }

    public double getProfondità() {
        return profondità;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public double getVolume(){
        return getBase()*getAltezza()*getProfondità();
    }
}
