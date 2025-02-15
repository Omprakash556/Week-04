package Collection.list_interface;

import java.util.*;

public class RemoveDuplicatesWhilePreservingOrder {
    public static Set<Integer>  removeDuplicates(List<Integer> list){
        TreeSet<Integer> removeDuplicates = new TreeSet<>();
        for (int i=0; i<list.size(); i++){
            removeDuplicates.add(list.get(i));
        }
        return removeDuplicates;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3,1,2,3,3,4,5,6));
        System.out.println(removeDuplicates(list));
    }
}
