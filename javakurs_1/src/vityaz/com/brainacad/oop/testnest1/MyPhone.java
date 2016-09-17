package vityaz.com.brainacad.oop.testnest1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MyPhone {
    public MyPhone() {
    }

    MyPhoneBook phoneBook = new MyPhoneBook();
    public void swichOn(){
        System.out.println("Loading PhoneBook records...");
        phoneBook.addPhoneNumber("Petya", "0671234567");
        phoneBook.addPhoneNumber("Kolya", "0671234207");
        phoneBook.addPhoneNumber("Sergiy", "0671094567");
        phoneBook.addPhoneNumber("Arkadiy", "0975064561");
        phoneBook.addPhoneNumber("Mikhail", "0635520022");
        phoneBook.addPhoneNumber("Ivan", "0508181234");
        phoneBook.addPhoneNumber("Mariya", "0506181881");
        phoneBook.addPhoneNumber("Alexandr", "0679119000");
        phoneBook.addPhoneNumber("Tatyana", "0985001020");
        phoneBook.addPhoneNumber("Roman", "0963331150");
        phoneBook.sortByName();
        System.out.println("OK!");
    }
    public void call(){
        System.out.print("select subscriber number ");
        Scanner sc = new Scanner(System.in);
        int choise = sc.nextInt();
        System.out.println("Calling to: " + phoneBook.phoneNumbers[choise - 1]);
    }
    class MyPhoneBook {
        int phoneNumbersIndex = 0;
        private PhoneNumber[] phoneNumbers = new PhoneNumber[10];

        public void addPhoneNumber(String name, String phone){
            phoneNumbers[phoneNumbersIndex] = new PhoneNumber(name, phone);
            phoneNumbersIndex ++;
        }

        public void printPhoneBook(){
            for(int i = 0; i < phoneNumbersIndex; i++){
                System.out.print(i + 1 + " ");
                System.out.println(phoneNumbers[i]);
            }
        }

        public void sortByName(){
            Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
                @Override
                public int compare(PhoneNumber o1, PhoneNumber o2) {
                    if(o1 == null)return 1;
                    if(o2 == null)return -1;
                    return o1.getName().compareTo(o2.getName());
                }
            });
            phoneBook.printPhoneBook();
        }

        public void sortByPhoneNumber(){
            Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
                @Override
                public int compare(PhoneNumber o1, PhoneNumber o2) {
                    if(o1 == null)return 1;
                    if(o2 == null)return -1;
                    return o1.getPhone().compareTo(o2.getPhone());
                }
            });
            phoneBook.printPhoneBook();
        }


        public class PhoneNumber{
            String name;
            String phone;

            public PhoneNumber(String name, String phone) {
                this.name = name;
                this.phone = phone;
            }

            public String getName() {
                return name;
            }

            public String getPhone() {
                return phone;
            }

            @Override
            public String toString() {
                return "Name='" + name + '\'' + ", Phone='" + phone + '\'' + '}';
            }
        }
    }
}
