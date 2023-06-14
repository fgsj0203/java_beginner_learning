package Structure_Repetition;

import java.util.Scanner;

public class Validations_datas {
    public static void main(String[] args) {

        /**
         * Importing class Scanner for input data user
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Section of variables
         */
        String name;
        int age;
        double salary;
        String gender;
        String stateCivil;

        /**
         * Input data user for validation data
         */
        System.out.println("Enter with a name: ");
        name = sc.nextLine();
        while (name.length() <= 3){
            System.out.println("name invalid, try again");
            name = sc.nextLine();
        }

        //Validation of age valid
        System.out.println("Enter with you age: ");
        age = sc.nextInt();
        while (age < 0 || age > 150){
            System.out.println("Age invalid, try again");
            age = sc.nextInt();
        }

        //Validation of salary
        System.out.println("Enter with you salary: ");
        salary = sc.nextDouble();
        while (salary < 0){
            System.out.println("Salary invalid, try again");
            System.out.println("Your salary: ");
            salary = sc.nextDouble();
        }

        //Validation of gender
        System.out.println("Enter with gender: ");
        gender = sc.next();
        while (gender.charAt(0) != 'f' && gender.charAt(0) != 'm' ){
            System.out.println("Gender invalid, try again: ");
            gender = sc.next();
        }

        // validation of State civil
        System.out.println("Enter with you State civil: ");
        stateCivil = sc.next();
        while (stateCivil.charAt(0) != 's' && stateCivil.charAt(0) != 'c' && stateCivil.charAt(0) != 'v' && stateCivil.charAt(0) != 'd'){
            System.out.println("State civil invalid, try again: ");
            stateCivil = sc.next();
        }

        /**
         * Printing data final of input user
         */
        System.out.println("Your name is: "+name);
        System.out.println("Your age is: "+age);
        System.out.println("Your salary is: "+salary);
        System.out.println("Your gender is: "+gender);
        System.out.println("Your State Civil is: "+stateCivil);



        /**
         * Ending resource "SC" of Scanner
         */
        sc.close();
    }
}
