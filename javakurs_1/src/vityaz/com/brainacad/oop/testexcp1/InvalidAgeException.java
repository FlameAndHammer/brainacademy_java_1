package vityaz.com.brainacad.oop.testexcp1;


public class InvalidAgeException extends RuntimeException{
    @Override
    public String getMessage(){
        return "invalid age range";
    }
}
