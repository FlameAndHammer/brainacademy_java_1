package _nikulin.labs.lesson_2_17.task6;

/**
 * Created by gladi on 29.09.2016.
 */
class Counter extends Thread {
    private Storage st;

    public Counter(Storage st) {
        this.st = st;
    }

    @Override
    public void run() {
        synchronized (st) {
            try {
                while (st.getNumber() < 1000) {
                    st.notify();
                    st.wait();
                    st.setNumber(st.getNumber() + 1);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            st.notifyAll();
        }
    }
}
