package derdyuk.lesson2_8$2_7.Shape;

/**
 * Created by maossi on 26.08.2016.
 */
public class Triangle extends Shape implements Drawable {
    private double a;
    private double b;
    private double c;
    private double s;

    public Triangle(String shapeColor, double a, double b, double c ){
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
        this.s = (a+b+c)/2;
    }

    @Override
    public String toString(){
        return "This is Triangle, color is " + getShapeColor() + " side 'a' is " + a + " side 'b' is "+ b + " side 'c' is " + c;
    }
    @Override
    public double calcArea(){
        return Math.sqrt(s* (s-a)*(s-b)*(s-c));

    }


}
