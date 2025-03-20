package EserciziOnline.Variabili.W3Resource.OOP.Java_Polymorphism.Exercise_3;

public class Rectangle extends Shape{

    private double height;
    private double width;

    public Rectangle (double height, double width) {
        this.height = height;
        this.width = width;

    }

    public double calculateArea(){
        return height * width;
    }
}
