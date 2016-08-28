package tretiak.labworks.work2;
import java.util.Arrays;

public class MainShape {
    public static void main(String[] arg) {
        Rectangle[] arr2 = new Rectangle[] {new Rectangle("Black", 10.0, 15.5), new Rectangle("Black", 16.0, 28.5),
        new Rectangle("Black", 12.0, 20.0), new Rectangle("Black", 14.0, 22.0)};
        for(int i = 0; i < arr2.length; i++){
            arr2[i].draw();
        }
        System.out.println();
        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < arr2.length; j++){
                Rectangle temp = arr2[i];
                if (temp.compare(arr2[i], arr2[j]) == 2){
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        for(int i = 0; i < arr2.length; i++){
            arr2[i].draw();
        }
    }
}
