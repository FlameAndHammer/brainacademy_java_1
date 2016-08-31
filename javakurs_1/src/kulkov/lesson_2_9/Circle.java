package kulkov.lesson_2_9;

/**
 * Created by User on 31.08.2016.
 * A subclass of shapes defining circles
 */
public class Circle extends Shape {                         //Circle is subclass of Shape
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

    public static Circle parseCircle(String s) {            //Parse string to create circle
        String[] circleData = s.split(":|,");               //Separate the data
        double r = Double.parseDouble(circleData[1]);       //Convert information about radius to double
        return new Circle(circleData[0], r);                //Call circles constructor
    }
}
