package torba.Lab_2_12;

public class MyPhone {

    private MyPhoneBook pb;

    public MyPhone() {}

    class MyPhoneBook {

        private int size = 0;

        class PhoneNumber {
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

    public void switchOn() {

        System.out.println("Loading phone book records ...");
        pb = new MyPhoneBook();
        pb.addPhoneNumber("Ivanov","111111");
        pb.addPhoneNumber("Petrov","555555");
        pb.addPhoneNumber("Sidorov","333333");
        pb.addPhoneNumber("Pupkin","444444");
        pb.addPhoneNumber("Popandopulo","222222");
        System.out.println("OK!");

    }

    public void call(int index) {
        if (index >= pb.size) {
            System.out.println("Incorrect abonent index");
        }
        else {
            System.out.println("Calling to: "+pb.phoneNumbers[index]);
        }
    }


}
