package mitrofanov.Lesson_2_7_1;

class Truck extends Vehicle{
    Truck() {
        wheels = 8;
        placeOfMoving = "Ground";
        numberOfPassengers = 0;
    }
    public void move (){
        System.out.println("I'm moving on the " + placeOfMoving + " at " + wheels + " wheels, without passengers");
    }
}
