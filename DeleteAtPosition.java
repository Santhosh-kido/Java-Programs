import java.util.ArrayList;

public class DeleteAtPosition {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int pos = 2;
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        list.remove(pos - 1);
        System.out.println(list);
    }
}
