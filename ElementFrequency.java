import java.util.LinkedHashMap;
import java.util.Map;

public class ElementFrequency {
    public static void main(String[] args) {
        int[] arr = {40, 20, 10, 50, 20, 10, 30, 40};
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }
}
