package Structure_Condition;

import java.util.Locale;
import java.util.Scanner;

public class Price_Snack {
    public static void main(String[] args) {

        /**
         * Importing decimal of US
         */
        Locale.setDefault(Locale.US);

        /**
         * importing class Scanner
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Variables
         */
        int codeItem;
        int amountItem;
        double priceFinal = 0;

        /**
         * Input data user
         */
        System.out.println("Enter with code of Item: ");
        codeItem = sc.nextInt();

        System.out.println("Enter with amount item: ");
        amountItem = sc.nextInt();

        /**
         * Condition of calculate price final item
         */
        if (codeItem == 1){
            priceFinal = 4.00 * amountItem;
        }
        else if (codeItem == 2){
            priceFinal = 4.50 * amountItem;
        }
        else if (codeItem == 3){
            priceFinal = 5.00 * amountItem;
        }
        else if (codeItem == 4){
            priceFinal = 2.00 * amountItem;
        }
        else if (codeItem == 5){
            priceFinal = 1.50 * amountItem;
        }

        /**
         * Printing value final of snack
         */
        System.out.println("Price final of snack is: U$ "+ priceFinal);

        /**
         * Ending resource Scanner
         */
        sc.close();
    }
}
