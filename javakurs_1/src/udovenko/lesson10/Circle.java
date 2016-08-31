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

    //Create a base class constructor with random "radius" generator
    protected Circle(){
        super();
        radius = Shape.rndShape.nextDouble() * 100;
        counter++;
    }

    //Add to class Circle constructor with color and radius arguments.
    protected Circle(String color, double radius){
        super(color);
        this.radius = radius;
        counter++;
    }

    //Override the toString() method. It must return string which contain name of shape, color and radius of circle.
    @Override
    public String toString(){
        return String.format("%s, radius = %.2f", super.toString(), radius);
    }

    //Override calcArea() method
    @Override
    protected double calcArea(){
        double area = pow(radius, 2) * PI;
        sumArea += area;
        sumCircleArea += area;
        return area;
    }

    //Getter counter
    protected static int getCounter() {
        return counter;
    }

    //Reset counter
    protected static void resetCounter(){
        counter = 0;
    }

    //Override the clone() method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Circle circle = (Circle) super.clone();
        return circle;
    }

    @Override
    public void draw() {
        System.out.printf("%s, area is: %.2f\n", toString(), calcArea());

    }

    protected static Circle parseCircle(String[] s){
        Circle cr = new Circle(s[1], Double.parseDouble(s[2]));
        return cr;
    }
}
