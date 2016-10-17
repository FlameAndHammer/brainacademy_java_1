package udovenko.labwork217.testthread8;

/**
 * Created by gladi on 30.09.2016.
 */
public class Transfer extends Thread {
    private Bank bank;
    private int from;
    private int max;
    public Transfer(Bank bank, int from, int max_amount) {
        bank = bank;
        from = from;
        max = max_amount;
    }
}
