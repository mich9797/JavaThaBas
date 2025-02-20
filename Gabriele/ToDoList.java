//commento aggiornato
// asdasd

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    private ArrayList<String> tasks;

    public ToDoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Attività aggiunta con successo!");
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Attività rimossa con successo!");
        } else {
            System.out.println("Indice non valido.");
        }
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Nessuna attività presente.");
        } else {
            System.out.println("Lista delle attività:");
            for (int i = 1; i < tasks.size(); i++) {
                System.out.println(i + ". " + tasks.get(i));
            }
        }
    }

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nScegli un'opzione:");
            System.out.println("1. Aggiungi attività");
            System.out.println("2. Rimuovi attività");
            System.out.println("3. Mostra attività");
            System.out.println("4. Esci");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consuma la newline
            
            switch (choice) {
                case 1:
                    System.out.print("Inserisci l'attività: ");
                    String task = scanner.nextLine();
                    toDoList.addTask(task);
                    break;
                case 2:
                    System.out.print("Inserisci l'indice dell'attività da rimuovere: ");
                    int index = scanner.nextInt();
                    toDoList.removeTask(index);
                    break;
                case 3:
                    toDoList.displayTasks();
                    break;
                case 4:
                    System.out.println("Uscita...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Scelta non valida, riprova.");
            }
        }
    }
}
