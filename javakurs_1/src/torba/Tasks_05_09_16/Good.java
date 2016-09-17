package torba.Tasks_05_09_16;

public class Good implements Comparable{
    private int id;
    private String name;
    private String type;
    private double price;
    public Good(int id, String name, String type, double price) {
        this.name = name;
        this.id = id;
        this.type = type;
        this.price = price;
    }
    public int getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int compareTo(Object good){
        if (((Good)good).getID() > id) {return 1;}
        else if (((Good)good).getID() == id) {return 0;}
        else {return -1;}
    }
    public boolean equals(Object good){
        if (((Good)good).getID() == id) {return true;}
        else {return false;}
    }
}
