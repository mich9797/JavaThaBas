package EserciziOnline.Variabili.W3Resource.OOP.Java_Encapsulation.Exercise_14;


//Write a Java program to create a class called Product with private instance variables productName, productCode, and price.
// Provide public getter and setter methods to access and modify these variables.
// Add a method called applyDiscount() that takes a percentage and reduces the price by that percentage.
public class Main {
    public static void main(String[] args) {

        Product product = new Product();

        product.setProductCode("AAA0011");
        product.setProductName("Fazzoletti Umidificati");
        product.setPrice(4.99);

        product.applyDiscount(7);

        System.out.println("Product name: " + product.getProductName());
        System.out.println("Product code: " +  product.getProductCode());
        System.out.println("Price after discount: $" + product.getPrice());

    }
}
