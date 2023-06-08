package Structure_Condition;

import java.util.Scanner;

public class Number_Multiple {
    public static void main(String[] args) {

        /**
         * Importing library Scanner
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Creating variables
         */
        int numberA;
        int numberB;

        /**
         * Input data user
         */
        System.out.println("Enter with number A: ");
        numberA = sc.nextInt();

        System.out.println("Enter with a number B: ");
        numberB = sc.nextInt();

        /**
         * Creating structure condition of identify number multiple
         */
        if (numberA % numberB == 0 || numberB % numberA == 0){
            System.out.println("Numbers is multiple");
        } else {
            System.out.println("Numbers is not multiple");
        }

        /**
         * Ending resource Scanner
         */
        sc.close();
    }
}
