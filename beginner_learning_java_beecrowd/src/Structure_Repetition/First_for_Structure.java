package Structure_Repetition;

import javax.annotation.processing.SupportedAnnotationTypes;
import java.util.Scanner;

public class First_for_Structure {
    public static void main(String[] args) {

        /**
         * Importing class Scanner for input data user
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Variables section
         */
        int n;
        int numberSum;
        int sumNumbers = 0;

        /**
         * Input data user
         */
        System.out.println("Enter with value of N: ");
        n = sc.nextInt();

        /**
         * Structure condition logical
         */
        for (int x = 0; x < n; x++){
            System.out.println("Enter with number for sum: ");
            numberSum = sc.nextInt();
            sumNumbers += numberSum;
        }

        /**
         * Printing sum final of numbers
         */
        System.out.printf("Sum final of numbers is %d ",sumNumbers);

        /**
         * Ending resource "sc" of Scanner
         */
        sc.close();
    }
}
