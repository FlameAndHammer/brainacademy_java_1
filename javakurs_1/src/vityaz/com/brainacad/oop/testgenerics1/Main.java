package vityaz.com.brainacad.oop.testgenerics1;


public class Main {
    public static void main(String[] args) {
        MyTuple myTuple = new MyTuple("Hello", 20, 15L);
        System.out.println(myTuple.getA());
        System.out.println(myTuple.getB());
        System.out.println(myTuple.getC());
    }
}
