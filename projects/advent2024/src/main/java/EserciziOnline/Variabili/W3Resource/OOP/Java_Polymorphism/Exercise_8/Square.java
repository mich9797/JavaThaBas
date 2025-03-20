package EserciziOnline.Variabili.W3Resource.OOP.Java_Polymorphism.Exercise_8;

public class Square extends Shape{

    private double side;

    public Square (double side) {
        this.side=side;
    }

    @Override
    public void draw() {
        System.out.println("Draw a Square");
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
