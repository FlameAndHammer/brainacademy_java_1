package spring.solutions.task1.formula1.race;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.solutions.task1.formula1.car.RacingCar;
import spring.solutions.task1.formula1.car.impl.FerrariRacingCar;
import spring.solutions.task1.formula1.marshal.impl.ChequeredFlagMarshal;


/**

 */
public class Race {

    private ChequeredFlagMarshal marshal = new ChequeredFlagMarshal();
    private RacingCar racingCar;

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

    private void startCar(RacingCar racingCar) {
        racingCar.start();
        racingCar.drive();
        racingCar.pitStop();
        racingCar.finish();
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/task1-context.xml");
        Race race = (Race) context.getBean(Race.class);
        context.getAutowireCapableBeanFactory().autowireBean(race);
        race.setRacingCar((RacingCar) context.getBean("ferrari"));
        race.race();
    }

    public void setRacingCar(RacingCar racingCar) {
        this.racingCar = racingCar;
    }

    public RacingCar getRacingCar() {
        return racingCar;
    }
}
