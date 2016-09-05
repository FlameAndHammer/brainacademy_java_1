package torba.Lab_2_11.TestException;

import torba.Lab_2_11.TestException.MyException;
import torba.Lab_2_8.testshapes.Rectangle;

public class MyTest {

    private static Rectangle rect = null;

    public static void test() throws MyException {
        throw new MyException("bla bla bla");
    }

    public static void test2(){
        rect.draw();
    }

}
