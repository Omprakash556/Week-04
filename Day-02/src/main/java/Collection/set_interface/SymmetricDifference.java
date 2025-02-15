package Collection.set_interface;

import java.util.Arrays;
import java.util.HashSet;

public class SymmetricDifference    {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(Arrays.asList(1,2,3));
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(3,4,5));

        HashSet<Integer> suymDiff1 = new HashSet<>(set);
        suymDiff1.removeAll(set1);

        HashSet<Integer> suymDiff2 = new HashSet<>(set1);
        suymDiff2.removeAll(set);

        suymDiff1.addAll(suymDiff2);
        System.out.println(suymDiff1);
    }
}

