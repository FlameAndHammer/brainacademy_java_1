package vityaz.testException;

public class MyTest {
    public void test() throws MyException{
        throw new MyException("my exception is caught");
    }
}
