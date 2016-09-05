package derdyuk.lesson2_8$2_7.Shape;

/**
 * Created by maossi on 26.08.2016.
 */
public class Rectangle extends Shape implements Drawable {
    private double width;
    private double height;

    public Rectangle (String shapeColor, double width, double height){
        super(shapeColor);
        this.width = width;
        this.height = height;
    }
    @Override
    public String toString (){
        return "This is Rectangle, color is " + getShapeColor() + " widht is " + width + " height is " + height;
    }
    @Override
    public double calcArea(){
        return width * height;
    }


}
