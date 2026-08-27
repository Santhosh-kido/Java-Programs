import java.util.Arrays;

public class RearrangeSmallestLargest {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 8, 7, 4};
        Arrays.sort(arr);
        int[] resArr = new int[arr.length];
        int start = 0;
        int end = arr.length - 1;
        int ind = 0;
        while (start < end) {
            if (start == end) {
                resArr[ind++] = arr[start];
                break;
            }
            resArr[ind++] = arr[start];
            resArr[ind++] = arr[end];
            start++;
            end--;
        }
        System.out.print(Arrays.toString(resArr));
    }
}
