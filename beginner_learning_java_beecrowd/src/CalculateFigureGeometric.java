import java.util.Locale;
import java.util.Scanner;

public class CalculateFigureGeometric {
    public static void main(String[] args) {

        /**
         * Importing library Locale for decimal value
         */
        Locale.setDefault(Locale.US);


        /**
         * Importing class Scanner for received data user input
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Section of variables
         */
        double pi = 3.14159;
        double A;
        double B;
        double C;
        double raid;
        double areaTriangle;
        double areaCircle;
        double areaTrapeze;
        double areaSquad;
        double areaRectangle;

        /**
         * Received data of side user input
         */
        System.out.println("Enter with value A: ");
        A = sc.nextDouble();

        System.out.println("Enter with value B: ");
        B = sc.nextDouble();

        System.out.println("Enter with value C: ");
        C = sc.nextDouble();


        /**
         * Section about operations and calculating respective area geometric
         */
        areaTriangle = (A * C) / 2;

        areaCircle = pi * Math.pow(C,2);

        areaTrapeze = ((B + A) * C) / 2;

        areaSquad = (B * B);

        areaRectangle = (A * B);

        /**
         * Printing value final of area geometric
         */

        System.out.printf("The area of Triangle: %.3f %n", areaTriangle);
        System.out.printf("The area of Circle: %.3f %n", areaCircle);
        System.out.printf("The area of Trapeze: %.3f %n", areaTrapeze);
        System.out.printf("The area of Squad: %.3f %n", areaSquad);
        System.out.printf("The area of Rectangle: %.3f", areaRectangle);
    }
}
