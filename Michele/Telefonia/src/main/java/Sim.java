import java.util.ArrayList;
import java.util.List;

class Sim{
    private String numero;
    private double credito;
    private List<Chiamata> chiamate;

    public Sim(String numero, double credito) {
        this.numero = numero;
        this.credito = credito;
        this.chiamate = new ArrayList<>();;
    }

    public String getNumero(){
        return this.numero;
    }

    public double getCredito(){
        return this.credito;
    }

    public List<Chiamata> getChiamate(){
        return this.chiamate;
    }

    public void aggiungiChiamata(Chiamata chiamata){
        this.chiamate.add(chiamata);
    }

    public void getMinutiTot(){
        int tot = 0;
        for (Chiamata chiamata : getChiamate()){
            tot += chiamata.getDurata();
        }
        System.out.println(tot);
    }

    public void chiamatePerNumero(String cellulare){
        int cont = 0;
        int minuti = 0;
        for (Chiamata chiamata : getChiamate()){
            if(chiamata.getNumero().equals(cellulare)){
                cont++;
                minuti += chiamata.getDurata();
            }
        }
        System.out.printf("Le chiamate effettuate verso " + cellulare + "sono %d per un totale di minuti di: %d",cont, minuti);
        System.out.println();
    }

    public void stampaDatiSim(){
        System.out.println(getNumero());
        System.out.println(getCredito());
        int cont=0;
        for (Chiamata chiamata : chiamate){
            cont++;
            System.out.printf("chiamata %d: " + chiamata.getNumero() + " di %d minuti", cont, chiamata.getDurata());
            System.out.println();
        }
    }
}