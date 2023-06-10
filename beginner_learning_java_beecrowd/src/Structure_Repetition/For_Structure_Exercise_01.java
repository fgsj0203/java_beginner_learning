package Structure_Repetition;

import java.util.Scanner;

public class For_Structure_Exercise_01 {
    public static void main(String[] args) {

        /**
         * Importing class Scanner for data user input
         */
        Scanner sc = new Scanner(System.in);


        /**
         * Section of variables
         */
        int x = 4;
        int y = x + 2;

        /**
         * Creating structure for in repetition calculate interval numbers
         */

        for (int i = 0; i < x ;i++){
            System.out.println(x+" "+y);
            y = y + 1;
        }

        /**
         * Ending resource "sc" of Scanner
         */
        sc.close();
    }
}
