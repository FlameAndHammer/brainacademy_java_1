package torba.Lab_2_17;

public class MyTimeBomb extends Thread {

    public void run() {
        for (int i = 10; i >= 0; i--) {
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                return;
            }
            System.out.println(i);
        }
        System.out.println("Boom");
    }

}
