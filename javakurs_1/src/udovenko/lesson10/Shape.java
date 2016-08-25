package udovenko.lesson10;

/**
 * Created by gladi on 25.08.2016.
 */
class Shape {
    //declare private instance variable “shapeColor” of String type
    private String colorShape;

    //declare static variable for calculate sum areas;
    protected static double sumArea = 0.0;
    protected static double sumRectArea = 0.0;
    protected static double sumTriangleArea = 0.0;
    protected static double sumCircleArea = 0.0;

    // create a constructor for Shape with shapeColor parameter
    public Shape(String colorShape) {
        this.colorShape = colorShape;
    }

    // Override toString() to return the string of Shape name and color, example: “Shape, color is: RED”
    @Override
    public String toString(){
        return this.getClass().getName().substring(18) + ", color is: " + colorShape;
    }

    /* All shapes must has a method called calcArea (), write public method (empty) calcArea
       that returns double value ( 0.0 )*/
    public double calcArea(){
        return 0.0;
    }

    //reset all counters in children class
    public static void resetCounter(){
        Circle.resetCounter();
        Rectangle.resetCounter();
        Triangle.resetCounter();
        sumArea = 0.0;
        sumRectArea = 0.0;
        sumCircleArea = 0.0;
        sumTriangleArea = 0.0;
    }
}
