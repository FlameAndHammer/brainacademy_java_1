package torba.Lab_2_9.com.brainacad.oop.testwrapper;

public class Main {

    public static void main(String[] args){

        Integer x1 = 10;
        Integer x2 = new Integer(10);
        Integer x3 = Integer.valueOf(10);
        Integer x4 = Integer.parseInt("10");

        System.out.println("x1 == x2 " + (x1 == x2));
        System.out.println("x1 == x3 " + (x1 == x3));
        System.out.println("x1 == x4 " + (x1 == x4));

        System.out.println("x1 equals x2 " + (x1.equals(x2)));
        System.out.println("x1 equals x3 " + (x1.equals(x3)));
        System.out.println("x1 equals x4 " + (x1.equals(x4)));

        Integer x11 = 200;
        Integer x22 = new Integer(200);
        Integer x33 = Integer.valueOf(200);
        Integer x44 = Integer.parseInt("200");

        System.out.println("x11 == x22 " + (x11 == x22));
        System.out.println("x11 == x33 " + (x11 == x33));
        System.out.println("x11 == x44 " + (x11 == x44));

        System.out.println("x11 equals x22 " + (x11.equals(x22)));
        System.out.println("x11 equals x33 " + (x11.equals(x33)));
        System.out.println("x11 equals x44 " + (x11.equals(x44)));

    }

}
