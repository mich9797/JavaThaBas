package EserciziOnline.Variabili.W3Resource.OOP.Java_Polymorphism.Exercise_12;

public class Cylinder extends Shape{

    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
     this.radius = radius;
     this.height = height;


    }


    @Override
    public void draw() {
        System.out.println("Draw a cylinder");
    }

    @Override
    public double calculateArea() {
        return (Math.PI*2*radius*height) + (Math.PI*radius*radius*2);
    }
}