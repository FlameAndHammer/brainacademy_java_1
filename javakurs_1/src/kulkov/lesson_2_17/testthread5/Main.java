package kulkov.lesson_2_17.testthread5;

/**
 * Created by User on 30.09.2016.
 * Synchronizing two threads with wait/notify mechanism
 */
public class Main {
    public static void main(String[] args) throws InterruptedException{
        Storage storage = new Storage();

        Thread counter = new Thread(new Counter(storage));
        Thread printer = new Thread(new Printer(storage));

        counter.start();
        printer.start();
    }
}
