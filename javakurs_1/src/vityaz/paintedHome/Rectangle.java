package vityaz.paintedHome;


public class Rectangle implements Cloneable{
    //class fields
    private double width;
    private double height;

    //class constructor
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    //override toString method to print rectangle fields
    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }

    //override clone method using superclass`s clone method
    @Override
    public Rectangle clone() throws CloneNotSupportedException {
        return (Rectangle) super.clone();
    }

    //override hashCode method using complex calculations
    @Override
    public int hashCode(){
        int result = 1;
        long tempWidht = Double.doubleToLongBits(width);
        long tempHeight = Double.doubleToLongBits(height);
        result = 30 * (int)(tempWidht^(tempWidht >>> 31));
        result += 30 * (int)(tempHeight^(tempHeight >>> 31));
        return result;
    }

    //override equals method using complex calculations
    @Override
    public boolean equals(Object o){
        //if the compared instances refer to the same object - return true
        if(this == o) {return true;}
        //if passed instances refer to null or compared instances are different classes - return false
        if(o == null || this.getClass() != o.getClass()){return false;}
        Rectangle tempRect = (Rectangle)o;
        //if the fields compared instances not equal - return false
        if(width != tempRect.width){return false;}
        if(height != tempRect.height){return false;}
        //else - return true
        return true;
    }
}
