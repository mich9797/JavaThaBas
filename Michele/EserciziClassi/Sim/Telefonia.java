package Sim;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//HashMap non funziona come una lista.   se si ripete una stessa key il value viene sostituito alla seconda chiamata

public class Telefonia {
    public static void main(String[] args){
        Sim sim = new Sim("345460096", 12.50);
        sim.stampaDatiSim();
        System.out.println();
        sim.aggiungiChiamata("3433433453", 45);
        sim.aggiungiChiamata("ciao", 33);
        sim.aggiungiChiamata("ciao", 377);     //il value della key "ciao" prima era 33 adesso è diventato 377
        sim.aggiungiChiamata("34334333334", 32);

        sim.stampaDatiSim();
        System.out.println();
        sim.getMinutiTot();

        sim.minutiPerNumero("3433433333");

    }
}

class Sim{
    private String numero;
    private double credito;
    private HashMap<String, Integer> chiamate;    //HashMap per una coppia di valori.. una Key e un Value

    public Sim(String numero, double credito) {
        this.numero = numero;
        this.credito = credito;
        this.chiamate = new HashMap<>();;
    }

    public String getNumero(){
        return this.numero;
    }

    public double getCredito(){
        return this.credito;
    }

    public void aggiungiChiamata(String cellulare, int minuti){
        chiamate.put(cellulare, minuti);
    }

    public HashMap<String, Integer> getChiamate(){
        return chiamate;
    }

    public void getMinutiTot(){
        int tot = 0;
        for (int min : getChiamate().values()){    //ciclo for su HashMap   .values() per indicare value    e .keyset() per indicare la key
            tot += min;
        }
        System.out.println(tot);
    }

    public void minutiPerNumero(String cellulare){
        int cont = 0;
        for (String cell : getChiamate().keySet()){
            if(cell.equals(cellulare)){
                cont++;
            }
        }
        System.out.println("Le chiamate effettuate verso " + cellulare + "sono " + cont);
    }

    public void stampaDatiSim(){
        System.out.println(getNumero());
        System.out.println(getCredito());
        System.out.println(getChiamate());
    }

}
