import java.util.Scanner;

public class DifferenceFourNumbers {
    public static void main(String[] args) {

        //Importing class Scanner
        Scanner sc = new Scanner(System.in);

        //Section about variables
        int A;
        int B;
        int C;
        int D;
        int differenceNumbers;

        //Received data of input user
        System.out.println("number 1");
        A = sc.nextInt();

        System.out.println("number 2");
        B = sc.nextInt();

        System.out.println("number 3");
        C = sc.nextInt();

        System.out.println("number 4");
        D = sc.nextInt();

        //Operation about purpose exercise
        differenceNumbers = ((A * B) - (C * D));

        //Printing value final of operation
        System.out.println("Value final of difference is: " + differenceNumbers);

    }
}
