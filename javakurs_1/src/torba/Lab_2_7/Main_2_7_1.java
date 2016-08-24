package torba.Lab_2_7;

class Device {

    private String color;
    private double weight;

    public void setColor(String color){
        this.color = color;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public String getColor(){
        return color;
    }
    public double getWeight(){
        return weight;
    }

}

class Watch extends Device {

    private String type;

    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }

    public Watch(String color, double weight, String type){
        setColor(color);
        setWeight(weight);
        this.type = type;
    }

    public String toString(){
        return "Watch. Color - " + getColor() + ". Weight - " + getWeight() + ". Type - " + getType();
    }

}

class Notebook extends Device {

    private double diagonal;

    public void setDiagonal(double diagonal){
        this.diagonal = diagonal;
    }
    public double getDiagonal(){
        return diagonal;
    }

    public Notebook(String color, double weight, double diagonal){
        setColor(color);
        setWeight(weight);
        this.diagonal = diagonal;
    }

    public String toString(){
        return "Notebook. Color - " + getColor()+". Weight - " + getWeight()+". Diagonal - " + getDiagonal();
    }

}

public class Main_2_7_1 {

    public static void main(String[] args){

        Watch[] watches = new Watch[2];
        watches[0] = new Watch("black", 0.05, "mechanical");
        watches[1] = new Watch("white", 0.03, "electronic");
        for (Watch el : watches){
            System.out.println(el);
        }

        Notebook[] notebooks = new Notebook[2];
        notebooks[0] = new Notebook("black", 5, 15.4);
        notebooks[1] = new Notebook("white", 6, 17);
        for (Notebook el : notebooks){
            System.out.println(el);
        }

    }
}
