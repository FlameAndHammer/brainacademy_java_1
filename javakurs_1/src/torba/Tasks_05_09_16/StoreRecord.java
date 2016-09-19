package torba.Tasks_05_09_16;

public class StoreRecord {
    private Good good;
    private int amount;
    public StoreRecord(Good good, int amount) {
        this.good = good;
        this.amount = amount;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }
    public int getAmount(){
        return amount;
    }
    public Good getGood(){
        return good;
    }
}
