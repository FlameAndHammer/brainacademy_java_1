package derdyuk.lesson2_8.Shape;

public class Main{
        public static void main(String[]arg){
            Shape shape = new Shape(new String("Blue"));
            System.out.println(shape.toString());
            System.out.println("Shape area is: " + shape.calcArea());

            Circle circle = new Circle("Yellow", 15);
            System.out.println(circle.toString());
            System.out.println("Circle area is "+ circle.calcArea());

            Rectangle rectangle = new Rectangle("RED",15,16);
            System.out.println(rectangle.toString());
            System.out.println("Rectangle area is " + rectangle.calcArea());

            Triangle triangle = new Triangle("Green", 4,5,6);
            System.out.println(triangle.toString());
            System.out.println("Triangle area is " + triangle.calcArea());


            Shape[]arr = new Shape[9];
            arr [0]= new Circle(" red ",4.6);
            arr [1] = new Circle(" blue ",2.3);
            arr [2] = new Rectangle(" black ",4,3);
            arr [3] = new Rectangle(" white ",5,4);
            arr [4] = new Rectangle(" silver ", 3,3);
            arr [5] = new Rectangle(" red ", 5,2);
            arr [6] = new Rectangle(" blue ", 6,3);
            arr [7] = new Triangle(" red ", 4, 5, 6);
            arr [8] = new Triangle(" black ", 7, 8, 9);



            double sumCircleArea = 0;
            double sumRectangleArea = 0;
            double sumTriangleArea = 0;

            for (Shape element: arr) {
                double sumArea = element.calcArea();
                System.out.println(element.toString() + " area is " + sumArea);


                if (element instanceof Circle){
                   sumCircleArea += sumArea;
                    }
                else if (element instanceof Rectangle){
                    sumRectangleArea += sumArea;
                }
                else if (element instanceof Triangle){
                    sumTriangleArea += sumArea;
                }
            }
            System.out.println("Total Cirle area is:" +  sumCircleArea);
            System.out.println("Total Rectangle area is: " + sumRectangleArea);
            System.out.println("Total Triangle area is: " + sumTriangleArea);

            System.out.println("Total area of all shapes is: " + (sumCircleArea+sumRectangleArea+sumTriangleArea));
                    }
        }
