package EserciziOnline.Variabili.W3Resource.JavaDatatypes.OOP.DefaultCostructor.RectangleClass;

public class Main {
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(12.5, 4.5);

        System.out.println("Rectangle 1 Length: " + rect1.length);
        System.out.println("Rectangle 1 Width: " + rect1.width);

        Rectangle rect2 = new Rectangle(rect1);

        System.out.println("Rectangle 2 length: " + rect2.length);
        System.out.println("rectangle 2 width: " + rect2.width);
    }
}
