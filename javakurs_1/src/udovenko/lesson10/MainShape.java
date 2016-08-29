package udovenko.lesson10;


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
        String[] colors = {"Green", "Red", "Black", "Plum", "Yellow"};
        Random rnd = new Random();

        //Create array (Shape[] arr) of different Shapes objects, (five rectangles, two circles and two triangles);
        Shape[] shapes = new Shape[9];
        int i = 0;
        while (Rectangle.getCounter() < 5 || Circle.getCounter() < 2 || Triangle.getCounter() < 2){
            switch (rnd.nextInt(3)){
                case 0: if (Rectangle.getCounter() < 5){
                            shapes[i] = new Rectangle(colors[rnd.nextInt(5)], 100 * rnd.nextDouble(), 100 * rnd.nextDouble());
                            i++;
                            break;
                        } else break;
                case 1: if (Circle.getCounter() < 2){
                            shapes[i] = new Circle(colors[rnd.nextInt(5)], 100 * rnd.nextDouble());
                            i++;
                            break;
                        } else break;
                case 2: if (Triangle.getCounter() < 2){
                            double[] sides = {100 * rnd.nextDouble(), 100 * rnd.nextDouble(), 0};
                            do {
                                sides[2] = 100*rnd.nextDouble();
                            } while (sides[0] >= sides[1] + sides[2] || sides[1] >= sides[2] + sides[0] || sides[2] >= sides[0] + sides[1]);
                            shapes[i] = new Triangle(colors[rnd.nextInt(5)], sides[0], sides[1], sides[2]);
                            i++;
                            break;
                        } else break;
            }
        }

        for (Shape element: shapes) {
            System.out.println(element.toString() + ", area is: " + element.calcArea());
        }

        System.out.println("sumArea = " + Shape.sumArea);
        System.out.println("sumRectArea = " + Shape.sumRectArea);
        System.out.println("sumCircleArea = " + Shape.sumCircleArea);
        System.out.println("sumTriangleArea = " + Shape.sumTriangleArea);
    }
}
