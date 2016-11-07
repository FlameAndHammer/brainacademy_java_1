package udovenko.labwork35.testrecflection1;

/**
 * Created by gladi on 07.11.2016.
 */
public final class MyClass {
    private int a;
    int b;
    protected int c;
    public int d;

    public MyClass() {
    }

    public MyClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public MyClass(int c) {
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }
}
