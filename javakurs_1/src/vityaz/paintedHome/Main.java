package vityaz.paintedHome;


public class Main implements Cloneable {
    public static void main(String[] args) throws CloneNotSupportedException{
        //create instances of Rectangle, Triangle and PaintedHome types
        Rectangle rect = new Rectangle(10, 10);
        Triangle triangle = new Triangle(5, 6, 7);
        PaintedHome home = new PaintedHome(rect, triangle);

        //create PaintedHome instance clone
        PaintedHome cloneHome = home.clone();
        //print the original and clone hash codes showing they are equals
        System.out.println("home hash - " + home.hashCode() + ", cloneHome hash - " + cloneHome.hashCode());
        //invoke clone method showing the original and clone are equals
        System.out.println(home.equals(cloneHome));
    }
}
