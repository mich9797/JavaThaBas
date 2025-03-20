package EserciziOnline.Variabili.W3Resource.OOP.Java_Polymorphism.Exercise_8;

public class Triangle extends Shape{

    private double height;
    private double base;

    public Triangle (double height, double base){
        this.base=base;
        this.height=height;
    }

    @Override
    public void draw() {
        System.out.println("Draw a Triangle");
    }

    @Override
    public double calculateArea() {
        return base * height * 0.5;
    }
}
