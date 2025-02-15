package Collection.queue_interface;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GenerateNBinaryNumber {
    public static ArrayList<String> generateNBinaryNumber(int n){
        ArrayList<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        for (int i=1; i<=n; i++){
            String front = queue.poll();
            result.add(front);

            queue.add(front +"0");
            queue.add(front +"1");
        }
        return result;

    }
    public static void main(String[] args) {
        int n = 15;
        System.out.println(generateNBinaryNumber(n));
    }
}
