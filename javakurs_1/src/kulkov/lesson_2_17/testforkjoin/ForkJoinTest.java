package kulkov.lesson_2_17.testforkjoin;

import java.util.List;
import java.util.concurrent.RecursiveTask;

/**
 * Created by User on 17.10.2016.
 */
public class ForkJoinTest extends RecursiveTask<Long> {
    private static int numberOfThreads;
    private List<Integer> list;
    private int from;
    private int to;

    public ForkJoinTest(List<Integer> list, int from, int to) {
        this.list = list;
        this.from = from;
        this.to = to;
    }

    @Override
    protected Long compute() {
        if ((to - from) <= 20) {
            long localSum = 0;
            for (int elem : list) {
                localSum += elem;
            }
            return localSum;
        } else {
            int middle = (to - from) / 2;
            ForkJoinTest firstHalf = new ForkJoinTest(list, from, middle);
            ForkJoinTest secondHalf = new ForkJoinTest(list, middle + 1, to);
            firstHalf.fork();
            long tempResult = secondHalf.compute();
            return firstHalf.join() + tempResult;
        }
    }
}
