package EserciziOnline.Variabili.W3Resource.OOP.Java_Polymorphism.Exercise_10;

public class Tiger extends Animal{

    @Override
    public void eat() {
        System.out.println("Tiger eats meat and fish");
    }

    @Override
    public void sound() {
        System.out.println("Tiger growls");
    }
}
