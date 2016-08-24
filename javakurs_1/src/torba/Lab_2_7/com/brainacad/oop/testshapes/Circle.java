package torba.Lab_2_7.com.brainacad.oop.testshapes;

public class Circle extends Shape {

    private double radius;

    public Circle(String color, double radius){
        setShapeColor(color);   //TODO use super constructor
        this.radius = radius;
    }
        //TODO use @Override
    public String toString(){
        return "This is circle, color: " + getShapeColor() + ", radius = " + radius;
    }
    //TODO use @Override
    public double calcArea(){
        return 3.14159 * radius * radius; //TODO use Math.PI
    }


}

