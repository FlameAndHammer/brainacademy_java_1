package torba.Lab_2_12;

public class MyPhoneBoook {

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

    public void sortByName() {
        java.util.Arrays.sort(phoneNumbers,
                              new java.util.Comparator<PhoneNumber>() {
                                    public int compare(PhoneNumber o1, PhoneNumber o2) {
                                        if ((o1 == null) && (o2 == null)) {return 0;}
                                        else if ((o1 != null) && (o2 == null)) {return -1;}
                                        else if ((o1 == null) && (o2 != null)) {return 1;}
                                        else {return ( o1.getName().compareToIgnoreCase(o2.getName()) );}
                                    }
                              }
                              );
    }

    public void sortByPhoneNumber() {
        java.util.Arrays.sort(phoneNumbers,
                              new java.util.Comparator<PhoneNumber>() {
                                     public int compare(PhoneNumber o1, PhoneNumber o2) {
                                         if ((o1 == null) && (o2 == null)) {return 0;}
                                         else if ((o1 != null) && (o2 == null)) {return -1;}
                                         else if ((o1 == null) && (o2 != null)) {return 1;}
                                         else {return ( o1.getPhone().compareToIgnoreCase(o2.getPhone()) );}
                                     }
                }
        );
    }

}
