package torba.Lab_2_8.testshapes;


public class PaintedHome {

    private Rectangle rectangle;
    private Triangle triangle;

    public Rectangle getRectangle(){
        return rectangle;
    }

    public Triangle getTriangle(){
        return triangle;
    }

    public PaintedHome(Rectangle rectangle, Triangle triangle) {
        this.rectangle = rectangle;
        this.triangle = triangle;
    }

    public PaintedHome deepClone() {

        Rectangle rectangle2 = rectangle.clone();
        Triangle triangle2 = triangle.clone();

        return new PaintedHome(rectangle2, triangle2);

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
        } else {
            return false;
        }
    }

}
