package vityaz.testException;


public class MyException extends Exception{
    private String string;
    public MyException(String string){
        this.string = string;
    }
    @Override
    public String getMessage() {
        return string;
    }
}
