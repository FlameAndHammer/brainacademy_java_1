package torba.Lab_2_15.task2;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        List list = new LinkedList<String>();

        for (int i = 0; i <= 10; i++) {
            list.add("");
        }

        for (int i = 0; i <= 10; i++) {

            String value = "number_" + i;

            int index = (int) (Math.random() * 11);
            while (true) {

                if (list.get(index).equals("")) {
                    break;
                }

                index = (int) (Math.random() * 11);
            }

            list.set(index, value);

        }

        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}
