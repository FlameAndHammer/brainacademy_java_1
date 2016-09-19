package vityaz.com.brainacad.oop.testenum1;


import java.util.Scanner;

public class Main {
    public static void main(String []args){
        //LabWork 2-13-1
        for (MyDayOfWeek myDayOfWeekElement:MyDayOfWeek.values()){
            System.out.println(myDayOfWeekElement);
        }
        System.out.println();
        //LabWork 2-13-2
        for (MyDayOfWeek myDayOfWeekElement:MyDayOfWeek.values()) {
            switch (myDayOfWeekElement){
                case MONDAY:
                case WEDNESDAY:
                case FRIDAY:
                    System.out.println("My Java Day: " + myDayOfWeekElement);
            }
        }
        System.out.println();

        //LabWork 2-13-3
        System.out.print("enter day of the week ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(input.toUpperCase());
        System.out.println("next day of the week: " + MyDayOfWeek.nextDay(input.toUpperCase()));

    }
}
