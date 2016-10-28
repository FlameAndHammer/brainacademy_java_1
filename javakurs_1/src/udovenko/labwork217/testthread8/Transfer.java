package udovenko.labwork217.testthread8;

import java.util.Random;

/**
 * Created by gladi on 30.09.2016.
 */
public class Transfer extends Thread {
    private Bank bank;
    private int from;
    private int max;
    public Transfer(Bank bank, int from, int max_amount) {
        this.bank = bank;
        this.from = from;
        this.max = max_amount;
    }

    public void run(){
        Random rnd = new Random();
        int to;
        try {
                while (true){
                    do {
                        to = rnd.nextInt(bank.getNumberAccounts());
                    } while (to == from);
                    synchronized (bank) {
                        Thread.sleep(100);
                        bank.transfer(from, to, rnd.nextInt(max));
                    }
                }
        } catch (InterruptedException e) {
                return;
        }

    }
}
