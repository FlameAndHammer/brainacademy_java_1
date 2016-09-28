package udovenko.labwork217.testrunnable;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by gladi on 28.09.2016.
 */
public class TestThread2 {
    public static void main(String[] args) {
//       LabWork 2-17-2
        Runnable bomb1 = new MyTimeBomb();
        Thread th0 = new Thread(bomb1);
        th0.start();

//        LabWork 2-17-4
        try {                               //wait until the finished Lab Work 2-17-2
            th0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int[] myArray = new int[1000];
        Random rnd = new Random();
        for (int i = 0, k = myArray.length; i < k;i++){
            myArray[i] = rnd.nextInt(1000);
        }
        System.out.println(Arrays.toString(myArray));
        MySumCount mc1 = new MySumCount(0, 500, myArray);
        MySumCount mc2 = new MySumCount(500, 1000, myArray);
        Thread th1 = new Thread(mc1);
        Thread th2 = new Thread(mc2);
        th1.start();
        th2.start();
        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Sum of array elements: " + (mc1.getResultSum() + mc2.getResultSum()));
    }
}
