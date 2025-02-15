package Collection.list_interface;

import java.util.*;

public class RotateElementsList {
    public static List<Integer> reverseList(List<Integer> list, int k){
        ArrayList<Integer> rotateList = new ArrayList<>(Collections.nCopies(list.size(),0));
            for (int i=0; i<list.size(); i++){
                int idx = (k+i)%list.size();
                rotateList.set(idx, list.get(i));
            }

        return rotateList;
    }
    public static void main(String[] args) {
        List<Integer> element = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(reverseList(element, 2));
    }
}
