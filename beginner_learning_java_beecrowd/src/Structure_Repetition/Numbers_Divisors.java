package Structure_Repetition;

import java.util.Scanner;

public class Numbers_Divisors {
    public static void main(String[] args) {

        /**
         * Importing class Scanner for input data user
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Section of variables
         */
        int number;

        /**
         * Input data user
         */
        System.out.println("Enter with you number for calculate divisor: ");
        number = sc.nextInt();

        /**
         * Structure logical for calculate number divisor
         */
        for (int i = 1; i <= number; i++) {
            if (number % i == 0){
                System.out.println(i);
            } else {
                System.out.println(i + " Number is non-divisible ");
            }
        }

        /**
         * Ending resource "sc" Scanner
         */
        sc.close();
    }
}
