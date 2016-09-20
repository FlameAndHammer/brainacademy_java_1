package udovenko.practice.shop;

/**
 * Created by gladi on 05.09.2016.
 */
public class Goods implements Listable {
    private static int counter = 0;
    private final int idGood = counter++;
    private String nameGood;
    private String typeGood;
    private double priceGood;

    Goods(String nameGood, String typeGood, double priceGood) {
        this.nameGood = nameGood;
        this.typeGood = typeGood;
        this.priceGood = priceGood;
    }

    @Override
    public String getNameGood() {
        return nameGood;
    }
}
