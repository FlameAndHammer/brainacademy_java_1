package udovenko.labwork37;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by gladi on 14.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("abc");
        strings.add("bcde");
        Collections.sort(strings, (s1, s2) -> s1.length() - s2.length());
    }
}
