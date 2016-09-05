package kulkov.lesson_2_9;

/**
 * Created by User on 31.08.2016.
 * A subclass of shapes defining triangles
 */
class Triangle extends Shape implements Cloneable {              //Triangle is subclass of Shape
    private double a, b, c;

    public Triangle(String color, double a, double b, double c) {       //Triangles constructor
        super(color);                                                   //Refer to superclass constructor
        this.a = a;                                                     //Define sides of the triangle
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {                                          //Override superclass method
        return "This is Triangle, color: " + getShapeColor() + ", a = " + a + ", b = " + b + ", c = " + c;
    }

    @Override
    public double calcArea() {                                          //Calculate the area for triangle
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static Triangle parseTriangle(String s) {                    //Parse string to create triangle
        String[] triangleData = s.split(":|,");                         //Separate the data
        double a = Double.parseDouble(triangleData[1]);                 //Convert information about sides of triangle to double
        double b = Double.parseDouble(triangleData[2]);
        double c = Double.parseDouble(triangleData[3]);
        return new Triangle(triangleData[0], a, b, c);                  //Call triangles constructor
    }

    @Override
    public Triangle clone() throws CloneNotSupportedException{          //Override cloning method for Triangle instances
        return (Triangle) super.clone();                                //No need of a deep copy since object has no reference type fields
    }

    @Override
    public boolean equals(Object o) {                                   //Override the equality check
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Triangle triangle = (Triangle) o;
        return (a == triangle.a && b == triangle.b && c == triangle.c); //Check objects primitive fields for equality
    }

    @Override
    public int hashCode() {                                             //When you override equals() you also need to override hashCode()
        int result = 1;                                                 //Create hash code calculations using the fields of an object
        result = 31 * result + (int) (Double.doubleToLongBits(a) ^ (Double.doubleToLongBits(a) >>> 32));
        result = 31 * result + (int) (Double.doubleToLongBits(b) ^ (Double.doubleToLongBits(b) >>> 32));
        result = 31 * result + (int) (Double.doubleToLongBits(c) ^ (Double.doubleToLongBits(c) >>> 32));
        return result;
    }
}
