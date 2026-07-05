public class CountEvenOddSeparate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            } else {
                evenCount++;
            }
        }
        System.out.println(evenCount);
        System.out.println(oddCount);
    }
}
