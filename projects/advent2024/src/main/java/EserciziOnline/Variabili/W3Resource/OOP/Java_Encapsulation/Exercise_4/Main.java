package EserciziOnline.Variabili.W3Resource.OOP.Java_Encapsulation.Exercise_4;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.setEmployee_name("Marco");
        employee.setEmployee_id(456);
        employee.setEmployee_salary(1850.50);

        String employee_name = employee.getEmployee_name();
        int employee_id = employee.getEmployee_id();
        String FormattedSalary = employee.getFormattedSalary();

        System.out.println("Emplyee Details: ");
        System.out.println("ID: " + employee_id);
        System.out.println("name: " + employee_name);
        System.out.println("Salary: " + FormattedSalary);

    }
}
