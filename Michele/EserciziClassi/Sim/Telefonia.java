package Sim;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//HashMap non funziona come una lista.   se si ripete una stessa key il value viene sostituito alla seconda chiamata

public class Telefonia {
    public static void main(String[] args){
        Sim sim1 = new Sim("345460096", 12.50);
        sim1.aggiungiChiamata(new Chiamata("1234567890", 12));
        sim1.aggiungiChiamata(new Chiamata("1234567890", 15));
        sim1.aggiungiChiamata(new Chiamata("1111222233", 25));
        sim1.stampaDatiSim();
        sim1.chiamatePerNumero("1234567890");
        sim1.getMinutiTot();
    }
}

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

    public void aggiungiChiamata(Chiamata chiamata){
        this.chiamate.add(chiamata);
    }

    public List<Chiamata> getChiamate(){
        return this.chiamate;
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

class Chiamata{
    String numero;
    int durata;

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
