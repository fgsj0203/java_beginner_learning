package Entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    /**
     * Creating first method calculate value total in stock
     */
    public double calculateStock() {
        double priceFinal = (price * quantity);
        return priceFinal;
    }
}
