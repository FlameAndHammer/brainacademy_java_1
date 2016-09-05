package torba.Lab_2_8.testshapes;

public class Main_2_7_2 {

    public static void main(String[] args){

/*
        Shape shape = new Shape("black");
        System.out.println("This is " + shape);
        System.out.println("Shape area is: " + shape.calcArea());
*/

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
            if (el instanceof Rectangle){sumRectArea = sumRectArea + area;}
            if (el instanceof Circle ){sumCircleArea = sumCircleArea + area;}
            if (el instanceof Triangle){sumTriangleArea = sumTriangleArea + area;}
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

        //2.8.2
        System.out.println("2.8.2---------------------------------------------------------");
        for (Shape el : arr) {
            el.draw();
        }

        //2.8.3
        System.out.println("2.8.3---------------------------------------------------------");
        Rectangle r1 = new Rectangle("black",20, 10);
        Rectangle r2 = new Rectangle("black",10, 5);
        System.out.println(r1.compareTo(r2));

        //2.8.4
        System.out.println("2.8.4---------------------------------------------------------");
        Rectangle[] arr2 = new Rectangle[6];

        arr2[0] = new Rectangle("black", 60, 60);
        arr2[1] = new Rectangle("black", 50, 50);
        arr2[2] = new Rectangle("black", 40, 40);
        arr2[3] = new Rectangle("black", 30, 30);
        arr2[4] = new Rectangle("black", 20, 20);
        arr2[5] = new Rectangle("black", 10, 10);

        java.util.Arrays.sort(arr2);

        for (Rectangle el : arr2){
            el.draw();
        }

        //2.9.3, 2.9.4
        System.out.println("2.9.3, 2.9.4---------------------------------------------------------");

        try {
            System.out.println(Shape.parseShape("Rectangle:black:20:10"));
        }
        catch (Exception e) {}
        try {
            System.out.println(Shape.parseShape("Triangle:yellow:30:17:17"));
        }
        catch (Exception e) {}
        try {
            System.out.println(Shape.parseShape("Circle:green:10"));
        }
        catch (Exception E) {}
        try {
            System.out.println(Shape.parseShape("Abracadabra:black:10:10:10"));
        }
        catch (Exception e) {}

        //2.9.5
        System.out.println("2.9.5---------------------------------------------------------");

        System.out.println("Input array of shapes length");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int length = Integer.parseInt(sc.nextLine());

        Object[] arr3 = new Object[length];
        for (int i = 0; i < length; i++){
            System.out.println("Input next shape");
            try {
                arr3[i] = Shape.parseShape(sc.nextLine());
            }
            catch (Exception e) {
                System.out.print(e.getMessage());
                System.out.println(", try again");
                i--;
            }
        }

        for (Object el : arr3){
            if (el instanceof String){
                System.out.println(el);
            }
            else{
                ((Shape) el).draw();
            }
        }








    }

}

