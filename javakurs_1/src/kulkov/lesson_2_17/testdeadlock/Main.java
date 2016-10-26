package kulkov.lesson_2_17.testdeadlock;

/**
 * Created by User on 07.10.2016.
 * Creating deadlock situation
 */
class Main {
    public static void main(String[] args) {
        //Create 3 immutable objects
        final MyObject lock1 = new MyObject(1);
        final MyObject lock2 = new MyObject(2);
        final MyObject lock3 = new MyObject(3);
        //Run 3 threads, each invoke method of one object
        new MyThread("Thread 1") {
            public void run() {
                lock1.takeObject();
            }
        }.start();
        new MyThread("Thread 2") {
            public void run() {
                lock2.takeObject();
            }
        }.start();
        new MyThread("Thread 3") {
            public void run() {
                lock3.takeObject();
            }
        }.start();
    }
}
