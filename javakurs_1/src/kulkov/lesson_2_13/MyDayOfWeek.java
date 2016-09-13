package kulkov.lesson_2_13;

/**
 * Created by User on 12.09.2016.
 * Days of a week
 */
public enum MyDayOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public void nextDay() {         //Print the next constant to console
        try {
            MyDayOfWeek day = MyDayOfWeek.values()[ordinal() + 1];      //Unless calling constant was the last in enum
            System.out.println(day);                                    //Print the next one addressing to its ordinal
        } catch (ArrayIndexOutOfBoundsException e) {
            MyDayOfWeek day = MyDayOfWeek.values()[0];                  //Else exception will be thrown
            System.out.println(day);                                    //Handle it by printing the first constant to the console
        }
    }
}
