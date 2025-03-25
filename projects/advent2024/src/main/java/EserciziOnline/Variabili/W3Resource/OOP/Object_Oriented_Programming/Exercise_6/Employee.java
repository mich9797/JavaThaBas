package EserciziOnline.Variabili.W3Resource.OOP.Object_Oriented_Programming.Exercise_6;

public class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void calculateSalary(double percentage) {
        salary = salary + salary*percentage/100;
    }

    public void printEmplyeeDetail() {
        System.out.println("Name: " + name);
        System.out.println("Job title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }


}
