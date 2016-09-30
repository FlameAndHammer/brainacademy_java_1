package udovenko.labwork217.testthread7;

import java.util.concurrent.CountDownLatch;

/**
 * Created by gladi on 30.09.2016.
 */
public class DiningHall {
    static int pizzaNum;
    String studentName;

    public void makePizza() {
        pizzaNum++;
    }
    public void servePizza() {
        String result;
        if (pizzaNum > 0) {
            result = "Served ";
            pizzaNum--;
        } else result = "Starved ";
        System.out.println(studentName + " " + result);
    }
    public static void main(String[] args) {
        DiningHall d = new DiningHall();
        for (int i = 0; i < 10; i++)
            d.makePizza();
        ServedPizza[] serveds = new ServedPizza[20];
        CountDownLatch cdl = new CountDownLatch(1);
        for (int i = 0; i < 20; i++) {
            serveds[i] = new ServedPizza("Student" + i, cdl, d);
        }
        cdl.countDown();
    }
}
