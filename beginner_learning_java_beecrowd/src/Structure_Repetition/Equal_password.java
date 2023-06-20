package Structure_Repetition;

import java.util.Scanner;

public class Equal_password {
    public static void main(String[] args) {

        /**
         * Importing class Scanner for input data user
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Section of variables and input data user
         */
        System.out.println("Enter with name: ");
        String name = sc.nextLine();
        System.out.println("Enter with password: ");
        String password = sc.nextLine();

        /**
         * Verify of values is equal and finished program
         */
        if (name.equals(password)){
            System.out.println("name and password is equal");
        } else {
            System.out.println("Continue a program...");
        }

        /**
         * Logical Structure for printing final value
         */
        while (!name.equals(password)){ //Utilizando a sigla de exclamação "!" é referente a negação do valor booleano da variável
            System.out.println("Name not equal a password, try again");
            System.out.println("Your name: ");
            name = sc.nextLine();

            System.out.println("your password: ");
            password = sc.nextLine();
        }

        /**
         * Printing value final
         */
        System.out.printf("Your name is equal a password, name: %s and password: %s", name,password);

        /**
         * Ending resource "sc" of Scanner
         */
        sc.close();

    }
}
