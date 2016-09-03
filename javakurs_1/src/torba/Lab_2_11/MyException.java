package torba.Lab_2_11;

public class MyException extends Exception {

    public String s;

    public MyException(String s){
        this.s=s;
    }

    public void printMessage(){
        System.out.println(s);
    }

}
