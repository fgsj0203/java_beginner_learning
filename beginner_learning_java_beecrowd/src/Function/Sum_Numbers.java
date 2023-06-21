package Function;

import java.util.Locale;
import java.util.Scanner;

public class Sum_Numbers {
    public static void main(String[] args) {

        /**
         * Import locale for decimal number
         */
        Locale.setDefault(Locale.US);

        /**
         * importing class "Scanner" for input data user
         */
        Scanner sc = new Scanner(System.in);

        double numberOne = sc.nextDouble();
        double numberTwo = sc.nextDouble();
        double numberThree = sc.nextDouble();

        double sum = sumNumbers(numberOne,numberTwo,numberThree);
        showSumNumbers(sum);

    }
    /**
     * *************** Section of Function ********************
     */
    public static double sumNumbers(double x, double y, double z){
        double aux;
        aux = (x + y + z);
        return aux;
    }

    public static void showSumNumbers (double value){
        System.out.println("The sum numbers is: " + value);
    }
}
