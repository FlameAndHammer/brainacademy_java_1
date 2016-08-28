package tretiak.labworks.work2;

import jdk.nashorn.internal.runtime.SharedPropertyMap;

import static java.lang.StrictMath.sqrt;


public abstract class Shape implements Drawable, Comparable{
    Shape(String shapeColor){
        this.shapeColor = shapeColor;
    }
    private String shapeColor;
    private double area = 0.0;
    public abstract double calcArea();
    @Override
    public String toString() {
        return "Shape, color is: " + shapeColor;
    }
    public String getShapeColor(){
        return shapeColor;
    }
    public void draw(){
        System.out.println(toString() +" area is: " + calcArea());
    }
    public int compare(Shape firstShape, Shape secondShape){
        if (firstShape.calcArea() > secondShape.calcArea()){
            return 1;
        } else if(firstShape.calcArea() < secondShape.calcArea()){

            return 2;
        }else {
            return 0;
        }
    }
}

class Circle extends Shape {
    private double radius;
    Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }
    @Override
    public double calcArea(){
        return radius* radius * 3.14;
    }

    @Override
    public String toString() {
        return "This is Circle, color : " + getShapeColor() + ", radius " + radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;
    Rectangle(String color, double width, double height){
        super(color);
        this.width = width;
        this.height = height;
    }
    @Override
    public double calcArea(){
        return width * height;
    }
    public String toString() {
        return "This is Rectangle, color : " + getShapeColor() + ", width = " + width + ", height " + height;
    }
}

class Triangle extends Shape {
    private double a;
    private double b;
    private double c;
    Triangle(String color, double a, double b, double c){
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double calcArea(){
        double s = (a + b + c) / 2;
        return sqrt(s * (s - a) * (s - b) * (s - c));
    }
    public String toString() {
        return "This is Triangle, color : " + getShapeColor() + ", a = " + a + ", b =" + b + ", c =" + c;
    }

}