package EserciziOnline.Variabili.W3Resource.OOP.Java_Polymorphism.Exercise_3;

import EserciziOnline.Variabili.W3Resource.OOP.Java_Polymorphism.Exercise_1.Main;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
