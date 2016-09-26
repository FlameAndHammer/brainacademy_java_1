package kulkov.lesson_2_16;

/**
 * Created by User on 26.09.2016.
 * Practice with overload
 * I've modified the task a little to not fracture code between different 'Main' classes
 */
public class Main {
    public static void main(String[] args) {
        Animal a = new Puppy();             //Initialize Animal instance with one of its heirs
        Dog d = (Dog) a;                    //Initialize Dog
        Puppy p = (Puppy) d;                //Initialize Puppy
        foo(a);                             //Test foo() with created instances
        foo(d);                             //The output will be Animal then Dog then Puppy
        foo(p);                             //It happens because method looks at type of pass variable, not its content
        short s = 0;                        //Initialize short primitive, then invoke foo() with it as an argument
        foo(s);                             //Compiler can invoke both foo(int) and foo(Short), but widening has priority over boxing
        int x = 0, y = 0, z = 0;
        foo(x, y);                          //Compiler can invoke foo(int...), but variable arity methods have the least priority
        foo(x, y, z);                       //In this case invocation of varargs method is inevitable
        byte b = 5;
        foo(b);                             //Invoke foo(byte)
        foo(5);                             //Compiler invoke foo(int) because '5' is a literal of int type by default
    }
    //Create and overload method foo() with different args
    static void foo(Animal a) {
        System.out.println("Animal");
    }
    static void foo(Dog d) {
        System.out.println("Dog");
    }
    static void foo(Puppy p) {
        System.out.println("Puppy");
    }
    static void foo(int i) {
        System.out.println("int");
    }
    static void foo(byte b) {
        System.out.println("byte");
    }
    static void foo(Short s) {
        System.out.println("Short");
    }
    static void foo(int a, int b) {
        System.out.println(a + " " + b);
    }
    static void foo(int... a) {
        for (int var : a) {
            System.out.print(var + " ");
        }
        System.out.println();
    }
}
