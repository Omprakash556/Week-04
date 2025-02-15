package Collection.set_interface;

import java.util.Arrays;
import java.util.HashSet;

public class UnionAndIntersection {
    public static void union(HashSet<Integer> set1, HashSet<Integer> set2){
        HashSet<Integer> unionResult = new HashSet<>();
        for (Integer i:set1){
            unionResult.add(i);
        }
        for (Integer i: set2){
            unionResult.add(i);
        }

        System.out.println(unionResult);
    }

    public static void intersection(HashSet<Integer> set1, HashSet<Integer> set2){
        HashSet<Integer> intersectionResult = new HashSet<>(set1);
        intersectionResult.retainAll(set2);
        System.out.println(intersectionResult);

    }

    public static void main(String[] args) {

        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5));

        union(set1, set2);
        intersection(set1, set2);
    }
}
