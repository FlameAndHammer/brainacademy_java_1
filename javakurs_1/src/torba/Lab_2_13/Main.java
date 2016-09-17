package torba.Lab_2_13;

public class Main {

    public static void main(String[] args) {

        for (MyDayOfWeek day : MyDayOfWeek.values()) {
            System.out.println(day);
        }

        System.out.println("---------------------------------------------------------------------------");

        for (MyDayOfWeek day : MyDayOfWeek.values()) {
            switch (day) {
                case MONDAY: case WEDNESDAY: case FRIDAY:
                    System.out.println("My Java day: " + day);
                    break;
            }
        }

        System.out.println("---------------------------------------------------------------------------");

        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Input a day");
        String str = sc.nextLine();
        System.out.println(MyDayOfWeek.valueOf(str.trim().toUpperCase()).getNextDay());

    }

}
