package tretiak.labworks.work2;


public class ArrayOfShape {
    public static void main (String[] arg) {
        double sumArray = 0, sumCircle = 0, sumRectangle = 0, sumTriangle = 0;
        Shape[] arr = new Shape[]{new Rectangle("Red", 4, 6), new Circle("Orange", 20)
                , new Triangle("Black", 4, 6, 8)};
        for (Shape i: arr){
            i.draw();
            sumArray += i.calcArea();
            if (i instanceof Circle){
                sumCircle += i.calcArea();
            }
            if (i instanceof Rectangle){
                sumRectangle += i.calcArea();
            }
            if (i instanceof Triangle){
                sumTriangle += i.calcArea();
            }
        }
        System.out.println("SumArray ="  + sumArray);
        System.out.println("SumTriangle = " + sumTriangle);
        System.out.println("SumRectangle = " + sumRectangle);
        System.out.println("SumCircle = " + sumCircle);
    }
}
