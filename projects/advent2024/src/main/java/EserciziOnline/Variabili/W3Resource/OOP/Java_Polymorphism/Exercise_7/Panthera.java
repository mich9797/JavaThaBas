package EserciziOnline.Variabili.W3Resource.OOP.Java_Polymorphism.Exercise_7;

public class Panthera extends Animal{

    @Override
    public void Move() {
        System.out.println("Panthera walks");
    }

    @Override
    public void makeSound() {
        System.out.println("Panthera roars");
    }
}
