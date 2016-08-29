package mitrofanov.Lesson_2_7_1;

class Flight extends Vehicle{
    Flight() {
        wheels = 3;
        placeOfMoving = "Sky";
        numberOfPassengers = 150;
    }
    public void move (){
        System.out.println("I'm moving on the " + placeOfMoving + " without wheels, with " + numberOfPassengers + " passengers");
    }
}
