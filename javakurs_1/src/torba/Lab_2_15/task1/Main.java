package torba.Lab_2_15.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        List list = new ArrayList<String>();
        for (int i = 0; i <= 10; i++){
            list.add("number_" + i);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}
