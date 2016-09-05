package derdyuk.lesson2_8$2_7.Shape;



/**
 * Created by maossi on 26.08.2016.
 */
public class Circle extends Shape implements Drawable {
    private double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }


    @Override
    public String toString() {
        return "This is Circle, color " + getShapeColor() + "  radius is " + radius;
        }
    @Override
    public double calcArea (){
        return Math.PI * radius*radius;
    }



}
        


