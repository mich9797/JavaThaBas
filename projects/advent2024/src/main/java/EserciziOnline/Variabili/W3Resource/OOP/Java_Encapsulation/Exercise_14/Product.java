package EserciziOnline.Variabili.W3Resource.OOP.Java_Encapsulation.Exercise_14;

public class Product {

    private String productName;
    private String productCode;
    private double price;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

   public double applyDiscount(double discount) {
       if (discount > 0 && discount <= 100) {
           this.price -= this.price * (discount / 100);
       }
       return discount;
   }

}
