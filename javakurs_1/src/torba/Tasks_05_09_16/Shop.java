package torba.Tasks_05_09_16;


public class Shop {

    private int goodsLength = 0;

    private  User[] users = {new User("admin", true), new User("any user", false)};

    private User currentUser;

    private Check currentCheck;

    private Store store = new Store("Basic");

    private String name = "Ali-baba";

    private Adress adress = new Adress(65111, "Odessa", "Bunina", 32);

    private Good[] goods = new Good[100];
    private GoodStore[] goodsStore = new GoodStore[100];

    private Check[] checks = new Check[1000];

    public void addGood(int id, String name, String type, double price) {
        goods[goodsLength] = new Good(id, name, type, price);
        goodsLength = goodsLength + 1;
    }

    public void deleteGood(int id) {
        for (int i = 0; i < goods.length; i++) {
            if (goods[i].id == id) {
                goods[i] = null;
            }
        }
    }

    public void Prih(int id, int amount) {
        boolean fl = false;
        for (int i = 0; i < goodsStore.length; i++) {
            if (goodsStore[i].good.id == id) {
                goodsStore[i].amount = goodsStore[i].amount + amount;
            }

        }
    }

    public void Rash(int id, int amount) {
        boolean fl = false;
        for (int i = 0; i < goodsStore.length; i++) {
            if (goodsStore[i].good.id == id) {
                goodsStore[i].amount = goodsStore[i].amount - amount;
            }
        }
    }

    public void findGood(String subStr) {
        for (int i = 0; i < goods.length; i++) {
            if (goods[i] == null) {continue;}
            else if(goods[i].name.substring(0,2) == subStr) {System.out.println(goods[i].name+" "+goods[i].price);}
        }
    }

    public void getGoods() {
        for (int i = 0; i < goods.length; i++) {
            if (goods[i] == null) {continue;}
            else {System.out.println(goods[i].name+" "+goods[i].price);}
        }
    }

    public void getGoodsStore() {
        for (int i = 0; i < goodsStore.length; i++) {
            if (goodsStore[i].amount > 0) {
                System.out.println(goodsStore[i].good.name+" "+goodsStore[i].good.price+" "+goodsStore[i].amount);
            }
        }
    }

    public void addCheck() {
        currentCheck = new Check();
    }

    public void addCheckRecord(CheckRecord checkRecord) {
        currentCheck.checkRecords[currentCheck.checkRecords.length-1] = checkRecord;
    }

}
