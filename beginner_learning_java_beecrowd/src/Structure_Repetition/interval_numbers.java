package Structure_Repetition;

import java.util.Scanner;

public class interval_numbers {
    public static void main(String[] args) {

        /**
         * Importing class Scanner for input data user
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Section variables with input data user
         */
        System.out.println("Enter with a number: ");
        int number = sc.nextInt();

        /**
         * Creating logical structure for result
         */
        while (number < 0 || number > 10){
            System.out.println("number invalid, try again");
            number = sc.nextInt();
        }

        /**
         * Printing value final
         */
        System.out.printf("Your final number: %d ",number);
    }
}
