package EserciziOnline.Variabili.W3Resource.OOP.Java_Polymorphism.Exercise_3;

public class Triangle {

    private double height;
    private double width;

    public Triangle(double height, double width) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea(){
        return (width * height)/2;
    }
}
