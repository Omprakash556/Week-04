package Collection.set_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class ConvertSetSortedList {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(Arrays.asList(12,4,2,5,3,6,8));
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer i: set){
            list.add(i);
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
