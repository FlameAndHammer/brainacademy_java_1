package _nikulin;

/**
 * Created by Александр on 30.09.2016.
 */
class BaseClass {
    protected volatile int increment;
    protected volatile boolean flag = false;
}

class Thread1 extends Thread {
    BaseClass a;
    public Thread1(BaseClass a){
        this.a = a;
    }
    @Override
    public void run() {
        System.out.println("Starting increment");
        synchronized (a){
            for(int i = 1; i < 1000001; i++){
                a.increment += 1;
            }
            a.flag = true;
            System.out.println("Finish");
            a.notifyAll();
        }
    }
}

class Thread2 extends Thread {
    BaseClass a;
    public Thread2(BaseClass a){
        this.a = a;
    }
    @Override
    public void run() {
        synchronized (a){
            try{
                while(!a.flag)
                    a.wait();

                System.out.println(a.increment);
            }
            catch (InterruptedException e){
                return;
            }
        }
    }
    public static void main(String[] argv){
        BaseClass a = new BaseClass();
        Thread1 b = new Thread1(a);
        b.start();
        Thread2 c = new Thread2(a);
        c.start();
    }
}