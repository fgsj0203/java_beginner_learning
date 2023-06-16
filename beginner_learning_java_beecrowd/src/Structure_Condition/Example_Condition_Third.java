package Structure_Condition;

import java.util.Locale;
import java.util.Scanner;

public class Example_Condition_Third {
    public static void main(String[] args) {

        /**
         * Importing class Locale for decimal number
         */
        Locale.setDefault(Locale.US);

        /**
         * Importing class Scanner for input data user
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Section of variables
         */
        double preco = 34.5;

        /**
         * ########### Atenção #############
         * Criando variável já com a condição ternária
         */
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;// <------
        //     (variável)   (condição)   (Se verdadeiro)   (se não)

        //Printing discount
        System.out.println("Discount: "+desconto);

        /**
         * Ending resource "sc" of Scanner
         */
        sc.close();
    }
}
