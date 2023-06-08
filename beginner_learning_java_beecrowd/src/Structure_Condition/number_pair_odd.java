package Structure_Condition;

import java.util.Scanner;

public class number_pair_odd {
    public static void main(String[] args) {

        /**
         * Importing class Scanner for input data
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Creating variable
         */
        int number;

        /**
         * Input data user
         */
        System.out.println("Enter with a number: ");
        number = sc.nextInt();

        /**
         * Creating structure condition of identify number pair and odd
         */
        if (number % 2 == 0){
            System.out.println("Number is pair");
        } else {
            System.out.println("Number is odd");
        }

        /**
         * Ending resource Scanner
         */
        sc.close();
    }
}
