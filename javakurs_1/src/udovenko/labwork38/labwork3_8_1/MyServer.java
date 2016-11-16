package udovenko.labwork38.labwork3_8_1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by gladi on 16.11.2016.
 */
public class MyServer implements Runnable {
    @Override
    public void run() {
        System.out.println("Start server");
        try (ServerSocket serverSocket = new ServerSocket(9999)){
            System.out.println("Server waits...");
            Socket socket = serverSocket.accept();
            System.out.println("Server connected");

            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            Student student = (Student) ois.readObject();
            System.out.println("Server receive: " + student);
            student.setName(student.getName() + "_Ser");

            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(student);
            System.out.println("Server write data");
            oos.flush();
            ois.close();
            oos.close();

            System.out.println("Server closed");
        } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
        }
    }
}
