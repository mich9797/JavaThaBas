package EserciziOnline.Variabili.W3Resource.OOP.Java_Polymorphism.Exercise_7;

public class Bird extends Animal{

    @Override
    public void Move() {
        System.out.println("Bird flies");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird chirps");
    }
}
