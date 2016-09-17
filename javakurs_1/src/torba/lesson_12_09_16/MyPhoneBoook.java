package torba.lesson_12_09_16;

class MyPhoneBoook {

    private int size = 0;

    static class PhoneNumber {
        private String name;
        private String phone;
        PhoneNumber(String n, String p) {
            name = n;
            phone = p;
        }
        String getName() {
            return name;
        }
        String getPhone() {
            return phone;
        }
        @Override
        public String toString() {
            return name+":"+phone;
        }
    }

    private PhoneNumber[] phoneNumbers = new PhoneNumber[10];

    public void addPhoneNumber(String n, String p) {
        phoneNumbers[size] = new PhoneNumber(n, p);
        size = size + 1;
    }

    public void printPhoneBook() {
        for (PhoneNumber el : phoneNumbers) {
            if (el == null) {break;}
            System.out.println(el);
        }
    }

}
