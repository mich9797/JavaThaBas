package EserciziOnline.Variabili.W3Resource.OOP.Java_Polymorphism.Exercise_11;

public class Motorcycle extends Vehicle{

     @Override
    public void startEngine() {
         System.out.println("The motorcicle engine starts");
     }

     public void stopEngine() {
         System.out.println("The motorcycle engine stops");
     }
}
