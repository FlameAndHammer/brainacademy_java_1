package udovenko.labwork38.labwork3_8_1;

/**
 * Created by gladi on 16.11.2016.
 */
public class DemoSocet {
    public static void main(String[] args) {
        MyClient client = new MyClient(new Student("Ivan", "first"));
        MyServer server = new MyServer();
        new Thread(server).start();
        new Thread(client).start();
    }
}
