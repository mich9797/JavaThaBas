import java.util.ArrayList;
import java.util.List;

class Corso{
    private String nomeCorso;
    private List<Studente> studentiIscritti;
    private List<Docente> docentiCorso;

    public Corso(String nomeCorso){
        this.nomeCorso = nomeCorso;
        this.studentiIscritti = new ArrayList<>();
        this.docentiCorso = new ArrayList<>();
    }

    public String getNomeCorso(){
        return this.nomeCorso;
    }

    public void setNomeCorso(String nomeCorso){
        this.nomeCorso = nomeCorso;
    }

    public List<Studente> getStudentiIscritti(){
        return this.studentiIscritti;
    }

    public List<Docente> getDocentiCorso(){
        return this.docentiCorso;
    }

    public void aggiungiDocenteCorso(Docente docente){
        this.docentiCorso.add(docente);
    }

    public void aggiungiStudenteCorso(Studente studente){
        this.studentiIscritti.add(studente);
    }
}