package kulkov.lesson_2_7;

/**
 * Created by User on 24.08.2016.
 * A subclass of shapes defining triangles
 */
public class Triangle extends  Shape {                              //Triangle is subclass of Shape
    private double a, b, c;

    public Triangle(String color, double a, double b, double c) {   //Triangles constructor
        super(color);                                               //Refer to superclass constructor
        this.a = a;                                                 //Define sides of the triangle
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {                                      //Override superclass method
        return "This is Triangle, color: " + getShapeColor() + ", a = " + a + ", b = " + b + ", c = " + c;
    }
    @Override
    public double calcArea() {                                      //Calculate the area for triangle
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
