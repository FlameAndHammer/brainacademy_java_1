package torba.Lab_2_8.testshapes;

public class Triangle extends Shape {

    static double area = 0;

    private double a, b, c;

    public void draw(){
        System.out.println(this+", area = "+calcArea());
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

    public Triangle clone(){
        return new Triangle(getShapeColor(), a, b, c);
    }

    public Triangle(String color, double a, double b, double c){
        super(color); //TODO use super constructor
        this.a = a;
        this.b = b;
        this.c = c;
        area = area + calcArea();
    }
    //TODO use @Override
    @Override
    public String toString(){
        return "This is Triangle, color: " + getShapeColor()+", a = " + a + ", b = " + b + ", c = " + c;
    }
    //TODO use @Override
    @Override
    public double calcArea(){
        double s = (a + b + c) / 2;
        return Math.sqrt( s * (s - a) * (s - b) * (s -c ) );
    }


}

