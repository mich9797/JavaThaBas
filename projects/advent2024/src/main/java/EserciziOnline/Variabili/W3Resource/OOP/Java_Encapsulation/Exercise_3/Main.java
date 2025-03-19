package EserciziOnline.Variabili.W3Resource.OOP.Java_Encapsulation.Exercise_3;



public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

       rectangle.setWidth(45.39);
       rectangle.setLength(68.79);

       double length = rectangle.getLength();
       double width = rectangle.getWidth();

       System.out.println("Rectangle Width: " + width);
       System.out.println("Rectangle Length: " + length);

       double area = length * width;

       System.out.println("Rectangle Area: " + area);


    }
}
