package torba.Lab_2_8.testshapes;

public class Circle extends Shape {

    static double area = 0;

    private double radius;

    public static Object parseCircle(String s){
        String[] m = s.split(":");
        switch (m[0]){
            case "Circle":
                {return new Circle(m[1], Double.parseDouble(m[2]));}
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

    public Circle(String color, double radius){
        super(color);   //TODO use super constructor
        this.radius = radius;
        area = area + calcArea();
    }
    //TODO use @Override
    @Override
    public String toString(){
        return "This is circle, color: " + getShapeColor() + ", radius = " + radius;
    }
    //TODO use @Override
    @Override
    public double calcArea(){
        return Math.PI * radius * radius; //TODO use Math.PI
    }


}

