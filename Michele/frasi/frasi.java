public class frasi{
    public static void main (String[] args){
        String[] lista1 = {"albero", "computer", "sogno", "luce", "viaggio",
            "cielo", "amico", "musica", "libro", "mare"};
        String[] lista2 = {"albero", "computer", "sogno", "luce", "viaggio",
            "cielo", "amico", "musica", "libro", "mare"};
        String[] lista3 = {"albero", "computer", "sogno", "luce", "viaggio",
            "cielo", "amico", "musica", "libro", "mare"};

        int lista1Lenght = lista1.length;
        int lista2Lenght = lista1.length;
        int lista3Lenght = lista1.length;
        
        int rand1 = (int)(Math.random() * lista1Lenght);
        int rand2 = (int)(Math.random() * lista2Lenght);
        int rand3 = (int)(Math.random() * lista3Lenght);

        String frase = lista1[rand1] + " " + lista2[rand2] + " " + lista3[rand3];

        System.out.println(frase);
    }
}