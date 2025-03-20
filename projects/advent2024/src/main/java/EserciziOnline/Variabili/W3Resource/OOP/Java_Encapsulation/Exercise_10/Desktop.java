package EserciziOnline.Variabili.W3Resource.OOP.Java_Encapsulation.Exercise_10;

public class Desktop {

    private String brand;
    private String processor;
    private int ramSize;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public void upgradeRam(int increaseRam) {
        if (increaseRam > 0) {
            this.ramSize += increaseRam;

        }
    }
}
