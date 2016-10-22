package kulkov.lesson_2_17.testdeadlock;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 07.10.2016.
 * Object which will serve as a lock
 */
class MyObject {
    private int number;
    private static List<MyObject> objects = new ArrayList<MyObject>();

    public int getNumber() {
        return number;
    }

    public MyObject(int number) {
        this.number = number;
        objects.add(this);
    }
    //Lock an object by a current thread
    public synchronized void takeObject() {
        System.out.printf("%s: Holding lock %s...\n", Thread.currentThread().getName(), this.getNumber());
        MyObject next = this.getNextObject();       //Return a reference of the next object
        System.out.printf("%s: Waiting for lock %s...\n", Thread.currentThread().getName(), next.getNumber());
        next.askForNext();                          //Try to invoke method of another object
    }

    public synchronized void askForNext() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " : Executed");
    }

    public MyObject getNextObject() {
        try {
            return objects.get(objects.indexOf(this) + 1);
        } catch (IndexOutOfBoundsException e) {
            return objects.get(0);
        }
    }
}
