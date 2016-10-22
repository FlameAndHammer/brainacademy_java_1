package kulkov.lesson_2_17.testthread5;

/**
 * Created by User on 30.09.2016.
 * This class gets the number from Storage and prints it to the console
 */
class Printer implements Runnable {
    private Storage storage;

    public Printer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        print();
    }

    private int print() {
        synchronized (storage) {                        //Lock on storage object
            try {
                storage.wait();                         //Wait until the notify signal comes from another thread
            } catch (InterruptedException e) {          //storage unlocks for this time
                return 0;
            }
            System.out.println(storage.getNumber());    //Print the stored number
            storage.notify();                           //Notify the other thread
        }
        return print();                                 //Recursive call
    }
}
