package udovenko.lesson10;

/**
 * Created by gladi on 25.08.2016.
 */
public class Shape {
    //declare private instance variable “shapeColor” of String type
    private String colorShape;

    // create a constructor for Shape with shapeColor parameter
    public Shape(String colorShape) {
        this.colorShape = colorShape;
    }

    // Override toString() to return the string of Shape name and color, example: “Shape, color is: RED”
    //@Override
    public String toSting(){
        return this.getClass() + "color is: " + colorShape;
    }

    // All shapes must has a method called calcArea (), write public method (empty) calcArea
    // that returns double value ( 0.0 )
    public double calcArea(){
        return 0.0;
    }
}
