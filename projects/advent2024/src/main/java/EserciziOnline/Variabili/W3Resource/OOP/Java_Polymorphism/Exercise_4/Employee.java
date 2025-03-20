package EserciziOnline.Variabili.W3Resource.OOP.Java_Polymorphism.Exercise_4;

public class Employee {

    private String nome;
    private String role;

    public Employee(String nome, String role) {
        this.nome = nome;
        this.role = role;

    }

    public String getNome() {
        return nome;
    }

    public String getRole() {
        return role;
    }

    public  double calculateSalary() {
        return  0.0;
    }
}
