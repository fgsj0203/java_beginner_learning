package Structure_Condition;

import java.util.Locale;
import java.util.Scanner;

public class Attribute_Acumulative {
    public static void main(String[] args) {

        /**
         * Importing library LOCALE for number decimal
         */
        Locale.setDefault(Locale.US);

        /**
         * Importing class Scanner for input data user
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Variables
         */
        int minutes;
        double payMinutesExcedd;

        /**
         * input data
         */
        System.out.println("Enter with minutes used in month: ");
        minutes = sc.nextInt();

        if (minutes <= 100){
            System.out.println("value for pay is U$ 50.00");
        } else {
            payMinutesExcedd = (minutes - 100) * 2 + 50;
            System.out.printf("your pay is U$ %.2f",payMinutesExcedd);
        }
    }
}
