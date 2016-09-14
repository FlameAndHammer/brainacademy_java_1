package udovenko.labwork213;

/**
 * Created by gladi on 12.09.2016.
 */
enum MyDayOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
//    Lab Work 2-13-3
    public MyDayOfWeek nextDay(){
        return valueOf(values()[(ordinal() + 1)%7].name());
    }
}
