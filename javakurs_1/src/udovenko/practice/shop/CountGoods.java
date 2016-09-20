package udovenko.practice.shop;

/**
 * Created by gladi on 05.09.2016.
 */
class CountGoods implements Listable {
    private static int counter = 0;
    private final int idCountGoods = counter++;
    private Goods goods;
    private int countOfGoods;

    CountGoods(Goods goods, int countOfGoods) {
        this.goods = goods;
        this.countOfGoods = countOfGoods;
    }

    @Override
    public String getNameGood() {
        return goods.getNameGood();
    }
}
