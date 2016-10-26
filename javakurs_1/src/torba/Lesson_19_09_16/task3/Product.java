package torba.Lesson_19_09_16.task3;

/**
 * @author ANikulin
 */
public class Product {

    private int price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return price == product.price;

    }

    @Override
    public int hashCode() {
        if (price == 100) {return (int) (Math.random()*1000);}
        else {return 0;}
    }

    public Product(int price) {
        this.price = price;
    }
}
