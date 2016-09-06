package udovenko.practice;

/**
 * Created by gladi on 05.09.2016.
 */
public class Goods {
    private static int counterGoods = 0;
    private int idGood;
    private String nameGood;
    private String typeGood;
    private double priceGood;

    Goods(String nameGood, String typeGood, double priceGood) {
        idGood = counterGoods;
        this.nameGood = nameGood;
        this.typeGood = typeGood;
        this.priceGood = priceGood;
        counterGoods++;
    }

    int getIdGood() {
        return idGood;
    }

    public void setPriceGood(double priceGood) {
        this.priceGood = priceGood;
    }

    String getNameGood() {
        return nameGood;
    }

    public static int getCounterGoods() {
        return counterGoods;
    }
}
