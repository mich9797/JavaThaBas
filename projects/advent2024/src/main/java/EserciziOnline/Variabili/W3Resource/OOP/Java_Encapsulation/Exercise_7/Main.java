package EserciziOnline.Variabili.W3Resource.OOP.Java_Encapsulation.Exercise_7;

import java.util.List;

//7 Write a Java program to create a class called Student with private instance variables student_id, student_name, and grades.
// Provide public getter and setter methods to access and modify the student_id and student_name variables.
// However, provide a method called addGrade() that allows adding a grade to the grades variable while performing additional validation.

public class Main {
    public static void main(String[] args) {

        Student student = new Student();

        student.setStudent_int(1);
        student.setStudent_name("Vladimir Ill'ic Ul'janov");

        student.addGrade(98.5);
        student.addGrade(99);
        student.addGrade(97.6);

        int student_id = student.getStudent_int();
        String student_name = student.getStudent_name();
        List<Double> grades = student.getGrades();

        System.out.println("Student ID: " + student_id);
        System.out.println("Student Name: " + student_name);
        System.out.println("Grades: " + grades);


    }
}
