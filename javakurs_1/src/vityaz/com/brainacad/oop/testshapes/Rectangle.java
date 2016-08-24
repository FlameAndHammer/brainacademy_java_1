package vityaz.com.brainacad.oop.testshapes;


public class Rectangle extends Shape{
    private String color;
    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.color = "black";
        this.width = width;
        this.height = height;
    }
    public Rectangle(String color, double width, double height){
        this.color = color;
        this.width = width;
        this.height = height;
    }

    public String toString(){
        return "This is a Rectangle, color is: " + color + ", width: " + width + ", height: " + height;
    }

    public double calcArea(){
        double area = 0;
        return area = width * height;
    }
}
