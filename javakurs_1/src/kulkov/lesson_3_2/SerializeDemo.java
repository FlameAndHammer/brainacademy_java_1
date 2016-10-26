package kulkov.lesson_3_2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by User on 19.10.2016.
 * Serialize class
 */
public class SerializeDemo {
    public static void main(String[] args) {
        Employee employee = new Employee("Alex", "SomeCity, AnyStreet", 1120, 555);

        try (ObjectOutputStream out = new ObjectOutputStream(       //Wrap file output stream by object output stream
                new FileOutputStream("./javakurs_1/src/kulkov/lesson_3_2/employee.ser"))) {
            out.writeObject(employee);                              //Write info about class employee to a specified file
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
