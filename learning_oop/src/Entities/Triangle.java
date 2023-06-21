package Entities;

public class Triangle {
    public double a;
    public double b;
    public double c;

    /**
     * Creating method for calculate area of triangle
     */
    public double areaTriangle (){
        double p = (a + b + c) / 2;
        double result = Math.sqrt(p * (p - a)*(p - b) * (p - c));
        return result;
    }

    public void result() {
        System.out.println("Triangle is larger area is: ");
    }
}
