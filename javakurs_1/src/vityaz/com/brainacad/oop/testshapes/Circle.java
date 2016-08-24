package vityaz.com.brainacad.oop.testshapes;


public class Circle extends Shape{
    private double radius;

    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }
    public Circle (double radius){
        this.radius = radius;
    }
    @Override
    public String toString(){
        return "This is a Circle, color is: " + color + ", radius: " + radius;
    }

    public double calcArea(){
        return  Math.PI * radius * radius;
    }

}
