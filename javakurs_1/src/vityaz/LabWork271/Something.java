package vityaz.LabWork271;


public class Something {
    protected int limbs;
    protected boolean tail;
    protected boolean wings;
    public Something(){
        System.out.println("Something is born");
    }
    public void move(){
        System.out.println("Something is moving");
    }
    public void voice(){
        System.out.println("Something makes sound");
    }
    public void report(){
        System.out.println("limbs: " + limbs);
        System.out.println("tail: " + tail);
        System.out.println("wings: " + wings);
    }
}
