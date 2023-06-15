package Structure_Repetition;

import java.util.Scanner;

public class Two_Numbers_Interval {
    public static void main(String[] args) {

        /**
         * Importing class Scanner for user data input
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Section variables with data user input
         */
        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();

        /**
         * Creating structure logical in loop of type "for"
         */
        for (int i = numberOne; i < numberTwo; i++) {
            System.out.println(i);
        }

        /**
         * Ending resource Scanner "sc"
         */
        sc.close();
    }
}
