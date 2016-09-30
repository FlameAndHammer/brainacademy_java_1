package udovenko.labwork217.testthread7;

import java.util.concurrent.CountDownLatch;

/**
 * Created by gladi on 30.09.2016.
 */
class ServedPizza extends Thread {
    private CountDownLatch timer;
    DiningHall dn;

    public ServedPizza(String name, CountDownLatch timer, DiningHall dn) {
        super(name);
        this.timer = timer;
        this.dn = dn;
        start();
    }

    @Override
    public void run(){
        synchronized (dn) {
            try {
                timer.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            dn.studentName = getName();
            dn.servePizza();
        }
    }
}
