package tretiak.labworks.work2;


public class PaintedHomeMain {
    public static void main(String[] arg){
        Rectangle rectangle =  new Rectangle("Black", 12.0, 20.0);
        Triangle triangle = new Triangle("Blue", 17, 19, 20);
        PaintedHome home = new PaintedHome(triangle, rectangle);
        PaintedHome home1 = home.clone();
        System.out.println("Comparison: " + home.equals(home1));
    }
}
