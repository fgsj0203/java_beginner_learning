package Structure_Repetition;

import java.util.Scanner;

public class Two_Numbers_Interval {
    public static void main(String[] args) {

        /**
         * Importing class Scanner for user data input
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Section variables with data user input
         */
        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();

        /**
         * Creating structure logical in loop of type "for"
         */
        for (int i = numberOne; i < numberTwo; i++) { 
            System.out.println(i);
        }
        //aqui estamos usando como o parâmetro de "i" o valor inicial que atribuímos na variável acima 
        //e após isso colocamos como a condição que o valor de "i" que é o da variável numberOne ser menor que o valor da variável numberTwo
        // Por exemplo: atribuímos a variável numberOne o valor 10 então o "i" recebe 10 e aí compara o valor de "i" com o do valor 20 (por exemplo) na variável numberTwo

        /**
         * Ending resource Scanner "sc"
         */
        sc.close();
    }
}
