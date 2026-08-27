import java.util.HashMap;
import java.util.Map;

public class PrintFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 1, 4, 5, 1, 2};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + " occurs " + value + " times");
        }
    }
}
