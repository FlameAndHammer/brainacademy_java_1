package _nikulin.practice.collections.task2;

import java.util.Date;

/**
 * @author ANikulin
 */
public class Product {
    public String name; // can't be changed
    public Date expirationDate;

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
}
