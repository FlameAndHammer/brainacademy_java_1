package kulkov.lesson_2_17.testthread7;

/**
 * Created by User on 03.10.2016.
 */
public class DiningHall implements Runnable {
    static int pizzaNum;
    static int studentID;

    public void makePizza() {
        pizzaNum++;
    }         //Add one to the counter
    public synchronized void servePizza() {
        String result;
        if (pizzaNum > 0) {                         //If thread invoked this method among the first
            result = " Served ";                    //It will send this message to a console
            pizzaNum--;
        } else {
            result = " Starved ";
        }
        System.out.println(Thread.currentThread().getName() + result + studentID);
        studentID++;
    }
    public static void main(String[] args) throws InterruptedException {
        DiningHall d = new DiningHall();
        for (int i = 0; i < 10; i++) {              //Create 10 pizzas
            d.makePizza();
        }
        for (int i = 0; i < 20; i++) {              //Create and start 20 threads
            new Thread(d).start();
        }
        Thread.sleep(1000);                         //Put main thread to sleep for 1 second
        synchronized (d) {
            d.notifyAll();                          //Send notifying signal to all threads
        }
    }

    @Override
    public void run() {
        try {
            synchronized (this) {
                this.wait();                        //Wait for a signal
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        servePizza();                               //Invoke synchronized method
    }
}
