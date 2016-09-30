package udovenko;

/**
 * Created by gladi on 29.09.2016.
 */
public class UserAccount {
    private int money;

    public UserAccount(int money) {
        this.money = money;
    }

    public int get() {
        return money;
    }

    public void set(int money) {
        this.money = money;
    }

    public static void main(String[] args) {
        UserAccount acc = new UserAccount(1000);
        for (int i = 0; i < 300; i++){
            UserAction act = acc.new UserAction(100);
            act.start();
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(acc.get());
    }

//    inner clas UserAction
    class UserAction extends Thread{
        private int withdraw;

        public UserAction(int withdraw) {
            this.withdraw = withdraw;
        }

        @Override
        public void run(){
            synchronized (UserAccount.this) {
                int has = get();
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (has >= withdraw) {
                    set(get() - withdraw);
                }
            }
        }
    }
}
