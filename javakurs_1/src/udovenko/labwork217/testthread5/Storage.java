package udovenko.labwork217.testthread5;

/**
 * Created by gladi on 29.09.2016.
 */
public class Storage{
    private int number;
    public final static int MAX_VALUE = 10000;
    //public boolean switcher = false;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static void main(String[] args) {
        Storage storage = new Storage();
        Counter cr = new Counter(storage);
        Printer pr = new Printer(storage);
        pr.start();
        cr.start();
    }
}
