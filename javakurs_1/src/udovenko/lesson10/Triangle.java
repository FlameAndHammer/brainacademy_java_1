package udovenko.lesson10;

import java.util.Arrays;

import static java.lang.Math.sqrt;

/**
 * Created by gladi on 25.08.2016.
 */
class Triangle extends Shape {
    //Add to class Triangle a private field’s a, b, c (of double type) which is sides of triangle.
    private double sideA;
    private double sideB;
    private double sideC;

    //Add counter of objects
    private static int counter;

    //Create a base class constructor with random "sideA", "sideB", "sideC" generator
    protected Triangle(){
        super();
        double[] sides = new double[3];
        for (int i = 0; i < 3; i++){
            sides[i] = Shape.rndShape.nextDouble() * 100;
        }

        //Check that the larger side is less than the sum of the other two. If not, we set new value of the larger side.
        Arrays.sort(sides);
        if (sides[2] >= (sides[0] + sides[1])){
            double dl = Shape.rndShape.nextDouble();
            sides[2] = sides[1] + dl + (double) Shape.rndShape.nextInt((int)(sides[0] - dl));
        }

        sideA = sides[0];
        sideB = sides[1];
        sideC = sides[2];
        counter++;
    }

    //Add to class Triangle constructor with color, a, b and c arguments.
    protected Triangle(String color, double sideA, double sideB, double sideC){
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        counter++;
    }

    //Override the toString() method.
    @Override
    public String toString(){
        return  super.toString() + ", a = " + sideA + ", b = " + sideB + ", c = " + sideC;
    }

    //Override the calcArea() method
    @Override
    protected double calcArea(){
        double s = (sideA + sideB + sideC) / 2;
        double area = sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
        sumArea += area;
        sumTriangleArea += area;
        return area;
    }

    //Override the clone() method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Triangle triangle = (Triangle) super.clone();
        return triangle;
    }

    //Override the equals() method
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }

        if (obj == null || getClass() != obj.getClass()){
            return false;
        }

        Triangle trian = (Triangle) obj;
        if (sideA != trian.sideA || sideB != trian.sideB || sideC != trian.sideC){
            return false;
        }

        return true;
    }

    //Getter counter
    protected static int getCounter() {
        return counter;
    }

    //reset counter
    protected static void resetCounter(){
        counter = 0;
    }

    @Override
    public void draw() {
        System.out.println(toString() + ", area is: " + calcArea());
    }
}
