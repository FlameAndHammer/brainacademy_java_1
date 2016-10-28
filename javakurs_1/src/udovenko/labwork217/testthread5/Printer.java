package udovenko.labwork217.testthread5;

/**
 * Created by gladi on 29.09.2016.
 *
 * Change realise without switcher
 */
class Printer extends Thread {
    private Storage st;

    public Printer(Storage st) {
        this.st = st;
    }

    @Override
    public void run(){
        int prevNum = 0;
        synchronized (st){
            try {
                while (st.getNumber() < Storage.MAX_VALUE){
                    System.out.println(st.getNumber());
                    while (prevNum == st.getNumber()){
                        st.notify();
                        st.wait();
                    }
                    prevNum = st.getNumber();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            st.notify();
        }
    }

}
