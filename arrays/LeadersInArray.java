import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] a = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> list = new ArrayList<>();
        int max = a[a.length - 1];
        list.add(max);
        for (int i = a.length - 2; i >= 0; i--) {
            if (a[i] > max) {
                max = a[i];
                list.add(max);
            }
        }
        Collections.reverse(list);
        System.out.println(list);
    }
}
