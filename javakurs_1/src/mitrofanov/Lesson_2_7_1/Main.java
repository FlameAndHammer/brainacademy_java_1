package mitrofanov.Lesson_2_7_1;


public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Car(), new Truck(), new Train(), new Ship(), new Flight(), new Ship()};
        for (Vehicle device:vehicles){
            device.move();
        }

    }
}

