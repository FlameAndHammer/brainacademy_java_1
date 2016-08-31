package udovenko.lesson10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.regex.Pattern;

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
        //return this.getClass().getName().substring(18) + ", color is: " + colorShape;
        String shapeName = new String(this.getClass().getName().substring(18));
        return String.format("%s, color is: %s", shapeName, colorShape);
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
   /*protected static Shape purseShape(String s){
       String[] param = s.split(":");
       String shapeName = param[0];
       String color = param[1];
       switch (shapeName){
           case "Circle":{
               Circle cr = new Circle(param[1], Double.parseDouble(param[2]));
               return cr;
           }
           case "Rectangle": {
               String[] sides = param[2].split(",");
               Rectangle rt = new Rectangle(param[1], Double.parseDouble(sides[0]), Double.parseDouble(sides[1]));
               return rt;
           }
           case "Triangle": {
               String[] sides = param[2].split(",");
               Triangle tr = new Triangle(param[1], Double.parseDouble(sides[0]), Double.parseDouble(sides[1]),
                       Double.parseDouble(sides[2]));
               return tr;
           }
           default:{
               System.out.println("Invalid shape name");
               return new Circle("NULL", 0.0);
           }
       }
   }*/

   //Lab Work 2-9-4
   protected static Shape purseShape(String s){
       String[] param = s.split(":");
       String shapeName = param[0];
       switch (shapeName){
           case "Circle":{
               Circle cr = Circle.parseCircle(param);
               return cr;
           }
           case "Rectangle": {
               Rectangle rt = Rectangle.parseRectangle(param);
               return rt;
           }
           case "Triangle": {
               Triangle tr = Triangle.parseTriangle(param);
               return tr;
           }
           default:{
               System.out.println("Invalid shape name");
               return new Circle("NULL", 0.0);
           }
       }
   }
}
