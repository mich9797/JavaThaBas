package EserciziOnline.Variabili.W3Resource.JavaDatatypes.OOP.DefaultCostructor.ConstructorWithDefaultValues;

public class Car {

    String make;
    String model;
    int year;

  public Car(String make, String model, int year) {
      this.make = (make == null || make.isEmpty()) ? "Unknown make":make;
      this.model = (model == null || model.isEmpty()) ? "Unknown model":model;
      this.year = (year <= 0) ? 2000: year;

  }
}
