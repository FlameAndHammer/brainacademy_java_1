package _nikulin.practice.reflection;

/**
 * @author ANikulin
 */
public final class Test implements TestInterface {
    public int a;
    private String b;
    private Object c;

    public Test(int a, String b, Object c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Test(int a, String b) {
        this.a = a;
        this.b = b;
    }

    public Test() {
    }

    @Override
    public String toString() {
        return "Test{" +
                "a=" + a +
                ", b='" + b + '\'' +
                ", c=" + c +
                '}';
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public Object getC() {
        return c;
    }

    public void setC(Object c) {
        this.c = c;
    }
}
