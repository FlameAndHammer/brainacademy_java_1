package kulkov.practice.threads.task2;

/**
 * Created by Александр on 07.10.2016.
 *
 * Напишите программу, которая каждую секунду отображает на экране данные о времени,
 * прошедшем от начала сессии, а другой ее поток выводит сообщение каждые 5 секунд.
 * Предусмотрите возможность ежесекундного оповещения потока, воспроизводящего сообщение,
 * потоком, отсчитывающим время.
 */
class App {

    public App(int lifetime) throws InterruptedException {
        A a = new A();
        T1 t1 = new T1(a);
        T2 t2 = new T2(a, "Test!");
        t1.start();
        t2.start();
        Thread.sleep(lifetime * 1000+100);
        t1.interrupt();
        t2.interrupt();
    }

    public static void main(String[] args) throws InterruptedException {
        new App(15);
    }

    class T1 extends Thread {

        private A app;

        public T1(A app) {
            this.app = app;
        }

        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Thread.sleep(1000);
                    synchronized (app) {
                        this.app.add();
                        System.out.println(this.app.last());
                        app.notify();
                    }
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    class T2 extends Thread {

        private A app;
        private String message;

        public T2(A app, String message) {
            this.app = app;
            this.message = message;
        }

        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    synchronized (app) {
                        app.wait();
                        if (app.last() % 5 == 0)
                            System.out.println(message);
                    }
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    class A {

        private int d = 0;

        public void add() {
            this.d++;
        }

        public int last() {
            return this.d;
        }
    }
}
