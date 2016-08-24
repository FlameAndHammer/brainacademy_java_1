package torba.Lab_2_7.com.brainacad.oop.testshapes;

public class Shape {

    private String shapeColor;

    public Shape(){}

    public Shape(String shapeColor){
        this.shapeColor = shapeColor;
    }

    public String toString(){
        return "Shape, color is: " + shapeColor;
    }

    public double calcArea(){
        return 0;
    }

    public void setShapeColor(String shapeColor){
        this.shapeColor = shapeColor;
    }

    public String getShapeColor(){
        return shapeColor;
    }

}

