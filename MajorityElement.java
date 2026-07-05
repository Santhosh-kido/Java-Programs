import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 1, 3, 5, 1};
        int majorSize = arr.length / 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int res = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > majorSize) {
                res = entry.getKey();
                break;
            }
        }
        System.out.println(res);
    }
}
