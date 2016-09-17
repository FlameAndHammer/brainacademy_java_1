package kulkov.lesson_2_12;

/**
 * Created by User on 12.09.2016.
 * Practice with nested classes
 */
class Main {
    public static void main(String[] args) {
        MyPhone phone = new MyPhone();          //Create instance of MyPhone
        phone.switchOn();                       //Fill phone book with contacts
        phone.call(1);                          //View the second contact
    }
}
