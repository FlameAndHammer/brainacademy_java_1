package kulkov.lesson_2_12;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by User on 13.09.2016.
 */
public class MyPhone {

    static class MyPhoneBook {
        private int lastPhoneNumber;                                            //Contact counter
        private static PhoneNumber[] phoneNumbers = new PhoneNumber[10];        //Phone book can comprise up to 10 contacts

        public static PhoneNumber[] getPhoneNumbers() {
            return phoneNumbers;
        }

        class PhoneNumber {
            //Fields
            private String name;
            private String phone;
            //Getters and setters
            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }
            //Constructor
            public PhoneNumber(String name, String phone) {
                this.name = name;
                this.phone = phone;
            }

            @Override
            public String toString() {                                          //Return information about contact
                return "Name: " + name + ", phone: " + phone;
            }
        }

        public void addPhoneNumber(String name, String phone) {
            try {
                phoneNumbers[lastPhoneNumber] = new PhoneNumber(name, phone);   //Add new contact to phone book
                lastPhoneNumber++;                                              //We can use this counter to create our own exceptions
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Phone book is full");
            }

        }

        public void printPhoneBook() {
            for (int i = 0; i < lastPhoneNumber; i++) {                         //No need to bother about NullPointerException this time
                System.out.println(phoneNumbers[i]);                            //Print contacts info to console
            }
        }

        public void sortByName() {
            try {
                Arrays.sort(this.phoneNumbers, new Comparator() {               //Use anonymous Comparator class to sort phone book
                    @Override
                    public int compare(Object o1, Object o2) {
                        PhoneNumber p1 = (PhoneNumber) o1;                      //Typecast from Object to PhoneNumber
                        PhoneNumber p2 = (PhoneNumber) o2;                      //Next time we would use generics to avoid this
                        return p1.name.compareTo(p2.name);                      //Compare strings
                    }
                });
            } catch (NullPointerException e) {                                  //If not every element of array are fill, NullPointerException will be thrown
                return;                                                         //When this happen we should end sorting
            }
        }

        public void sortByPhoneNumber() {
            try {
                Arrays.sort(this.phoneNumbers, new Comparator() {
                    @Override
                    public int compare(Object o1, Object o2) {
                        PhoneNumber p1 = (PhoneNumber) o1;
                        PhoneNumber p2 = (PhoneNumber) o2;
                        return p1.phone.compareTo(p2.phone);
                    }
                });
            } catch (NullPointerException e) {
                return;
            }
        }
    }

    public void switchOn() {
        System.out.print("Loading PhoneBook records...");
        MyPhoneBook pb = new MyPhoneBook();                                     //Create instance of PhoneBook and fill it with contacts
        pb.addPhoneNumber("Alex", "215135");                                    //Not an excellent designer choice though
        pb.addPhoneNumber("Ivan", "564874");                                    //We would never be able to refer to phone book outside the method
        pb.addPhoneNumber("Peter", "294272");                                   //Unless we make PhoneNumber[] static variable
        pb.addPhoneNumber("Victor", "156392");                                  //Thus we need to make inner class MyPhoneBook static too
        pb.addPhoneNumber("Steve", "365015");
        pb.addPhoneNumber("John", "843409");
        pb.addPhoneNumber("Richard", "326437");
        pb.addPhoneNumber("Alice", "783248");
        System.out.println(" OK!");
    }

    public void call(int i) {
        try {                                                                   //Print the information about specified contact
            System.out.println("Calling to: " + MyPhoneBook.getPhoneNumbers()[i].toString());
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {     //Just in case somebody will try to get a nonexistent contact
            System.out.println("Phone book does not contain such contact");
        }
    }
}
