package _nikulin.labs.lesson_2_17.task6;

/**
 * Created by gladi on 29.09.2016.
 */
class Printer extends Thread {
    private Storage st;

    public Printer(Storage st) {
        this.st = st;
    }

    @Override
    public void run(){
        int previousNumber = 0;
        synchronized (st){
            try {
                while (st.getNumber() < 1000){
                    System.out.println(st.getNumber());
                        while (previousNumber == st.getNumber()){
                            st.notify();
                            st.wait();
                        }
                    previousNumber = st.getNumber();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
