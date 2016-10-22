package spring.solutions.task1.formula1.car.impl;

import spring.solutions.task1.formula1.car.RacingCar;

import java.util.Random;

/**

 */
public class McLarenRacingCar implements RacingCar {

    private int random;

    public McLarenRacingCar() {
        random = new Random().nextInt(10);
    }

    public void start() {
        System.out.println("McLaren: I started " + random + "th");
    }

    public void drive() {
        System.out.println("McLaren: I'm driving");
    }

    public void finish() {
        System.out.println("McLaren: I finished " + random + "th");
    }

    public void pitStop() {
        System.out.println("McLaren: I'm on pit stop");
    }

    @Override
    public String teamName() {
        return "McLaren";
    }
}
