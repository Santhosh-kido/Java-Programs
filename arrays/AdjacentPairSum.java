public class AdjacentPairSum {
    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        int target = -2;
        for (int i = 0; i < arr.length - 1; i++) {
            int a = arr[i];
            int b = arr[i + 1];
            int sum = a + b;
            if (sum == target) {
                System.out.println(i + " " + (i + 1));
                break;
            }
        }
    }
}
