package torba.Lab_2_16.task2;

public class Main {

    static void foo(int i) {
        System.out.println("int");
    }

    static void foo(Byte b) {
        System.out.println("Byte");
    }

    public static void main(String[] args) {

        byte v = 1;

        foo(v);

    }

}
