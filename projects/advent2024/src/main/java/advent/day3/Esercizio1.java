package advent.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Esercizio1 {
    public static void main(String[] args) {
        List<Persona> persone = new ArrayList<>();
        persone.add(new Persona("Alice", 25, "Napoli"));
        persone.add(new Persona("Giacomo", 19, "Udine"));
        persone.add(new Persona("Sandro", 48, "Milano"));
        persone.add(new Persona("Marco", 15, "Torino"));
        persone.add(new Persona("Michele", 53, "Roma"));

        Collections.sort(persone, (p1, p2) -> Integer.compare(p1.getEtà(), p2.getEtà()));

        System.out.println("Lista ordinata per età:");
        for (Persona p : persone) {
            p.stampaInfo();

        }
    }
}
