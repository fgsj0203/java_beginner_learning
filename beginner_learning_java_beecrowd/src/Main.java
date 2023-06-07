import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * Exercise: creating operation about sum of two numbers
         */

        //Section of variables
        int numberOne;
        int numberTwo;
        int sumNumbers;

        //Creating class Scanner of received input value
        Scanner sc = new Scanner(System.in);

        //Creating variable of received value number and operation sum
        System.out.println("Enter with value of number one: ");
        numberOne = sc.nextInt();

        System.out.println("Enter with value of number two: ");
        numberTwo = sc.nextInt();

        //Creating operation of sum numbers
        sumNumbers = numberOne + numberTwo;

        //Printing value final of operation sum numbers
        System.out.println(numberOne + " + " + numberTwo + " = " + sumNumbers);
    }
}