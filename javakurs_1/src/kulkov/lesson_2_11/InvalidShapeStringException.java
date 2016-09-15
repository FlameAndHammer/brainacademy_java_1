package kulkov.lesson_2_11;

/**
 * Created by User on 04.09.2016.
 * Exception invoked when method can't parse a string
 */
class InvalidShapeStringException extends Exception {
    public InvalidShapeStringException(String s) {
        super(s);
    }
}
