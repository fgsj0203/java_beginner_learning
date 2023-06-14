package Structure_Repetition;

import java.util.Locale;
import java.util.Scanner;

public class Population_growth {
    public static void main(String[] args) {

        /**
         * Importing class locale for decimal number
         */
        Locale.setDefault(Locale.US);

        /**
         * Importing class Scanner for user data input
         */
        Scanner sc = new Scanner(System.in);


        /**
         * Section of variables with data
         */
        double popularionA = 80000;
        double growthA = 1.03;

        double populationB = 200000;
        double growthB = 0.015;

        int year = 0;

        /**
         * Creating structure logical for calculate value final
         */
        while (popularionA <= populationB) {
            popularionA = popularionA + (popularionA * 0.03);
            populationB = populationB + (populationB * 0.015);
            year += 1;
        }

        /**
         * Printing final values
         */
        System.out.printf("Population final of A %.2f %n",popularionA);
        System.out.printf("Population final of B %.2f %n",populationB);
        System.out.println("Final years is: "+year);

    }
}
