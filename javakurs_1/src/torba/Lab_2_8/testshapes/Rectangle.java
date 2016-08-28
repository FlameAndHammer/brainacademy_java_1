package torba.Lab_2_8.testshapes;

public class Rectangle extends Shape {

    static double area = 0;

    private double width, height;

    public void draw(){
        System.out.println(this+", area = "+calcArea());
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public Rectangle clone(){
        return new Rectangle(getShapeColor(), width, height);
    }

    public Rectangle(String color, double width, double height){
        setShapeColor(color); //TODO use super constructor
        this.width = width;
        this.height = height;
        area = area + calcArea();
    }
    //TODO use @Override
    public String toString(){
        return "This is Rectangle, color: " + getShapeColor() + ", width = " + width + ", height = " + height;
    }
    //TODO use @Override
    public double calcArea(){
        return width * height;
    }



}

