package torba.Lab_2_8.testshapes;

public class TestPaintedHome {

    public static void main(String[] args){

        Rectangle r = new Rectangle("black", (double) 10, (double) 7);
        Triangle t = new Triangle("black", (double) 10, (double) 6, (double) 6 );

        PaintedHome h1 = new PaintedHome(r, t);
        PaintedHome h2= h1.deepClone();

        System.out.println("Homes equality: "+h1.equals(h2));
        System.out.println("Rectangles equality (default): "+h1.getRectangle().equals(h2.getRectangle()));
        System.out.println("Triangles equality (default): "+h1.getTriangle().equals(h2.getTriangle()));

    }

}
