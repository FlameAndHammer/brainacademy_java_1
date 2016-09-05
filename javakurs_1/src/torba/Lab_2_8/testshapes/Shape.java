package torba.Lab_2_8.testshapes;

public abstract class Shape implements Drawable, Comparable {

    private String shapeColor;

    public static Object parseShape(String s) throws InvalidShapeStringException {

        //String filter = "(Rectangle|Triangle|Circle):\\w+(:\\d+)*";
        String filter = "(Rectangle:\\w+(:\\d+){2})|(Triangle:\\w+(:\\d+){3})|(Circle:\\w+(:\\d+){1})";
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(filter);
        java.util.regex.Matcher matcher = pattern.matcher(s);
        if (! matcher.matches()) {throw new InvalidShapeStringException("Invalid string for shape");}

        String[] m = s.split(":");
        switch (m[0]){
            case "Rectangle":
                //{return new Rectangle(m[1], Double.parseDouble(m[2]), Double.parseDouble(m[3]));}
            {return Rectangle.parseRectangle(s);}
            case "Triangle":
                //{return new Triangle(m[1], Double.parseDouble(m[2]), Double.parseDouble(m[3]), Double.parseDouble(m[4]));}
                {return Triangle.parseTriangle(s);}
            case "Circle":
                //{return new Circle(m[1], Double.parseDouble(m[2]));}
                {return Circle.parseCircle(s);}
            default:
            {return new String("unknown object");}
        }
    }

    public int compareTo(Object o){
        double area1, area2;
        area1 = this.calcArea();
        Shape o1 = (Shape) o;
        area2 = o1.calcArea();
        if (area1 > area2) {return 1;}
        else if (area1 < area2) {return -1;}
        else {return 0;}
    }

    public Shape(){}

    public Shape(String shapeColor){
        this.shapeColor = shapeColor;
    }

    public String toString(){
        return "Shape, color is: " + shapeColor;
    }

    public abstract double calcArea();

    public void setShapeColor(String shapeColor){
        this.shapeColor = shapeColor;
    }

    public String getShapeColor(){
        return shapeColor;
    }

}

