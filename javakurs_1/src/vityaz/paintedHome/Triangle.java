package vityaz.paintedHome;


public class Triangle implements Cloneable {
    //class fields
    private double a;
    private double b;
    private double c;

    //class constructor
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //override toString method to print triangle fields
    @Override
    public String toString() {
        return "Triangle{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }

    //override clone method using superclass`s clone method
    @Override
    public Triangle clone() throws CloneNotSupportedException {
        return (Triangle) super.clone();
    }

    //override hashCode method using complex calculations
    @Override
    public int hashCode(){
        int result = 1;
        long tempA = Double.doubleToLongBits(a);
        long tempB = Double.doubleToLongBits(b);
        long tempC = Double.doubleToLongBits(c);
        result = 30 * (int)(tempA^(tempA >>> 31));
        result += 30 * (int)(tempB^(tempB >>> 31));
        result += 30 * (int)(tempC^(tempC >>> 31));
        return result;
    }

    @Override
    public boolean equals(Object o){
        //if the compared instances refer to the same object - return true
        if(this == o) {return true;}
        //if passed instances refer to null or compared instances are different classes - return false
        if(o == null || this.getClass() != o.getClass()){return false;}
        //if the fields compared instances not equal - return false
        Triangle tempTriangle = (Triangle) o;
        if(a != tempTriangle.a){return false;}
        if(b != tempTriangle.b){return false;}
        if(c != tempTriangle.c){return false;}
        //else - return true
        return true;
    }
}
