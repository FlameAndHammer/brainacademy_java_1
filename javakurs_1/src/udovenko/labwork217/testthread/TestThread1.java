package udovenko.labwork217.testthread;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by gladi on 28.09.2016.
 */
public class TestThread1 {
    public static void main(String[] args) {
//       LabWork 2-17-1
        MyTimeBomb myBomb = new MyTimeBomb();
        myBomb.start();

//        LabWork 2-17-3
        try {                               //wait until the finished Lab Work 2-17-1
            myBomb.join();
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
        mc1.start();
        mc2.start();
        try {
            mc1.join();
            mc2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Sum of array elements: " + (mc1.getResultSum() + mc2.getResultSum()));

//        check results
        long checkSum = 0L;
        for (int el: myArray){
            checkSum += el;
        }
        System.out.println("Checking sum of array elements: " + checkSum);
    }
}
