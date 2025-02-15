package Collection.list_interface;

import java.util.LinkedList;
import java.util.ListIterator;


public class FindNthElementFromEnd {
    public static Character printNthNode(LinkedList<Character> ll, int nth){
        ListIterator<Character> fast = ll.listIterator();
        ListIterator<Character> slow=ll.listIterator();

        for (int i=0; i<nth; i++){
            if(fast==null){
                System.out.println("Index  out of bound: ");
                return null;
            }
            fast.next();
        }
        while (fast.hasNext()){
            fast.next();
            slow.next();
        }
        return slow.next();

    }
    public static void main(String[] args) {
        LinkedList<Character> ll = new LinkedList<>();
        ll.add('A');
        ll.add('B');
        ll.add('C');
        ll.add('D');
        ll.add('E');
        System.out.println(printNthNode(ll,3));

        System.out.println(ll);

    }
}
