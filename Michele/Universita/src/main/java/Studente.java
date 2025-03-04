class Studente extends Persona{
    private String matricola;

    public Studente(String nome, String cognome, String matricola) {
        super(nome, cognome);
        this.matricola = matricola;
    }

    public String getMatricola() {
        return this.matricola;
    }

    public void setMatricola(String matricola){
        this.matricola = matricola;
    }
}