package kulkov.lesson_2_17.testforkjoin;

import java.util.List;
import java.util.concurrent.RecursiveTask;

/**
 * Created by User on 17.10.2016.
 * Recursive Task
 */
class ForkJoinTest extends RecursiveTask<Long> {
    private List<Integer> list;
    private int from;                       //starting position
    private int to;                         //final position

    public ForkJoinTest(List<Integer> list, int from, int to) {
        this.list = list;
        this.from = from;
        this.to = to;
    }

    @Override
    protected Long compute() {
        if ((to - from) <= 20) {            //If number of elements is less than 20, execute in one thread
            long localSum = 0;
            for (int elem : list) {
                localSum += elem;
            }
            return localSum;
        } else {
            int middle = (to - from) / 2;   //Define median to create new tasks with it as an argument
            ForkJoinTest firstHalf = new ForkJoinTest(list, from, from + middle);
            ForkJoinTest secondHalf = new ForkJoinTest(list, from + middle + 1, to);
            firstHalf.fork();                           //Fork the thread
            long tempResult = secondHalf.compute();     //Recursive method call
            return firstHalf.join() + tempResult;       //Sum the results
        }
    }
}
