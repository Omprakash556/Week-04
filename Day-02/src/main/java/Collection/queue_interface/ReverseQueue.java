package Collection.queue_interface;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {
    public static void reverseQueue(Queue<Integer> queue){
        if(queue.isEmpty()){
            return;
        }
        int front = queue.poll();
        reverseQueue(queue);
        queue.add(front);
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(queue);

        reverseQueue(queue);
        System.out.println(queue);
    }
}
