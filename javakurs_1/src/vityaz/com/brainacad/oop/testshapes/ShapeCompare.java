package vityaz.com.brainacad.oop.testshapes;


import java.util.Comparator;

public class ShapeCompare implements Comparator{
    @Override
    public int compare (Object o1, Object o2){
        Shape obj1 = (Shape) o1;
        Shape obj2 = (Shape) o2;
        if(obj1.calcArea() < obj2.calcArea()) return -1;
        else if(obj1.calcArea() > obj1.calcArea()) return 1;
        else return 0;
    }
}
