package kulkov.lesson_2_17.testthread8;

import java.util.Random;

/**
 * Created by User on 03.10.2016.
 * Describing transfer restrictions
 */
class Transfer implements Runnable{
    private final Bank bank;
    private int from;
    private int max;
    public Transfer(Bank bank, int from, int max_amount) {
        this.bank = bank;
        this.from = from;
        max = max_amount;
    }

    @Override
    public void run() {
        Random r = new Random();
        while (true) {
            bank.transfer(r.nextInt(bank.getNumberAccounts()), r.nextInt(bank.getNumberAccounts()), r.nextInt(max - from) + from); //Invoke money transfer
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
