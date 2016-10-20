package kulkov.lesson_2_17.testthread8;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by User on 03.10.2016.
 * Money transaction logic
 */
class Bank {
    private int accounts[];
    private int numOfAccounts;
    private Lock lock = new ReentrantLock();                    //Initialize Lock object
    public Bank(int num_accounts, int init_balance) {
        accounts = new int[num_accounts];
        numOfAccounts = num_accounts;
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = init_balance;
        }
    }
    void transfer(int from, int to, int amount) {
        try {
            System.out.println("from: " + from + " to: " + to +
                    " amount: " + amount);

            lock.lock();                                        //Lock the following code from execution by other threads
            if (accounts[from] < amount) return;                //If account does not have sufficient funds, return from method
            accounts[from] = accounts[from] - amount;           //Take money from sender
            accounts[to] = accounts[to] + amount;               //Give money to receiver

            Thread.sleep((int)(100*Math.random()));

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();                 //In case of interrupt request send it further
        } finally {
            System.out.println("Total balance: " + totalBalance());
            lock.unlock();                                      //Remove lock
        }
    }
    private int totalBalance() {
        int total = 0;
        for (int v : accounts) {
            total = total + v;
        }
        return total;
    }
    public int getNumberAccounts() {
        return numOfAccounts;
    }
}

