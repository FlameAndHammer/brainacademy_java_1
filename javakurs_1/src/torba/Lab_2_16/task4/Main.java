package torba.Lab_2_16.task4;

public class Main {

    static void foo(Animal a) {
        System.out.println("Animal");
    }

    static void foo(Dog d) {
        System.out.println("Dog");
    }

    static void foo(Puppy p) {
        System.out.println("Puppy");
    }

    public static void main(String[] args) {

        foo(null);

    }

}
