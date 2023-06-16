package Function;

import java.util.Scanner;

public class Example_Function {
    public static void main(String[] args) {

        /**
         * Importing class Scanner for data user input
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Section of variables
         */
        System.out.println("Enter with three numbers: ");
        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();
        int numberThree = sc.nextInt();


        int higher = max(numberOne, numberTwo, numberThree);

        showResult(higher);

        /**
         * ending resource "sc" Scanner
         */
        sc.close();

    }

    /**
     * Area for creation first function example
     */
    public static int max (int x, int y, int z){
        /**
         * Creating variable local with support a value higher
         * Criando uma variável local que receberá o maior valor da nossa função
         */
        int aux;
        if (x > y && x > z){
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux; //Retorno final do maior valor
    }

    /**
     * Creating function only printing value final
     * Criando função para imprmir valor final na tela
     */
    public static void showResult (int value){
        System.out.println("Higher number is: " + value);
    }



}
