package spring.templates.formula1.race;

import spring.templates.formula1.car.impl.FerrariRacingCar;
import spring.templates.formula1.marshal.impl.ChequeredFlagMarshal;


/**
 *
 */
public class Race {

    private ChequeredFlagMarshal marshal = new ChequeredFlagMarshal();
    private FerrariRacingCar racingCar = new FerrariRacingCar();

    private void race() {
        System.out.println("----------------------------------");
        System.out.println("START RACE");
        marshal.showFlag();

        System.out.println("RACING CARS ARE STARTING");
        startCar(racingCar);
        System.out.println("RACING CARS ARE FINISHING");

        marshal.showFlag();
        System.out.println("RACING CARS FINISHED");
        System.out.println("----------------------------------");
    }

    private void startCar(FerrariRacingCar racingCar) {
        racingCar.start();
        racingCar.drive();
        racingCar.pitStop();
        racingCar.finish();
    }

    public static void main(String[] args) {
        new Race().race();
    }
}
