package Structure_Repetition;

import java.util.Scanner;

public class Odd_Numbers_Interval {
    public static void main(String[] args) {

        /**
         * Importing class Scanner for input user
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Creating structure logical for calculate numbers
         */
        for (int i = 0; i < 50; i++) {
            if (i % 2 == 1){
                System.out.println(i + " is number odd");
            }
        }

        /**
         * Ending resource close
         */
        sc.close();

    }
}
