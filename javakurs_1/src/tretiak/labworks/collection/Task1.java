package tretiak.labworks.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Maksim on 26.10.2016.
 */
public class Task1 {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++){
            list.add("number_" + i);
        }
        Iterator<String> arrayIterator = list.iterator();
        while(arrayIterator.hasNext()){
            System.out.println(arrayIterator.next());
        }
    }
}
