package vityaz.com.brainacad.oop.testshapes;

abstract public class Shape implements Drawable, Comparable<Shape>{
    protected String color;
    

    public Shape(){
        this("black");
    }
    public Shape(String color){
        this.color = color;
    }

    public String toString(){
        return "This is a Shape, color is: " + color;
    }

    abstract public double calcArea();


    public void draw(){
        System.out.println(toString() + ", area is: " + calcArea());
    }

    public int compareTo(Shape o){
        if(this.calcArea() == o.calcArea()){return 0;}
        else if(this.calcArea() < o.calcArea()){return -1;}
        else return 1;
    }

    public static Shape parseShape(String string){
        String[] arr = string.split("\\W", 2);

        Shape result;
        switch (arr[0]){
            case "Rectangle":
            case "rectangle":{
                result = Rectangle.parseRectangle(string);
                break;
            }
            case "triangle":
            case "Triangle":{
                result = Triangle.parseTriangle(string);
                break;
            }
            case "circle":
            case "Circle":{
                result =  Circle.parseCircle(string);
                break;
            }
            default: result =  null;
        }
        return result;
    }


}
