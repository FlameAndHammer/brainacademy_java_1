package udovenko.labwork212;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by gladi on 12.09.2016.
 */
class MyPhoneBook {
    private static int counter = 0;
    private PhoneNumber[] phoneNumbers = new PhoneNumber[10];

    public void addPhoneNumber(String name, String phone){             //Lab Work 2-12-1
        if (counter < phoneNumbers.length) {
            PhoneNumber phoneNumber = new PhoneNumber(name, phone);
            phoneNumbers[counter++] = phoneNumber;
        }
    }

    public void printPhoneBook(){                                       //Lab Work 2-12-1
        for (int i = 0; i < counter; i++){
            System.out.println(phoneNumbers[i]);
        }
    }

    public void sortByName(){
        Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>(){

            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                int i = 0;
                while (i < o1.name.length() && i < o2.name.length()){
                    if (o1.name.toLowerCase().charAt(i) > o2.name.toLowerCase().charAt(i))
                        return 1;
                    if (o1.name.toLowerCase().charAt(i) < o2.name.toLowerCase().charAt(i))
                        return -1;
                    i++;
                }
                if (o1.name.length() > o2.name.length())
                    return 1;
                if (o1.name.length() < o2.name.length())
                    return -1;
                return 0;
            }
        });
    }

    public void sortByPhoneNumber(){
        Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return Integer.valueOf(o1.phone) - Integer.valueOf(o2.phone);
            }
        });
    }

    //Lab Work 12-2-1
    private static class PhoneNumber{
        private String name;
        private String phone;

        public PhoneNumber(String name, String phone) {                     //Lab Work 2-12-1
            this.name = name;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }                           //Lab Work 2-12-1

        public String getPhone() {
            return phone;
        }                         //Lab Work 2-12-1

        @Override
        public String toString(){
            return name + ", phone: " + phone;
        }   //Lab Work 2-12-1
    }
}
