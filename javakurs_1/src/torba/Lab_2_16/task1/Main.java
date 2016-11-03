package torba.Lab_2_16.task1;

public class Main {

    static void foo(Animal a) {
        System.out.println("Animal");
    }

    static void foo(Dog d) {
        System.out.println("Dog");
    }

    public static void main(String[] args) {

        Animal o = new Dog();
        foo(o);

    }

}
