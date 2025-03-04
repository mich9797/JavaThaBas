class Docente extends Persona{
    private String codiceDocente;

    public Docente(String nome, String cognome, String codiceDocente) {
        super(nome, cognome);
        this.codiceDocente = codiceDocente;
    }

    public String getCodiceDocente(){
        return this.codiceDocente;
    }

    public void setCodiceDocente(String codiceDocente){
        this.codiceDocente = codiceDocente;
    }
}