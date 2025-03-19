package EserciziOnline.Variabili.W3Resource.OOP.Java_Constructor.ChaingingContructor;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();

        System.out.println("Student1 id: " + student1.studentid);
        System.out.println("Studenr1 name: " + student1.studentName);
        System.out.println("Student1 grade: " + student1.grade);

        Student student2 = new Student(34589,"Alessandro Calcaterra",9);

        System.out.println("Student2 id: " + student2.studentid);
        System.out.println("Student2 name: " + student2.studentName);
        System.out.println("Student2 grade: " + student2.grade);

    }
}
