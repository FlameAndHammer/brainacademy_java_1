package udovenko.lesson10;


import java.util.Arrays;
import java.util.Random;

/**
 * Created by gladi on 25.08.2016.
 */
public class MainShape {
    public static void main(String[] args) {
        //Lab Work 2-7-2
        /*Shape sh1 = new Shape("Green");
        System.out.println("This is " + sh1.toString());
        System.out.println("Shape area is: " + sh1.calcArea());*/

        //Lab Work 2-7-3
        Circle cr1 = new Circle("Red", 10);
        System.out.println("This is " + cr1.toString());
        System.out.println("Shape area is: " + cr1.calcArea());

        //Lab Work 2-7-4
        Rectangle rt1 = new Rectangle("Black", 23, 14);
        System.out.println("This is " + rt1.toString());
        System.out.println("Shape area is: " + rt1.calcArea());

        //Lab Work 2-7-5
        Triangle tr1 = new Triangle("White", 12, 14, 18);
        System.out.println("This is " + tr1.toString());
        System.out.println("Shape area is: " + tr1.calcArea());

        //Lab Work 2-7-6
        Shape.resetCounter();

        //Create array (Shape[] arr) of different Shapes objects, (five rectangles, two circles and two triangles);
        Drawable[] shapes = new Shape[9];
        int i = 0;
        while (Rectangle.getCounter() < 5 || Circle.getCounter() < 2 || Triangle.getCounter() < 2){
            shapes[i] = GenerateShape.getRandomShape();
            String nameShape = new String(shapes[i].getClass().getName().substring(18));
            switch (nameShape){
                default:
                case "Rectangle":
                    if (Rectangle.getCounter() <= 5) {
                    i++;
                    break;
                    } else break;

                case "Circle":
                    if (Circle.getCounter() <= 2) {
                        i++;
                        break;
                    } else break;

                case "Triangle":
                    if (Triangle.getCounter() <= 2) {
                        i++;
                        break;
                    } else break;
            }
        }

        for (Drawable element: shapes) {
            element.draw();
        }

        System.out.println("sumArea = " + Shape.sumArea);
        System.out.println("sumRectArea = " + Shape.sumRectArea);
        System.out.println("sumCircleArea = " + Shape.sumCircleArea);
        System.out.println("sumTriangleArea = " + Shape.sumTriangleArea);

        //Lab Work 2-8-3
        System.out.println("Compare to rectangle:");
        Rectangle rec1 = new Rectangle();
        Rectangle rec2 = new Rectangle();
        switch (rec1.compareTo(rec2)){
            case -1:
                System.out.println("rec1 < rec2");
                break;

            case 1:
                System.out.println("rec1 > rec2");
                break;

            case 0:
            default:
                System.out.println("rec1 = rec2");
        }

        //Lab Work 2-8-4
        Drawable[] arr2 = new Rectangle[6];
        for (int j = 0; j < 6; j++){
            arr2[j] = new Rectangle();
        }

        //Solution by interface Comparable
        Arrays.sort(arr2);
        System.out.println("Solution by interface Comparable");
        for (Drawable elem: arr2){
            elem.draw();
        }

        //Solution by interface Comparator
        Arrays.sort(shapes, new ShapeMaxAreaComparator());
        System.out.println("Solution by interface Comparator");
        for (Drawable elem: shapes){
            elem.draw();
        }
    }
}
