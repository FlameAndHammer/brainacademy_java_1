package kulkov.lesson_2_11;

/**
 * Created by User on 04.09.2016.
 * Exception invoked when user tries to set incorrect age
 */
public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String s) {
        super(s);
    }
}
