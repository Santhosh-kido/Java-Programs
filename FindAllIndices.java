import java.util.ArrayList;

public class FindAllIndices {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 14, 40, 60, 10};
        int search = 10;
        ArrayList<Integer> list = new ArrayList<>();
        int ind = 0;
        for (int num : arr) {
            if (num == search) {
                list.add(num);
                list.add(ind);
            } else {
                list.add(num);
            }
            ind++;
        }
        System.out.println(list);
    }
}
