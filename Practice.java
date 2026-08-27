
public class Practice {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int target = 9;
        int left = 0, right = n - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        if (left < right) {
            System.out.println("[" + arr[left] + ", " + arr[right] + "]");
        } else {
            System.out.println("No pair found");
        }

    }

}
