package udovenko.lesson10;

import java.util.Comparator;
import java.util.Random;

/**
 * Created by gladi on 25.08.2016.
 */
abstract class Shape implements Cloneable, Drawable{
    //declare private instance variable “shapeColor” of String type
    private String colorShape;

    //declare static Random variable
    protected static Random rndShape = new Random();

    //declare static variable for calculate sum areas;
    protected static double sumArea = 0.0;
    protected static double sumRectArea = 0.0;
    protected static double sumTriangleArea = 0.0;
    protected static double sumCircleArea = 0.0;

    //Create a base class constructor with random colorShape generator
    protected Shape(){
        Colors[] colors = Colors.values();
        colorShape = colors[rndShape.nextInt(colors.length)].toString();
    }

    // create a constructor for Shape with shapeColor parameter
    protected Shape(String colorShape) {
        this.colorShape = colorShape;
    }

    // Override toString() to return the string of Shape name and color, example: “Shape, color is: RED”
    @Override
    public String toString(){
        return this.getClass().getName().substring(18) + ", color is: " + colorShape;
    }

    /* All shapes must has a method called calcArea (), write public method (empty) calcArea
       that returns double value ( 0.0 )*/
    protected abstract double calcArea();

    //reset all counters in children class
    protected static void resetCounter(){
        Circle.resetCounter();
        Rectangle.resetCounter();
        Triangle.resetCounter();
        sumArea = 0.0;
        sumRectArea = 0.0;
        sumCircleArea = 0.0;
        sumTriangleArea = 0.0;
    }

    protected void setColorShape(String colorShape) {
        this.colorShape = colorShape;
    }

    //Lab Work 2-9-3
   /* protected static Shape purseShape(String s){

    }*/


}
