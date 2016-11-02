package torba.Lab_2_16.task3;

public class Main {

    static void foo(int a, int b) {
        System.out.println("a = " + a + " b = " + b);
    }

    static void foo(int ... a) {
        System.out.println("a = " + java.util.Arrays.toString(a));
    }

    public static void main(String[] args) {

        int a = 1, b = 2, c = 3;

        foo(a, b);

        foo(a, b, c);

    }

}
