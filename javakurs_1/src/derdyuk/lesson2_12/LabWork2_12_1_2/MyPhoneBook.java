package derdyuk.lesson2_12.LabWork2_12_1_2;


import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by maossi on 12.09.2016.
 */
public class MyPhoneBook {
    int phoneNumberInd;
    private static PhoneNumber[] phoneNumbers = new PhoneNumber[10];

    private static PhoneNumber[] getPhoneNumbers() {
        return phoneNumbers;
    }

    public void addPhoneNumber(String name, String phone){
        phoneNumbers[phoneNumberInd] = new PhoneNumber(name, phone);
        phoneNumberInd++;

    }
    public void printPhoneBook(){
        for (int i=0; i<phoneNumberInd; i++){
            System.out.println(phoneNumbers[i]);
        }
    }



     class PhoneNumber{
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

         public void setName(String name) {
             this.name = name;
         }

         public void setPhone(String phone) {
             this.phone = phone;
         }

         @Override
        public String toString(){
            return "Name: "+ name + ", Phone: " + phone;
        }
     }


    public  void sortByName(){

        Arrays.sort(this.phoneNumbers, new Comparator() {

                    @Override
                    public int compare(Object o1, Object o2) {
                        PhoneNumber q1 = (PhoneNumber)o1;
                        PhoneNumber q2 = (PhoneNumber) o2;
                        return q1.name.compareTo(q2.name);

                    }
                });
    }
    public  void sortByNumber(){
        Arrays.sort(this.phoneNumbers, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                PhoneNumber q1 = (PhoneNumber)o1;
                PhoneNumber q2 = (PhoneNumber)o2;
                return q1.phone.compareTo(q2.phone);

            }
        });
    }


}

