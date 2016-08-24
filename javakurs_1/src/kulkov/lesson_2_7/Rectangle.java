package kulkov.lesson_2_7;

/**
 * Created by User on 24.08.2016.
 * A subclass of shapes defining rectangles
 */
public class Rectangle extends Shape {                              //Rectangle is subclass of Shape
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {   //Rectangles constructor
        super(color);                                               //Refer to superclass constructor
        this.width = width;                                         //Define width and height of the rectangle
        this.height = height;
    }

    @Override
    public String toString() {                                      //Override superclass method
        return "This is Rectangle, color: " + getShapeColor() + ", width = " + width + ", height = " + height;
    }
    @Override
    public double calcArea() {                                      //Calculate the area for rectangle
        return width * height;
    }
}
