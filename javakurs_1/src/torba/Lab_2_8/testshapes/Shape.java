package torba.Lab_2_8.testshapes;

public abstract class Shape implements Drawable{

    private String shapeColor;

    public Shape(){}

    public Shape(String shapeColor){
        this.shapeColor = shapeColor;
    }

    public String toString(){
        return "Shape, color is: " + shapeColor;
    }

    public abstract double calcArea();

    public void setShapeColor(String shapeColor){
        this.shapeColor = shapeColor;
    }

    public String getShapeColor(){
        return shapeColor;
    }

}

