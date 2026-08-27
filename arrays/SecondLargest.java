public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12, 36, 35, 1, 10, 34, 1};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (secondLargest < largest && num > secondLargest) {
                secondLargest = num;
            }
        }
        System.out.print(secondLargest);
    }
}
