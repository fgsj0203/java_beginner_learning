public class Interpolation {
    public static void main(String[] args) {

        //Variables
        String product1 = "Computer";
        String product2 = "Office Desk";

        //Section integer and char
        int age = 30;
        int code = 5290;
        char gender = 'F';

        //Section double
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        /**
         * Printing data output
         */
        System.out.printf("%s, which price is %.2f %n", product1, price1);
        System.out.printf("%s, which price is %.2f %n %n", product2, price2);
        System.out.printf("Record: %d years old, code %d and gender: %c %n %n",age,code,gender);
        System.out.printf("Measure with eight decimal places: %.8f %n", measure);
        System.out.printf("Rouded (three decimal places): %.3f", measure);

        /**
         * Observations for learning: using command PRINTF for use model interpolation output data and not PRINTLN
         * %s = string; %f = point flutuant
         */

    }
}
