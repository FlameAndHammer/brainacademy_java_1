package _nikulin.practice.shop.content.shop;

import _nikulin.practice.shop.content.Goods;
import _nikulin.practice.shop.content.store.GoodsCount;

import java.util.Arrays;

/**
 * Created by Александр on 05.09.2016.
 */
public class MyShop implements Shop {

    private String name;
    private Goods[] productList = new Goods[100];

    public MyShop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public void addNewGoods() {
        /*int indexLine = Arrays.binarySearch(productList,new Goods(product));*/
    }

    @Override
    public void deleteNewGoods() {

    }


}
