package vityaz.com.brainacad.oop.testshapes;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.*;


public class Main {
    //accessory newline method
    private static void goToNewLine(){
        System.out.println();
    }

    public static void main(String[] args) {
        //create eight instances of shape type
        Shape[] arrayOfShapes = {new Circle(6), new Triangle("Yellow", 2, 6, 6),
                new Rectangle("Green", 2, 3), new Circle("Brown", 11), new Rectangle("Blue", 7, 2),
                new Rectangle("Grey", 25, 4), new Triangle("Pink", 3, 3, 3), new Rectangle(18, 19)};
        //define area variables for all shapes together and for each shape type
        double allShapesTotalArea = 0;
        double circlesTotalArea = 0;
        double rectanglesTotalArea = 0;
        double trianglesTotalArea = 0;
        //calculate total area for all shapes and for each shape types using loop
        for (Shape arrayElement : arrayOfShapes) {
            arrayElement.draw();
            allShapesTotalArea += arrayElement.calcArea();
            if (arrayElement instanceof Circle) {
                circlesTotalArea += arrayElement.calcArea();
            } else if (arrayElement instanceof Rectangle) {
                rectanglesTotalArea += arrayElement.calcArea();
            } else if (arrayElement instanceof Triangle) {
                trianglesTotalArea += arrayElement.calcArea();
            }
        }
        Main.goToNewLine();
        //print area values
        System.out.println("All shapes total area is " + allShapesTotalArea);
        System.out.println("All circles total area is " + circlesTotalArea);
        System.out.println("All rectangles total area is " + rectanglesTotalArea);
        System.out.println("All triangles total area is " + trianglesTotalArea);
        Main.goToNewLine();
        //create instances of rectangle and triangle to compare their areas using compareTo() method
        Shape rect1 = new Rectangle(8, 8);
        Shape tri = new Triangle("Yellow", 25, 17, 11);
        int compareResult = rect1.compareTo(tri);
        switch (compareResult) {
            case -1: {
                System.out.println(rect1.toString() + " have area less than next shape. " + tri.toString());
                break;
            }
            case 0: {
                System.out.println(rect1.toString() + " have area equal than next shape. " + tri.toString());
                break;
            }
            case 1: {
                System.out.println(rect1.toString() + " have area more than next shape. " + tri.toString());
                break;
            }
        }
        Main.goToNewLine();

        //create array of rectangles to compare and sort their areas using Comparator interface implementation
        Rectangle[] arr2 = {new Rectangle(1, 2), new Rectangle("white", 3, 1), new Rectangle("blue", 6, 7),
                new Rectangle("green", 9, 9), new Rectangle("red", 6, 11), new Rectangle("grey", 7, 2), new Rectangle(9, 7)};

        Arrays.sort(arr2, new ShapeCompare());

        for (Rectangle arr2Element : arr2) {
            arr2Element.draw();
        }
        Main.goToNewLine();

        System.out.println("Enter the number of shapes that you want create");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arrOfShapes = new String[n];
        for (int i = 0; i < arrOfShapes.length; i++) {
            while (true) {
                try{
                    System.out.println("describe the shape");
                    Scanner scanner = new Scanner(System.in);
                    String string = scanner.nextLine();
                    if (Shape.checkShape(string)) {
                        arrOfShapes[i] = string;
                        break;
                    }
                    throw new InvalidShapeStringException();
                }
                catch (InvalidShapeStringException ex){
                    System.out.println(ex.getMessage());
                }
            }
        }

        for (String arrElement : arrOfShapes) {
            Shape shape = Shape.parseShape(arrElement);
            shape.draw();
        }
    }
}
