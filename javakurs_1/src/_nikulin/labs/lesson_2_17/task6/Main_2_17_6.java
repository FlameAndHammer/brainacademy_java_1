package _nikulin.labs.lesson_2_17.task6;

/**
 * Created by Александр on 30.09.2016.
 */
public class Main_2_17_6 {
    public static void main(String[] args) {
        Storage storage = new Storage();
        Counter counter = new Counter(storage);
        Printer printer = new Printer(storage);
        printer.start();
        counter.start();
    }
}
