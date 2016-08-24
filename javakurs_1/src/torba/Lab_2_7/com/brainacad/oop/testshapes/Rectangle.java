package torba.Lab_2_7.com.brainacad.oop.testshapes;

public class Rectangle extends Shape {

    private double width, height;

    public Rectangle(String color, double width, double height){
        setShapeColor(color);
        this.width = width;
        this.height = height;
    }

    public String toString(){
        return "This is Rectangle, color: " + getShapeColor() + ", width = " + width + ", height = " + height;
    }

    public double calcArea(){
        return width * height;
    }



}

