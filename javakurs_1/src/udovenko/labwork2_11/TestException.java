package udovenko.labwork2_11;

/**
 * Created by gladi on 31.08.2016.
 */
public class TestException {
    public static void main(String[] args) {
        //Lab Work 2-11-1
        try {
            throw new Exception("Lab Work 2-11-1");
        }catch (Exception e1) {
            System.out.println(e1.getMessage());
        } finally {
            System.out.println("Lab Work 2-11-1: finally");
        }

        //Lab Work 2-11-2
        MyTest test1 = new MyTest();
        try {
            test1.test();
        }catch (MyException me){
            me.outMessage();
        }

        MyTest test2 = null;
        try {
            test1.test();
        }catch (Exception e2){
            System.out.println("test2 have exception");
            e2.printStackTrace();
        }

        //Lab Work 2-11-3
        Person pr = new Person();
        try {
            int age = 125;
            pr.setAge(age);
            System.out.println(pr.getAge());
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
