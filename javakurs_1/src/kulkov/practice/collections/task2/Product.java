package kulkov.practice.collections.task2;

import java.util.Date;

/**
 * @author ANikulin
 */
class Product implements Comparable {
    public String name; // can't be changed
    public Date expirationDate;

    public Product(Integer i, Date date) {
        this.name = i.toString();
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

    public int hashCode() {
        int result = 1;
        result = 31 * result + name.hashCode();
        result = 31 * result + expirationDate.hashCode();
        return result;
    }

    @Override
    public int compareTo(Object o) {
        Product product = (Product) o;
        if (name.hashCode() > product.name.hashCode()) {
            return 1;
        } else if (name.hashCode() < product.name.hashCode()){
            return -1;
        } else {
            return 0;
        }
    }
}
