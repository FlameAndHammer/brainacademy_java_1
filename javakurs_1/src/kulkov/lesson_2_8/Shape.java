package kulkov.lesson_2_8;

/**
 * Created by User on 27.08.2016.
 * Abstract superclass which defines shapes in general
 */
abstract class Shape implements Drawable, Comparable {  //Abstract class won't have instances
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
    @Override
    public void draw() {                                //Method which prints information about an object
        System.out.println(toString() + ", area is: " + calcArea());
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
