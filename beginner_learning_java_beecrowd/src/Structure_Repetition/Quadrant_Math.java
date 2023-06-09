package Structure_Repetition;

import java.util.Scanner;

public class Quadrant_Math {
    public static void main(String[] args) {

        /**
         * Importing class Scanner for data user input
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Section variables
         */
        int quadrantX;
        int quadrantY;

        /**
         * Input data user
         */
        System.out.println("Enter with value about quadrant X: ");
        quadrantX = sc.nextInt();

        System.out.println("Enter with a value about quadrant Y: ");
        quadrantY = sc.nextInt();

        /**
         * Structure condition
         */
        while(quadrantX != 0 && quadrantY != 0){
            if (quadrantX > 0 && quadrantY >0){
                System.out.println("First quadrant");
            } else if (quadrantX < 0 && quadrantY > 0){
                System.out.println("Second quadrant");
            } else if (quadrantX < 0 && quadrantY < 0) {
                System.out.println("Third quadrant");
            } else {
                System.out.println("Fourth quadrant");
            }
            quadrantX = sc.nextInt();
            quadrantY = sc.nextInt();
        }

        /**
         * Ending resource Scanner
         */
        sc.close();
    }
}
