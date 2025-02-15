import Collection.list_interface.*;
import org.junit.Test;


import java.util.*;

import static org.junit.Assert.assertEquals;

public class test {

    @Test
    public void reverseList(){
        List<Integer>arr= ReverseList.reverseArrayList(Arrays.asList(1,2,3,4,5));
        assertEquals(Arrays.asList(5,4,3,2,1),arr);
    }

    @Test
    public void findFrequency(){
        HashMap<String, Integer> excepted = new HashMap<>();
        excepted.put("Anubhav", 1);
        excepted.put("Furqan",1);
        excepted.put("Deepansh", 2);
        excepted.put("Prakash", 2);
        HashMap<String, Integer> actual = FindFrequencyofElements.countFrequency(Arrays.asList("Prakash", "Furqan", "Deepansh", "Anubhav", "Prakash", "Deepansh"));
        assertEquals(excepted,actual);
    }

    @Test
    public void rotateList(){
        List<Integer> actual = RotateElementsList.reverseList(Arrays.asList(1,2,3,4,5),2);
        assertEquals(Arrays.asList(4,5,1,2,3),actual);
    }

    @Test
    public void removeDuplicatesPreservingOrder(){
        Set<Integer> list = RemoveDuplicatesWhilePreservingOrder.removeDuplicates(Arrays.asList(3,1,2,3,3,4,5,6));
        Set<Integer> actual = new TreeSet<>(list);
        assertEquals(list, actual);
    }

    @Test
    public void findNthElementEnd(){
      LinkedList<Character>list=new LinkedList<>();
      list.add('A');
      list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');
        list.add('F');
        assertEquals(Optional.of('E'),Optional.of(FindNthElementFromEnd.printNthNode(list,2)));
    }

}
