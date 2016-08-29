package mitrofanov.Lesson_2_7_1;

class Ship extends Vehicle{
    Ship() {
        wheels = 0;
        placeOfMoving = "Water";
        numberOfPassengers = 500;
    }
    public void move (){
        System.out.println("I'm moving on the " + placeOfMoving + " without wheels, with " + numberOfPassengers + " passengers");
    }
}
