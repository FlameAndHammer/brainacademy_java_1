package udovenko.practice;

/**
 * Created by gladi on 05.09.2016.
 */
class CountGoods {
    private static int counter = 0;
    private int idCountGoods;
    private Goods goods;
    private int countOfGoods;

    CountGoods(Goods goods, int countOfGoods) {
        this.idCountGoods = counter;
        this.goods = goods;
        this.countOfGoods = countOfGoods;
        counter++;
    }

    Goods getGoods() {
        return goods;
    }

    int getCountOfGoods() {
        return countOfGoods;
    }

    int getIdCountGoods() {
        return idCountGoods;
    }

    void setCountOfGoods(int countOfGoods) {
        this.countOfGoods = countOfGoods;
    }
}
