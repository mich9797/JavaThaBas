package EserciziOnline.Variabili.SwitchInJava;

public class Esercizio7 {
    public static void main (String[] args) {
        int numeroMese = 8;
        String nomeMese;

        switch (numeroMese) {
            case 1:
                nomeMese = "Gen";
                break;
            case 2:
                nomeMese = "Feb";
                break;
            case 3:
                nomeMese = "Mar";
                break;
            case 4:
                nomeMese = "Apr";
                break;
            case 5:
                nomeMese = "Mag";
                break;
            case 6:
                nomeMese = "Giu";
                break;
            case 7:
                nomeMese = "Lug";
                break;
            case 8:
                nomeMese = "Ago";
                break;
            case 9:
                nomeMese = "Set";
                break;
            case 10:
                nomeMese = "Ott";
                break;
            case 11:
                nomeMese = "Nov";
                break;
            case 12:
                nomeMese = "Dic";
                break;
            default:
                nomeMese = "Numero non valido";
        }

        System.out.println("Il numero " + numeroMese + " corrisponde a " + nomeMese + ".");
    }
}
