package Structure_Condition;

import java.util.Scanner;

public class Duration_Game {
    public static void main(String[] args) {

        /**
         * Importing class Scanner
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Section of variables
         */
        int hour_initial;
        int hour_final;
        int duration;

        /**
         * Input data user
         */
        System.out.println("Hour initial: ");
        hour_initial = sc.nextInt();

        System.out.println("Hour final: ");
        hour_final = sc.nextInt();

        /**
         * Creating condition calculate duration of game
         */
        if (hour_initial < hour_final){
            duration = (hour_initial - hour_final) * (-1);
        } else {
            duration = 24 - hour_initial + hour_final;
        }

        /**
         * printing value final of duration
         */
        System.out.println("Duration of game: "+duration+" Hours ");


        /**
         * Ending resource close
         */
        sc.close();
    }
}
