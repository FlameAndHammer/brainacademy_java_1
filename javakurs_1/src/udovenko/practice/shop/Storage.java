package udovenko.practice.shop;

/**
 * Created by gladi on 05.09.2016.
 */
class Storage {
    private CountGoods[] listStorage ;

    Storage(int quantityGoods){
        listStorage = new CountGoods[quantityGoods];
    }
}
