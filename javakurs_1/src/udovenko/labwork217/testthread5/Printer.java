package udovenko.labwork217.testthread5;

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
        while (st.getNumber() < 1000000){
            synchronized (st){
                System.out.println(st.getNumber());
                try {
                        while (!st.switcher){
                            st.wait();
                        }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                st.switcher = false;
                st.notify();
            }
        }
     }
}
