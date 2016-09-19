package torba.lesson_12_09_16;

public class Main {

    public static void main(String[] args) {

        MyPhoneBoook pb = new MyPhoneBoook();
        pb.addPhoneNumber("Ivanov","111111");
        pb.addPhoneNumber("Petrov","222222");
        pb.addPhoneNumber("Sidorov","333333");
        pb.addPhoneNumber("Pupkin","444444");
        pb.addPhoneNumber("Popandopulo","555555");
        pb.printPhoneBook();
    }

}
