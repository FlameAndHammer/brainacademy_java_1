package udovenko.practice.collections.task3;

import java.util.Random;

/**
 * @author ANikulin
 */
public class Product implements Comparable {
    private int price;

    public Product(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return price == product.price;

    }

    @Override
    public int hashCode() {
        Random rnd = new Random();
        return rnd.nextInt();
    }

    @Override
    public int compareTo(Object o) {
        return price - ((Product)o).price;
    }
}
