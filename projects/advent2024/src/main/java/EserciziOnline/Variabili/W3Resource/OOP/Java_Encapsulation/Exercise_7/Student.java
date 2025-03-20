package EserciziOnline.Variabili.W3Resource.OOP.Java_Encapsulation.Exercise_7;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private int student_int;
    private String student_name;
    private List grades;

    public int getStudent_int() {
        return student_int;
    }

    public void setStudent_int(int student_int) {
        this.student_int = student_int;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public List getGrades() {
        return grades;
    }

    public void addGrade(double grade) {
        if (grades == null) {
            grades = new ArrayList<>();
        }
        grades.add(grade);
    }
}
