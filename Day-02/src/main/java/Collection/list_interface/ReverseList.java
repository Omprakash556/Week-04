package Collection.list_interface;

import java.util.*;

public class ReverseList {
    public static <T> List<T> reverseArrayList(List<T> list) {
        int left = 0, right = list.size() - 1;
        while (left < right) {
            // Swap elements
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
        return list;
    }
    public static <T> List<T> reverseLinkedList(LinkedList<T> list) {
        LinkedList<T> reversedList = new LinkedList<>();
        for (T element : list) {
            reversedList.addFirst(element);
        }
        return reversedList;
    }

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("Before Reversed ArrayList: " + arrayList);
        System.out.println("After Reversed ArrayList: " + reverseArrayList(arrayList));

        System.out.println("Before Reversed LinkedList: " + linkedList);
        System.out.println("After Reversed LinkedList: " + reverseLinkedList(linkedList));
    }
}

