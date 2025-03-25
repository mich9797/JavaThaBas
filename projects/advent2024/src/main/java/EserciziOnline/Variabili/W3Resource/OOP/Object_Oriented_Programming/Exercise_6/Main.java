package EserciziOnline.Variabili.W3Resource.OOP.Object_Oriented_Programming.Exercise_6;

public class Main {
    public static void main(String[] args) {
         Employee employee1 = new Employee("Michele Tha","Software Engineer", 40000);
         Employee employee2 = new Employee("Basello Gabriele","CEO",250000000);

        System.out.println("\nEmployee details: ");
        employee1.printEmplyeeDetail();
        employee2.printEmplyeeDetail();

        employee1.calculateSalary(9);
        employee2.calculateSalary(4);

        System.out.println("\nAfter raising slary: ");
        System.out.println("\n9% for 'Michele Tha': ");
        employee1.printEmplyeeDetail();
        System.out.println("\n4% for 'Basello Gabriele': ");
        employee2.printEmplyeeDetail();




    }
}
