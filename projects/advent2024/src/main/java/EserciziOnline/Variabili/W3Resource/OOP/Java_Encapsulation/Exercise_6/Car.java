package EserciziOnline.Variabili.W3Resource.OOP.Java_Encapsulation.Exercise_6;

public class Car {

    private String company_name;
    private String model_name;
    private double mileage;
    private int year;

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getModel_name() {
        return model_name;
    }

    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMileage() {
        return mileage;
    }
}
