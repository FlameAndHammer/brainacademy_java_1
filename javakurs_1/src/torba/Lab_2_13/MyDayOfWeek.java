package torba.Lab_2_13;

public enum MyDayOfWeek {

    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public MyDayOfWeek getNextDay() {
        int index = ordinal();
        int index1;
        if (index < 6 ) {index1 = index + 1;} else {index1 = 1;}
        for (MyDayOfWeek day : MyDayOfWeek.values()) {
            if (day.ordinal() == index1) {return day;}
        }
        return null;
    }

}
