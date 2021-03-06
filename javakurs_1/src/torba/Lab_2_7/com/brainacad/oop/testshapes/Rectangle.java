package torba.Lab_2_7.com.brainacad.oop.testshapes;

public class Rectangle extends Shape {

    static double area = 0;

    private double width, height;

    public Rectangle(String color, double width, double height){
        super(color); //TODO use super constructor
        this.width = width;
        this.height = height;
        area = area + calcArea();
    }
    //TODO use @Override
    @Override
    public String toString(){
        return "This is Rectangle, color: " + getShapeColor() + ", width = " + width + ", height = " + height;
    }
    //TODO use @Override
    @Override
    public double calcArea(){
        return width * height;
    }



}

