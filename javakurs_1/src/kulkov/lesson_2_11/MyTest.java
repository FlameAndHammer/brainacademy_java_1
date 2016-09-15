package kulkov.lesson_2_11;

/**
 * Created by User on 04.09.2016.
 * Testing try-catch block inside a method
 */
class MyTest {
    public void test() {
        try {
            throw new MyException("Test");          //Create exception instance
        } catch (MyException e) {
            System.out.println(e.getMessage());     //Handle with it
        }
    }
}
