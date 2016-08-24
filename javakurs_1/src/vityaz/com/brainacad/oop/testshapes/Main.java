package vityaz.com.brainacad.oop.testshapes;


public class Main {
    public static void main(String[] args){
        //Shape
        Shape shape = new Shape("WHITE");
        System.out.println(shape.toString());
        System.out.println("Shape area is: " + shape.calcArea());

        //Circle
        Shape circle = new Circle("RED", 12);
        System.out.println(circle.toString());
        System.out.println("Circle area is: " + circle.calcArea());

        //Rectangle
        Shape rect = new Rectangle(7, 11);
        System.out.println(rect.toString());
        System.out.println("Rectangle area is: " + rect.calcArea());

        //Triangle
        Shape triangle = new Triangle("BLUE", 11, 4, 8);
        System.out.println(triangle.toString());
        System.out.println("Triangle area is: " + triangle.calcArea());
    }
}
