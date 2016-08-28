package vityaz.com.brainacad.oop.testshapes;


abstract public class Shape implements Drawable, Comparable<Shape>{
    protected String color;
    private boolean c;

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


}
