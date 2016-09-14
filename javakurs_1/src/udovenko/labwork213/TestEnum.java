package udovenko.labwork213;

import java.util.Scanner;

/**
 * Created by gladi on 12.09.2016.
 */
public class TestEnum {
    public static void main(String[] args) {
//        Lab Work 2-13-1
        System.out.println("Lab Work 2-13-1");
        for (MyDayOfWeek e: MyDayOfWeek.values()){
            System.out.println(e);
        }

//        Lab Work 2-13-2
        System.out.println("Lab Work 2-13-2");
        System.out.print("My Java classes on ");
        for (MyDayOfWeek e:MyDayOfWeek.values()) {
            switch (e){
                case MONDAY:case WEDNESDAY:
                    System.out.print(e + ", ");
                    break;
                case FRIDAY:
                    System.out.println(e);
            }
        }

//        Lab Work 2-13-3
        System.out.println("Lab Work 2-13-3");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter day of week");
        boolean right = false;
        while (!right) {
            try {
                MyDayOfWeek mdw = MyDayOfWeek.valueOf(sc.next().toUpperCase());
                System.out.println("The next day of week: " + mdw.nextDay());
                right = true;
            } catch (IllegalArgumentException iae) {
                System.out.println("No such day of the week. Try again.");
            }
        }
    }
}
