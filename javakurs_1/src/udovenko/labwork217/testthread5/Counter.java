package udovenko.labwork217.testthread5;

/**
 * Created by gladi on 29.09.2016.
 * Change realise without switcher
 */
class Counter extends Thread {
    private Storage st;

    public Counter(Storage st) {
        this.st = st;
    }

    @Override
    public void run(){
        synchronized (st) {
            try{
                while (st.getNumber() < Storage.MAX_VALUE){
                    st.notify();
                    st.wait();
                    st.setNumber(st.getNumber() + 1);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            st.notify();
        }
    }
}
