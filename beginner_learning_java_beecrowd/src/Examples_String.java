import java.util.Scanner;

public class Examples_String {
    public static void main(String[] args) {
        /**
         * Importing class Scanner for user input
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Section of variables and examples
         */
        String original = "asdfg ASDFG ASdFg ASD ZXCV       ";

        //Converting all string for lower
        //Convertendo toda a string em minúsculo
        String s01 = original.toLowerCase();

        //Converting all string for upper
        String s02 = original.toUpperCase();

        //Removing space empty of String
        String s03 = original.trim();

        //Using only one parameter for initial position until final position
        //Usando o comando substring e colocar como parâmetro a partir de onde começar a buscar a String até o final
        String s04 = original.substring(2);

        /**
         * Printing demonstration
         */
        System.out.println(original);
        System.out.println(s01);
        System.out.println(s02);
        System.out.println(s03);
        System.out.println(s04);

        /**
         * Ending resource Scanner
         */
        sc.close();



    }
}
