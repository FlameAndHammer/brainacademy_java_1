package kulkov.lesson_2_8;

/**
 * Created by User on 27.08.2016.
 * A subclass of shapes defining circles
 */
public class Circle extends Shape implements Comparable {   //Circle is subclass of Shape
    private double radius;

    public Circle(String color, double radius) {            //Circles constructor
        super(color);                                       //Refer to superclass constructor
        this.radius = radius;                               //Define radius of the circle
    }

    @Override
    public String toString() {                              //Override superclass method
        return "This is Circle, color: " + getShapeColor() + ", radius = " + radius;
    }
    @Override
    public double calcArea() {                              //Calculate the area for circle
        return Math.PI * radius * radius;
    }
    @Override
    public int compareTo(Object o) {                        //Implement Comparable interface method
        Circle circle = (Circle) o;                         //Type cast to one type
        if (this.calcArea() > circle.calcArea()) {
            return 1;                                       //Object that invoked the method is larger
        }
        if (this.calcArea() < circle.calcArea()) {
            return -1;                                      //Object that invoked the method is smaller
        }
        return 0;                                           //Objects are equal in size
    }
}
