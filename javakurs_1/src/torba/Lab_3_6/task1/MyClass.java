package torba.Lab_3_6.task1;

final class MyClass {

    private int a;
    int b;
    protected int c;
    public int d;

    public int getA() {return a;}
    public int getB() {return b;}
    public int getC() {return c;}
    public int getD() {return d;}

    public void setA(int a) {this.a = a;}
    public void setB(int b) {this.b = b;}
    public void setC(int c) {this.c = c;}
    public void setD(int d) {this.d = d;}

    public MyClass() {}
    public MyClass(int a) {this.a = a;}
    public MyClass(int a, int b) {this.a = a; this.b = b;}
    public MyClass(int a, int b, int c) {this.a = a; this.b = b; this.c = c;}
    public MyClass(int a, int b, int c, int d) {this.a = a; this.b = b; this.c = c; this.d = d;}
}

