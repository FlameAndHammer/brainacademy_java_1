package vityaz.com.brainacad.oop.testshapes;


public class Circle extends Shape{
    private final double PI = 3.1415926; //TODO use Math.PI
    private String color; //TODO Shape already has color. what is the need?
    private double radius;

    public Circle(double radius){
        this.color = "black";       //TODO use color from parent and use super
        this.radius = radius;
    }
    public Circle (String color, double radius){
        this.color = color;
        this.radius = radius;
    }
    //TODO use @Override
    public String toString(){
        return "This is a Circle, color is: " + color + ", radius: " + radius;
    }

    public double calcArea(){
        double area = 0;
        return area = PI * radius * radius; //TODO  return PI * radius * radius; why is so difficult?
    }

}
