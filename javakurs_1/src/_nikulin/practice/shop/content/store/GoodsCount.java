package _nikulin.practice.shop.content.store;

import _nikulin.practice.shop.content.Goods;

/**
 * Created by Александр on 05.09.2016.
 */
public class GoodsCount implements Comparable{

    private Goods goods;
    private int count;

    public GoodsCount(Goods goods) {
        this.goods = goods;
    }

    public void addCount(int newCount){
        this.count += newCount;
    }

    public void subtractCount(int newCount){
        if (this.count < newCount) {
            throw new RuntimeException("No available goods!");
        }
        this.count -= newCount;
    }

    public int getCount() {
        return count;
    }

   /* public Goods getGoods() {
        return goods;
    }*/

    @Override
    public int compareTo(Object o) {
         GoodsCount goodsCount = (GoodsCount) o;
        if (this.goods.getId() > goodsCount.goods.getId()) {
            return 1;
        }
        if (this.goods.getId() < goodsCount.goods.getId()) {
            return -1;
        }
        return 0;
    }
}
