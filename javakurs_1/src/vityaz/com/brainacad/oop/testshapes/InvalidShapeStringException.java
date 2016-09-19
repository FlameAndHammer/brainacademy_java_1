package vityaz.com.brainacad.oop.testshapes;


public class InvalidShapeStringException extends RuntimeException{
    @Override
    public String getMessage(){
        return "invalid shape type!";
    }
}
