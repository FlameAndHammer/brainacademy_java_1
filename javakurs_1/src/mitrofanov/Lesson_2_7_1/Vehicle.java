package mitrofanov.Lesson_2_7_1;

class Vehicle {
    int wheels;
    int numberOfPassengers;
    String placeOfMoving;

    public void move (){
        System.out.println("I'm moving on the " + placeOfMoving + " at " + wheels + " wheels, with " + numberOfPassengers + " passengers");
    }
}
