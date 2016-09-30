package udovenko;


import java.util.Random;

/**
 * Created by gladi on 29.09.2016.
 */
public class MyTestData {
    private byte[] data;

    public boolean ready(){
        return data != null;
    }

    public static void main(String[] args) {
        MyTestData data = new MyTestData();
        DataSender[] senders = {
            data.new DataSender("user1"),
            data.new DataSender("user2"),
            data.new DataSender("user3")
        };
        for (DataSender send: senders){
            send.start();
        }
        DataGenerator pr = data.new DataGenerator();
        pr.start();
    }

//    inner class DataGenerator
    private class DataGenerator extends Thread{
        @Override
        public void run(){
            System.out.println("Generating data...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (MyTestData.this){
                data = new byte[1000];
                new Random().nextBytes(data);
                System.out.println("Ok!!!");
                MyTestData.this.notifyAll();
            }
        }
    }

//    inner class DataSender
    private class DataSender extends Thread{
        private String user;

    public DataSender(String user) {
        this.user = user;
    }

    @Override
    public void run(){
        System.out.println("Waiting for Data#" + getId()+ "...");
        synchronized (MyTestData.this){
            try {
                while (!ready()){
                    MyTestData.this.wait();
                }
            }catch (InterruptedException e){
                return;
            }
        }
        System.out.printf("Sending Data to %s\r\n", user);
    }
}
}
