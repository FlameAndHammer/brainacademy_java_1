package kulkov.lesson_2_14;

/**
 * Created by User on 14.09.2016.
 * Multiple type variables
 */
class MyTuple<A, B, C> {         //Generic class
    //Fields
    private A a;
    private B b;
    private C c;
    //Getters and setters
    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }
    //Constructor
    MyTuple(A a, B b, C c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
