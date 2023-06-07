import java.util.Locale;
import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {

        //Exercise about calculate salary brute of employee

        /**
         * Importing class Locale for change decimal number
         */
        Locale.setDefault(Locale.US);

        /**
         * Importing class Scanner of received input data user
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Section variables
         */
        int numberEmployee;
        double hoursWorking;
        double valueHourWork;
        double salaryBrute;

        /**
         * Input received data user for attribute value
         */
        System.out.println("Enter with you number identify: ");
        numberEmployee = sc.nextInt();

        System.out.println("Enter with hours worked in month: ");
        hoursWorking = sc.nextDouble();

        System.out.println("Enter with value of hour work: ");
        valueHourWork = sc.nextDouble();

        /**
         * Calculating salary brute of employee
         */
        salaryBrute = (hoursWorking * valueHourWork);


        /**
         * Printing values final of ID employee and salary brute
         */
        System.out.println("number Employee ID: "+numberEmployee);
        System.out.println("Salary brute: U$"+salaryBrute);

    }
}
