import java.util.ArrayList;

public class InsertAtPosition {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int pos = 3;
        int ele = 50;
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        list.add(pos - 1, ele);
        System.out.println(list);
    }
}
