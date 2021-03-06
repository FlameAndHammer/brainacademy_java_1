package udovenko;

/**
 * Created by gladi on 29.09.2016.
 */
public class VolatileTest {
    private static volatile int varVlt = 0;
    private static int varNonVlt = 0;

    public static void main(String[] args) {
        ChangeListener th1 = new ChangeListener();
        ChangeMaker th2 = new ChangeMaker();
        th1.start();
        th2.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        th1.interrupt();
        th2.interrupt();
    }

    static class ChangeMaker extends Thread{
        @Override
        public void run(){
            int local_value = 0;
            while (!isInterrupted()){
                varNonVlt = varVlt = ++local_value;
            }
        }
    }

    static class ChangeListener extends Thread{
        @Override
        public void run(){
            while (!isInterrupted()) {
                if (varVlt > varNonVlt) {
                    System.out.printf("Error: %s > %s\r\n", varVlt, varNonVlt);
                }
            }
        }
    }
}
