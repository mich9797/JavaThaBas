package EserciziOnline.Variabili.W3Resource.JavaDatatypes.OOP.DefaultCostructor.ConstructorWitharrayInitialization;

public class Classroom {

    String className;
    String[] students;

    public Classroom(String className, String[] students) {
        this.className = className;
        this.students = students;
    }

    public void printClasroom() {
        System.out.println("Class name: " + className);
        System.out.print("Students: ");
        for (String student : students) {
            System.out.print(student + " ");
        }
        System.out.println();
    }
}
