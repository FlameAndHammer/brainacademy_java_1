package kulkov.lesson_2_12;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by User on 13.09.2016.
 * Describing phone by nested classes
 */
class MyPhone {
    private MyPhoneBook phoneBook = new MyPhoneBook();

    static class MyPhoneBook {
        private int lastPhoneNumber;                                            //Contact counter
        private PhoneNumber[] phoneNumbers = new PhoneNumber[10];               //Phone book can comprise up to 10 contacts

        public PhoneNumber[] getPhoneNumbers() {
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

    public void switchOn() {                                                    //Fill phone book with contacts
        System.out.print("Loading PhoneBook records...");
        phoneBook.addPhoneNumber("Alex", "215135");
        phoneBook.addPhoneNumber("Ivan", "564874");
        phoneBook.addPhoneNumber("Peter", "294272");
        phoneBook.addPhoneNumber("Victor", "156392");
        phoneBook.addPhoneNumber("Steve", "365015");
        phoneBook.addPhoneNumber("John", "843409");
        phoneBook.addPhoneNumber("Richard", "326437");
        phoneBook.addPhoneNumber("Alice", "783248");
        System.out.println(" OK!");
    }

    public void call(int i) {
        try {                                                                   //Print the information about specified contact
            System.out.println("Calling to: " + phoneBook.getPhoneNumbers()[i].toString());
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {     //Just in case somebody will try to get a nonexistent contact
            System.out.println("Phone book does not contain such contact");
        }
    }
}
