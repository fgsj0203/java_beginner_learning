import java.util.Locale;
import java.util.Scanner;

public class ValueFinalProduct {
    public static void main(String[] args) {

        /**
         * Importing library of locale US for decimal number
         */
        Locale.setDefault(Locale.US);

        /**
         * Importing class Scanner for received input data user
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Section of variables
         */
        int codePartOne;
        int amountPartOne;
        double valueUnitPartOne;

        int codePartTwo;
        int amountPartTwo;
        double valueUnitPartTwo;

        double sumValueFinalProduct;


        /**
         * Section of received data user input
         */
        System.out.println("Enter with code Product one: ");
        codePartOne = sc.nextInt();

        System.out.println("Enter with amount of product one: ");
        amountPartOne = sc.nextInt();

        System.out.println("Enter with value of unit product one: ");
        valueUnitPartOne = sc.nextDouble();

        System.out.println("Enter with code Product Two: ");
        codePartTwo = sc.nextInt();

        System.out.println("Enter with amount of product Two: ");
        amountPartTwo = sc.nextInt();

        System.out.println("Enter with value of unit product Two: ");
        valueUnitPartTwo = sc.nextDouble();

        //Calculating value final of sum products
        sumValueFinalProduct = (amountPartOne * valueUnitPartOne) + (amountPartTwo * valueUnitPartTwo);

        /**
         * Printing value final of product
         */
        System.out.printf("Value total for pay is: R$ %.2f",sumValueFinalProduct);

    }
}
