package udovenko.labwork212;

/**
 * Created by gladi on 12.09.2016.
 */
class MyPhoneBook {
    private static int counter = 0;
    private PhoneNumber[] phoneNumbers = new PhoneNumber[10];

    public void addPhoneNumber(String name, String phone){
        PhoneNumber phoneNumber = new PhoneNumber(name, phone);
        phoneNumbers[counter] = phoneNumber;
        counter++;
    }

    public void printPhoneBook(){
        for (int i = 0; i < counter; i++){
            System.out.println(phoneNumbers[i]);
        }
    }

    static class PhoneNumber{
        private String name;
        private String phone;

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
        public String toString(){
            return name + ", phone: " + phone;
        }
    }
}
