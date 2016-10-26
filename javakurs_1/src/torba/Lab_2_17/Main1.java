package torba.Lab_2_17;

public class Main1 {

    public static void main(String[] args) {
        MyTimeBomb1 mtb1 = new MyTimeBomb1();
        Thread mtb = new Thread(mtb1);
        mtb.start();
    }

}
