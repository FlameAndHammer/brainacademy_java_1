package torba.Lab_2_7.com.brainacad.oop.testshapes;

public class Triangle extends Shape {

    static double area = 0;

    private double a, b, c;

    public Triangle(String color, double a, double b, double c){
        setShapeColor(color); //TODO use super constructor
        this.a = a;
        this.b = b;
        this.c = c;
        area = area + calcArea();
    }
    //TODO use @Override
    public String toString(){
        return "This is Triangle, color: " + getShapeColor()+", a = " + a + ", b = " + b + ", c = " + c;
    }
    //TODO use @Override
    public double calcArea(){
        double s = (a + b + c) / 2;
        return Math.sqrt( s * (s - a) * (s - b) * (s -c ) );
    }


}

