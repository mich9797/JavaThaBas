public class PaccoAColori extends Pacco{
    private String colore;

    public PaccoAColori(double base, double altezza, double profondità) {
        super(base, altezza, profondità);
    }


    public void setColore(String colore){
        this.colore = colore;
    }

    public String getColore(){
        return this.colore;
    }

    public void stampa(){
        System.out.println(getBase());
        System.out.println(getProfondità());
        System.out.println(getAltezza());
        System.out.println(getColore());
    }

    public void stampaVolume(){
        System.out.println(getVolume());
    }
}
