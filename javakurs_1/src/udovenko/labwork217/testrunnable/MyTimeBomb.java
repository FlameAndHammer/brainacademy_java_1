package udovenko.labwork217.testrunnable;

/**
 * Created by gladi on 28.09.2016.
 */
class MyTimeBomb implements Runnable {
    @Override
    public void run(){
        int i = 10;
        while (i-- >= 0){
            System.out.println(i+1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Boom!!!");
    }
}
