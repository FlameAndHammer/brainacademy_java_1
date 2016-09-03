package torba.Lab_2_11.TestException;

public class Main {

    public static void main(String[] args){

        try {
            throw new Exception("bla bla bla");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally");
        }

        System.out.println("1---------------------------------------------------------------------");

        try {
            throw new MyException("bla bla bla");
        }
        catch (MyException e) {
            e.printMessage();
        }
        finally {
            System.out.println("finally");
        }

        System.out.println("2---------------------------------------------------------------------");

        try {
            MyTest.test();
        }
        catch (MyException e){
            e.printMessage();
        }

        System.out.println("3---------------------------------------------------------------------");

        try {
            MyTest.test2();
        }
        catch (Exception e) {
            System.out.println("Exception: "+e.getClass());
            System.out.println(e.getMessage());
        }


    }

}
