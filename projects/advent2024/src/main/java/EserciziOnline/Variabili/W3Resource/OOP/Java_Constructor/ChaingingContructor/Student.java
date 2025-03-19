package EserciziOnline.Variabili.W3Resource.OOP.Java_Constructor.ChaingingContructor;

public class Student {

    int studentid;
    String studentName;
    int grade;

    public Student()  {
     this(0, "Unknown", 9);
    }

    public Student(int studentid, String studentName, int grade) {
        this.studentid = studentid;
        this.studentName = studentName;
        this.grade = grade;
    }
}
