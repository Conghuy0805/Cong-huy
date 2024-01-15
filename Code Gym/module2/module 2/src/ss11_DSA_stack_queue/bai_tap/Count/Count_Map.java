package ss11_DSA_stack_queue.bai_tap.Count;

import java.util.HashMap;
import java.util.Map;


public class Count_Map {
    public static void main(String[] args) {
        String input = "Code Gym ";
        String lower = input.toLowerCase();
        String[] arr = lower.split(" ");
        Map<String, Integer> mapWord = new HashMap<>();
        for (String s : arr) {
            if (mapWord.containsKey(s)) {
                Integer value = mapWord.get(s);
                value++;
                mapWord.replace(s, value);
            } else {
                mapWord.put(s, 1);
            }
        }
        System.out.println(mapWord);
    }
}
