package EserciziOnline.Variabili.W3Resource.OOP.Java_Polymorphism.Exercise_6;

public class Rectagle extends Shape{

    private double height;
    private double width;

    public Rectagle(double height, double width) {
        this.width = width;
        this.height = height;
    }


    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return (height * 2) + (width * 2);
    }
}
