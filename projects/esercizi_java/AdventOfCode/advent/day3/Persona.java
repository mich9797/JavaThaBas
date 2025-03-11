public class Persona {
    private String nome;
    private int eta;
    private String città;

    public Persona(String nome, int eta, String città) {
        this.nome = nome;
        this.eta = eta;
        this.città = città;
    }

    public String getNome() {
        return nome;
    }

    public int getEtà() {
        return eta;
    }

    public String getCittà() {
        return città;
    }

    public void stampaInfo() {
        System.out.println("Nome : " + nome + "età : " + eta + "città : " + città);
    }
}