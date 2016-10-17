package kulkov.lesson_2_17.testforkjoin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;

/**
 * Created by User on 16.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        List<Integer> list = new ArrayList<>(1000_000);
        for (int i = 0; i < 1000_000; i++) {
            list.add(r.nextInt(100));
        }
        ForkJoinTest test = new ForkJoinTest(list, 0, 100);
        ForkJoinPool pool = new ForkJoinPool();
        long sum = pool.invoke(test);
        System.out.println(sum);
    }
}
