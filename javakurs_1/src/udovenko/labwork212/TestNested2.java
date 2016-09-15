package udovenko.labwork212;

/**
 * Created by gladi on 14.09.2016.
 */
public class TestNested2 {
    public static void main(String[] args) {
        MyTestClass mtc = new MyTestClass();
        MyTestClass.MyStaticNested msn = new MyTestClass.MyStaticNested();
        MyTestClass.Inner innerClass = mtc.new Inner();
    }
}
