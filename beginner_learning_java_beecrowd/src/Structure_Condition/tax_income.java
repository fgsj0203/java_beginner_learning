package Structure_Condition;

import java.util.Locale;
import java.util.Scanner;

public class tax_income {
    public static void main(String[] args) {

        /**
         * Importing library "Locale" for decimal number
         */
        Locale.setDefault(Locale.US);

        /**
         * Importing class Scanner for input data user
         */
        Scanner sc = new Scanner(System.in);

        /**
         * section Variables
         */
        double income;
        double tax_income = 0;

        /**
         * Input data user
         */
        System.out.println("Enter with income: ");
        income = sc.nextDouble();

        /**
         * Structure condition of calculate income tax
         */
        if (income > 0 && income <= 2000.00){
            System.out.println("Tax income Foolish");
        } else if (income > 2000.01 && income <= 3000.00) {
            tax_income = (income * 0.08);
        } else if (income > 3000.01 && income < 4500.00) {
            tax_income = (income * 0.18);
        } else if (income > 4500.00) {
            tax_income = (income * 0.28);
        } else {
            System.out.println("Out interval");
        }

        /**
         * Printing final value tax income
         */
        System.out.println("Your tax is: U$ " + tax_income);

        /**
         * Ending resource Scanner
         */
        sc.close();
    }
}
