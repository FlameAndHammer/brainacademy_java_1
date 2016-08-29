package udovenko.lesson10;

/**
 * Created by gladi on 25.08.2016.
 */
class Rectangle extends Shape implements Cloneable {
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

    //Override the clone() method
    @Override
    public Object clone() throws CloneNotSupportedException {
        Rectangle rectangle = (Rectangle) super.clone();
        return rectangle;
    }

    //Override the equals() method
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }

        if (obj == null || getClass() != obj.getClass()){
            return false;
        }

        Rectangle rec = (Rectangle)obj;
        if (width != rec.width || height != rec.height){
            return false;
        }

        return true;
    }

    //Getter counter
    public static int getCounter() {
        return counter;
    }

    //Reset counter
    public static void resetCounter(){
        counter = 0;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
