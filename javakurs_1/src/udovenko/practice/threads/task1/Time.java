package udovenko.practice.threads.task1;

import java.util.*;

/**
 * Created by Александр on 07.10.2016.
 *
 * поисправлять ошибки. объяснить почему contains вфдает разные результаты
 */
/*Разные результаты contains связаны с тем, что во втором случаи искомых значений нет
 и вынужден просматривать весь список*/
public class Time {

   public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        HashSet<Integer> set = new HashSet<>();
        TreeSet<Integer> set2 = new TreeSet<>();

        long time = addTimeList(list);
        long time2 = addTimeList(list2);

        long time3 = addTimeSet(set);
        long time4 = addTimeSet(set2);

        System.out.println("ArrayList add - " + time);
        System.out.println("LinkedList add - " + time2);
        System.out.println("HashSet add - " + time3);
        System.out.println("TreeSet add - " + time4);

        time = searchTimeList(list);
        time2 = searchTimeList(list2);

        time3 = searchTimeSet(set);
        time4 = searchTimeSet(set2);

        System.out.println("ArrayList contains - " + time);
        System.out.println("LinkedList contains - " + time2);
        System.out.println("HashSet contains - " + time3);
        System.out.println("TreeSet contains - " + time4);

        time = removeTimeList(list);
        time2 = removeTimeList(list2);

        time3 = removeTimeSet(set);
        time4 = removeTimeSet(set2);

        System.out.println("ArrayList remove - " + time);
        System.out.println("LinkedList remove - " + time2);
        System.out.println("HashSet remove - " + time3);
        System.out.println("TreeSet remove - " + time4);

        time = searchTimeList(list);
        time2 = searchTimeList(list2);

        time3 = searchTimeSet(set);
        time4 = searchTimeSet(set2);

        System.out.println("ArrayList contains - " + time);
        System.out.println("LinkedList contains - " + time2);
        System.out.println("HashSet contains - " + time3);
        System.out.println("TreeSet contains - " + time4);
    }

    public  static long addTimeList(List<Integer> list) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }

        long end = System.currentTimeMillis() - start;

        return end;
    }


    public static long addTimeSet(Set<Integer> set) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            set.add(i);
        }

        long end = System.currentTimeMillis() - start;

        return end;

    }

    public static long removeTimeList(List<Integer> list) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            list.remove(i);
        }

        long end = System.currentTimeMillis() - start;

        return end;

    }

    public static long removeTimeSet(Set<Integer> set) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            set.remove(i);
        }

        long end = System.currentTimeMillis() - start;

        return end;

    }

    public static long searchTimeList(List<Integer> list) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            list.contains(i);
        }

        long end = System.currentTimeMillis() - start;

        return end;
    }

    public  static long searchTimeSet(Set<Integer> set) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            set.contains(i);
        }

        long end = System.currentTimeMillis() - start;

        return end;

    }
}
