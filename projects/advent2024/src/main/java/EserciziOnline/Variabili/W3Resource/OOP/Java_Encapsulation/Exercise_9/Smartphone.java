package EserciziOnline.Variabili.W3Resource.OOP.Java_Encapsulation.Exercise_9;

public class Smartphone {

    private String brand;
    private String model;
    private double storagecapacity;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getStoragecapacity() {
        return storagecapacity;
    }

    public void setStoragecapacity(double storagecapacity) {
        this.storagecapacity = storagecapacity;
    }

    public void increaseCapacity(int additionalCapacity) {
        if (additionalCapacity > 0) {
            this.storagecapacity += additionalCapacity;
        }

    }
}
