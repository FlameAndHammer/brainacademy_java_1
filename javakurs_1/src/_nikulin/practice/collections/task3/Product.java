package _nikulin.practice.collections.task3;

/**
 * @author ANikulin
 */
public class Product {
    private int price;

    public Product(int price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        return (int)(Math.random() * price /10);
    }
}
