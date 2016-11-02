package torba.Lab_2_16.task5;

public class Main {

    static void foo(int i) {
        System.out.println("int");
    }

    static void foo(byte b) {
        System.out.println("byte");
    }

    public static void main(String[] args) {

        byte v = 5;

        foo(v);

        foo(5);

    }


}
