package Collection.set_interface;

import java.util.Arrays;
import java.util.HashSet;

public class FindSubsets {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(Arrays.asList(8,9));
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,5));

        boolean isSubset = set1.containsAll(set);
        System.out.println(isSubset);
    }
}
