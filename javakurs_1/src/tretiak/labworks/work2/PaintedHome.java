package tretiak.labworks.work2;


import java.util.Objects;

public class PaintedHome implements Cloneable {
    private Triangle triangle;
    private Rectangle rectangle;

    public Triangle getTriangle() {
        return triangle;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public PaintedHome(Triangle triangle, Rectangle rectangle) {
        this.rectangle = rectangle;
        this.triangle = triangle;
    }

    @Override
    public PaintedHome clone() {
        Rectangle tempRectangle = rectangle.clone();
        Triangle tempTriangle = triangle.clone();
        return new PaintedHome(tempTriangle, tempRectangle);
    }

    public boolean equals(PaintedHome home) {
        if ((rectangle.getShapeColor().equals(home.rectangle.getShapeColor()))
                && (rectangle.getWidth() == home.rectangle.getWidth())
                && (rectangle.getHeight() == home.rectangle.getHeight())
                && (triangle.getShapeColor().equals(home.triangle.getShapeColor()))
                && (triangle.getA() == home.triangle.getA())
                && (triangle.getB() == home.triangle.getB())
                && (triangle.getC() == home.triangle.getC())) {
            return true;
        }else{
            return false;
        }
    }
}
