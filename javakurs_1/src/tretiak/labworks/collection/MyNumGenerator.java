package tretiak.labworks.collection;


import java.util.*;

/**
 * Created by Maksim on 26.10.2016.
 */
public class MyNumGenerator {
    private int numOfElm;
    private int maxNumb;
    public MyNumGenerator(int numOfElm,int maxNumb){
        this.numOfElm = numOfElm;
        this.maxNumb = maxNumb;
    }
    public List<Integer> generate() {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numOfElm; i++) {
            list.add(Integer.valueOf(random.nextInt(maxNumb) + 1));
        }
        return list;
    }
    public Set<Integer> generateDistinct(){
            Random random = new Random();
            Set<Integer> list = new HashSet<>();
            for(int i = 0; i < numOfElm; i++){
                list.add(Integer.valueOf(random.nextInt(maxNumb) + 1));
            }
        return list;
    }
}
