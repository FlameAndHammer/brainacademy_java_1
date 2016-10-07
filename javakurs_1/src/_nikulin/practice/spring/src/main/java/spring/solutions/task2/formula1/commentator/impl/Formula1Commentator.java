package spring.solutions.task2.formula1.commentator.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.solutions.task2.formula1.car.RacingCar;
import spring.solutions.task2.formula1.commentator.Commentator;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 */
public class Formula1Commentator implements Commentator {

    private List<String> wordsToSpeak;

    private String speechToIntroduce;

    private int numberOfRace;

    private List<RacingCar> racingCars;

    public void init(){
        introduce();
        speak();
        yell();
    }

    @Override
    public void introduce() {
        System.out.println("Commentator: " + speechToIntroduce);
    }

    @Override
    public void speak() {
        System.out.println("Commentator: Today is " + numberOfRace + "th of this year Formula 1 season");
        wordsToSpeak.forEach(s -> System.out.println("Commentator: " + s));
    }

    @Override
    public void yell() {
        List<String> teamNames = racingCars.stream().map(RacingCar::teamName).collect(Collectors.toList());
        System.out.println("Commentator: today such teams are taking part in competition : " + teamNames);
    }

    public Formula1Commentator setWordsToSpeak(List<String> wordsToSpeak) {
        this.wordsToSpeak = wordsToSpeak;
        return this;
    }

    public Formula1Commentator setSpeechToIntroduce(String speechToIntroduce) {
        this.speechToIntroduce = speechToIntroduce;
        return this;
    }

    public Formula1Commentator setNumberOfRace(int numberOfRace) {
        this.numberOfRace = numberOfRace;
        return this;
    }

    public Formula1Commentator setRacingCars(List<RacingCar> racingCars) {
        this.racingCars = racingCars;
        return this;
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("/task2-context.xml");
    }
}
