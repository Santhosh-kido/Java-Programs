import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public class RankTransformArray {
    public static void main(String[] args) {
        int[] arr = {40, 10, 20, 30};
        TreeSet<Integer> set = new TreeSet<>();
        for (int i : arr) {
            set.add(i);
        }
        List<Integer> list = new ArrayList<>(set);
        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for (int i = 0; i < list.size(); i++) {
            int val = list.get(i);
            map.put(val, rank);
            rank++;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}
