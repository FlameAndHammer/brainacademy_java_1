package torba.lesson_31_08_16.com.brainacad.oop.testexcp1;

public class MyException extends Exception {

    public String s;

    public MyException(String s){
        this.s=s;
    }

    public void printMessage(){
        System.out.println(s);
    }

}
