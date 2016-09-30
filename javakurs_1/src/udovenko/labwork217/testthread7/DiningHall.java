package udovenko.labwork217.testthread7;

import java.util.ArrayList;
import java.util.List;
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
        for (int i = 0; i < 100; i++)
            d.makePizza();
        List<ServedPizza> serveds = new ArrayList<>();
        CountDownLatch cdl = new CountDownLatch(1);
        for (int i = 0; i < 200; i++) {
            serveds.add(new ServedPizza("Student" + i, cdl, d));
        }
        cdl.countDown();
    }
}
