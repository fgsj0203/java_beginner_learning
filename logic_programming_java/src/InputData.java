import java.util.Scanner;

public class InputData {
    public static void main(String[] args) {

        //Importing library of Scanner for received data input user
        Scanner sc = new Scanner(System.in); //name of variable Scanner is "sc"

        //Creating variable
        /**
         * Using variable of type String
         * String x;
         * x = sc.nextLine(); //Function "nextLine" of received all string input user
         */

        //Using now variable of type "int"
        int x;
        x = sc.nextInt();

        //Printing all content input user string in variable "x"
        System.out.println("Your typed: " + x);

        //Finishing resource Scanner
        sc.close();
    }
}
