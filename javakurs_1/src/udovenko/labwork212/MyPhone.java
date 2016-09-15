package udovenko.labwork212;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by gladi on 14.09.2016.
 */
class MyPhone {
    MyPhoneBook mpb;
    public MyPhone() {
    }

    public void swichOn(){
        System.out.println("Loading PhoneBook records…");
        mpb = this.new MyPhoneBook();
        mpb.addPhoneNumber("Petya", "123456");
        mpb.addPhoneNumber("Sasha", "345876");
        mpb.addPhoneNumber("Marina", "964789");
        mpb.addPhoneNumber("Kolya", "345123");
        mpb.addPhoneNumber("Georgi", "345123");
        mpb.addPhoneNumber("Andrey", "329854");
        mpb.addPhoneNumber("Vsevolod", "284319");
        mpb.addPhoneNumber("Nata", "976120");
        mpb.addPhoneNumber("Natasha", "126789");
        mpb.addPhoneNumber("Sergey", "428912");
        mpb.addPhoneNumber("Test", "test");
        System.out.println("Ok");
    }

    public void call(int index){
        if (index < mpb.phoneNumbers.length) {
            System.out.println("Calling to: " + mpb.phoneNumbers[index]);
        }
    }

    class MyPhoneBook {
        private int counter = 0;
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
        class PhoneNumber{
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

    class Camera{};
    class TouchScreen{};
    class PowerOnButton{};
    class PhoneDisplay{};
    class PhoneSpeaker{};
    static class Bluetooth{};
    static class SimCard{};
    static class PhoneBattery{};
    static class PhoneCharger{};

}
