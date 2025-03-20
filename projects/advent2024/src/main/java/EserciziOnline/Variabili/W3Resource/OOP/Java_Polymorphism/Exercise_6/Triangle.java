package EserciziOnline.Variabili.W3Resource.OOP.Java_Polymorphism.Exercise_6;

public class Triangle extends Shape{
    private double lato1;
    private double lato2;
    private double lato3;

    public Triangle(double lato1, double lato2, double lato3){
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
    }

    @Override
    public double getArea() {
        double a =(lato1 + lato2 + lato3)/2;
        return Math.sqrt(a * (a - lato1)*(a - lato2)*(a - lato3));
    }

    @Override
    public double getPerimeter() {
        return lato1 + lato2 + lato3;
    }
}
