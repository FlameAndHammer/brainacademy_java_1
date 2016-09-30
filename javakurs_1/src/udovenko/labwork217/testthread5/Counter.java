package udovenko.labwork217.testthread5;

/**
 * Created by gladi on 29.09.2016.
 */
class Counter extends Thread {
    private Storage st;

    public Counter(Storage st) {
        this.st = st;
    }

    @Override
    public void run(){
        int count = 0;
        while (count <= 1000000){
            synchronized (st) {
                try {
                    while (st.switcher){
                        st.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                st.switcher = true;
                st.setNumber(count++);
                st.notify();
            }
        }
    }
}
