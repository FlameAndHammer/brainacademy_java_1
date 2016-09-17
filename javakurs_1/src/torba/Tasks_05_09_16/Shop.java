package torba.Tasks_05_09_16;

public class Shop {

    private String name = "Ali-baba";
    private Adress adress = new Adress(65111, "Odessa", "Bunina", 32);

    private User[] users = {new User("admin", "rhjccabn", true), new User("user", "123", false)};
    private User currentUser;

    private Good[] goods = new Good[100];
    private int numberOfGoods = 0;
    private Store store = new Store("Basic");
    private StoreRecord[] storeRecords = new StoreRecord[100];
    private int numberOfStoreRecords = 0;

    private Check[] checks = new Check[1000];
    private Check currentCheck;

    public void login(String username, String password) {
        for (User el : users) {
            if ( (el.getName().equalsIgnoreCase(username)) && (el.getPassword().equalsIgnoreCase(password)) ) {
                currentUser = el;
            }
        }
    }

    public boolean existsID(int id){
        //java.util.Arrays.sort
        for (Good el : goods) {
            if (el.getID() == id) {return true;}
        }
        return false;
    }

    public Good getGoodByID(int id){
        for (Good el : goods) {
            if (el == null) {break;}
            if (el.getID() == id) {return el;}
        }
        return null;
    }

    public void addGood(int id, String name, String type, double price) {
        if (currentUser == null) {System.out.println("Login!"); return;}
        if (!currentUser.getAdmin()) {System.out.println("insufficient access rights"); return;}
        if (existsID(id)) {System.out.println("A good with this ID already exists."); return;}
        goods[numberOfGoods] = new Good(id, name, type, price);
        numberOfGoods = numberOfGoods + 1;
    }

    public void deleteGood(int id) {
        if (currentUser == null) {System.out.println("Login!"); return;}
        if (!currentUser.getAdmin()) {System.out.println("insufficient access rights"); return;}
        if (!existsID(id)) {System.out.println("A good with this ID doesn't exist."); return;}
        int index = -1; boolean deleting = false;
        for (int i = 0; i < goods.length; i++) {
            if (goods[i] == null) {break;};
            if (goods[i].getID() == id) {
                goods[i] = null;
                deleting = true;
                index = i;
                break;
            }
        }
        if (deleting) {
            for (int i = index+1; i < numberOfGoods; i++){
                goods[i-1] = goods[i];
                goods[i] = null;
            }
        }
        numberOfGoods = numberOfGoods - 1;
    }

    public void goodArrival(int id, int amount) {
        if (currentUser == null) {System.out.println("Login!"); return;}
        if (!currentUser.getAdmin()) {System.out.println("insufficient access rights"); return;}
        if (!existsID(id)) {System.out.println("A good with this ID doesn't exist."); return;}
        boolean existsRecord = false;
        for (int i = 0; i < storeRecords.length; i++) {
            if (storeRecords[i].getGood().getID() == id) {
                storeRecords[i].setAmount(storeRecords[i].getAmount() + amount);
                existsRecord = true;
            }
        }
        if (!existsRecord){
            storeRecords[numberOfStoreRecords]=new StoreRecord(getGoodByID(id), amount);
            numberOfStoreRecords = numberOfStoreRecords + 1;
        }
    }

    public void goodConsumption(int id, int amount) {
        if (currentUser == null) {System.out.println("Login!"); return;}
        if (!currentUser.getAdmin()) {System.out.println("Insufficient access rights"); return;}
        if (!existsID(id)) {System.out.println("A good with this ID doesn't exist."); return;}
        boolean existsRecord = false;
        for (int i = 0; i < storeRecords.length; i++) {
            if (storeRecords[i].getGood().getID() == id) {
                if (storeRecords[i].getAmount() >= amount) {
                    storeRecords[i].setAmount(storeRecords[i].getAmount() - amount);
                    existsRecord = true;
                }
                else {System.out.println("Good amount isn't enough.");}
            }
        }
        if (!existsRecord) {System.out.println("Good is not in stock.");}
    }

    public void findGood(String subStr) {
        if (subStr.trim().length() <= 3) {System.out.println("Less than 3 character."); return;}
        for (int i = 0; i < goods.length; i++) {
            if (goods[i] == null) {break;}
            else if(goods[i].getName().substring(0,2) == subStr) {System.out.println(goods[i].getName()+" "
                                                                                     +goods[i].getPrice());}
        }
    }

    public void listOfGoods() {
        for (int i = 0; i < goods.length; i++) {
            if (goods[i] == null) {break;}
            else {System.out.println(goods[i].getName()+" "+goods[i].getPrice());}
        }
    }

    public void getStoreRecords() {
        for (int i = 0; i < storeRecords.length; i++) {
            if (storeRecords[i].getAmount() > 0) {
                System.out.println(storeRecords[i].getGood().getName()+" "+storeRecords[i].getGood().getPrice()+" "
                                   +storeRecords[i].getAmount());
            }
        }
    }

    public void addCheck() {
        currentCheck = new Check();
    }

}