package tretiak.labworks.work13;


public class Main {
    public static void main(String[] args) {
        for (MyDayOfWeek day : MyDayOfWeek.values()){
            System.out.println(day);
        }
        for (MyDayOfWeek day : MyDayOfWeek.values()){
            switch (day){
                case MONDAY:
                case THURSDAY:
                case FRIDAY:
                    System.out.println("My Java Day: " + day);
                    break;
            }
        }
    }
}
