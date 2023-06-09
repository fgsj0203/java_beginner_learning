package Structure_Condition;

import java.util.Scanner;

public class Day_Week {
    public static void main(String[] args) {

        /**
         * Importing class Scanner for user data input
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Variables
         */
        int numberDayWeek;

        /**
         * Input data user
         */
        System.out.println("Enter with a number between 1-7 ");
        numberDayWeek = sc.nextInt();

        /**
         * logical condition of day week
         */

        if (numberDayWeek == 1){
            System.out.println("Sunday");
        } else if (numberDayWeek == 2) {
            System.out.println("Monday");
        } else if (numberDayWeek == 3) {
            System.out.println("Tuesday");
        } else if (numberDayWeek == 4) {
            System.out.println("Wednesday");
        } else if (numberDayWeek == 5) {
            System.out.println("Thursday");
        } else if (numberDayWeek == 6) {
            System.out.println("Friday");
        } else if (numberDayWeek == 7) {
            System.out.println("Saturday");
        } else {
            System.out.println("Day invalid, try again");
        }

        /**
         * Ending resource Scanner
         */
        sc.close();
    }
}
