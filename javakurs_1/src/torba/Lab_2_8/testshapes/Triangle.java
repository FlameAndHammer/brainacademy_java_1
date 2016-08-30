package torba.Lab_2_8.testshapes;

public class Triangle extends Shape {

    static double area = 0;

    private double a, b, c;

    public static Object parseTriangle(String s){
        String[] m = s.split(":");
        switch (m[0]){
            case "Triangle":
                {return new Triangle(m[1], Double.parseDouble(m[2]), Double.parseDouble(m[3]), Double.parseDouble(m[4]));}
            default:
                {return new String("unknown object");}
        }
    }


/*
    public int compareTo(Object o){
        Rectangle r = (Rectangle) o;
        if (calcArea() > r.calcArea()) {return 1;}
        else if (calcArea() < r.calcArea()) {return -1;}
        else {return 0;}
    }
*/

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

