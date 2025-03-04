class Chiamata{
    private String numero;
    private int durata;

    public Chiamata(String numero, int durata){
        this.numero = numero;
        this.durata = durata;
    }

    public int getDurata(){
        return this.durata;
    }

    public String getNumero(){
        return this.numero;
    }
}