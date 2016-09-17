package torba.Lab_2_12;

public class MyTestClass {

    int i = 1;

    static class MyStaticNested {
        int i = 2;
    }

    class MyInner {
        int i = 3;
        public int getI() {
            return MyTestClass.this.i;
        }
    }

    public void test() {

        class MyLocal {}
        MyLocal ml = new MyLocal();

        MyStaticNested msn = new MyStaticNested();
        MyInner mi = new MyInner();

    }

}
