package udovenko.practice;

import java.util.Arrays;

/**
 * Created by gladi on 05.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop("Test", 65000, "Odesa", "Deribasovskaya", 5, 2);
        shop.createGood("Bonaqua", "water", 5.76);
        shop.createGood("Bonaqua", "water", 12.50);
    }
}
