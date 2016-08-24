package vityaz.com.brainacad.oop.testshapes;


import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {
    public static void main(String[] args){
       /* //Shape
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
        System.out.println("Triangle area is: " + triangle.calcArea());*/

        Shape [] arrayOfShapes = {new Circle(6), new Triangle("Yellow", 2, 6, 6),
                new Rectangle("Green", 2, 3),new Circle("Brown", 11), new Rectangle("Blue", 7, 2),
                new Rectangle("Grey", 25, 4), new Triangle("Pink", 3, 3, 3), new Rectangle(18, 19)};
        double areaTotal = 0;
        double areaCircles = 0;
        double areaRectangles = 0;
        double areaTriangles = 0;
        for (Shape arrayElement:arrayOfShapes) {
            double elementArea = arrayElement.calcArea();
            System.out.print(arrayElement.toString());
            System.out.println(" . It area is: " + elementArea);
            areaTotal += elementArea;
            if(arrayElement instanceof Circle){
                areaCircles += elementArea;
            }
            else if(arrayElement instanceof Rectangle){
                areaRectangles += elementArea;
            }
            else if(arrayElement instanceof Triangle){
                areaTriangles += elementArea;
            }
        }
        System.out.println("Total area of all shapes is " + areaTotal);
        System.out.println("Circles total area is " + areaCircles);
        System.out.println("Rectangles total area is " + areaRectangles);
        System.out.println("Triangles total area is " + areaTriangles);

    }
}
