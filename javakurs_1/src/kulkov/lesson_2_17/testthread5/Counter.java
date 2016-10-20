package kulkov.lesson_2_17.testthread5;

/**
 * Created by User on 30.09.2016.
 * This class change and write the number to Storage
 */
class Counter implements Runnable{
    private Storage storage;

    public Counter(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        count(0);
    }

    private int count(int counter) {
        if (counter < 1000) {
            synchronized (storage) {                    //Lock on storage object
                storage.setNumber(counter);             //Set a new value
                storage.notify();                       //Notify the other thread
                try {
                    storage.wait();                     //Wait for reply
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return count(++counter);                    //Recursive call with a new value
        }
        return 0;
    }
}
