package derdyuk.lesson2_8.Shape;

/**
 * Created by maossi on 26.08.2016.
 */
public class Shape {

    public double calcArea(){
        return 0.0;
    }

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


}
