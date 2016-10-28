package udovenko.labwork217.testthread8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by gladi on 30.09.2016.
 */
public class BankTest {
    public static final int N_ACCOUNTS = 5;
    public static final int INIT_BALANCE = 1000;

    public static void main(String args[]) {
        Bank bank = new Bank(N_ACCOUNTS, INIT_BALANCE);
        List<Transfer> transfers = new ArrayList<>();
        for (int i = 0; i < N_ACCOUNTS; i++){
            transfers.add(new Transfer(bank, i, INIT_BALANCE));
            transfers.get(i).start();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (Transfer tr: transfers){
            tr.interrupt();
        }
    }
}
