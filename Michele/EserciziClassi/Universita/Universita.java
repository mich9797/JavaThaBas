package Universita;
//Classe universita con nome, sede (citta, indirizzo), insieme di studenti, insieme di corsi tenuti in essa,
//        insieme di docenti. Progettare i seguenti metodi: costruttore che valorizza nome e sede; metodo aggiungi
//        studente; metodo aggiungi corso; aggiungi docente; aggiungi frequenza di un corso da parte di uno studente;
//        aggiungi docente ad un corso; metodo che restituisce il nome dell università; dato uno studente in ingresso
//        verificare se appartiene a questa università; dato un corso in input verificare se è tenuto in quella
//        università; numero di studenti che hanno seguito un determinato corso.

import java.net.StandardSocketOptions;

public class Universita {
    private final String nome;
    private final String sede;

    public Universita(String nome, String sede){
        this.nome = nome;
        this.sede = sede;
    }

    public static void main(String[] args){
        Persona mik = new Studente("michele","tha");

    }
}

class Persona{
    String nome;
    String cognome;

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }
}

class Studente extends Persona{

    public Studente(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
    }
}