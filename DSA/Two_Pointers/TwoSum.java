package DSA.Two_Pointers;

public class TwoSum {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int left = 0;
        int right = arr.length - 1;
        int target = 9;
        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.print("[" + arr[left] + ", " + arr[right] + "]");
                break;
            } else if (sum < target)
                left++;
            else
                right--;
        }
    }
}
