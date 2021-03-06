package torba.Lab_2_7.com.brainacad.oop.testshapes;

public class Circle extends Shape {

    static double area = 0;

    private double radius;

    public Circle(String color, double radius){
        super(color);   //TODO use super constructor
        this.radius = radius;
        area = area + calcArea();
    }
    //TODO use @Override
    @Override
    public String toString(){
        return "This is circle, color: " + getShapeColor() + ", radius = " + radius;
    }
    //TODO use @Override
    @Override
    public double calcArea(){
        return Math.PI * radius * radius; //TODO use Math.PI
    }

}

