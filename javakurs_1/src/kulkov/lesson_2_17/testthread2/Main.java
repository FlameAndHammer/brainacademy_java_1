package kulkov.lesson_2_17.testthread2;

/**
 * Created by User on 26.09.2016.
 * Practice with interface Runnable
 */
public class Main {
    public static void main(String[] args) {
        int[] myArray = new int[1000];
        MySumCount count1 = new MySumCount();
        MySumCount count2 = new MySumCount();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 1000);      //Fill the array with random values
        }
        //Divide the array between two runnable objects
        count1.setArray(myArray);
        count1.setStartIndex(0);
        count1.setStopIndex(499);

        count2.setArray(myArray);
        count2.setStartIndex(500);
        count2.setStopIndex(999);
        //Run threads
        new Thread(count1).start();
        new Thread(count2).start();
        try {
            Thread.sleep(1000);                             //Pause main thread for 1 sec
        } catch (InterruptedException e) {
            e.printStackTrace();                            //In case of interruption print exception to the console
        }
        System.out.println("Sum of array elements: " + (count1.getResultSum() + count2.getResultSum()));    //Print final result

        MyTimeBomb bomb = new MyTimeBomb();                 //Create runnable instance
        Thread thread = new Thread(bomb);                   //Initialize thread with this instance
        thread.start();                                     //Run thread
    }
}
