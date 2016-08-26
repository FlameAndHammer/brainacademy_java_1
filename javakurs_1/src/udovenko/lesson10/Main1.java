package udovenko.lesson10;

import java.util.Random;

class Airplane{
    private int maxSpeed;
    private String nameModel;

    public Airplane(int maxSpeed, String nameModel) {
        this.maxSpeed = maxSpeed;
        this.nameModel = nameModel;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getNameModel() {
        return nameModel;
    }
}

class Airbus extends Airplane{
    private int passengerCapacity;

    public Airbus(int maxSpeed, String nameModel) {
        super(maxSpeed, nameModel);
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
}

class Airfreighter extends Airplane {
    private double cargoCapacity;

    public Airfreighter(int maxSpeed, String nameModel) {
        super(maxSpeed, nameModel);
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Airplane[] myAir = new Airplane[5];
        for (int i = 0; i < 5; i++){
            String model = "model" + (char)i;
            Random rnd = new Random();
            switch (rnd.nextInt(3)){
                case 0: myAir[i] = new Airplane(220, model);
                break;

                case 1: myAir[i] = new Airbus(200, model);
                break;

                case 2: myAir[i] = new Airfreighter(190, model);
                break;
            }

            if (myAir[i] instanceof Airbus){
                Airbus info = (Airbus)myAir[i];
                info.setPassengerCapacity(150);
            }

            if (myAir[i] instanceof Airfreighter){
                Airfreighter info = (Airfreighter)myAir[i];
                info.setCargoCapacity(234.34);
            }
        }
    }
}
