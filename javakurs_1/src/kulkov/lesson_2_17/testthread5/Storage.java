package kulkov.lesson_2_17.testthread5;

/**
 * Created by User on 30.09.2016.
 * This class stores a number
 */
class Storage {
    private static Integer number;

    public int getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        Storage.number = number;
    }
}
