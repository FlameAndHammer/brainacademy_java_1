package torba.Lab_2_7.com.brainacad.oop.testshapes;

public class Rectangle extends Shape {

    private double width, height;

    public Rectangle(String color, double width, double height){
        setShapeColor(color); //TODO use super constructor
        this.width = width;
        this.height = height;
    }
    //TODO use @Override
    public String toString(){
        return "This is Rectangle, color: " + getShapeColor() + ", width = " + width + ", height = " + height;
    }
    //TODO use @Override
    public double calcArea(){
        return width * height;
    }



}

