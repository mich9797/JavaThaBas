import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Universita {
    private String nome;
    private String sede;
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

    public String getSede(){
        return this.sede;
    }

    public List<Corso> getCorsi(){
        return this.corsi;
    }

    public List<Studente> getStudentiUni(){
        return this.studenti;
    }

    public List<Docente> getDocentiUni(){
        return this.docenti;
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
        System.out.println("Ci sono " + ingegneria.getStudentiIscritti().size() + " studenti isctitti ad ingegneria");       //vedo quanti sono iscritti ad ingegneria
    }
}