package torba.Lab_2_12;

public class MyTestClass {

    static class MyStaticNested {
        int i = 1;
    }

    class MyInner {
        int i = 1;
    }

    public void test() {

        class MyLocal {}
        MyLocal ml = new MyLocal();

        MyStaticNested msn = new MyStaticNested();
        MyInner mi = new MyInner();

    }

}
