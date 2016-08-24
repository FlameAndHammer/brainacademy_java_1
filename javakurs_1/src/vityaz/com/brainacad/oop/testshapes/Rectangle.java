package vityaz.com.brainacad.oop.testshapes;


public class Rectangle extends Shape{
    private String color; //TODO Shape already has color. what is the need?
    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.color = "black";       //TODO see Circle
        this.width = width;
        this.height = height;
    }
    public Rectangle(String color, double width, double height){
        this.color = color;         //TODO see Circle
        this.width = width;
        this.height = height;
    }
    //TODO use @Override
    public String toString(){
        return "This is a Rectangle, color is: " + color + ", width: " + width + ", height: " + height;
    }
    //TODO use @Override
    public double calcArea(){
        double area = 0;
        return area = width * height; //TODO see Circle
    }
}
