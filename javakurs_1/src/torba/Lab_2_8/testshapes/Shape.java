package torba.Lab_2_8.testshapes;

public abstract class Shape implements Drawable, Comparable {

    private String shapeColor;

    public int compareTo(Object o){
        double area1, area2;
        area1 = this.calcArea();
        Shape o1 = (Shape) o;
        area2 = o1.calcArea();
        if (area1 > area2) {return 1;}
        else if (area1 < area2) {return -1;}
        else {return 0;}
    }

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

