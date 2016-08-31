package udovenko.lesson10;

/**
 * Created by gladi on 29.08.2016.
 */
public class PrintedHome implements Cloneable {
    private Triangle triangle;
    private Rectangle rectangle;

    public PrintedHome(){
        this.triangle = new Triangle();
        this.rectangle = new Rectangle();
    }

    @Override
    public String toString(){
        return triangle.toString() + '\n' + rectangle.toString();
    }

    //Override method clone();
    @Override
    public Object clone() throws CloneNotSupportedException {
        PrintedHome home = (PrintedHome) super.clone();
        home.triangle = (Triangle) this.triangle.clone();
        home.rectangle = (Rectangle) this.rectangle.clone();
        return home;
    }

    //Override the equals() method
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }

        if (obj == null || getClass() != obj.getClass()){
            return false;
        }

        PrintedHome ph = (PrintedHome) obj;
        if (!triangle.equals((ph.triangle)) || !rectangle.equals(ph.rectangle)){
            return false;
        }

        return true;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        PrintedHome ph1 = new PrintedHome();
        PrintedHome ph2 = (PrintedHome) ph1.clone();

        System.out.println("Without changes");
        if (ph1.equals(ph2)){
            System.out.println("ph1 == ph2");
        } else {
            System.out.println("ph1 != ph2");
        }

        ph2.rectangle.setWidth(8.0);
        ph2.rectangle.setColorShape("Green");
        System.out.println("With changes");
        if (ph1.equals(ph2)){
            System.out.println("ph1 == ph2");
        } else {
            System.out.println("ph1 != ph2");
        }

        System.out.println("ph1:" + '\n' + ph1);
        System.out.println("ph2:" + '\n' + ph2);
    }
}
