package Structure_Repetition;

import java.util.Locale;
import java.util.Scanner;

public class Numbers_Average_Weighted {
    public static void main(String[] args) {

        /**
         * Importing class Locale for decimal number
         */
        Locale.setDefault(Locale.US);

        /**
         * importing class Scanner for input data user
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Section of variables
         */
        int numbers_repetition;

        /**
         * Input data user of repetition numbers calculate average weighted
         */
        System.out.println("Enter with repetition numbers calculate average weighted: ");
        numbers_repetition = sc.nextInt();

        /**
         * Logical structure of repetition for calculate average weighted
         */
        for (int i = 0; i < numbers_repetition; i++) {
            double number_one = sc.nextDouble();
            double number_two = sc.nextDouble();
            double number_three = sc.nextDouble();

            //Variable of calculate average weighted
            double average_weighetd = (number_one * 2.0 + number_two * 3.0 + number_three * 5.0) / 10;
            System.out.printf("Average weighted %.1f %n ", average_weighetd);
        }

        /**
         * Ending resource "sc" Scanner
         */
        sc.close();
    }
}
