package derdyuk.lesson2_12.LabWork2_12_1_2;


/**
 * Created by maossi on 18.09.2016.
 */
public class Main {
    public static void main (String[] args){
        MyPhoneBook phone = new MyPhoneBook();
        phone.addPhoneNumber("Ira", "666666");
        phone.addPhoneNumber("Vasya", "352613");
        phone.addPhoneNumber("Tolya", "456987");
        phone.addPhoneNumber("Ruslan", "356457");
        phone.addPhoneNumber("Kolya", "856658");
        phone.addPhoneNumber("Fedya", "234125");
        phone.addPhoneNumber("Natasha", "745547");
        phone.addPhoneNumber("Sveta", "654145");
        phone.addPhoneNumber("Olesya", "478954");
        phone.addPhoneNumber("Yulija", "546698");
        phone.sortByName();
        phone.printPhoneBook();
        System.out.println();
        phone.sortByNumber();
        phone.printPhoneBook();

//        phone.sortByName();





    }
}
