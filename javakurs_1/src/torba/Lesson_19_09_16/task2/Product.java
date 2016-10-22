package torba.Lesson_19_09_16.task2;

import java.util.Date;

/**
 * @author ANikulin
 */
public class Product implements Comparable {
    public String name; // can't be changed
    public Date expirationDate;

    public int compareTo(Object o) {
        return name.compareTo(((Product)o).name);
    }

    public Product(int i, Date date) {
        name = String.valueOf(i);
        expirationDate = date;
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

        if ( (name.equals(product.name)) && (expirationDate.equals(product.expirationDate)) ) {
            System.out.println("!!!");
            return true;
        }
        else {return false;}
        //return expirationDate != null ? expirationDate.equals(product.expirationDate) : product.expirationDate == null;

    }
}
