package Collection.queue_interface;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ImplementStackUsingQueue {
    public static void buildStack(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()){
            stack.push(queue.poll());
        }
        System.out.println("Top of the stack: "+stack.pop());
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(1,2,3));
        System.out.println("Queue elements are: "+queue);
        buildStack(queue);
    }
}
