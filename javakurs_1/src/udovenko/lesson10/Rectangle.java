package udovenko.lesson10;

/**
 * Created by gladi on 25.08.2016.
 */
class Rectangle extends Shape implements Comparable{
    //Add to class Rectangle a private field’s width and height (of double type)
    private double width;
    private double height;

    //Add counter of objects
    private static int counter;

    //Create a base class constructor with random "width", "height" generator
    protected Rectangle(){
        super();
        width = Shape.rndShape.nextDouble() * 100;
        height = Shape.rndShape.nextDouble() * 100;
        counter++;
    }

    //Add to class Rectangle constructor with color , width and height arguments.
    protected Rectangle(String color, double width, double height){
        super(color);
        this.width = width;
        this.height = height;
        counter++;
    }

    //Override the toString() method.
    @Override
    public String toString(){
        return String.format("%s, width = %.2f, height = %.2f", super.toString(), width, height);
    }

    //Override the calcArea() method
    @Override
    protected double calcArea(){
        double area = width * height;
        sumArea += area;
        sumRectArea += area;
        return area;
    }

    //Override the clone() method
    @Override
    protected Object clone() throws CloneNotSupportedException {
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
    protected static int getCounter() {
        return counter;
    }

    //Reset counter
    protected static void resetCounter(){
        counter = 0;
    }

    protected void setWidth(double width) {
        this.width = width;
    }

    @Override
    public int compareTo(Object o) {
        Rectangle rec = (Rectangle) o;
        if (this.calcArea() < rec.calcArea()){
            return -1;
        }

        if (this.calcArea() > rec.calcArea()){
            return 1;
        }
        return 0;
    }

    @Override
    public void draw() {
        System.out.printf("%s, area is: %.2f\n", toString(), calcArea());
    }

    protected static Rectangle parseRectangle(String[] s){
        String[] sides = s[2].split(",");
        Rectangle rt = new Rectangle(s[1], Double.parseDouble(sides[0]), Double.parseDouble(sides[1]));
        return rt;
    }
}
