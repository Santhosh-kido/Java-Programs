package DSA.Two_Pointers;

public class MoveZeroToEnd {
    public static void main(String[] args) {

        int[] arr = { 1, 0, 2, 0, 3, 0, 4, 0, 5 };
        int left = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                int temp = arr[left];
                arr[left] = arr[i];
                arr[i] = temp;
                left++;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
