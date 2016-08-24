package vityaz.LabWork271;


public class Human extends Something{
    public Human(){
        System.out.println("This is a Human");
        limbs = 4;
    }
    public void move(){
        System.out.println("Human can walk");
    }
    public void voice(){
        System.out.println("Human say: 'Hallo'");
    }
}
