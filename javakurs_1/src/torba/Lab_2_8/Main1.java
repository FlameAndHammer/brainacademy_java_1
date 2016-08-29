package torba.Lab_2_8;

import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;

abstract class Vehicle{
    public abstract void move();
}

abstract class Car extends Vehicle{
}

interface MoveAble{
    void useTurbo();
}

class SportCar extends Car implements MoveAble{
    @Override
    public void move(){
        System.out.println("SportCar move");
    }
    public void useTurbo(){
        System.out.println("SportCar use turbo");
    }
}

public class Main1 {

    public static void main(String[] args){
        Car myCar1 = new SportCar();
        myCar1.move();
        MoveAble myCar2 = new SportCar();
        myCar2.useTurbo();
    }

}
