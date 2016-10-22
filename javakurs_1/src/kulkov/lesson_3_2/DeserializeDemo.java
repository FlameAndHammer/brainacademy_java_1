package kulkov.lesson_3_2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by User on 19.10.2016.
 * Deserialize class
 */
public class DeserializeDemo {
    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(          //Wrap file input stream by object input stream
                new FileInputStream("./javakurs_1/src/kulkov/lesson_3_2/employee.ser"))) {
            System.out.println(in.readObject());                    //Read info about class employee and print it to the console
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
