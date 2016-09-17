package udovenko.labwork212;

/**
 * Created by gladi on 12.09.2016.
 */
public class TestNested {
    public static void main(String[] args) {
        MyPhoneBook phoneBook = new MyPhoneBook();
        phoneBook.addPhoneNumber("Petya", "123456");        //Lab Work 2-12-1
        phoneBook.addPhoneNumber("Sasha", "345876");
        phoneBook.addPhoneNumber("Marina", "964789");
        phoneBook.addPhoneNumber("Kolya", "345123");
        phoneBook.addPhoneNumber("Georgi", "345123");
        phoneBook.addPhoneNumber("Andrey", "329854");       //Lab Work 2-12-2
        phoneBook.addPhoneNumber("Vsevolod", "284319");
        phoneBook.addPhoneNumber("Nata", "976120");
        phoneBook.addPhoneNumber("Natasha", "126789");
        phoneBook.addPhoneNumber("Sergey", "428912");
        phoneBook.addPhoneNumber("Test", "test");

        //Lab Work 2-12-1
        System.out.println("Print unsorted phone book");
        phoneBook.printPhoneBook();

        //lab Work 2-12-2
        System.out.println();
        System.out.println("Print sorted by name phone book");
        phoneBook.sortByName();
        phoneBook.printPhoneBook();

        System.out.println();
        System.out.println("Print sorted by phone number book");
        phoneBook.sortByPhoneNumber();
        phoneBook.printPhoneBook();

        //Lab Work 2-12-3
        MyPhone mp1 = new MyPhone();
        mp1.swichOn();
        mp1.call(5);
    }
}
