package EserciziOnline.Variabili.W3Resource.JavaDatatypes.OOP.DefaultCostructor.ConstructorWithDefaultValues;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Ferrari", "F40", 1998);

        System.out.println("Car 1 make: " + car1.make);
        System.out.println("Car 1 model: " + car1.model);
        System.out.println("Car 1 year: " + car1.year);

        Car car2 = new Car("Toyota", "Corolla", 2015);

        System.out.println("Car 2 make: " + car2.make);
        System.out.println("Car 2 model: " + car2.model);
        System.out.println("Car 2 year: " + car2.year);

    }
}
