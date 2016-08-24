package vityaz.com.brainacad.oop.testshapes;


public class Shape {
    private String color;

    public Shape(){
        this("black");
    }
    public Shape(String color){
        this.color = color;
    }

    public String toString(){
        return "This is a Shape, color is: " + color;
    }

    public double calcArea(){
        double area = 0;
        return area;
    }

}
