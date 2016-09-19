package kulkov.practice.collections.task3;

import java.util.Random;

/**
 * @author ANikulin
 */
class Product {
    private int price;

    public Product(int price) {
        this.price = price;
    }

    public int hashCode() {
        int result = 1;
        if (price == 100) {
            Random r = new Random();
            result = r.nextInt(100);
        }
        return result * 31 + price;
    }
}
