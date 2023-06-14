package Structure_Repetition;

import java.util.Scanner;

public class Bigger_five_numbers {
    public static void main(String[] args) {

        /**
         * Importing class Scanner for input data user
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Section of variables
         */
        int number;
        int biggerNumber = 0;

        /**
         * Creating logical structure for input data and printing value
         */
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter with a number: ");
            number = sc.nextInt();
            if (number > biggerNumber) {
                biggerNumber = number;
            }
        }

        /**
         * Printing of Bigger number
         */
        System.out.println("Bigger number is: "+biggerNumber);

    }
}
