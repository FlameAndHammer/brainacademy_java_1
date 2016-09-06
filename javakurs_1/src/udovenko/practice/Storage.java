package udovenko.practice;

/**
 * Created by gladi on 05.09.2016.
 */
class Storage {
    private CountGoods[] listStorage;

    Storage(int quantityGoods){
        listStorage = new CountGoods[quantityGoods];
    }

    void addGoodsStorage(CountGoods countGoods){
        this.listStorage[countGoods.getIdCountGoods()] = countGoods;
    }

    CountGoods[] getListStorage() {
        return listStorage;
    }
}
