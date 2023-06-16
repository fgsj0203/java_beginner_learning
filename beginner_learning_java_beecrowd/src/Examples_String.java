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
        //Convertendo toda a string em maiúsculo
        String s02 = original.toUpperCase();

        //Removing space empty of String
        //Removendo os espaços em brancos da string
        String s03 = original.trim();

        //Using only one parameter for initial position until final position
        //Usando o comando substring e colocar como parâmetro a partir de onde começar a buscar a String até o final
        String s04 = original.substring(2);

        //Using command substring for capture position initial of string and second argument of limit String
        /**
         * Usando comando Substring para capturar criar uma nova string
         * A partir de dois argumentos, o da posição incial e até aonde ela vai ter que buscar
         */
        String s05 = original.substring(2,10);

        /**
         * Using command replace for literal replace two arguments
         * Usar o comando replace para substituir um dado pelo outro em uma String
         */
        String s06 = original.replace("A", "q");

        /**
         * Printing demonstration
         */
        System.out.println(original);
        System.out.println(s01);
        System.out.println(s02);
        System.out.println(s03);
        System.out.println(s04);
        System.out.println(s05);
        System.out.println(s06);

        /**
         * Ending resource Scanner
         */
        sc.close();



    }
}
