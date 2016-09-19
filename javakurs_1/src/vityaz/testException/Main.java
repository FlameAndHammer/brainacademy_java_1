package vityaz.testException;


public class Main {
    public static void main(String[]args){
        try{
            MyTest myTest = new MyTest();
            myTest.test();
        }
        catch (MyException ex){
            System.out.println(ex.getMessage());
        }
    }
}
