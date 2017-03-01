package udovenko.labwork38.labwork3_8_2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by gladi on 16.11.2016.
 */
public class MyClient implements Runnable {
    private Student student;

    public MyClient(Student student) {
        this.student = student;
    }

    @Override
    public void run() {
        System.out.println("Start client");
        try (Socket socket = new Socket("localhost", 9999)){
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(student);
            System.out.println("Client write data");

            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            System.out.println("Client receive: " + (Student)ois.readObject());

            oos.flush();
            oos.close();
            ois.close();
            System.out.println("Client closed");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
