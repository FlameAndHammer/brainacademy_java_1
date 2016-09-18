package torba.Lab_2_14;

public class MyTuple<A, B, C> {

    A a;
    B b;
    C c;

    MyTuple(A a, B b, C c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public A getA() {
        return a;
    }

    public B getB() {
        return b;
    }

    public C getC() {
        return c;
    }

    public String toString() {
        return(""+a+" "+b+" "+c);
    }

}
