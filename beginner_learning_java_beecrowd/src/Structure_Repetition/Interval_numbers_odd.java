package Structure_Repetition;

import java.util.Scanner;

public class Interval_numbers_odd {
    public static void main(String[] args) {
        /**
         * Importing class Scanner for data user input
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Section of variables
         */
        int number;

        /**
         * Data user input
         */
        System.out.println("Enter with a number: ");
        number = sc.nextInt();

        /**
         * Logical structure repetition for calculate interval numbers and return only odd
         */
        for (int x=0; x < number; x++){
            if (x % 2 == 1){
                System.out.println(x + " is odd");
            }
        }
    }
}
