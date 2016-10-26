package kulkov.lesson_2_17.testforkjoin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;

/**
 * Created by User on 16.10.2016.
 * Fork/join framework
 */
class Main {
    public static void main(String[] args) {
        Random r = new Random();                            //Initialize random
        List<Integer> list = new ArrayList<>(1000_000);     //Initialize the list with 1M numbers
        for (int i = 0; i < 1000_000; i++) {
            list.add(r.nextInt(100));
        }
        ForkJoinTest test = new ForkJoinTest(list, 0, 100); //Initialize recursive task
        ForkJoinPool pool = new ForkJoinPool();             //Initialize pool
        long sum = pool.invoke(test);                       //Invoke pool with the task
        System.out.println(sum);                            //Print the result to the console
    }
}
