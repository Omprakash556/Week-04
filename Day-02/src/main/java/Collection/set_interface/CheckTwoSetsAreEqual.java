package Collection.set_interface;

import java.util.Arrays;
import java.util.HashSet;

public class CheckTwoSetsAreEqual {
    public static boolean checkTwoSetsAreEqual(HashSet<Integer> set, HashSet<Integer> set1){

        for (int i=0; i<set1.size(); i++){
            if(set1.equals(set)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(Arrays.asList(1,2,3));
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(3,2,1));
        System.out.println(checkTwoSetsAreEqual(set,set1));
    }
}
