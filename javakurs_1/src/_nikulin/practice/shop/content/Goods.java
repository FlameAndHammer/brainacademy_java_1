package _nikulin.practice.shop.content;

import _nikulin.practice.shop.content.store.GoodsCount;

import java.util.Random;

/**
 * Created by Александр on 05.09.2016.
 */
public class Goods implements Comparable {

    private int id;
    private String name;
    private String type;
    private double price;

    public Goods(String name, String type, double price) {
        this.id = (int) (Integer.MAX_VALUE * Math.random());
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Object o) {
        Goods goodsCount = (Goods) o;
        if (this.getId() > goodsCount.getId()) {
            return 1;
        }
        if (this.getId() < goodsCount.getId()) {
            return -1;
        }
        return 0;
    }
}
