import java.util.Locale;
import java.util.Scanner;

public class InputData {
    public static void main(String[] args) {

        //Example with function locale for use point case decimal
        Locale.setDefault(Locale.US);

        //Importing library of Scanner for received data input user
        Scanner sc = new Scanner(System.in); //name of variable Scanner is "sc"

        //Creating variable
        /**
         *Using variable of type String
         *string x;
         * x = sc.nextLine(); //Function "nextLine" of received all string input user
         */

        /**
         *Using now variable of type "int"
         *int x;
         *x = sc.nextInt();
         */

        /**
         * Using now variable of type "point flutuant".
         * If use virgule in decimal house, not modified, if not, use point additing Locale.setDefault(Locale.US)
         * Before declaration Scanner.
         */

        /**
         *double x;
         *x = sc.nextDouble();
         *Printing all content input user string in variable "x"
         *System.out.println("Your typed: " + x);
         */

        /**
         * Using function "charAt()" for capture character of string in parameter
         * char x;
         * x = sc.next().charAt(0); Obs.: in function charAt(0) a parameter this is index capture in string
         * System.out.println(x);
         */

        //Finishing resource Scanner
        sc.close();
    }
}
