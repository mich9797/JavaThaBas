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