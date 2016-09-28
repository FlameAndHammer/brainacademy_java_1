package kulkov.lesson_2_17.testthread1;

/**
 * Created by User on 26.09.2016.
 * Writing simple thread
 */
class MyTimeBomb extends Thread {
    @Override
    public void run() {
        for (int i = 10; i >= 0; i--) {
            try {
                Thread.sleep(1000);             //Pause thread execution
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);              //Print number to the console
        }
        System.out.println("Boom!!!");
    }
}
