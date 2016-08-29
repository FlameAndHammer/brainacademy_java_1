package kulkov.lesson_2_7;

/**
 * Created by User on 24.08.2016.
 * Superclass which defines shapes in general
 */
class Shape {
    private String shapeColor;
    private static double sumArea = 0;

    public static void setSumArea(double sumArea) {
        Shape.sumArea = sumArea;
    }

    public static double getSumArea() {
        return sumArea;
    }

    public String getShapeColor() {             //Default getter
        return shapeColor;
    }

    public Shape(String shapeColor) {           //General constructor of all shapes
        this.shapeColor = shapeColor;           //It defines shape color
    }

    @Override
    public String toString() {                  //Override an existing method
        return "Shape, color is: " + shapeColor;
    }
    public double calcArea() {                  //This method will be overriden
        return 0.0;                             //Each type of shapes has its own formula for calculating the area
    }

}
