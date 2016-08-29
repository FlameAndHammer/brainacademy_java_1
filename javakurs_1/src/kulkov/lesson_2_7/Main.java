package kulkov.lesson_2_7;

/**
 * Created by User on 24.08.2016.
 * Practice using inheritance and polymorphism
 */
class Main {
    public static void main(String[]args) {
        Shape shape = new Shape("RED");                                 //Create shape
        System.out.println(shape.toString());
        System.out.println("Shape area is: " + shape.calcArea() + '\n');

        Circle circle = new Circle("GREEN", 4);                         //Create circle
        System.out.println(circle.toString());
        System.out.println("Shape area is: " + circle.calcArea() + '\n');

        Rectangle rectangle = new Rectangle("BLUE", 8, 5);              //Create rectangle
        System.out.println(rectangle.toString());
        System.out.println("Shape area is: " + rectangle.calcArea() + '\n');

        Triangle triangle = new Triangle("BLACK", 6, 8, 10);            //Create triangle
        System.out.println(triangle.toString());
        System.out.println("Shape area is: " + triangle.calcArea() + '\n');

        Shape[] arr = new Shape[3];                                     //Create an array of different shapes
        arr[0] = new Circle("YELLOW", 3.5);
        arr[1] = new Rectangle("GREY", 4, 11);
        arr[2] = new Triangle("PINK", 5, 9, 9);
        //Define total area of shapes of different types and on the whole
        /*double sumArea = 0, sumCircleArea = 0, sumRectArea = 0, sumTriangleArea = 0;
        for (Shape elem: arr) {                     //For each shape in array
            double localCalc = elem.calcArea();     //Calculate area with appropriate method
            System.out.println(elem.toString() + " area is: " + localCalc);     //Display appropriate info about shape
            sumArea += localCalc;                   //Add shape area to total area counting
            if (elem instanceof Circle) {           //Check if shape is a circle
                sumCircleArea += localCalc; //If true add shape area to circles total area counting
            }
            else if (elem instanceof Rectangle) {   //Check if shape is a rectangle
                sumRectArea += localCalc;           //If true add shape area to rectangles total area counting
            }
            else if (elem instanceof Triangle) {    //Check if shape is a triangle
                sumTriangleArea += localCalc;       //If true add shape area to triangles total area counting
            }
        }
        System.out.println();*/                       //adding this for results readability
        //Display the counting results
        System.out.println("Total area: " + Shape.getSumArea());
        System.out.println("Circles total area: " + Circle.getSumArea());
        System.out.println("Rectangles total area: " + Rectangle.getSumArea());
        System.out.println("Triangles total area: " + Triangle.getSumArea());
    }
}
