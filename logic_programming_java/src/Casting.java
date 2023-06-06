public class Casting {
    public static void main(String[] args) {

        //Section of variables
        int a,b;
        double result;

        // attributing value for variable without input user
        a = 5;
        b = 2;

        //Operation of calculate division
        //result = a / b; //If not identify type value (double) this rounded value, result only case = 2.0
        result = (double) a / b;

        //Printing value of result final
        System.out.println("The result final is: "+result);
    }
}
