package tretiak.labworks.theardLab;

import java.util.Random;

public class Main {
    public static Random random = new Random();
    public static void main(String[] args) throws InterruptedException{
        Integer[] myArray = new Integer[1000];
        for (int i = 0; i < 1000; i++){
            myArray[i] = random.nextInt(1000);
        }
        MySumCount mySumCount1 = new MySumCount();
        mySumCount1.setArr(myArray);
        MySumCount mySumCount2 = new MySumCount();
        mySumCount2.setArr(myArray);
        mySumCount1.setStartIndex(0);
        mySumCount2.setStartIndex(500);
        mySumCount1.setStopIndex(500);
        mySumCount2.setStopIndex(1000);
        Thread th1 = new Thread(mySumCount1);
        Thread th2 = new Thread(mySumCount2);
        th1.start();
        th2.start();
        th1.join();
        System.out.println(mySumCount1.getResultSum() + mySumCount2.getResultSum());
    }
}
