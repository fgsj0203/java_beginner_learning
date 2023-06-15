package Structure_Repetition;

import java.util.Scanner;

public class Bigger_five_numbers {
    public static void main(String[] args) {

        /**
         * Importing class Scanner for input data user
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Section of variables
         */
        int number;
        int biggerNumber = 0;

        /**
         * Creating logical structure for input data and printing value
         */
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter with a number: ");
            number = sc.nextInt();
            if (number > biggerNumber) {
                biggerNumber = number;
            }
        }
        // Aqui o biggerNumber ele começa com o valor para que sempre que aplicarmos um número na variável number a gente compare e porquê zero, isso zero é o menor valor inteiro positivo na matemática
        // Então o primeiro número a comparar sempre será o maior na primeira iteração, tipo, 1 já é maior que zero, logo é o maior número, mas segunda iteração coloco 5 e aí 5 já será o maior
        // E assim sucessivamente.

        /**
         * Printing of Bigger number
         */
        System.out.println("Bigger number is: "+biggerNumber);

    }
}
