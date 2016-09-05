package derdyuk.lesson2_8$2_7.Shape;

/**
 * Created by maossi on 26.08.2016.
 */
public abstract class Shape implements Drawable, Comparable{

    public abstract double calcArea();

    private String shapeColor;
    public Shape (String shapeColor) {
        this.shapeColor = shapeColor;
    }
    public String getShapeColor() {
        return shapeColor;
    }
    @Override
    public String toString(){
        return "Shape color is: "+ shapeColor;
    }
@Override
    public void draw (){
        System.out.println(toString()+ " area is " + calcArea());
    }

@Override
public int  compareTo(Object o1) {
    Shape shape = (Shape) o1;
    if (this.calcArea() > shape.calcArea()){
        return 1;
    }
    else if (this.calcArea() < shape.calcArea()){
        return -1;
    }
    else return 0;
}



}
