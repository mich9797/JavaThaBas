package Universita;
//Classe universita con nome, sede (citta, indirizzo), insieme di studenti, insieme di corsi tenuti in essa,
//        insieme di docenti. Progettare i seguenti metodi: costruttore che valorizza nome e sede; metodo aggiungi
//        studente; metodo aggiungi corso; aggiungi docente; aggiungi frequenza di un corso da parte di uno studente;
//        aggiungi docente ad un corso; metodo che restituisce il nome dell università; dato uno studente in ingresso
//        verificare se appartiene a questa università; dato un corso in input verificare se è tenuto in quella
//        università; numero di studenti che hanno seguito un determinato corso.

import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Universita {
    private final String nome;
    private final String sede;
    private List<Studente> studenti;
    private List<Docente> docenti;
    private List<Corso> corsi;

    public Universita(String nome, String sede){
        this.nome = nome;
        this.sede = sede;
        this.studenti = new ArrayList<>();
        this.docenti = new ArrayList<>();
        this.corsi = new ArrayList<>();

    }

    public String getNome(){
        return this.nome;
    }

    public List<Corso> getCorsi(){
        return this.corsi;
    }

    public List<Studente> getStudentiUni(){
        return this.studenti;
    }

    public void aggiungiStudente(Studente studente){
        this.studenti.add(studente);
    }

    public void aggiungiCorso(Corso corso){
        this.corsi.add(corso);
    }

    public void aggiungiDocente(Docente docente){
        this.docenti.add(docente);
    }

    public void cercaStudente(String matricolaStudente, List<Studente> studenti){
        boolean trovato = false;
        for (Studente studente : studenti){
            if (studente.getMatricola().equals(matricolaStudente)){
                trovato = true;
            }
        }
        if (trovato) {
            System.out.println("Lo studente che stai cercando è iscritto all'università!");
        }else {
            System.out.println("Lo studente che stai cercando non è inscritto all'università!");
        }

    }

    public void cercaCorso(String nomeCorso, List<Corso> corsi){
        boolean trovato = false;
        for (Corso corso : corsi){
            if(corso.getNomeCorso().equals(nomeCorso)) {
                trovato = true;
            }
        }
        if (trovato) {
            System.out.println("Il corso a cui sei interessato è presente nella nostra università!!");
        }else {
            System.out.println("Mi dispiace ma il corso da lei sccelto non è presente nella nostra università");
        }
    }

    public static void main(String[] args){
        Universita uni = new Universita("Politecnico", "via XX settembre");
        System.out.println(uni.getNome());
        Studente mik = new Studente("michele", "tha", "123");
        uni.aggiungiStudente(mik);
        Docente bruno = new Docente("bruno", "freddi", "d123");
        uni.aggiungiDocente(bruno);
        Corso ingegneria = new Corso("ingegneria");
        uni.aggiungiCorso(ingegneria);

        Scanner scanner = new Scanner(System.in);
        System.out.println("A quale corse sei interessato?");
        String nomeCorso = scanner.nextLine();                         //leggo il nome corso in input
        uni.cercaCorso(nomeCorso, uni.getCorsi());                     //cerco il corso nella lista corsi

        System.out.println("inserisci il numero di matricola che stai cercando..");
        String cercaStudente = scanner.nextLine();      //leggo matricola in input
        uni.cercaStudente(cercaStudente, uni.getStudentiUni());             //cerco matricola in lista studenti

        ingegneria.aggiungiStudenteCorso(mik);
        ingegneria.aggiungiDocenteCorso(bruno);
        System.out.println("Ci sono " + ingegneria.getStudentiCorso().size() + " studenti isctitti ad ingegneria");       //vedo quanti sono iscritti ad ingegneria
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
    private String matricola;

    public Studente(String nome, String cognome, String matricola){
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
    }

    public String getMatricola() {
        return this.matricola;
    }
}

class Docente extends Persona{
    private String codiceDocente;

    public Docente(String nome, String cognome, String codiceDocente){
        this.nome = nome;
        this.cognome = cognome;
        this.codiceDocente = codiceDocente;
    }
}

class Corso{
    private String nomeCorso;
    private List<Studente> studentiIscritti;
    private List<Docente> docentiCroso;

    public Corso(String nomeCorso){
        this.nomeCorso = nomeCorso;
        this.studentiIscritti = new ArrayList<>();
        this.docentiCroso = new ArrayList<>();
    }

    public String getNomeCorso(){
        return this.nomeCorso;
    }

    public void aggiungiDocenteCorso(Docente docente){
        this.docentiCroso.add(docente);
    }

    public void aggiungiStudenteCorso(Studente studente){
        this.studentiIscritti.add(studente);
    }
    public List<Studente> getStudentiCorso(){
        return this.studentiIscritti;
    }

}