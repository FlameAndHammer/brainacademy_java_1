package vityaz.com.brainacad.oop.testenum1;


enum MyDayOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

        static MyDayOfWeek nextDay (String anyDay){
            if(MyDayOfWeek.valueOf(anyDay).ordinal() == MyDayOfWeek.values().length - 1) return MyDayOfWeek.values()[0];
            else return MyDayOfWeek.values()[MyDayOfWeek.valueOf(anyDay).ordinal() + 1];
        }
    }
