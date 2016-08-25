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

        //2.7.6
        System.out.println("---------------------------------------------------------");

        Shape[] arr = new Shape[9];

        arr[0] = new Rectangle("black",(double) 10, (double) 20);
        arr[1] = new Rectangle("white",(double) 20, (double) 40);
        arr[2] = new Rectangle("green",(double) 30, (double) 60);
        arr[3] = new Rectangle("yellow",(double) 40, (double) 80);
        arr[4] = new Rectangle("pink",(double) 50, (double) 100);

        arr[5] = new Circle("black",(double) 10);
        arr[6] = new Circle("pink",(double) 20);

        arr[7] = new Triangle("yellow",(double) 10, 10, 15);
        arr[8] = new Triangle("white",(double) 20, 20, 35);

        double area, sumArea = 0, sumRectArea = 0, sumCircleArea = 0, sumTriangleArea = 0;

        for (Shape el : arr){
            System.out.print(el+", ");
            area = el.calcArea();
            System.out.println("area is: "+area);
            sumArea = sumArea + area;
            if (el instanceof Rectangle ){sumRectArea = sumRectArea + area;}
            if (el instanceof Circle ){sumCircleArea = sumCircleArea + area;}
            if (el instanceof Triangle ){sumTriangleArea = sumTriangleArea + area;}
        }
        System.out.println("Total area = "+sumArea);
        System.out.println("Total rectangle area = "+sumRectArea);
        System.out.println("Total circle area = "+sumCircleArea);
        System.out.println("Total triangle area = "+sumTriangleArea);

        System.out.println("----------------------------------------------------------");
        System.out.println("Total area = " + (Rectangle.area + Circle.area + Triangle.area));
        System.out.println("Total rectangle area = " + Rectangle.area);
        System.out.println("Total circle area = " + Circle.area);
        System.out.println("Total triangle area = " + Triangle.area);
    }

}

