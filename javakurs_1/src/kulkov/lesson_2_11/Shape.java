package kulkov.lesson_2_11;

/**
 * Created by User on 04.09.2016.
 * Abstract superclass which defines shapes in general
 */
public abstract class Shape implements Comparable {   //Abstract class won't have instances
    private String shapeColor;

    public String getShapeColor() {                     //Default getter
        return shapeColor;
    }

    public Shape(String shapeColor) {                   //General constructor of all shapes
        this.shapeColor = shapeColor;                   //It defines shape color
    }

    @Override
    public String toString() {                          //Override an existing method
        return "Shape, color is: " + shapeColor;
    }

    public abstract double calcArea();                  //Abstract method will be implemented in the child classes

    public static Shape parseShape(String s) throws InvalidShapeStringException{          //Parse string to create new shape
        String[] shapeData = s.split(":", 2);           //Separate shape type from a string
        switch (shapeData[0]) {                         //Call appropriate method to create shape based on shape type
            case "Circle":
                return Circle.parseCircle(shapeData[1]);
            case "Rectangle":
                return Rectangle.parseRectangle(shapeData[1]);
            case "Triangle":
                return Triangle.parseTriangle(shapeData[1]);
            default:                                    //In case it is not circle, rectangle, or triangle, throw exception
                throw new InvalidShapeStringException("InvalidShapeStringException: incorrect input data! Shape should be Circle, Rectangle or Triangle");
        }
    }

    public int compareTo(Object o) {                    //Implement Comparable interface method
        Shape shape = (Shape) o;                        //Type cast to one type
        if (this.calcArea() > shape.calcArea()) {
            return 1;                                   //Object that invoked the method is larger
        }
        if (this.calcArea() < shape.calcArea()) {
            return -1;                                  //Object that invoked the method is smaller
        }
        return 0;                                       //Objects are equal in size
    }
}
