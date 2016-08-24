package vityaz.LabWork271;


public class Beast extends Something{
    public Beast(){
        System.out.println("This is a Beast");
        tail = true;
        limbs = 4;
    }
    public void move(){
        System.out.println("Beast can runs");
    }
    public void voice(){
        System.out.println("Beast say: 'grrr'");
    }
}
