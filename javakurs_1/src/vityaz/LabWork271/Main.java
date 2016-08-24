package vityaz.LabWork271;


public class Main {
    public  static void main(String[] args){
        Something[] arrayOfSomething = {new Fish(), new Bird(), new Beast(), new Human()};
        for (Something arrayElement:arrayOfSomething) {
            arrayElement.move();
            arrayElement.voice();
            arrayElement.report();
        }
    }
}
