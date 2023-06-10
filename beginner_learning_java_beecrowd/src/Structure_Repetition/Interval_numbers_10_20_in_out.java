package Structure_Repetition;

import java.util.Scanner;

public class Interval_numbers_10_20_in_out {
    public static void main(String[] args) {
        /**
         * Importing class Scanner for data user input
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Section of variables
         */
        int number_repetition;
        int number_now;
        int numbers_in = 0;
        int numbers_out = 0;

        /**
         * Input data user repetition numbers
         */
        System.out.println("Enter with a numbers repetition user input: ");
        number_repetition = sc.nextInt();

        /**
         * Structure logical of repetition iteration numbers and identify if in or out interval
         */
        for (int i = 0; i < number_repetition; i++) {
            number_now = sc.nextInt();
            if (number_now > 10 && number_now < 20){
                numbers_in += 1;
            } else {
                numbers_out += 1;
            }
        }

        /**
         * Printing sum final of numbers and in or out interval [10,20]
         */
        System.out.println("Numbers in interval "+numbers_in);
        System.out.println("Numbers out interval "+numbers_out);

        /**
         * Ending resource "sc"
         */
        sc.close();
    }
}
