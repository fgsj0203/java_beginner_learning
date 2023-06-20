package Structure_Repetition;

import java.util.Scanner;

public class Bigger_Five_Sum_Average {
    public static void main(String[] args) {

        /**
         * Importing class Scanner of input data user
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Section of variables and input data user
         */
        int number;
        int sum = 0;
        int average = 0;


        /**
         * Creating structure logical for calculating
         */
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter with a number: ");
            number = sc.nextInt();
            sum += number; //o trecho "+=" é o mesmo que [variável-A] = [variável-A] + [variável 2] 
        }

        /**
         * Calculating average of numbers
         */
        average = sum / 5;

        /**
         * Printing values final
         */
        System.out.println("Average of numbers is: " + average);
        System.out.println("Sum of numbers is: " + sum);

    }
}
