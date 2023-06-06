import java.util.Scanner;

public class Math_Java_Operation {
    public static void main(String[] args) {

        /**
         * Exercise about used in some operation Math.
         */

        //Section of variables
        double x;
        double y;
        double z;
        double A, B, C;

        //Importing class Scanner for received input data user
        Scanner sc = new Scanner(System.in);

        //Receiving data of user input
        System.out.println("Enter with value X: ");
        x = sc.nextDouble();

        System.out.println("Enter with value Y: ");
        y = sc.nextDouble();

        System.out.println("Enter with value Z: ");
        z = sc.nextDouble();

        //Attributing value about operation of Squad Roots
        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(z);

        //First operation with Squad roots
        System.out.println("Squad roots of number: "+ x +" = " + A);
        System.out.println("Squad roots of number: "+ y + " = " + B);
        System.out.println("Squad roots of number: "+ z + " = " + C);

        //Operation Math with power
        A = Math.pow(x,y);
        B = Math.pow(x, 2);
        C = Math.pow(x, 3);

        //Printing values of operation math power
        System.out.println(x + " Elevate a "+ y + " = " + A);
        System.out.println(x + " Elevate a power two " + " = " + B);
        System.out.println(x + " Elevate a power three " + " = " + C);
    }
}
