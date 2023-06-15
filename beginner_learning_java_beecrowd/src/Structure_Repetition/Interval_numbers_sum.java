package Structure_Repetition;

import java.util.Scanner;

public class Interval_numbers_sum {
    public static void main(String[] args) {

        /**
         * Importing class Scanner for input data user
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Section of variables and input data user
         */
        int numberOne;
        int numberTwo;
        int sum = 0;

        /**
         * Input data user
         */
        numberOne = sc.nextInt();
        numberTwo = sc.nextInt();

        /**
         * Creating structure logical with loop "for"
         */
        for (int i = numberOne; i <= numberTwo; i++) {
            System.out.println(sum += i);
        }

        /**
         * Printing value final of sum numbers interval
         */
        System.out.println("Final value of sum numbers: " + sum);

        /**
         * Ending resource "sc" of Scanner
         */
        sc.close();
    }
}
