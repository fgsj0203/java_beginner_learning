import Entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Product product;

        product = new Product();


        product.price = sc.nextDouble();
        product.quantity = sc.nextInt();
        product.calculateStock();
        System.out.println("Value final of Stock is: "+product.calculateStock());

        //In development


    }
}
