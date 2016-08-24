package tretiak.labworks.work1;

public class MainCar{
    public static void main (String[] arg){
        Car[] myCars = new Car[] {new Car(220), new Car(), new SportCar(25), new Truck(), new Tractor(6)};
        myCars[2].setMaxSpeed(400);
        myCars[3].setMaxSpeed(120);
        myCars[4].setMaxSpeed(70);
        for (int i = 0; i < myCars.length; i++){
            System.out.println("Max speed: " + myCars[i].getMaxSpeed());
        }
    }
}
