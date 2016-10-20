package kulkov.lesson_2_17.testthread8;

/**
 * Created by User on 03.10.2016.
 * Synchronizing threads with high level concurrency objects
 */
public class BankTest {
    public static final int N_ACCOUNTS = 5;
    public static final int INIT_BALANCE = 1000;

    public static void main(String args[]) throws InterruptedException {
        Bank testBank = new Bank(N_ACCOUNTS, INIT_BALANCE);
        Transfer transfer = new Transfer(testBank, 100, 500);
        Thread[] threads = new Thread[N_ACCOUNTS];

        for (int i = 0; i < N_ACCOUNTS; i++) {          //Create 5 threads
            threads[i] = new Thread(transfer);
            threads[i].start();                         //Start the thread
        }
        Thread.sleep(2000);                             //Put main thread to sleep for 2 seconds
        for (int i = 0; i < N_ACCOUNTS; i++) {
            threads[i].interrupt();                     //Ask thread for interruption
        }

        //...
        // COMPLETE
        //..
    }
}

