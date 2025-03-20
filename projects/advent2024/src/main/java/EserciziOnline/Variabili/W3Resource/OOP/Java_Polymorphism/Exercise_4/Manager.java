package EserciziOnline.Variabili.W3Resource.OOP.Java_Polymorphism.Exercise_4;

public class Manager extends Employee{

    private double baseSalary;
    private double bonus;


    public Manager(String nome,double bonus, double baseSalary) {
        super(nome, "Manager");

        this.baseSalary = baseSalary;
        this.bonus = bonus;

    }

    public  double calculateSalary() {
        return baseSalary + bonus;
    }
}
