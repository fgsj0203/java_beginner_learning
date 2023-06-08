package Structure_Condition;

import java.util.Scanner;

public class Number_Negative_Positive {
    public static void main(String[] args) {

        /**
         * Importing library of received data user input
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Section variable
         */
        int number;

        /**
         * Received data input user data
         */
        System.out.println("Enter with number: ");
        number = sc.nextInt();

        /**
         * Creating structure condition
         */
        if(number < 0){
            System.out.println("Number negative");
        } else {
            System.out.println("Number positive");
        }

        /**
         * Ending resource Scanner
         */
        sc.close();

    }
}
