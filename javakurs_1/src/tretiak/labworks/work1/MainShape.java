package tretiak.labworks.work1;


public class MainShape {
    public static void main(String[] arg) {
        Shape shape = new Shape("Red");
        System.out.println(shape.toString());
        System.out.println("Shape area is: " + shape.calcArea());
        Circle circle = new Circle("Black", 12);
        System.out.println(circle.toString());
        System.out.println("Circle area is: " + circle.calcArea());
        Rectangle rectangle = new Rectangle("Orange", 12, 16);
        System.out.println(rectangle.toString());
        System.out.println("Rectangle area is: " + rectangle.calcArea());
    }

}
