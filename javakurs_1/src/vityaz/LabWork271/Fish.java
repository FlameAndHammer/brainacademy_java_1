package vityaz.LabWork271;


public class Fish extends Something {
    public Fish(){
        System.out.println("This is a Fish");
        tail = true;
    }
    public void move(){
        System.out.println("Fish can swims");
    }
    public void voice(){
        System.out.println("Fish is silent");
    }
}
