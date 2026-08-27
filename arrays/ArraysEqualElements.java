import java.util.Arrays;

public class ArraysEqualElements {
    public static void main(String[] args) {
        int[] a = {1, 2, 5, 4, 0};
        int[] b = {2, 4, 5, 0, 1};
        Arrays.sort(a);
        Arrays.sort(b);
        if (Arrays.equals(a, b)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
