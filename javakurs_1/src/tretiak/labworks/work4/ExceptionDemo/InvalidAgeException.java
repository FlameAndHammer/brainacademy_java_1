package tretiak.labworks.work4.ExceptionDemo;


public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(){
        super();
    }
    public InvalidAgeException(String s){
        super(s);
    }
}
