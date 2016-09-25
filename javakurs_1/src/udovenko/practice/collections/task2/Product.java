package udovenko.practice.collections.task2;

import java.util.Date;

/**
 * @author ANikulin
 */
public class Product implements Comparable {
    public String name; // can't be changed
    public Date expirationDate;

    public Product(Integer name, Date expirationDate) {
        this.name = Integer.toString(name);
        this.expirationDate = expirationDate;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + expirationDate.hashCode();
        return result;
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
    public int compareTo(Object o) {
        return expirationDate.compareTo(((Product)o).expirationDate);
    }
}
