package torba.Lab_2_8.testshapes;

public class Rectangle extends Shape {

    static double area = 0;

    private double width, height;

    public static Object parseRectangle(String s){
        String[] m = s.split(":");
        switch (m[0]){
            case "Rectangle":
                {return new Rectangle(m[1], Double.parseDouble(m[2]), Double.parseDouble(m[3]));}
            default:
                {return new String("unknown object");}
        }
    }

/*
    public int compareTo(Object o){
        Rectangle r = (Rectangle) o;
        if (calcArea() > r.calcArea()) {return 1;}
        else if (calcArea() < r.calcArea()) {return -1;}
        else {return 0;}
    }
*/

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
        super(color); //TODO use super constructor
        this.width = width;
        this.height = height;
        area = area + calcArea();
    }
    //TODO use @Override
    @Override
    public String toString(){
        return "This is Rectangle, color: " + getShapeColor() + ", width = " + width + ", height = " + height;
    }
    //TODO use @Override
    @Override
    public double calcArea(){
        return width * height;
    }



}

