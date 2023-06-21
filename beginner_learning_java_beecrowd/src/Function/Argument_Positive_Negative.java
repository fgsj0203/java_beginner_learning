package Function;
import java.util.Locale;
import java.util.Scanner;

public class Argument_Positive_Negative {
    public static void main(String[] args) {

        /**
         * Importing locale for decimal number
         */
        Locale.setDefault(Locale.US);

        /**
         * Importing class "Scanner" for input data user
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Input data user
         */
        int number = sc.nextInt();

        /**
         * Using function for available if argument positive or negative
         */
        int argumentFinal = argumentNumber(number);


        /**
         * Ending resource close
         */
        sc.close();

    }

    /**
     * *********** Section of create function ***********
     */
    public static int argumentNumber(int number) {
        if (number > 0) {
            System.out.println("P");
        } else {
            System.out.println("N");
        }
        return number;
    }

}
