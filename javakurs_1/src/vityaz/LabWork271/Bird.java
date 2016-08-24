package vityaz.LabWork271;


public class Bird extends Something {
    public Bird() {
        System.out.println("This is a Bird");
        limbs = 4;
        tail = true;
        wings = true;
    }

    public void move() {
        System.out.println("Birds can fly");
    }

    public void voice() {
        System.out.println("Bird tweets");
    }
}
