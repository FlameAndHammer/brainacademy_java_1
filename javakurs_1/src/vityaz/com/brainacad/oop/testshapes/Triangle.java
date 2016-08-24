package vityaz.com.brainacad.oop.testshapes;


public class Triangle extends Shape{
    private String color;
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c){
        this.color = "black";
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Triangle(String color, double a, double b, double c){
        this.color = color;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String toString(){
        return "This is a Triangle, color is: " + color + ", side A: " + a + ", side B: " + b + ", side C: " + c;
    }

    public double calcArea(){
        double area = 0;
        double s = (a + b + c) / 2;
        return area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

    }
}
