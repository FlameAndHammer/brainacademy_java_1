package torba.lesson_31_08_16.com.brainacad.oop.testexcp1;

public class Main {

    public static void main(String[] args){

/*
        try {
            throw new Exception("bla bla bla");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally");
        }
*/

        try {
            throw new MyException("bla bla bla");
        }
        catch (MyException e) {
            e.printMessage();
        }
        finally {
            System.out.println("finally");
        }



    }

}
