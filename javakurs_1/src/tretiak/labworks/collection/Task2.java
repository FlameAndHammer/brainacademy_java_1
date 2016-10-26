package tretiak.labworks.collection;


import java.util.*;

import static java.lang.StrictMath.abs;

public class Task2 {
    public static void main(String[] args){
        final Random random = new Random();
        List<String> list = new LinkedList<String>();
        for (int i = 0; i <= 10; i++){
            list.add(random.nextInt(list.size() + 1),"number_" + i);
        }
        Iterator<String> linkedIterator = list.iterator();
        while(linkedIterator.hasNext()){
            System.out.println(linkedIterator.next());
        }
    }
}
