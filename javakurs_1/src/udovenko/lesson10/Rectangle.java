package udovenko.lesson10;

/**
 * Created by gladi on 25.08.2016.
 */
class Rectangle extends Shape {
    //Add to class Rectangle a private field’s width and height (of double type)
    private double width;
    private double height;

    //Add counter of objects
    private static int counter;

    //Add to class Rectangle constructor with color , width and height arguments.
    public Rectangle(String color, double width, double height){
        super(color);
        this.width = width;
        this.height = height;
        counter++;
    }

    //Override the toString() method.
    @Override
    public String toString(){
        return  super.toString() + ", width = " + width + ", height = " + height;
    }

    //Override the calcArea() method
    @Override
    public double calcArea(){
        double area = width * height;
        sumArea += area;
        sumRectArea += area;
        return area;
    }

    //Getter counter
    public static int getCounter() {
        return counter;
    }

    //Reset counter
    public static void resetCounter(){
        counter = 0;
    }

}
