package udovenko.practice;

/**
 * Created by gladi on 06.09.2016.
 */
class FoundCountGoods {
    private CountGoods countGoods;
    private int index;

    FoundCountGoods(CountGoods countGoods, int index) {
        this.countGoods = countGoods;
        this.index = index;
    }

    CountGoods getCountGoods() {
        return countGoods;
    }

    int getIndex() {
        return index;
    }
}
