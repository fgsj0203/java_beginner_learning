package Structure_Repetition;

import java.util.Scanner;

public class Password_Correct {
    public static void main(String[] args) {

        /**
         * Importing class Scanner for input data user
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Variables section
         */
        int password;

        /**
         * Enter user data
         */
        System.out.println("Enter with you password: ");
        password = sc.nextInt();

        /**
         * Condition structure
         */
        while (password != 2002){
            System.out.println("Try again you password: ");
            password = sc.nextInt();
        }

        /**
         * Message final
         */
        System.out.println("Password correct");

        /**
         * Ending resource Scanner
         */
        sc.close();



    }
}
