package udovenko.labwork212;

/**
 * Created by gladi on 12.09.2016.
 */
public class TestNested {
    public static void main(String[] args) {
        MyPhoneBook phoneBook = new MyPhoneBook();
        phoneBook.addPhoneNumber("Petya", "123-456");
        phoneBook.addPhoneNumber("Sasha", "345-876");
        phoneBook.addPhoneNumber("Marina", "964-789");
        phoneBook.addPhoneNumber("Kolya", "345-123");
        phoneBook.addPhoneNumber("Georgiy", "345-123");

        phoneBook.printPhoneBook();
    }
}
