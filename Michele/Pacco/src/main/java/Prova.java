public class Prova {
    public static void main(String[] args){
        Pacco p = new Pacco(3.5,4.5,6);
        p.setNumero(3);
        System.out.println(p.getVolume());

        PaccoAColori pCol = new PaccoAColori(2.4,5.3,5.5);
        pCol.setColore("rosso");
        pCol.stampaVolume();
    }
}
