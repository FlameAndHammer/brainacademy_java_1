package vityaz.com.brainacad.oop.testshapes;


public class Circle extends Shape{
    private final double PI = 3.1415926;
    private String color;
    private double radius;

    public Circle(double radius){
        this.color = "black";
        this.radius = radius;
    }
    public Circle (String color, double radius){
        this.color = color;
        this.radius = radius;
    }

    public String toString(){
        return "This is a Circle, color is: " + color + ", radius: " + radius;
    }

    public double calcArea(){
        double area = 0;
        return area = PI * radius * radius;
    }

}
