package tretiak.labworks.collection;


import java.util.*;

public class Task3 {
    public static void main(String[] args){
        List<String> arrayList = new ArrayList<String>();
        for (int i = 0; i < 10; i++){
            arrayList.add("number_" + i);
        }
        List<String> linkedList = new LinkedList<String>();
        for (int i = 0; i <= 10; i++) {
            linkedList.add(i, "number_" + i);
        }
        ListIterator<String> listArrItr = arrayList.listIterator(), listLinkItr = linkedList.listIterator();
        while (listLinkItr.hasNext()) {
            listArrItr.add(listLinkItr.next());
        }
        while(listArrItr.hasPrevious()){
            listLinkItr.add(listArrItr.previous());
        }
        printElements(linkedList);
    }

    private static <E> void printElements(List <E> list) {
        Iterator<E> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
