package tretiak.labworks.work1;

public class Car {
    private int maxSpeed;
    private int numberOfWheels;
    Car () {
        maxSpeed = 200;
        numberOfWheels = 4;
    }
    Car (int speed){
        maxSpeed = speed;
    }
    Car (int speed, int numberOfWheels){
        this(speed);
        this.numberOfWheels = numberOfWheels;
    }
    public int getMaxSpeed(){
        return  maxSpeed;
    }
    public int getNumberOfWheels(){
        return  numberOfWheels;
    }
    public void setMaxSpeed(int maxSpeed){
        if (maxSpeed > 0 && maxSpeed < 500){
            this.maxSpeed = maxSpeed;
        }
    }
    public void setNumberOfWheels(int numberOfWheels){
        if (numberOfWheels > 3 && numberOfWheels < 26){
            this.numberOfWheels = numberOfWheels;
        }
    }
}
class Truck extends Car{
    private double bodyCapacity;
    Truck (){
        bodyCapacity = 30.0;
    }
    Truck (double bodyCapacity){
        this.bodyCapacity = bodyCapacity;
    }
    public double getBodyCapacity(){
        return bodyCapacity;
    }
}
class Tractor extends Car{
    private double bucketLenght;
    Tractor(){
        bucketLenght = 4;
    }
    Tractor(double bucketLenght){
        this.bucketLenght = bucketLenght;
    }
    public double getBucketLenght(){
        return bucketLenght;
    }
}
class SportCar extends Car{
    private double durationOfNitroOxide;
    SportCar(){
        durationOfNitroOxide = 20;
    }
    SportCar(double durationOfNitroOxide){
        this.durationOfNitroOxide = durationOfNitroOxide;
    }
    public double getDurationOfNitroOxide(){
        return durationOfNitroOxide;
    }
}