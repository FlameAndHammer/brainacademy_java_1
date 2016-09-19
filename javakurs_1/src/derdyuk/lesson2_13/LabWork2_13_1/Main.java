package derdyuk.lesson2_13.LabWork2_13_1;

/**
 * Created by maossi on 12.09.2016.
 */
public class Main {
    public static void main(String[]args){
        for(MyDayOfWeek myday:MyDayOfWeek.values()){
            System.out.println(myday);
        }
        //2_13_2
        System.out.println();
        for(MyDayOfWeek myJavaDay:MyDayOfWeek.values()){
            switch (myJavaDay){
                case MONDEY:
                case THURTHDEY:
                case TUESDAY:
                    System.out.println("My Java days is: " + myJavaDay);
            }
        }

    }
}