package torba.Lab_2_7.com.brainacad.oop.testshapes;

public class Main_2_7_2 {

    public static void main(String[] args){

        Shape shape = new Shape("black");
        System.out.println("This is " + shape);
        System.out.println("Shape area is: " + shape.calcArea());

        Circle circle = new Circle("black", 10);
        System.out.println(circle);
        System.out.println("Shape area is: " + circle.calcArea());

        Rectangle rectangle = new Rectangle("black", (double) 11, (double) 22);
        System.out.println(rectangle);
        System.out.println("Shape area is: " + rectangle.calcArea());

        Triangle triangle = new Triangle("black", (double) 5, (double) 5, (double) 5);
        System.out.println(triangle);
        System.out.println("Shape area is: " + triangle.calcArea());

    }

}

