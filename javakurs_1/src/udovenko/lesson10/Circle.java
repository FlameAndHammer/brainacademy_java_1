package udovenko.lesson10;

import static java.lang.Math.*;

/**
 * Created by gladi on 25.08.2016.
 */

class Circle extends Shape {
    //Add to class Circle a private field “radius” (of double type).
    private double radius;

    //Add counter of objects
    private static int counter;

    //Add to class Circle constructor with color and radius arguments.
    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
        counter++;
    }

    //Override the toString() method. It must return string which contain name of shape, color and radius of circle.
    @Override
    public String toString(){
        return  super.toString() + ", radius = " + radius;
    }

    //Override calcArea() method
    @Override
    public double calcArea(){
        double area = pow(radius, 2) * PI;
        sumArea += area;
        sumCircleArea += area;
        return area;
    }

    //Getter counter
    public static int getCounter() {
        return counter;
    }

    //Reset counter
    public static void resetCounter(){
        counter = 0;
    }
}
