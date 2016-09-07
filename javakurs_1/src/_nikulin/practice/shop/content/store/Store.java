package _nikulin.practice.shop.content.store;

import _nikulin.practice.shop.content.Goods;

import java.util.Arrays;

/**
 * Created by Александр on 05.09.2016.
 */
public class Store {
    private GoodsCount[] balances = new GoodsCount[100];

    public GoodsCount[] getAllBalances(){
        return balances;
    }

    public void addGoods(Goods product, int count) {
        int indexLine = Arrays.binarySearch(balances,new GoodsCount(product));
        if (indexLine > 0 ){
            balances[indexLine].addCount(count);
        } else {
            GoodsCount newBatch = new GoodsCount(product);
            newBatch.addCount(count);
            balances[balances.length - 1] = newBatch;
            Arrays.sort(balances);
        }
    }
}
