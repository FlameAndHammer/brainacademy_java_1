package tretiak.labworks.work2;

import java.security.cert.TrustAnchor;

import static java.lang.StrictMath.sqrt;


public abstract class Shape implements Drawable, Comparable, Cloneable{
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
    public int compareTo(Object o){
        Shape shape2 = (Shape)o;
        if(this.calcArea() > shape2.calcArea()){
            return 1;
        }else if(this.calcArea() < shape2.calcArea()){
            return -1;
        }
        return 0;
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
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }
    @Override
    public double calcArea(){
        return width * height;
    }
    public String toString() {
        return "This is Rectangle, color : " + getShapeColor() + ", width = " + width + ", height " + height;
    }
    public Rectangle clone(){
        return new Rectangle(getShapeColor(), width, height);
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
    public void setA(double a){
        this.a = a;
    }
    public void setB(double b){
        this.b = b;
    }
    public void setC(double c){
        this.c = c;
    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    @Override
    public double calcArea(){
        double s = (a + b + c) / 2;
        return sqrt(s * (s - a) * (s - b) * (s - c));
    }
    public String toString() {
        return "This is Triangle, color : " + getShapeColor() + ", a = " + a + ", b =" + b + ", c =" + c;
    }
    public Triangle clone(){
        return new Triangle(getShapeColor(), a, b, c);
    }

}