package udovenko.lesson10;

import static java.lang.Math.sqrt;

/**
 * Created by gladi on 25.08.2016.
 */
class Triangle extends Shape {
    //Add to class Triangle a private field’s a, b, c (of double type) which is sides of triangle.
    private double sideA;
    private double sideB;
    private double sideC;

    //Add counter of objects
    private static int counter;

    //Add to class Triangle constructor with color, a, b and c arguments.
    public Triangle(String color, double sideA, double sideB, double sideC){
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        counter++;
    }

    //Override the toString() method.
    @Override
    public String toString(){
        return  super.toString() + ", a = " + sideA + ", b = " + sideB + ", c = " + sideC;
    }

    //Override the calcArea() method
    @Override
    public double calcArea(){
        double s = (sideA + sideB + sideC) / 2;
        double area = sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
        sumArea += area;
        sumTriangleArea += area;
        return area;
    }

    //Getter counter
    public static int getCounter() {
        return counter;
    }

    //reset counter
    public static void resetCounter(){
        counter = 0;
    }
}
