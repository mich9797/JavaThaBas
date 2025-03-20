package EserciziOnline.Variabili.W3Resource.OOP.Java_Polymorphism.Exercise_4;

public class Programmer extends Employee{

    private double baseSalary;
    private double overtimePlay;

    public Programmer(String name, double overtimePlay, double baseSalary) {
        super(name, "Programmer");

        this.baseSalary = baseSalary;
        this.overtimePlay = overtimePlay;
    }

    public double calculateSalary() {
        return baseSalary + overtimePlay;
    }
}
