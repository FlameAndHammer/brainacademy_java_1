package udovenko.lesson11;

/**
 * Created by gladi on 24.08.2016.
 */
abstract class Vevicle {
    public abstract void move();
}

abstract class Car extends Vevicle{
}

class SportCar extends Car implements Turbo{
    @Override
    public void move(){
        System.out.println("SportCar move");
    }

    @Override
    public void doTurbo() {
        System.out.println("Speed increased " + incrieseSpeed + " times");
    }
}

public class Main {
    public static void main(String[] arg){
        Turbo myCar = new SportCar();
        //myCar.move();
        myCar.doTurbo();

    }
}
