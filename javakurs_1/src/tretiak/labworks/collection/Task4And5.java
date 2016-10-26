package tretiak.labworks.collection;

/**
 * Created by Maksim on 26.10.2016.
 */
public class Task4And5 {
    public static void main(String[] args){
        MyNumGenerator myNumGenerator = new MyNumGenerator(5,64);
        System.out.println(myNumGenerator.generate());
        System.out.println(myNumGenerator.generateDistinct());
    }
}
