package torba.Lab_2_12;

public class Main {

    public static void main(String[] args) {

        MyPhoneBoook pb = new MyPhoneBoook();
        pb.addPhoneNumber("Ivanov","111111");
        pb.addPhoneNumber("Petrov","555555");
        pb.addPhoneNumber("Sidorov","333333");
        pb.addPhoneNumber("Pupkin","444444");
        pb.addPhoneNumber("Popandopulo","222222");
        pb.printPhoneBook();

        System.out.println("-------------------------------------------------------------------------------------");
        pb.sortByName();
        pb.printPhoneBook();

        System.out.println("-------------------------------------------------------------------------------------");
        pb.sortByPhoneNumber();
        pb.printPhoneBook();

        System.out.println("-------------------------------------------------------------------------------------");
        MyPhone mp = new MyPhone();
        mp.switchOn();
        mp.call(1);

        System.out.println("-------------------------------------------------------------------------------------");
        MyTestClass mtc = new MyTestClass();
        MyTestClass.MyStaticNested msn = new MyTestClass.MyStaticNested();
        int z = msn.i;
        System.out.println(z);
        MyTestClass.MyInner mi = mtc.new MyInner();
        z = mi.i;
        System.out.println(z);

        System.out.println(mi.getI());


    }

}
