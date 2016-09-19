package _nikulin.practice.collections.task2;

import java.util.Date;

/**
 * @author ANikulin
 */
public class Product implements Comparable {
    public String name; // can't be changed
    public Date expirationDate;

    public Product(int i, Date date) {
        this.name = Integer.toString(i);
        this.expirationDate = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (name != null ? !name.equals(product.name) : product.name != null) {
            return false;
        }
        return expirationDate != null ? expirationDate.equals(product.expirationDate) : product.expirationDate == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (expirationDate != null ? expirationDate.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Object o) {
        return expirationDate.compareTo(((Product) o).expirationDate);
    }
}
