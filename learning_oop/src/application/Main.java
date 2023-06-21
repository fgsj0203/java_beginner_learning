package application;
import Entities.Triangle;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /**
         * Import class Locale for decimal number
         */
        Locale.setDefault(Locale.US);

        /**
         * Import Scanner for input data user
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Instancing objects of class "Triangle"
         */
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        /**
         * Calling object of class "Triangle" and you attributes
         */
        System.out.println("Enter the measures of Triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of Triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();


        /**
         * Creating formula about "p"
         */
        double p = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b + y.c) / 2.0; //variable P associate a formula
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        /**
         * Printing value of areas triangle X and Y
         */
        System.out.printf("Area of triangle X: %.4f %n",areaX);
        System.out.printf("Area of triangle Y: %.4f %n",areaY);


        /**
         * Condition for identify triangle with bigger area
         */
        if (areaX > areaY){
            System.out.println("Area of triangle X is bigger");
        } else {
            System.out.println("Area of triangle Y is bigger");
        }

        /**
         * Ending resource "sc" of Scanner
         */
        sc.close();
    }
}