import java.util.Scanner;
import java.util.Locale;

public class AreaCircle {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        //Creating and importing class Scanner for received data input user
        Scanner sc = new Scanner(System.in);

        //Section of variables
        float pi = 3.14159F;
        float raid;
        float areaCircle = 0; //Initializing value of variable

        //Received input data user
        System.out.println("Enter with value raid");
        raid = sc.nextFloat();

        //Creating operation about area of circle
        areaCircle = (float) (pi * Math.pow(raid,2));

        //Printing value final of area circle
        System.out.printf("The area of circle is: %.4f",areaCircle);
    }
}
