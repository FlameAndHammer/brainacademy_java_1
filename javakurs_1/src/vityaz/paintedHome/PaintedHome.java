package vityaz.paintedHome;


public class PaintedHome implements Cloneable{
    //class fields
    private Rectangle rectangle;
    private Triangle triangle;

    //class constructor
    public PaintedHome(Rectangle rectangle, Triangle triangle) {
        this.rectangle = rectangle;
        this.triangle = triangle;
    }

    //override toString method to print triangle fields
    @Override
    public String toString() {
        return "PaintedHome{" + "rectangle=" + rectangle + ", triangle=" + triangle + '}';
    }

    //override clone method using superclass`s clone method and field`s clone methods
    @Override
    public PaintedHome clone() throws CloneNotSupportedException {
        PaintedHome tempPaintedHome = (PaintedHome) super.clone();
        tempPaintedHome.rectangle = rectangle.clone();
        tempPaintedHome.triangle = triangle.clone();
        return tempPaintedHome;
    }

    //override hashCode method adding field`s hash codes
    @Override
    public int hashCode(){
        return rectangle.hashCode() + triangle.hashCode();
    }

    @Override
    public boolean equals(Object o){
        //if the compared instances refer to the same object - return true
        if(this == o) {return true;}
        //if passed instances refer to null or compared instances are different classes - return false
        if(o == null || this.getClass() != o.getClass()){return false;}
        PaintedHome tempPaintedHome = (PaintedHome) o;
        //if the fields compared instances not equal - return false
        if(!rectangle.equals(tempPaintedHome.rectangle)){return false;}
        if(!triangle.equals(tempPaintedHome.triangle)){return false;}
        //else - return true
        return true;
    }
}
