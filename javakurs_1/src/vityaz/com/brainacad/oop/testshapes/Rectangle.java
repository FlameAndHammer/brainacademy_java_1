package vityaz.com.brainacad.oop.testshapes;


public class Rectangle extends Shape{

    private double width;
    private double height;

    public Rectangle(double width, double height){

        this.width = width;
        this.height = height;
    }
    public Rectangle(String color, double width, double height){
        super(color);
        this.width = width;
        this.height = height;
    }
    @Override
    public String toString(){
        return "This is a Rectangle, color is: " + color + ", width: " + width + ", height: " + height;
    }
    @Override
    public double calcArea(){
        return width * height;
    }
}
