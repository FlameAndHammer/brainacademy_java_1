package kulkov.lesson_2_8;

/**
 * Created by User on 27.08.2016.
 * A subclass of shapes defining rectangles
 */
public class Rectangle extends Shape implements Comparable, Cloneable {     //Rectangle is subclass of Shape
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {           //Rectangles constructor
        super(color);                                                       //Refer to superclass constructor
        this.width = width;                                                 //Define width and height of the rectangle
        this.height = height;
    }

    @Override
    public String toString() {                                              //Override superclass method
        return "This is Rectangle, color: " + getShapeColor() + ", width = " + width + ", height = " + height;
    }
    @Override
    public double calcArea() {                                              //Calculate the area for rectangle
        return width * height;
    }
    @Override
    public int compareTo(Object o) {                                        //Implement Comparable interface method
        Rectangle rect = (Rectangle) o;
        if (this.calcArea() > rect.calcArea()) {
            return 1;
        }
        if (this.calcArea() < rect.calcArea()) {
            return -1;
        }
        return 0;
    }
    @Override
    public Rectangle clone() throws CloneNotSupportedException{             //Override cloning method for Rectangle instances
        return (Rectangle) super.clone();                                   //No need of a deep copy since object has no reference type fields
    }
    @Override
    public boolean equals(Object o) {                                       //Override the equality check
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Rectangle rect = (Rectangle) o;
        return (width == rect.width && height == rect.height);              //Check objects primitive fields for equality
    }
    @Override
    public int hashCode() {                                                 //When you override equals() you also need to override hashCode()
        int result = 1;                                                     //Create hash code calculations using the fields of an object
        result = 31 * result + (int) (Double.doubleToLongBits(width) ^ (Double.doubleToLongBits(width) >>> 32));
        result = 31 * result + (int) (Double.doubleToLongBits(height) ^ (Double.doubleToLongBits(height) >>> 32));
        return result;
    }
}
