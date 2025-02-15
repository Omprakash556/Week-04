package Collection.list_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindFrequencyofElements {
    public static HashMap<String, Integer> countFrequency(List<String> list){
        HashMap<String, Integer> countFre = new HashMap<>();
        for (String s: list){
            countFre.put(String.valueOf(s),countFre.getOrDefault(s,0)+1);
        }
        return countFre;
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Prakash", "Furqan", "Deepansh", "Abubhav", "Prakash", "Deepansh"));
        System.out.println(countFrequency(list));
    }
}
