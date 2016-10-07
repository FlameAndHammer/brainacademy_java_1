package spring.solutions.task1.formula1.car.impl;


import spring.solutions.task1.formula1.car.RacingCar;

import java.util.Random;

/**

 */
public class FerrariRacingCar implements RacingCar {

    private int random;

    public FerrariRacingCar() {
        this.random = new Random(10).nextInt();
    }

    public void start() {
        System.out.println("Ferrari: I started " + random + "th");
    }

    public void drive() {
        System.out.println("Ferrari: I'm driving");
    }

    public void finish() {
        System.out.println("Ferrari: I finished " + random + "th");
    }

    public void pitStop() {
        System.out.println("Ferrari: I'm on pit stop");
    }

    @Override
    public String teamName() {
        return "Ferrari";
    }
}
