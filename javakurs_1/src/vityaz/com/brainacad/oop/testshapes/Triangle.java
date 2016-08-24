package vityaz.com.brainacad.oop.testshapes;


public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Triangle(String color, double a, double b, double c){
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public String toString(){
        return "This is a Triangle, color is: " + color + ", side A: " + a + ", side B: " + b + ", side C: " + c;
    }
    @Override
    public double calcArea(){
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));

    }
}
